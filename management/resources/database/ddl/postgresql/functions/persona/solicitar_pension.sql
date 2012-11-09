--
--Descripci�n: Este procedimiento solicita una pensi�n a una persona
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la revocaci�n
--@return: mensaje indicando el resultado de la acreditaci�n
--
create or replace function persona_solicitar_pension(rastro bigint, persona_consultada bigint, comentarios varchar) returns integer as $$
declare
mensaje varchar:='';
begin
    select persona_solicitar_pension(persona_consultada,comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripci�n: Este procedimiento solicita una pensi�n a una persona, verificando que la persona 
--cumpla los requisitos personales est� acreditada y sea elegible
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la revocaci�n
--@return: mensaje indicando el resultado de la acreditaci�n
--
create or replace function persona_solicitar_pension(persona_consultada bigint, comentarios varchar) returns varchar as $$
declare
    mensaje varchar:='';
    row_persona persona;
    condicion_elegibilidad integer:=0;
    requisitos_personales integer:=0;
begin
    select *
    into   row_persona
    from   persona as p
    where  p.id_persona = persona_consultada;
    if not found then
        raise exception 'Persona no existe (id=%)', persona_consultada;
    end if;
    --Si la persona tiene pensi�n solicitada no puede volver a solicitarla
    if row_persona.numero_condicion_pension =1 then
        raise exception 'Persona ya tiene pensi�n solicitada';
    --Si la persona ya tiene pensi�n aprobada no puede volver a solicitarla
    elsif row_persona.numero_condicion_pension =2 then
        raise exception 'Persona ya tiene pensi�n aprobada';
    --Si la persona ya tiene pensi�n denegada no puede volver a solicitarla, 
    --el proceso de reconsideraciones se encargar� de reprocesar esa solicitud
    elsif row_persona.numero_condicion_pension =3 then
        raise exception 'Persona ya tiene pensi�n denegada';
    --Si la persona ya tiene pensi�n revocada no puede volver a solicitarla, 
    --el proceso de reconsideraciones se encargar� de reprocesar esa solicitud
    elsif row_persona.numero_condicion_pension =4 then
        raise exception 'Persona ya tiene pensi�n revocada';
    end if;
    --Si la persona no cumple requisitos personales no se le puede solicitar la pensi�n
    requisitos_personales:=persona_consultar_requisitos_personales(persona_consultada);
    if requisitos_personales=12 then
        raise exception 'Persona Fallecida';
    end if;
    if requisitos_personales=13 then
        raise exception 'Persona no es Paraguayo Natural';
    end if;
    if requisitos_personales=14 then
        raise exception 'Persona no es mayor de 65 a�os';
    end if;
    --Se solicita la pensi�n de la persona
    update persona 
    set    numero_condicion_pension = 1,
           fecha_solicitud_pension = CURRENT_TIMESTAMP,
           comentarios_solicitud_pension=comentarios
    where  id_persona = persona_consultada;
    mensaje:='Pensi�n solicitada';
    return mensaje;
end;
$$ language plpgsql;
