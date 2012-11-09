--
--Descripción: Este procedimiento permite acreditar un potencial beneficiario
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario_consultado: id del potencial beneficiario sobre el que se ejecutara la funcion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_acreditar(rastro bigint, beneficiario_consultado bigint) returns integer as $$
declare
    mensaje varchar:='';
begin
    select potencial_ben_acreditar(beneficiario_consultado) into mensaje; 
    return rastro_proceso_update(rastro, 21, null, mensaje);                 
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento permite acreditar un potencial beneficiario, 
--para ello hace las validaciones correspondientes y solicita la pensión
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario_consultado: id del potencial beneficiario sobre el que se ejecutara la funcion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_acreditar( beneficiario_consultado bigint) returns varchar as $$
declare
    mensaje varchar:='';
    row_potencial_ben potencial_ben;
    row_ficha_persona ficha_persona;
    row_ficha_hogar ficha_hogar;
    row_persona persona;
    indice_calidad_vida_corte numeric (7,4);
    indice_calidad_vida_beneficiario numeric (7,4);
begin
    --Se consulta el punto de corte
    select limite_indice_calidad_vida 
    into indice_calidad_vida_corte 
    from parametro_global;
    --Se extrae el potencial beneficiario
    select * 
    into row_potencial_ben
    from potencial_ben as pb
    where pb.id_potencial_ben=beneficiario_consultado;
    if not found then
        raise exception 'Potencial Beneficiario no existe (id=%)', beneficiario_consultado;
    end if;
    --Solo se acredita si el potencial beneficiario tiene una persona asociada
    if row_potencial_ben.id_persona is null then
        raise exception 'Potencial Beneficiario (%) no aparece en el registro de Personas',beneficiario_consultado;
    end if;
    --Si el potencial beneficiario es indígena, se acredita automáticamente
    if row_potencial_ben.es_indigena =1 then
        update persona
        set es_persona_acreditada_para_pen=1
        where id_persona=row_potencial_ben.id_persona;
        if not found then
            raise exception 'No fue posible solicitar la pension a la Persona (%)';
        else
            mensaje:=persona_solicitar_pension(row_potencial_ben.id_persona,'Pension Solicitada y Acreditada automáticamente. Persona Indígena');
        end if;
        mensaje:='Potencial Beneficiario Acreditado para pensión. '||mensaje;
        return mensaje;
    end if;
    --Si no es indigena, se acredita por ICV
    --Solo se acredita si el potencial beneficiario tiene una ficha persona o es indigena
    if row_potencial_ben.id_ficha_persona is null then
        raise exception 'Potencial Beneficiario (%) no tiene Ficha Persona',beneficiario_consultado;
    end if;
    --Solo se acredita si el potencial beneficiario tiene estado de censo censado o validado
    if row_potencial_ben.numero_condicion_censo<>3 and row_potencial_ben.numero_condicion_censo<>5 then
        raise exception 'Potencial Beneficiario (%) no tiene Censo Válido',beneficiario_consultado;
    end if;
    --Se ubica la Ficha Persona
    select *
    into row_ficha_persona
    from ficha_persona 
    where id_ficha_persona=row_potencial_ben.id_ficha_persona;
    if not found then
        raise exception 'Ficha Persona No Existe';
    end if;
    --Se ubica la Ficha Hogar
    select * 
    into row_ficha_hogar
    from ficha_hogar 
    where id_ficha_hogar=row_ficha_persona.id_ficha_hogar;
    if not found then
        raise exception 'Ficha Hogar No Existe';
    end if;
    --Se toma el icv de la ficha hogar
    indice_calidad_vida_beneficiario=row_ficha_hogar.indice_calidad_vida;
    --Si la ficha hogar no tiene icv
    if indice_calidad_vida_beneficiario is null then    
        indice_calidad_vida_beneficiario:=ficha_hogar_calcular_icv(row_ficha_hogar.id_ficha_hogar) ;
    end if;
    --Se compara el icv con el punto de corte
    if indice_calidad_vida_beneficiario<=indice_calidad_vida_corte then
        --Se copian los datos de la ficha 
        update persona
        set es_persona_acreditada_para_pen=1,
            indice_calidad_vida=indice_calidad_vida_beneficiario,
            id_departamento=row_ficha_hogar.id_departamento,
            id_distrito=row_ficha_hogar.id_distrito,
            id_barrio=row_ficha_hogar.id_barrio,
            numero_tipo_area=row_ficha_hogar.numero_tipo_area,
            manzana=row_ficha_hogar.manzana,
            direccion=row_ficha_hogar.direccion,
            numero_telefono_linea_baja=row_ficha_hogar.numero_telefono_linea_baja,
            numero_telefono_celular=row_ficha_hogar.numero_telefono_celular
        where id_persona=row_potencial_ben.id_persona;
        if not found then
            raise exception 'No fue posible solicitar la pension a la Persona (%)',row_potencial_ben.id_persona;
        else
            mensaje:=persona_solicitar_pension(row_potencial_ben.id_persona,'Pension Solicitada y Acreditada automáticamente');
        end if;
        mensaje:='Potencial Beneficiario Acreditado para pensión. '||mensaje;
    else
        mensaje:='Potencial Beneficiario NO está Acreditado para pensión';
    end if;
    return mensaje;
end;
$$ language plpgsql;