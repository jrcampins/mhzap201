--
--Descripción: Este procedimiento permite acreditar un potencial beneficiario, 
--para ello hace las validaciones correspondientes y solicita la pensión
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario_consultado: id del potencial beneficiario sobre el que se ejecutara la funcion
--@return: 0 si no se produjo ninguna excepcion.
--
function acreditar( beneficiario_consultado number) return varchar2 is

    mensaje varchar2(2000);
    row_potencial_ben potencial_ben%rowtype;
    row_ficha_persona ficha_persona%rowtype;
    row_ficha_hogar ficha_hogar%rowtype;
    row_persona persona%rowtype;
    icv_corte number;
    icv_beneficiario number;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
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
        msg_string:='No hay limite_indice_calidad_vida definido';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Solo se acredita si el potencial beneficiario tiene una persona asociada
    if row_potencial_ben.id_persona is null then
        msg_string:='Potencial Beneficiario no aparece en el registro de Personas';
        raise_application_error(err_number, msg_string, true);
    --Si el potencial beneficiario es indígena, se acredita automáticamente
    elsif row_potencial_ben.es_indigena =1 then
        update persona
        set es_persona_acreditada_para_pen=1
        where id_persona=row_potencial_ben.id_persona;
        if not sql%found then
            msg_string:='No fue posible solicitar la pension a la Persona';
            raise_application_error(err_number, msg_string, true);
        end if;
        mensaje:=sp$persona.solicitar_pension(row_potencial_ben.id_persona,'Pension Solicitada y Acreditada automáticamente. Persona Indígena');
        mensaje:='Potencial Beneficiario Acreditado para pensión. '||mensaje;
    --Si no es indigena, se acredita por ICV
    --Solo se acredita si el potencial beneficiario tiene una ficha persona o es indigena
    elsif row_potencial_ben.id_ficha_persona is null then
        mensaje:='Potencial Beneficiario no tiene Ficha Persona. No se puede acreditar';
    --Solo se acredita si el potencial beneficiario tiene estado de censo censado o validado
    elsif row_potencial_ben.numero_condicion_censo<>3 and row_potencial_ben.numero_condicion_censo<>5 then
        mensaje:='Potencial Beneficiario no tiene Censo Válido';
    --Si no es indigena hay que acreditar
    else
        --Se ubica la Ficha Persona
        begin
            select * into row_ficha_persona from ficha_persona where id_ficha_persona=row_potencial_ben.id_ficha_persona;
        exception
            when no_data_found then null;
        end;
        if not sql%found then
            msg_string:='Ficha Persona No Existe';
            raise_application_error(err_number, msg_string, true);
        end if;
        --Se ubica la Ficha Hogar
        begin 
            select * into row_ficha_hogar from ficha_hogar where id_ficha_hogar=row_ficha_persona.id_ficha_hogar;
        exception
            when no_data_found then null;
        end;
        if not sql%found then
            msg_string:='Ficha Hogar No Existe';
            raise_application_error(err_number, msg_string, true);
        end if;
        --Se toma el icv de la ficha hogar
        icv_beneficiario:=row_ficha_hogar.indice_calidad_vida;
        --Si la ficha hogar no tiene icv
        if icv_beneficiario is null then    
            icv_beneficiario:=sp$ficha_hogar.calcular_icv(row_ficha_hogar.id_ficha_hogar) ;
        --Se compara el icv con el punto de corte
        elsif icv_beneficiario<=icv_corte then
        --Se intenta solicitar la pensión
            mensaje:=sp$persona.solicitar_pension(row_potencial_ben.id_persona,'Pension Solicitada y Acreditada automáticamente');
            mensaje:='Potencial Beneficiario Acreditado para pensión. '||mensaje;
        --Se actualiza la persona como acreditada
            update persona
            set es_persona_acreditada_para_pen=1,
            indice_calidad_vida=icv_beneficiario,
            fecha_ficha_persona=row_ficha_hogar.fecha_entrevista,
            id_departamento=row_ficha_hogar.id_departamento,
            id_distrito=row_ficha_hogar.id_distrito,
            id_barrio=row_ficha_hogar.id_barrio,
            numero_tipo_area=row_ficha_hogar.numero_tipo_area,
            manzana=row_ficha_hogar.manzana,
            direccion=row_ficha_hogar.direccion,
            numero_telefono_linea_baja=row_ficha_hogar.numero_telefono_linea_baja,
            numero_telefono_celular=row_ficha_hogar.numero_telefono_celular
            where id_persona=row_potencial_ben.id_persona;
            if not sql%found then
                msg_string:='No fue posible solicitar la pension a la Persona ';
                raise_application_error(err_number, msg_string, true);
            end if;
        else
            mensaje:='Potencial Beneficiario NO está Acreditado para pensión';
        end if;
    end if;
return mensaje;
end;
