--
--Descripción: Este procedimiento registra un certificado de vida de una persona.
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param certificado: Identificador del certificado de vida
--@param fecha_certificado: Fecha del certificado de vida
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_registrar_cer_vida(rastro bigint, persona_consultada bigint, certificado varchar, fecha_certificado timestamp) returns integer as $$
declare
mensaje varchar:='';
begin
    select persona_registrar_cer_vida(persona_consultada,certificado,fecha_certificado) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento registra un certificado de vida de una persona, utilizado para verificar la vigencia de una pensión.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param certificado: Identificador del certificado de vida
--@param fecha_certificado: Fecha del certificado de vida
--@return: Mensaje indicando que se actualizo la persona, si no se produjo ninguna excepcion.
--
create or replace function persona_registrar_cer_vida(persona_consultada bigint, certificado varchar, fecha_certificado timestamp) returns varchar as $$
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
    --Persona tiene certificado de defunción registrado: Será necesario anular el certificado de defunción para poder registrar el certificado de vida.
    --
    if row_persona.certificado_defuncion is not null and row_persona.es_cer_defuncion_anulado=0 then
        raise exception 'Persona tiene Certificado de Defuncion Registrado (id=%)', persona_consultada;
    --
    --Persona tiene certificado de vida: Se reemplaza por el nuevo certificado.
    --
    elsif row_persona.certificado_vida is not null and row_persona.es_certificado_vida_anulado=0 then
        update persona 
        set fecha_certificado_vida = fecha_certificado,
            certificado_vida = certificado,
            es_certificado_vida_anulado=0,
            comentarios_anul_cer_vida=null
        where  id_persona = persona_consultada;
        mensaje:='Certificado de Vida actualizado';
    --
    --En cualquier otro caso, se registra el certificado de vida
    --
    else
        update persona 
        set fecha_certificado_vida = fecha_certificado,
            certificado_vida = certificado,
            es_certificado_vida_anulado=0,
            comentarios_anul_cer_vida=null
        where  id_persona = persona_consultada;
        mensaje:='Certificado de Vida Registrado';
    end if;
    return mensaje;
end;
$$ language plpgsql;
