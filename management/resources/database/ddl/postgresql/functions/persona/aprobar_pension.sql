--
--Descripción: Este procedimiento aprueba una solicitud de pensión, verificando que la persona sea elegible.
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios del usuario
--@return: 0 si no se produjo ninguna excepción.
--
create or replace function persona_aprobar_pension(rastro bigint, persona_consultada bigint, comentarios varchar) returns integer as $$
declare
mensaje varchar:='';
begin
    select persona_aprobar_pension(persona_consultada,comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento aprueba una solicitud de pensión, verificando que la persona sea elegible
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios del usuario
--@return: Mensaje indicando que se aprobó la pensión, si no se produjo ninguna excepción.
--
create or replace function persona_aprobar_pension(persona_consultada bigint, comentarios varchar) returns varchar as $$
declare
    row_persona persona;
    mensaje varchar:='';
    requisitos_personales integer:=0;
    condicion_elegibilidad integer:=0;
    acreditacion integer:=0;
begin
    select *
    into   row_persona
    from   persona as p
    where  p.id_persona = persona_consultada;
    if not found then
        raise exception 'Persona no existe (id=%)', persona_consultada;
    end if;
    --No ha solicitado pensión: No hay nada que hacer
    if (row_persona.numero_condicion_pension is null or row_persona.numero_condicion_pension <>1) then
        raise exception 'Persona no tiene pensión solicitada';
    end if;
    --Persona no acreditada: No hay nada que hacer
    if (row_persona.es_persona_acreditada_para_pen=0) then
        raise exception 'Persona no está acreditada';
    end if;
    --Actualiza elegibilidad de la persona 
    condicion_elegibilidad:=persona_actualizar_persona_elegible(persona_consultada);
    --La persona es elegible (condicion_elegibilidad=0): Se aprueba la pensión
    if condicion_elegibilidad=0 then  
        update persona 
        set    numero_condicion_pension = 2,
            fecha_aprobacion_pension = CURRENT_TIMESTAMP,
            comentarios_aprobacion_pension=comentarios
        where  id_persona = persona_consultada;
        mensaje:='Pensión Aprobada';
    else
    --La persona no es elegible 
        mensaje:='No se pudo aprobar la pensión';
    end if;
    return mensaje;
end;
$$ language plpgsql;
