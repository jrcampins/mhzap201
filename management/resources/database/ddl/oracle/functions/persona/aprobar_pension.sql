--
--Descripción: Este procedimiento aprueba una solicitud de pensión, verificando que la persona sea elegible.
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param comentarios: Comentarios del usuario
--@return: 0 si no se produjo ninguna excepción.
--
create or replace function persona_aprobar_pension(rastro number, persona_consultada number, comentarios varchar2) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$persona.aprobar_pension(persona_consultada,comentarios);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;
