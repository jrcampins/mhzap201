--
--Descripción: Este procedimiento realiza las aprobaciones y denegaciones correspondientes,
--procesa las reconsideraciones y denuncias
--@param rastro: Identificador del proceso ejecutado.
--@param ubicacion_consultada: Identificador de la ubicacion a consultar
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function proceso_preparar_prox_pago_pen(rastro number,ubicacion_consultada number,fecha_solicitud_desde timestamp, fecha_solicitud_hasta timestamp) return number is
    mensaje varchar2(200);
    retcode number;
begin
    mensaje:=sp$proceso.preparar_prox_pago_pen(ubicacion_consultada,fecha_solicitud_desde, fecha_solicitud_hasta);
    retcode := rastro_proceso_update(rastro, 21, null, mensaje);
    return retcode;
end;
/
show errors;