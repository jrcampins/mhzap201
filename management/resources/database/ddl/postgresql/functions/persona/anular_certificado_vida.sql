--
--Descripción: Este procedimiento anula un certificado de vida. 
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios_anulacion: Comentarios donde el usuario indica las razones de la anulacion
--@return: 0 si no se produjo ninguna excepción.
--
create or replace function persona_anular_cer_vida(rastro bigint, persona_consultada bigint, comentarios varchar) returns integer as $$
declare
mensaje varchar:='';
begin
    select persona_anular_cer_vida(persona_consultada,comentarios) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento anula un certificado de vida
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios_anulacion: Comentarios donde el usuario indica las razones de la anulacion
--@return: Mensaje indicando que se actualizó la persona, si no se produjo ninguna excepción.
--
create or replace function persona_anular_cer_vida(persona_consultada bigint, comentarios varchar) returns varchar as $$
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
    --No tiene certificado de vida: no hay nada que procesar.
    --
    if row_persona.certificado_vida is null or row_persona.es_certificado_vida_anulado=1  then
        raise exception 'Persona no tiene Certificado de Vida a Anular';
    --
    --Si la persona tiene certificado de vida a anular, se anula el certificado. No se hace mas nada.
    --    
    else
        update persona 
        set certificado_vida=null,
            fecha_certificado_vida=null,
            es_certificado_vida_anulado=1,
            comentarios_anul_cer_vida=comentarios
        where  id_persona = persona_consultada;
    end if;
    mensaje:='Certificado de Vida Anulado para Persona '||row_persona.id_persona;
    return mensaje;
end;
$$ language plpgsql;