--
--Descripci�n: Este procedimiento acredita los potenciales beneficiarios
--@param rastro: Identificador del proceso ejecutado.
--@param ubicacion: Identificador de la ubicaci�n para filtrar potenciales beneficiarios
--@param fecha_registro_desde: Fecha de registro para filtrar potenciales beneficiarios
--@param fecha_registro_hasta: Fecha de registro para filtrar potenciales beneficiarios
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function proceso_acreditar_pot_ben(rastro number,ubicacion number,fecha_registro_desde timestamp, fecha_registro_hasta timestamp) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$proceso.acreditar_pot_ben(ubicacion,fecha_registro_desde,fecha_registro_hasta);         
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;