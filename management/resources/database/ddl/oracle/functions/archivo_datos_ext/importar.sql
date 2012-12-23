-- 
-- Este procedimiento importa un archivo de datos externos
-- @param rastro: Identificador del proceso ejecutado.
-- @param archivo: id del archivo sobre el que ejecutará el proceso
-- @returns el valor de retorno
--
create or replace function archivo_datos_ext_importar(rastro number, archivo number)return number is
    mensaje varchar2(2000);
    retcode number;
begin
    mensaje:=sp$archivo_datos_ext.importar(archivo);       
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);        
    return retcode;
end;
/
show errors;