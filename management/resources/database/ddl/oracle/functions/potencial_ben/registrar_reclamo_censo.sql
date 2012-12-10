--
--Descripción: Este procedimiento permite registrar un reclamo relacionado con un censo
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario_consultado: id del potencial beneficiario sobre el que se ejecutara la funcion
--@param comentarios: Comentarios del reclamo
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_reg_recl_cen(rastro number, beneficiario_consultado number, comentarios varchar2) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$potencial_ben.reg_recl_cen(beneficiario_consultado,comentarios);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;
