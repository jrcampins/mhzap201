--
--Descripción: Este procedimiento registra un certificado de defuncion, revocando la pension aprobada y denegando la solicitud de pension, cuando corresponda.
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param certificado: Identificador del certificado de defuncion 
--@param fecha_certificado: Fecha del certificado de defuncion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_registrar_cer_defun(rastro number, persona_consultada number, certificado varchar2, fecha_certificado timestamp) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$persona.registrar_cer_defun(persona_consultada,certificado,fecha_certificado);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;
