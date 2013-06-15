--
--Descripci�n: Este procedimiento anula una objeci�n de pensi�n
--@param rastro: Identificador del proceso ejecutado.
--@param objecion_consultada: id de la objeci�n sobre la que se ejecutara la funcion
--@param comentarios: Comentarios de la anulaci�n
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function objecion_ele_pen_anular(rastro number, objecion_consultada number, comentarios varchar2) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje := sp$objecion_ele_pen.anular(objecion_consultada, comentarios);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;