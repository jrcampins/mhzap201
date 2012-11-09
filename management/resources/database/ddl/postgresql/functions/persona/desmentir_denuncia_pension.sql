--
--Descripción: Este procedimiento desmiente una denuncia asociada con una pensión aprobada
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@comentarios: Comentarios para desmentir la denuncia
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_desmentir_denu_pen(rastro bigint, persona_consultada bigint, comentarios varchar) returns integer as $$
declare
mensaje varchar:='';
begin
    select persona_desmentir_denu_pen(persona_consultada,comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento desmiente una denuncia asociada con una pensión aprobada
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@comentarios: Comentarios para desmentir la denuncia
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_desmentir_denu_pen(persona_consultada bigint, comentarios varchar) returns varchar as $$
declare
    mensaje varchar:='';
    row_persona persona;
    acreditacion integer;
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
    --Solo se desmienten denuncias registradas
    if row_persona.numero_condicion_denu_pen<>1 then
        raise exception 'Persona no tiene denuncia registrada (id=%)', persona_consultada;
    end if;
    --Se actualiza el estado de la denuncia a desmentida
    condicion_elegibilidad:=persona_actualizar_persona_elegible(persona_consultada);
    --Si la persona no es elegible se actualiza su estado
    if condicion_elegibilidad=0 then  
       update persona 
       set  numero_condicion_denu_pen = 3,
            fecha_desmentido_denuncia_pen = CURRENT_TIMESTAMP,
            comentarios_des_denu_pen=comentarios
       where  id_persona = persona_consultada;
       mensaje:='Denuncia Desmentida';
    else
       mensaje:='No se pudo desmentir la denuncia';
    end if;
    return mensaje; 
end;
$$ language plpgsql;
