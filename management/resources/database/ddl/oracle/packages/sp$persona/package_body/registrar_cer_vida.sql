--
--Descripción: Este procedimiento registra un certificado de vida de una persona, utilizado para verificar la vigencia de una pensión.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param certificado: Identificador del certificado de vida
--@param fecha_certificado: Fecha del certificado de vida
--@return: Mensaje indicando que se actualizo la persona, si no se produjo ninguna excepcion.
--
function registrar_cer_vida(persona_consultada number, certificado varchar2, fecha_certificado timestamp, dias_vigencia number) return varchar2 is
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
    --Persona tiene certificado de defunción registrado: Será necesario anular el certificado de defunción para poder registrar el certificado de vida.
    --
    elsif row_persona.certificado_defuncion is not null and row_persona.es_cer_defuncion_anulado=0 then
        msg_string := 'Error: Persona tiene Certificado de Defuncion Registrado (id='|| persona_consultada||')';
        raise_application_error(err_number, msg_string, true);
    --
    --Persona tiene certificado de vida: Se reemplaza por el nuevo certificado.
    --
    elsif row_persona.certificado_vida is not null and row_persona.es_certificado_vida_anulado=0 then
        if dias_vigencia is not null and dias_vigencia>0 then
            update persona 
            set fecha_certificado_vida = fecha_certificado,
                certificado_vida = certificado,
                dias_vigencia_certificado_vida=dias_vigencia,
                es_certificado_vida_anulado=0,
                es_persona_con_cer_vida=1
            where  id_persona = persona_consultada;
            mensaje:='Certificado de Vida actualizado';
        else
            update persona 
            set fecha_certificado_vida = fecha_certificado,
                certificado_vida = certificado,
                dias_vigencia_certificado_vida=90,
                es_certificado_vida_anulado=0,
                es_persona_con_cer_vida=1
            where  id_persona = persona_consultada;
            mensaje:='Certificado de Vida actualizado. No se especificaron días de vigencia, se toman 90 días por defecto';
       end if;
    --
    --En cualquier otro caso, se registra el certificado de vida
    --
    else
        if dias_vigencia is not null and dias_vigencia>0 then
            update persona 
            set fecha_certificado_vida = fecha_certificado,
                certificado_vida = certificado,
                es_certificado_vida_anulado=0,
                dias_vigencia_certificado_vida=dias_vigencia,
                es_persona_con_cer_vida=1
            where  id_persona = persona_consultada;
            mensaje:='Certificado de Vida Registrado';
        else
            update persona 
            set fecha_certificado_vida = fecha_certificado,
                certificado_vida = certificado,
                es_certificado_vida_anulado=0,
                dias_vigencia_certificado_vida=90,
                es_persona_con_cer_vida=1
            where  id_persona = persona_consultada;
            mensaje:='Certificado de Vida Registrado. No se especificaron días de vigencia, se toman 90 días por defecto';
        end if;
    end if;
    return mensaje;
end;
