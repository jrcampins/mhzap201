--
--Descripci�n: Este procedimiento permite registrar la entrega de documentaci�n a una pensi�n solicitada
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param cer_vida: bandera indicando si entrega certificado de vida
--@param fecha_cer_vida: bandera indicando fecha de certificado
--@param copia_cedula: bandera indicando si entrega copia cedula
--@param declaracion_jur: bandera indicando si entrega declaracion jurada
--@return: 0 si no se produjo ninguna excepcion.
--
function registrar_entrega_doc(persona_consultada number, cert_vida varchar2, fecha_cert_vida timestamp, copia_cedula number, declaracion_jur number) return varchar2 is
    mensaje varchar2(200);
    mensaje_int varchar2(200);
    row_persona persona%rowtype;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
begin
    begin
        select *  into   row_persona from   persona p where  p.id_persona = persona_consultada;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'Persona no existe (id='||persona_consultada||')';
        raise_application_error(err_number, msg_string, true);
    --Solo se aceptan denuncias respecto a pensiones aprobadas
    elsif row_persona.numero_condicion_pension <>5 then
        msg_string := 'Persona no tiene pensi�n otorgada. No se puede registrar documentaci�n';
        raise_application_error(err_number, msg_string, true);
    --Se registra la entrega de documentaci�n
    else
        --Se registra el certificado de vida:
        mensaje:=registrar_cer_vida(persona_consultada, cert_vida, fecha_cert_vida);
        --Se actualiza copia_cedula y declaraci�n jurada
        update persona 
        set    es_persona_con_copia_cedula = copia_cedula,
               es_persona_con_declaracion_jur = declaracion_jur
        where  id_persona = persona_consultada;
        mensaje:='Documentos Registrados. '||mensaje;
    end if;
    return mensaje;
end;