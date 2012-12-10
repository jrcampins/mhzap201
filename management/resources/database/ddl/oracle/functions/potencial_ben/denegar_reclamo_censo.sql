--
--Descripción: Este procedimiento deniega un reclamo de censo
--@param rastro: Identificador del proceso ejecutado.
--@param beneficiario_consultado: id del potencial beneficiario sobre el que se ejecutara la funcion
--@param numero_causa: numero de la causa de denegación
--@param otra_causa: descripcion de otra causa de denegación
--@param comentarios: Comentarios de la denegacion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function potencial_ben_denegar_recl_cen(rastro number, beneficiario_consultado number, numero_causa number, otra_causa varchar2, comentarios varchar2) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$potencial_ben.denegar_recl_cen(beneficiario_consultado, numero_causa, otra_causa, comentarios);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;
