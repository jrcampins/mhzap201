--
--Descripción: Este procedimiento actualiza las pensiones aprobadas, denegadas y revocadas en el JUPE 
--@param rastro: Identificador del proceso ejecutado.
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function proceso_actualizar_pen_en_jupe(rastro number, sime varchar2) return number is
    mensaje varchar2(200);
    retcode number;
    param varchar2(200);--Un parametro por si necesitas enviarle algo
begin
    mensaje:=sp$proceso.actualizar_pen_en_jupe(param, sime);         
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;