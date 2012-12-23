--
--Descripción: Este procedimiento actualiza las pensiones aprobadas, denegadas y revocadas en el JUPE 
--@param rastro: Identificador del proceso ejecutado.
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function proceso_importar_archivos_ext(rastro number) return number is
    mensaje varchar2(2000);
    retcode number;
    param varchar2(200);--Un parametro por si necesitas enviarle algo
begin
    mensaje:=sp$proceso.importar_archivos_ext(param);         
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;