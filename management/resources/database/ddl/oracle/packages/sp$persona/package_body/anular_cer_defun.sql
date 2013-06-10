--
--Descripción: Este procedimiento anula un certificado de defuncion, revirtiendo la denegación o revocación de la pensión según corresponda
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios_anulacion: Comentarios donde el usuario indica las razones de la anulacion
--@return: Mensaje indicando que se actualizó la persona, si no se produjo ninguna excepción.
--
function anular_cer_defun(persona_consultada number) return varchar2 is
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
    --No tiene certificado de defunción: no hay nada que procesar.
    --
    elsif row_persona.certificado_defuncion is null then
        msg_string :='Persona no tiene certificado de defunción registrado';
        raise_application_error(err_number, msg_string, true);
    --
    --Pensión revocada: Se retorna al estado aprobada (queda pendente de otorgar)
    --
    elsif row_persona.numero_condicion_pension =4 and row_persona.numero_causa_rev_pension = 12 then
        update persona 
        set numero_condicion_pension =2,
            numero_causa_rev_pension =null,
            fecha_revocacion_pension=null,
            comentarios_revocacion_pension=null,
            certificado_defuncion=null,
            fecha_certificado_defuncion=null,
            es_cer_defuncion_anulado=1
        where  id_persona = persona_consultada;
        mensaje:='Certificado de Defunción Anulado. Pensión vuelve a estado aprobada';
    --
    --Pensión denegada: Se retorna al estado solicitada (su estado anterior)
    --
    elsif row_persona.numero_condicion_pension =3 and row_persona.numero_causa_den_pension = 12 then
        update persona 
        set numero_condicion_pension =1,
            numero_causa_den_pension =null,
            fecha_denegacion_pension=null,
            comentarios_denegacion_pension=null,
            certificado_defuncion=null,
            fecha_certificado_defuncion=null,
            es_cer_defuncion_anulado=1
        where  id_persona = persona_consultada;
        mensaje:='Certificado de Defunción Anulado. Pensión vuelve a estado solicitada';
    --
    --En cualquier otro caso, solamente se anula el certificado de defunción.
    --
    else
        update persona 
        set certificado_defuncion=null,
            fecha_certificado_defuncion=null,
            es_cer_defuncion_anulado=1
        where  id_persona = persona_consultada;
        mensaje:='Certificado de Defunción Anulado';
    end if;
    return mensaje;
end;
