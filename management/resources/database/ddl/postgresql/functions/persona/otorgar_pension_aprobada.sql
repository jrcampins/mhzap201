--
--Descripción: Este procedimiento otorga una pensión previamente aprobada
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_resolucion: numero de la resolución en la que se otorga la pensión
--@param fecha_resolucion: fecha de la resolución en la que se otorga la pensión
--@param comentarios: Comentarios del usuario
--@return: 0 si no se produjo ninguna excepción.
create or replace function persona_otorgar_pension(rastro bigint, persona_consultada bigint, numero_resolucion varchar, fecha_resolucion timestamp) returns integer as $$
declare
mensaje varchar:='';
begin
    select persona_otorgar_pension(persona_consultada,numero_resolucion, fecha_resolucion) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento aprueba una solicitud de pensión, verificando que la persona sea elegible
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_resolucion: numero de la resolución en la que se otorga la pensión
--@param fecha_resolucion: fecha de la resolución en la que se otorga la pensión
--@param comentarios: Comentarios del usuario
--@return: Mensaje indicando que se aprobó la pensión, si no se produjo ninguna excepción.
create or replace function persona_otorgar_pension(persona_consultada bigint, numero_resolucion varchar, fecha_resolucion timestamp) returns varchar as $$
declare
    row_persona persona;
    mensaje varchar:='';
begin
    select *
    into   row_persona
    from   persona as p
    where  p.id_persona = persona_consultada;
    if not found then
        raise exception 'Persona no existe (id=%)', persona_consultada;
    end if;
    --No tiene pension aprobada: No hay nada que hacer
    if (row_persona.numero_condicion_pension is null or row_persona.numero_condicion_pension <>2) then
        raise exception 'Persona no tiene pensión aprobada';
    end if;
    --La pensión es otorgada sin validar, las validaciones se hicieron en los procesos anteriores
    update persona 
    set    numero_condicion_pension = 5,
           fecha_otorgamiento_pen = CURRENT_TIMESTAMP,
           numero_resolucion_otor_pen=numero_resolucion,
           fecha_resolucion_otor_pen=fecha_resolucion
    where  id_persona = persona_consultada;
    mensaje:='Pensión Otorgada';
    return mensaje;
end;
$$ language plpgsql;

