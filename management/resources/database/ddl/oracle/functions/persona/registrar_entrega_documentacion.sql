--
--Descripción: Este procedimiento permite registrar la entrega de documentación a una pensión solicitada
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param cer_vida: bandera indicando si entrega certificado de vida
--@param fecha_cer_vida: bandera indicando fecha de certificado
--@param copia_cedula: bandera indicando si entrega copia cedula
--@param declaracion_jur: bandera indicando si entrega declaracion jurada
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_registrar_entrega_doc(rastro number, persona_consultada number, cert_vida varchar2, fecha_cert_vida timestamp, copia_cedula number, declaracion_jur number) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$persona.registrar_entrega_doc(persona_consultada, cert_vida, fecha_cert_vida, copia_cedula, declaracion_jur);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;