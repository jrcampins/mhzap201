--
--Descripción: Este procedimiento permite registrar la ultima visita del censo de un potencial beneficiario
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario: id del beneficiario sobre el que se ejecutara la funcion
--@param fecha: Fecha de la ultima visita
--@param funcionario: Funcionario que realiza la visita
--@param comentarios: Comentarios de la solicitud
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_reg_ult_vis_cen(rastro number, beneficiario number, fecha timestamp, funcionario number, comentarios varchar2) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$potencial_ben.reg_ult_vis_cen( beneficiario, fecha, funcionario, comentarios);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;