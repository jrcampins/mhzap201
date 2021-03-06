--
--Descripción: Este procedimiento otorga las pensiones aprobadas 
--@param rastro: Identificador del proceso ejecutado.
--@param ubicacion_consultada: Identificador de la ubicacion a consultar
--@param numero_resolucion: numero de la resolución en la que se otorgan las pensiones
--@param fecha_resolucion: fecha de la resolución en la que se otorgan las pensiones
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function proceso_denegar_pensiones_obj(rastro number,ubicacion_consultada number,numero_resolucion varchar2, fecha_resolucion timestamp, sime varchar2, cedula_desde varchar2, cedula_hasta varchar2) return number is
    mensaje varchar2(2000);
    retcode number;
begin
    mensaje:=sp$proceso.denegar_pensiones_obj(ubicacion_consultada,numero_resolucion,fecha_resolucion,sime, cedula_desde, cedula_hasta);
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
/
show errors;
