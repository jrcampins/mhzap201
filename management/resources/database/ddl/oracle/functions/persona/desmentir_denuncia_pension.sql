--
--Descripción: Este procedimiento desmiente una denuncia asociada con una pensión aprobada
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@comentarios: Comentarios para desmentir la denuncia
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function persona_desmentir_denu_pen(rastro number, persona_consultada number, comentarios varchar2) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$persona.desmentir_denu_pen(persona_consultada,comentarios);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;