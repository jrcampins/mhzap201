--
--Descripción: Este procedimiento registra un certificado de defuncion, denegando una pension solicitada o revocando una pension aprobada según corresponda.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param certificado: Identificador del certificado de defuncion 
--@param fecha_certificado: Fecha del certificado de defuncion
--@return: Mensaje indicando que se actualizo la persona, si no se produjo ninguna excepcion.
--
function registrar_cer_defun(persona_consultada number, certificado varchar2, fecha_certificado timestamp) return varchar2 is
    mensaje varchar2(200);
    mensaje_int varchar2(200);
    row_persona persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
        select * into row_persona from persona p where  p.id_persona = persona_consultada;
    exception
        when no_data_found then null;
    end;
    if not sql%found then

        msg_string := 'Persona no existe (id='||persona_consultada||')';
        raise_application_error(err_number, msg_string, true);
    --
    --Persona ya tiene certificado de defuncion: no hay nada que procesar.
    --
    elsif row_persona.certificado_defuncion is not null and row_persona.es_cer_defuncion_anulado=0 then
        mensaje := 'Error: Persona ya tiene Certificado de Defunción Registrado ';
    --
    --Pension ya aprobada: Se revoca por fallecimiento
    --
    elsif row_persona.numero_condicion_pension =2 or row_persona.numero_condicion_pension =5 then
        mensaje_int:=sp$persona.revocar_pension(persona_consultada, 12, null,'Certificado de Defuncion Registrado');
        update persona 
        set fecha_certificado_defuncion = fecha_certificado,
            certificado_defuncion = certificado,
            es_cer_defuncion_anulado =0,
            comentarios_anul_cer_defuncion=null
        where  id_persona = persona_consultada;
        mensaje:='Certificado de Defunción Registrado. Pensión Revocada por Fallecimiento';
    --
    --Pension solicitada: Se deniega por fallecimiento
    --
    elsif row_persona.numero_condicion_pension =1 then
        mensaje_int:=sp$persona.objetar_pension(persona_consultada, 12, null, 'Certificado de Defuncion Registrado');
        update persona 
        set fecha_certificado_defuncion = fecha_certificado,
            certificado_defuncion = certificado,
            es_cer_defuncion_anulado =0,
            comentarios_anul_cer_defuncion=null
        where  id_persona = persona_consultada;
        mensaje:='Certificado de Defunción Registrado. Pensión Denegada por Fallecimiento';

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