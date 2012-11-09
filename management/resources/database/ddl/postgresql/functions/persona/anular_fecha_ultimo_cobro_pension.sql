--
--Descripción: Este procedimiento anula la fecha del cobro de la última pensión de una persona
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios_anulacion: Comentarios donde el usuario indica las razones de la anulacion
--@return: 0 si no se produjo ninguna excepción.
--
create or replace function persona_anul_fec_ult_cob_pen(rastro bigint, persona_consultada bigint, comentarios varchar) returns integer as $$
declare
mensaje varchar:='';
begin
    select persona_anul_fec_ult_cob_pen(persona_consultada,comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento anula el último cobro de una pensión
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios_anulacion: Comentarios donde el usuario indica las razones de la anulacion
--@return: Mensaje indicando que se actualizó la persona, si no se produjo ninguna excepción.
--
create or replace function persona_anul_fec_ult_cob_pen(persona_consultada bigint, comentarios varchar) returns varchar as $$
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
    --No tiene fecha de cobro: no hay nada que procesar.
    --
    if row_persona.fecha_ultimo_cobro_pension is null then
        raise exception 'Persona no tiene Fecha de Cobro a Anular';
    end if;
    --
    --Se anula la fecha de ultimo cobro
    --
    update persona 
    set fecha_ultimo_cobro_pension=null,
        notas_anul_fec_ult_cob_pen=comentarios
    where  id_persona = persona_consultada;
    mensaje:='Fecha de cobro de última pensión anulado para '||row_persona.id_persona;
    return mensaje;
    end;
$$ language plpgsql;