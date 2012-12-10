--
--Este procedimiento valida el icv de un potencial beneficiario
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario: Id del potencial beneficiario a invalidar
--@param funcionario: Id del funcionario responsable de la invalidación
--@param numero_causa: Numero de la causa de la invalidación
--@param otra_casa: Otra causa para la invalidación
--@param comentarios: Comentarios de validación del icv
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_invalidar_censo(rastro number, beneficiario number, funcionario number, numero_causa number, otra_causa varchar2, comentarios varchar2) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$potencial_ben.invalidar_censo(beneficiario, funcionario, numero_causa, otra_causa, comentarios);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;
