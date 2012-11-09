--
--Descripción: Este procedimiento deniega una solicitud de reconsideración de pensión
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: numero de la causa de denegación
--@param otra_causa: descripcion de otra causa de denegación
--@param comentarios: Comentarios de la denegacion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_denegar_reco_pen(rastro bigint, persona_consultada bigint, numero_causa integer, otra_causa varchar, comentarios varchar) returns integer as $$
declare
    mensaje varchar:='';
begin
    select persona_denegar_reco_pen(persona_consultada, numero_causa, otra_causa, comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento deniega una solicitud de reconsideración de pensión. Para ello registra los motivos indicados por el usuario
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: numero de la causa de denegación
--@param otra_causa: descripcion de otra causa de denegación
--@param comentarios: Comentarios de la denegacion
--@return: mensaje indicando resultado de la ejecucion del proceso
--
create or replace function persona_denegar_reco_pen(persona_consultada bigint, numero_causa integer, otra_causa varchar, comentarios varchar) returns varchar as $$
declare
    row_persona persona;
    mensaje varchar:='';
    mensaje_denegacion_reconsideracion_pension varchar:='';
begin
    select *
    into   row_persona
    from   persona as p
    where  p.id_persona = persona_consultada;
    if not found then
        raise exception 'Persona no existe (id=%)', persona_consultada;
    end if;
    --Solo se procesan reconsideraciones solicitadas
    if row_persona.numero_condicion_reco_pen<>1 then
        raise exception 'Persona no tiene reconsideración solicitada';
    end if;
    --Se determina el mensaje de denegacion de la reconsideración de pensión
    select cdp.codigo_causa_den_reco_pen  
    into mensaje_denegacion_reconsideracion_pension 
    from causa_den_reco_pen  cdp
    where cdp.numero_causa_den_reco_pen =numero_causa;
    --Se deniega la reconsideración de la pensión con los parámetros recibidos
    update persona 
    set    numero_condicion_reco_pen = 3,
           fecha_denegacion_reco_pen = CURRENT_TIMESTAMP,
           numero_causa_den_reco_pen =numero_causa,
           comentarios_den_reco_pen=comentarios,
           otra_causa_den_reco_pen = otra_causa
    where  id_persona = persona_consultada;
    mensaje:='Reconsideración Negada: '||mensaje_denegacion_reconsideracion_pension;
    return mensaje;
end;
$$ language plpgsql;