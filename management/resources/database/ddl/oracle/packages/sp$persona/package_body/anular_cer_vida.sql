--
--Descripción: Este procedimiento anula un certificado de vida
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios_anulacion: Comentarios donde el usuario indica las razones de la anulacion
--@return: Mensaje indicando que se actualizó la persona, si no se produjo ninguna excepción.
--
function anular_cer_vida(persona_consultada number, comentarios varchar2) return varchar2 is
    mensaje varchar2(200);
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
    --No tiene certificado de vida: no hay nada que procesar.
    --
    elsif row_persona.certificado_vida is null or row_persona.es_certificado_vida_anulado=1  then
        msg_string := 'Persona no tiene Certificado de Vida a Anular';
        raise_application_error(err_number, msg_string, true);
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
        mensaje:='Certificado de Vida Anulado para Persona '||row_persona.id_persona;
    end if;
    return mensaje;
end;
