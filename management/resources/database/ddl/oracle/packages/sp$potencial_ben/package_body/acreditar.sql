--
--Descripción: Este procedimiento permite acreditar un potencial beneficiario, 
--para ello hace las validaciones correspondientes y solicita la pensión
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario_consultado: id del potencial beneficiario sobre el que se ejecutara la funcion
--@param lote: identificador del lote
--@return: 0 si no se produjo ninguna excepcion.
--
function acreditar( beneficiario_consultado number, lote number) return varchar2 is

    mensaje varchar2(2000);
    row_potencial_ben potencial_ben%rowtype;
    row_ficha_persona ficha_persona%rowtype;
    row_ficha_hogar ficha_hogar%rowtype;
    row_persona persona%rowtype;
    icv_corte number;
    numero_lote number;
    icv_beneficiario number;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    numero_lote:=lote;
    begin
        --Se extrae el potencial beneficiario
        select * into row_potencial_ben from potencial_ben pb where pb.id_potencial_ben=beneficiario_consultado;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string:='Potencial Beneficiario no existe ';
        raise_application_error(err_number, msg_string, true);
    end if;
    if row_potencial_ben.id_barrio is not null then
        begin
            select ta.limite_indice_calidad_vida into icv_corte from ubicacion u left join tipo_area ta on u.numero_tipo_area=ta.numero_tipo_area where u.id_ubicacion=row_potencial_ben.id_barrio;
        exception
            when no_data_found then null;
        end;
    else
        begin
            --Se consulta el punto de corte
            select limite_indice_calidad_vida into icv_corte from parametro_global;
        exception
            when no_data_found then null;
        end;        
    end if;
    if icv_corte is null then
        begin
            --Se consulta el punto de corte
            select limite_indice_calidad_vida into icv_corte from parametro_global;
        exception
            when no_data_found then null;
        end;
    end if;
    if icv_corte is null then
        msg_string:='No hay limite_indice_calidad_vida definido';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Se determina la ficha hogar (si la hay)
    if row_potencial_ben.id_ficha_persona is not null then
        begin
            --Se consulta la ficha persona
            select * into row_ficha_persona from ficha_persona where id_ficha_persona=row_potencial_ben.id_ficha_persona;
        exception
            when no_data_found then null;
        end;
        if sql%found then
            begin
                --Se consulta la ficha hogar
                select * into row_ficha_hogar from ficha_hogar where id_ficha_hogar=row_ficha_persona.id_ficha_hogar;
            exception
                when no_data_found then null;
            end;
        end if;
    end if;
    --Solo se acredita si el potencial beneficiario tiene una persona asociada
    if row_potencial_ben.id_persona is null then
        msg_string:='Potencial Beneficiario no aparece en el registro de Personas';
        raise_application_error(err_number, msg_string, true);
    --Si el potencial beneficiario es indígena, se acredita automáticamente
    elsif row_potencial_ben.es_indigena =1 then
        begin
            select * into row_persona from persona where id_persona=row_potencial_ben.id_persona;
        exception when no_data_found then null;
        end;
        if not sql%found then
            msg_string:='Persona NO existe';
            raise_application_error(err_number, msg_string, true);
        else
            if row_persona.es_persona_acreditada_para_pen=1 then
               msg_string:='Persona ya fue acreditada';
               raise_application_error(err_number, msg_string, true); 
            end if;            
        end if;        
        mensaje:=sp$persona.solicitar_pension(row_potencial_ben.id_persona,'Pension Solicitada y Acreditada automáticamente. Persona Indígena');
        if mensaje like '%Pensión solicitada%' then
            --Actualizar lote y acreditación de persona
            update persona p
            set p.es_persona_acreditada_para_pen=1,
            p.lote=numero_lote
            where p.id_persona=row_potencial_ben.id_persona;
            if not sql%found then
                msg_string:='No fue posible solicitar la pension a la Persona';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Asignar el lote al potencial beneficiario
            update potencial_ben pb
            set pb.lote=numero_lote
            where pb.id_potencial_ben=row_potencial_ben.id_potencial_ben;
            if not sql%found then
                msg_string:='No fue posible asignar el lote al Potencial Beneficiario';
                raise_application_error(err_number, msg_string, true);
            end if;
            mensaje:='Potencial Beneficiario (Indígena) Acreditado para pensión. '||mensaje||' Lote: '||lote;
        end if;
    --Solo se acredita si el potencial beneficiario tiene una ficha persona o icv
    elsif row_potencial_ben.indice_calidad_vida is null and row_potencial_ben.id_ficha_persona is null then
        mensaje:='Potencial Beneficiario no tiene ICV ni Ficha Persona. No se puede acreditar';
    --Solo se acredita si el potencial beneficiario tiene estado de censo censado o validado
    elsif row_potencial_ben.numero_condicion_censo<>3 and row_potencial_ben.numero_condicion_censo<>5 then
        mensaje:='Potencial Beneficiario no tiene Censo Válido';
    --Si no es indigena, se acredita por ICV
    else
        begin
            select * into row_persona from persona where id_persona=row_potencial_ben.id_persona;
        exception when no_data_found then null;
        end;
        if not sql%found then
            msg_string:='Persona NO existe';
            raise_application_error(err_number, msg_string, true);
        else
            if row_persona.es_persona_acreditada_para_pen=1 then
               msg_string:='Persona ya fue acreditada';
               raise_application_error(err_number, msg_string, true); 
            end if;            
        end if;
        --Se toma el icv
        icv_beneficiario:=row_potencial_ben.indice_calidad_vida;
        --Si la ficha hogar no tiene icv
        if icv_beneficiario is null then    
            icv_beneficiario:=sp$ficha_hogar.calcular_icv(row_ficha_hogar.id_ficha_hogar) ;
        end if;
        --Se compara el icv con el punto de corte y se verifica que la persona tenga condición de censo válida
        if icv_beneficiario<=icv_corte
           and (row_potencial_ben.numero_condicion_censo=5 or row_potencial_ben.numero_condicion_censo=3) then
        --Se intenta solicitar la pensión
            mensaje:=sp$persona.solicitar_pension(row_potencial_ben.id_persona,'Pensión Solicitada y Acreditada automáticamente');
            if mensaje like '%Pensión solicitada%' then
                --Se asigna el lote al potencial beneficiario
                update potencial_ben pb
                set pb.lote=numero_lote
                where pb.id_potencial_ben=row_potencial_ben.id_potencial_ben; 
                --Si ya tiene ficha se actualiza y se copia la dirección de la ficha
                if row_potencial_ben.id_ficha_persona is not null then
                    update persona p
                    set p.es_persona_acreditada_para_pen=1,
                    p.indice_calidad_vida=icv_beneficiario,
                    p.fecha_ficha_persona=row_ficha_hogar.fecha_entrevista,
                    p.id_departamento=row_ficha_hogar.id_departamento,
                    p.id_distrito=row_ficha_hogar.id_distrito,
                    p.id_barrio=row_ficha_hogar.id_barrio,
                    p.numero_tipo_area=row_ficha_hogar.numero_tipo_area,
                    p.direccion=row_potencial_ben.direccion,
                    p.numero_telefono_linea_baja=row_ficha_hogar.numero_telefono_linea_baja,
                    p.numero_telefono_celular=row_ficha_hogar.numero_telefono_celular,
                    p.lote=numero_lote
                    where p.id_persona=row_potencial_ben.id_persona;
                --Si es un potencial beneficiario que solo tiene icv se acredita solamente
                else
                    update persona p
                    set p.es_persona_acreditada_para_pen=1,
                    p.indice_calidad_vida=icv_beneficiario,
                    p.id_departamento=row_potencial_ben.id_departamento,
                    p.id_distrito=row_potencial_ben.id_distrito,
                    p.id_barrio=row_potencial_ben.id_barrio,
                    p.numero_tipo_area=row_potencial_ben.numero_tipo_area,
                    p.direccion=row_potencial_ben.direccion,
                    p.lote=numero_lote
                    where p.id_persona=row_potencial_ben.id_persona;
                end if;
                mensaje:='Potencial Beneficiario Acreditado para pensión. '||mensaje||' Lote: '||lote;
    --             --Se inactiva el potencial beneficiario
    --             update potencial_ben
    --             set es_potencial_ben_inactivo=1 
    --             where id_potencial_ben=row_potencial_ben.id_potencial_ben;
            end if;
        elsif (row_potencial_ben.numero_condicion_censo!=5 and row_potencial_ben.numero_condicion_censo!=3) then
            mensaje:='Potencial Beneficiario NO está Acreditado para pensión.Censo no válido';
        else
            mensaje:='Potencial Beneficiario NO está Acreditado para pensión';
        end if;
    end if;
return mensaje;
end;
