--
--Descripci�n: Este procedimiento deniega una solicitud de reconsideraci�n de pensi�n
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: numero de la causa de denegaci�n
--@param otra_causa: descripcion de otra causa de denegaci�n
--@param comentarios: Comentarios de la denegacion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_denegar_reco_pen(rastro number, persona_consultada number, numero_causa number, otra_causa varchar2, comentarios varchar2) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$persona.denegar_reco_pen(persona_consultada, numero_causa, otra_causa, comentarios);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;