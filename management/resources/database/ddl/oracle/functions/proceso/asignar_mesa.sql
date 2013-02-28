--
--Descripción: Este procedimiento asigna mesa a un lote de potenciales beneficiarios
--@param rastro: Identificador del proceso ejecutado.
--@param lote: Identificador del lote
--@param sime: Número de mesa de entrada
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function proceso_asignar_mesa(rastro number,lote number,sime varchar2) return number is
    mensaje varchar2(2000);
    retcode number;
begin
    mensaje:=sp$proceso.asignar_mesa(lote,sime);         
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;