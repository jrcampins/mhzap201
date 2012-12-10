--
--Este procedimiento valida el icv de un potencial beneficiario
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario: Id del potencial beneficiario a validar
--@param funcionario: Id del funcionario responsable de la validación
--@param comentarios: Comentarios de validación del icv
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_validar_censo(rastro number, beneficiario number, funcionario number, comentarios varchar2) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$potencial_ben.validar_censo(beneficiario,funcionario,comentarios);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;
