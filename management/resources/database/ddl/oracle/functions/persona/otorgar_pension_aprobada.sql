--
--Descripci�n: Este procedimiento otorga una pensi�n previamente aprobada
--@param rastro: Identificador del proceso ejecutado.
--@param persona_consultada: id de la persona sobre la que se ejecutara la funcion
--@param numero_resolucion: numero de la resoluci�n en la que se otorga la pensi�n
--@param fecha_resolucion: fecha de la resoluci�n en la que se otorga la pensi�n
--@param comentarios: Comentarios del usuario
--@return: 0 si no se produjo ninguna excepci�n.
create or replace function persona_otorgar_pension(rastro number, persona_consultada number, numero_resolucion varchar2, fecha_resolucion timestamp, comentarios varchar2) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$persona.otorgar_pension(persona_consultada,numero_resolucion, fecha_resolucion, comentarios);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;
