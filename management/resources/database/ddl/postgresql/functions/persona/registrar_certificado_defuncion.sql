--
--Descripción: Este procedimiento registra un certificado de defuncion, revocando la pension aprobada y denegando la solicitud de pension, cuando corresponda.
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param certificado: Identificador del certificado de defuncion 
--@param fecha_certificado: Fecha del certificado de defuncion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_registrar_cer_defun(rastro bigint, persona_consultada bigint, certificado varchar, fecha_certificado timestamp) returns integer as $$
declare
mensaje varchar:='';
begin
    select persona_registrar_cer_defun(persona_consultada,certificado,fecha_certificado) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento registra un certificado de defuncion, denegando una pension solicitada o revocando una pension aprobada según corresponda.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param certificado: Identificador del certificado de defuncion 
--@param fecha_certificado: Fecha del certificado de defuncion
--@return: Mensaje indicando que se actualizo la persona, si no se produjo ninguna excepcion.
--
create or replace function persona_registrar_cer_defun(persona_consultada bigint, certificado varchar, fecha_certificado timestamp) returns varchar as $$
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
    --Persona ya tiene certificado de defuncion: no hay nada que procesar.
    --
    if row_persona.certificado_defuncion is not null and row_persona.es_cer_defuncion_anulado=0 then
        raise exception 'Persona ya tiene Certificado de Defunción Registrado (id=%)', persona_consultada;
    end if;
    --
    --Pension ya aprobada: Se revoca por fallecimiento
    --
    if row_persona.numero_condicion_pension =2 or row_persona.numero_condicion_pension =5 then
        perform persona_revocar_pension(persona_consultada, 12, null,'Certificado de Defuncion Registrado');
        update persona 
        set fecha_certificado_defuncion = fecha_certificado,
            certificado_defuncion = certificado,
            es_cer_defuncion_anulado =0,
            comentarios_anul_cer_defuncion=null
        where  id_persona = persona_consultada;
        mensaje:='Pensión Revocada por Fallecimiento';
    --
    --Pension solicitada: Se deniega por fallecimiento
    --
    elsif row_persona.numero_condicion_pension =1 then
        perform persona_denegar_pension(persona_consultada, 12, null,'Certificado de Defuncion Registrado');
        update persona 
        set fecha_certificado_defuncion = fecha_certificado,
            certificado_defuncion = certificado,
            es_cer_defuncion_anulado =0,
            comentarios_anul_cer_defuncion=null
        where  id_persona = persona_consultada;
        mensaje:='Pensión Denegada por Fallecimiento';
    --
    --En cualquier otro caso, se registra el certificado de defuncion
    --
    else
        update persona
        set fecha_certificado_defuncion = fecha_certificado,
            certificado_defuncion = certificado,
            es_cer_defuncion_anulado =0,
            comentarios_anul_cer_defuncion=null
        where  id_persona = persona_consultada;
        mensaje:='Certificado de Defunción Registrado';
    end if;
    return mensaje;
end;
$$ language plpgsql;