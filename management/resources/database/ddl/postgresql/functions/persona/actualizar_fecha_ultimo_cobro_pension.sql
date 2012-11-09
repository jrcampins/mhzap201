--
--Descripción: Este procedimiento actualiza la fecha en que se registró el último cobro de pensión de una persona.
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param fecha_cobro: Fecha de cobro
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_act_fec_ult_cob_pen(rastro bigint, persona_consultada bigint, fecha_cobro timestamp) returns integer as $$
declare
mensaje varchar:='';
begin
    select persona_act_fec_ult_cob_pen(persona_consultada,fecha_cobro) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento registra el ultimo cobro de la pension de una persona
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param fecha_cobro: Fecha de cobro
--@return: Mensaje indicando que se actualizo la persona, si no se produjo ninguna excepcion.
--
create or replace function persona_act_fec_ult_cob_pen(persona_consultada bigint, fecha_cobro timestamp) returns varchar as $$
declare
    mensaje varchar:='';
    row_persona persona;
begin
    select * 
    into row_persona
    from   persona as p
    where  p.id_persona = persona_consultada;
    if not found then
        raise exception 'Persona no existe (id=%)', persona_consultada;
    end if;
    --
    --Persona debe tener pensión aprobada
    --
    if row_persona.numero_condicion_pension<>2 then
        raise exception 'Persona no tiene pensión aprobada (id=%)', persona_consultada;
    --
    --Se reemplaza la fecha de cobro por la recibida
    --
    else
        update persona 
        set fecha_ultimo_cobro_pension = fecha_cobro
        where  id_persona = persona_consultada;
        mensaje:='Último Cobro Registrado';
    end if;
    return mensaje;
end;
$$ language plpgsql;