--
--Descripción: Este procedimiento otorga las pensiones aprobadas 
--@param rastro: Identificador del proceso ejecutado.
--@param ubicacion_consultada: Identificador de la ubicacion a consultar
--@param numero_resolucion: numero de la resolución en la que se otorgan las pensiones
--@param fecha_resolucion: fecha de la resolución en la que se otorgan las pensiones
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function proceso_aprobar_exclusion_pen(rastro number, codigo_sime varchar2) return number is
    mensaje varchar2(2000);
    retcode number;
begin
    mensaje:=sp$proceso.aprobar_exclusion_pen(codigo_sime);
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
/
show errors;