--
--Descripción: Este procedimiento deniega una solicitud de pensión
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: numero de la causa de denegación
--@param otra_causa: descripcion de otra causa de denegación
--@param comentarios: Comentarios de la denegacion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_denegar_pension(rastro bigint, persona_consultada bigint, numero_causa integer, otra_causa varchar, comentarios varchar) returns integer as $$
declare
mensaje varchar:='';
begin
    select persona_denegar_pension(persona_consultada, numero_causa, otra_causa, comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento deniega una solicitud de pensión. Para ello registra los motivos indicados por el usuario
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: numero de la causa de denegación
--@param otra_causa: descripcion de otra causa de denegación
--@param comentarios: Comentarios de la solicitud
--@return: mensaje indicando la condición de ejecución del proceso
--
create or replace function persona_denegar_pension(persona_consultada bigint, numero_causa integer, otra_causa varchar, comentarios varchar) returns varchar as $$
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
    --Solo se deniegan pensiones solicitadas.
    if row_persona.numero_condicion_pension <>1 then
        raise exception 'Persona no tiene pensión solicitada';
    end if;
    --Se determina el mensaje de denegacion de la pensión
    select cdp.codigo_causa_den_pension 
    into mensaje_denegacion_pension 
    from causa_den_pension cdp
    where cdp.numero_causa_den_pension=numero_causa;
    --Este proceso no hace ninguna validación, solo se registran los datos indicados por el usuario.
    update persona 
    set    numero_condicion_pension = 3,
           fecha_denegacion_pension = CURRENT_TIMESTAMP,
           numero_causa_den_pension=numero_causa,
           comentarios_denegacion_pension=comentarios,
           otra_causa_den_pension = otra_causa
    where  id_persona = persona_consultada;
    mensaje:='Pensión Denegada: '||mensaje_denegacion_pension;
    return mensaje;
end;
$$ language plpgsql;
