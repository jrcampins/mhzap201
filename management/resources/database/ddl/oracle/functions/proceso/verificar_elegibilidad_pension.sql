--
--Descripción: Este procedimiento realiza las verificaciones necesarias para 
--validar la elegibilidad de potenciales beneficiarios
--@param rastro: Identificador del proceso ejecutado.
--@param ubicacion_consultada: Identificador de la ubicacion a consultar
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function proceso_verificar_ele_pen(rastro number,ubicacion_consultada number) return number is
    mensaje varchar2(2000);
    retcode number;
begin
    mensaje:=sp$proceso.verificar_ele_pen(ubicacion_consultada);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;
