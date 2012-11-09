--
--Descripción: Este procedimiento permite registrar un reclamo relacionado con un censo
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario_consultado: id del potencial beneficiario sobre el que se ejecutara la funcion
--@param comentarios: Comentarios del reclamo
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_reg_recl_cen(rastro bigint, beneficiario_consultado bigint, comentarios varchar) returns integer as $$
declare
    mensaje varchar:='';
begin
    select potencial_ben_reg_recl_cen(beneficiario_consultado,comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento permite registrar un reclamo relacionado con un censo. Un reclamo puede deberse a: icv no corresponde, persona no censada, datos del censo erroneos
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la solicitud
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_reg_recl_cen(beneficiario_consultado bigint, comentarios varchar) returns varchar as $$
declare
    mensaje varchar:='';
    row_potencial_ben potencial_ben;
    row_persona persona;
begin
    select *
    into   row_potencial_ben
    from   potencial_ben as p
    where  p.id_potencial_ben= beneficiario_consultado;
    if not found then
        raise exception 'Potencial Beneficiario no existe (id=%)', beneficiario_consultado;
    end if;
    --Los reclamos solo son pertinentes para: 
    --beneficiarios que no fueron acreditados, 
    --beneficiarios que no fueron validados y 
    --beneficiarios que no se les realizo el censo
    --Beneficiarios que no fueron acreditados (si persona asociada es acreditada no es pertinente)
    if row_potencial_ben.id_persona is not null then
        select * 
        into row_persona
        from persona as p
        where p.id_persona=row_potencial_ben.id_persona;
        if row_persona.es_persona_acreditada_para_pen=1 then
            raise exception 'Potencial Beneficiario ya fue censado y acreditado para pension';
        end if;
    end if;
    --Beneficiarios que no fueron validados (si condicion_censo=validado no es pertinente)
    if row_potencial_ben.numero_condicion_censo=3 then
        raise exception 'ICV del Potencial Beneficiario ya fue validado';
    end if;
    --Beneficiarios que no fueron censados (si condicion_censo=Censado no es pertinente)
    if row_potencial_ben.numero_condicion_censo=5 then
        raise exception 'Potencial Beneficiario ya fue censado';
    end if;
    --Solo se permite registrar un reclamo a la vez
    if row_potencial_ben.numero_condicion_recl_cen=1 then
        raise exception'Persona ya tiene reclamo registrado';
    end if;
    --Se actualiza el estado del potencial beneficiario, registrando un reclamo para el censo
    update potencial_ben
    set    numero_condicion_recl_cen = 1,
           fecha_reclamo_censo  = CURRENT_TIMESTAMP,
           comentarios_reclamo_censo =comentarios
    where  id_potencial_ben=beneficiario_consultado;
    mensaje:='Reclamo de Censo Registrado: '||row_potencial_ben.nombre_potencial_ben;
    return mensaje;
end;
$$ language plpgsql;