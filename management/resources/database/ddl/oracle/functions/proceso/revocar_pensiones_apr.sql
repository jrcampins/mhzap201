--
--Descripción: Este procedimiento otorga las pensiones aprobadas 
--@param rastro: Identificador del proceso ejecutado.
--@param ubicacion_consultada: Identificador de la ubicacion a consultar
--@param numero_resolucion: numero de la resolución en la que se otorgan las pensiones
--@param fecha_resolucion: fecha de la resolución en la que se otorgan las pensiones
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function proceso_revocar_pensiones_apr(rastro number,codigo_sime varchar2,fecha_resolucion timestamp,numero_resolucion varchar2, cedula_desde varchar2, cedula_hasta varchar2) return number is
    mensaje varchar2(2000);
    retcode number;
begin
    mensaje:=sp$proceso.revocar_pensiones_apr(codigo_sime,fecha_resolucion,numero_resolucion,cedula_desde, cedula_hasta);
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
/
show errors;