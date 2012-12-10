--
--Descripción: Este procedimiento permite acreditar un potencial beneficiario
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario_consultado: id del potencial beneficiario sobre el que se ejecutara la funcion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_acreditar(rastro number, beneficiario_consultado number) return integer is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$potencial_ben.acreditar(beneficiario_consultado); 
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;

