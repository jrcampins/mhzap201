--
--Descripción: Este procedimiento solicita una pensión a una persona
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la revocación
--@return: mensaje indicando el resultado de la acreditación
--
create or replace function persona_solicitar_pension(rastro number, persona_consultada number, comentarios varchar2) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$persona.solicitar_pension(persona_consultada,comentarios);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;