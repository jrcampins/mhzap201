--
--Descripción: Este procedimiento permite denunciar una pensión ya aprobada
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la solicitud
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_registrar_denu_pen(rastro bigint, persona_consultada bigint, comentarios varchar) returns integer as $$
declare
    mensaje varchar:='';
begin
    select persona_registrar_denu_pen(persona_consultada,comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento permite denunciar una pensión. Para ello verifica que la pensión ya haya sido aprobada
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la solicitud
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_registrar_denu_pen(persona_consultada bigint, comentarios varchar) returns varchar as $$
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
    --Solo se aceptan denuncias respecto a pensiones aprobadas
    if row_persona.numero_condicion_pension <>2 and row_persona.numero_condicion_pension <>5 then
        raise exception 'Persona no tiene pensión aprobada ni otorgada. No se puede registrar denuncia';
    --Solo se permite registrar una denuncia a la vez
    elsif row_persona.numero_condicion_denu_pen=1 then
        raise exception 'Persona ya tiene denuncia registrada';
    end if;
    --Se actualiza el estado de la denuncia, registrando los valores indicados por el usuario
    update persona 
    set    numero_condicion_denu_pen = 1,
           fecha_registro_denuncia_pen = CURRENT_TIMESTAMP,
           comentarios_registro_denu_pen =comentarios
    where  id_persona = persona_consultada;
    mensaje:='Denuncia Registrada';
    return mensaje;
end;
$$ language plpgsql;
