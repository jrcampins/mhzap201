--
--Este procedimiento desactiva un potencial beneficiario
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario: Id del potencial beneficiario sobre el que se ejecuta el proceso.
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_desactivar(rastro number, beneficiario number) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$potencial_ben.desactivar(beneficiario);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;