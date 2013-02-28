--
--Descripción: Este procedimiento otorga las pensiones aprobadas 
--@param rastro: Identificador del proceso ejecutado.
--@param ubicacion_consultada: Identificador de la ubicacion a consultar
--@param numero_resolucion: numero de la resolución en la que se otorgan las pensiones
--@param fecha_resolucion: fecha de la resolución en la que se otorgan las pensiones
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function proceso_otorgar_pensiones_apr(rastro number,ubicacion_consultada number,numero_resolucion varchar2, fecha_resolucion timestamp, codigo_sime varchar2) return number is
    mensaje varchar2(2000);
    retcode number;
begin
    mensaje:=sp$proceso.otorgar_pensiones_apr(ubicacion_consultada,numero_resolucion,fecha_resolucion,codigo_sime);
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
/
show errors;
