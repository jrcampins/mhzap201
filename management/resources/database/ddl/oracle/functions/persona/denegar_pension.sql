--
--Descripción: Este procedimiento deniega una solicitud de pensión
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_causa: numero de la causa de denegación
--@param otra_causa: descripcion de otra causa de denegación
--@param comentarios: Comentarios de la denegacion
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_denegar_pension(rastro number, persona_consultada number, numero_causa integer, otra_causa varchar2, numero_res varchar2, fecha_res timestamp, comentarios varchar2) return integer is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$persona.denegar_pension(persona_consultada, numero_causa, otra_causa, numero_res, fecha_res, comentarios);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;