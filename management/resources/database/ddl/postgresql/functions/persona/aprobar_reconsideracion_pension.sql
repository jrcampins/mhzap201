--
--Descripción: Este procedimiento aprueba una solicitud de reconsideración de pensión
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la solicitud
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_aprobar_reco_pen(rastro bigint, persona_consultada bigint, comentarios varchar) returns integer as $$
declare
mensaje varchar:='';
begin
    select persona_aprobar_reco_pen(persona_consultada,comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento aprueba una solicitud de reconsideración de pensión. Para ello se verifican los requisitos personales, la elegibilidad y la vigencia de la pensión
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la solicitud
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_aprobar_reco_pen(persona_consultada bigint, comentarios varchar) returns varchar as $$
declare
    mensaje varchar:='';
    row_persona persona;
    vigencia_pension integer;
    requisitos_personales integer;
    condicion_elegibilidad integer;
    fecha_icv timestamp;
    fecha_reconsideracion timestamp;
begin
    select *
    into   row_persona
    from   persona as p
    where  p.id_persona = persona_consultada;
    if not found then
        raise exception 'Persona no existe (id=%)', persona_consultada;
    end if;
    --Solo se aprueba una reconsideración solicitada
    if row_persona.numero_condicion_reco_pen<>1 then
        raise exception 'Persona no tiene reconsideración solicitada (id=%)', persona_consultada;
    end if;
    --Solo se aprueban reconsideraciones de personas que cumplen con requisitos personales
    requisitos_personales:=persona_consultar_requisitos_personales(persona_consultada);
    --Solo se aprueban reconsideraciones de personas elegibles
    condicion_elegibilidad:=persona_actualizar_persona_elegible(persona_consultada);
    --Solo se aprueban reconsideraciones de personas con certificado de vida vigente o ultimos pagos registrados
    vigencia_pension:=persona_consultar_vigencia_pension(persona_consultada);
    --Cuando se aprueba una reconsideración se aprueba la pensión
    if requisitos_personales=0 and condicion_elegibilidad=0 and vigencia_pension=0 then  
       update persona 
       set  numero_condicion_pension=2,
            fecha_aprobacion_pension=CURRENT_TIMESTAMP,
            comentarios_aprobacion_pension='Pensión Aprobada por reconsideración',
            numero_condicion_reco_pen = 2,
            fecha_aprobacion_reco_pen = CURRENT_TIMESTAMP,
            comentarios_apr_reco_pen=comentarios
       where  id_persona = persona_consultada;
       mensaje:='Reconsideración Aprobada, Pensión Aprobada';
    else
       mensaje:='No se pudo aprobar la reconsideración';
    end if;
    return mensaje; 
end;
$$ language plpgsql;
