-- 
-- Este procedimiento calcula el icv de una ficha hogar
-- @param rastro: Identificador del proceso ejecutado.
-- @param id_ficha_hogar: La ficha hogar a la que se le calculará el icv
-- @returns el valor del icv 
--
create or replace function ficha_hogar_calcular_icv(rastro number, ficha_hogar number)return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$ficha_hogar.calcular_icv(ficha_hogar);       
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);        
    return retcode;
end;
/
show errors;