--
--Descripción: Este procedimiento registra un certificado de vida de una persona.
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param certificado: Identificador del certificado de vida
--@param fecha_certificado: Fecha del certificado de vida
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_registrar_cer_vida(rastro number, persona_consultada number, certificado varchar2, fecha_certificado timestamp, dias_vigencia number) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$persona.registrar_cer_vida(persona_consultada,certificado,fecha_certificado,dias_vigencia);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;
