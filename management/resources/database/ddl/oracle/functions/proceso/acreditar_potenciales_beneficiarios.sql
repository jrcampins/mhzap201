--
--Descripción: Este procedimiento acredita los potenciales beneficiarios
--@param rastro: Identificador del proceso ejecutado.
--@param ubicacion: Identificador de la ubicación para filtrar potenciales beneficiarios
--@param fecha_registro_desde: Fecha de registro para filtrar potenciales beneficiarios
--@param fecha_registro_hasta: Fecha de registro para filtrar potenciales beneficiarios
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function proceso_acreditar_pot_ben(rastro number,ubicacion number,fecha_registro_desde timestamp, fecha_registro_hasta timestamp, edad_desde number, edad_hasta number) return number is
    mensaje varchar2(2000);
    retcode number;
    lote number;
begin
    lote:=rastro;
    mensaje:=sp$proceso.acreditar_pot_ben(ubicacion,fecha_registro_desde,fecha_registro_hasta,lote,edad_desde, edad_hasta);         
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;