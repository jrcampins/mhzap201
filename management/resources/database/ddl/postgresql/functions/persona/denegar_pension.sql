--
--Descripci�n: Este procedimiento deniega una solicitud de pensi�n
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: numero de la causa de denegaci�n
--@param otra_causa: descripcion de otra causa de denegaci�n
--@param comentarios: Comentarios de la denegacion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_denegar_pension(rastro bigint, persona_consultada bigint, numero_resolucion varchar, fecha_resolucion timestamp, comentarios varchar) returns integer as $$
declare
mensaje varchar:='';
begin
    select persona_denegar_pension(persona_consultada, numero_resolucion, fecha_resolucion, comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripci�n: Este procedimiento deniega una solicitud de pensi�n. Para ello registra los motivos indicados por el usuario
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: numero de la causa de denegaci�n
--@param otra_causa: descripcion de otra causa de denegaci�n
--@param comentarios: Comentarios de la solicitud
--@return: mensaje indicando la condici�n de ejecuci�n del proceso
--
create or replace function persona_denegar_pension(persona_consultada bigint, numero_resolucion varchar, fecha_resolucion timestamp, comentarios varchar) returns varchar as $$
declare
    row_persona persona;
    mensaje varchar:='';
    mensaje_denegacion_pension varchar:='';
begin
    select *
    into   row_persona
    from   persona as p
    where  p.id_persona = persona_consultada;
    if not found then
        raise exception 'Persona no existe (id=%)', persona_consultada;
    end if;
    --Solo se deniegan pensiones objetadas.
    if row_persona.numero_condicion_pension <> 3 then
        raise exception 'Persona no tiene pensi�n objetada';
    end if;
    --Se determina el mensaje de denegacion de la pensi�n
    select cdp.codigo_causa_den_pension 
    into mensaje_denegacion_pension 
    from causa_den_pension cdp
    where cdp.numero_causa_den_pension = row_persona.numero_causa_den_pension;
    --
    update persona 
    set    numero_condicion_pension = 6,
           fecha_denegacion_pension = CURRENT_TIMESTAMP,
           numero_resolucion_den_pen = numero_resolucion,
           fecha_resolucion_den_pen = fecha_resolucion,
           comentarios_denegacion_pension = comentarios
    where  id_persona = persona_consultada;
    --
    mensaje:='Pensi�n Denegada. Causa: ' || mensaje_denegacion_pension;
    return mensaje;
end;
$$ language plpgsql;
