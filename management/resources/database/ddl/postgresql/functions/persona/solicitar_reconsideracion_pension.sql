--
--Descripción: Este procedimiento registra una solicitud de reconsideración de pensión
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la solicitud
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_solicitar_reco_pen(rastro bigint, persona_consultada bigint, comentarios varchar) returns integer as $$
declare
mensaje varchar:='';
begin
    select persona_solicitar_reco_pen(persona_consultada,comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento registra una solicitud de reconsideración de pensión. La pensión debe haber sido negada o revocada
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la solicitud
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_solicitar_reco_pen(persona_consultada bigint, comentarios varchar) returns varchar as $$
declare
    mensaje varchar:='';
    row_persona persona;
begin
    select *
    into   row_persona
    from   persona as p
    where  p.id_persona = persona_consultada;
    if not found then
        raise exception 'Persona no existe (id=%)', persona_consultada;
    end if;
    --Solo se reconsideran pensiones negadas o revocadas
    if row_persona.numero_condicion_pension <>3 and row_persona.numero_condicion_pension <>4 then
        raise exception 'Persona no tiene pensión denegada ni revocada. No se puede reconsiderar';
    --Solo se puede solicitar una reconsideracion. Si ya hay una solicitada se rechaza la solicitud
    elsif row_persona.numero_condicion_reco_pen=1 then
        raise exception 'Persona ya tiene reconsideracion solicitada';
    end if;
    --Se registra la solicitud de reconsideración. Se queda a la espera que se apruebe o deniegue
    update persona 
    set    numero_condicion_reco_pen = 1,
           fecha_solicitud_reco_pen = CURRENT_TIMESTAMP,
           comentarios_solicitud_reco_pen =comentarios
    where  id_persona = persona_consultada;
    mensaje:='Reconsideración solicitada';
    return mensaje;
end;
$$ language plpgsql;
