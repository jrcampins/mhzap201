--
--Descripción: Este procedimiento exporta las pensiones aprobadas a un archivo
--@param codigo_sime: código sime de las pensiones a exportar
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function proceso_exp_pen_den(rastro number,codigo_sime varchar2) return number is
    mensaje varchar2(2000);
    nombre_archivo varchar2(2000);
    retcode number;
begin
    nombre_archivo:='archivo_'||rastro||'.csv';
    mensaje:=sp$proceso.exportar_pen_den(nombre_archivo, codigo_sime);
    if mensaje like '% Personas con pensión denegada exportadas' then
        return rastro_proceso_update(rastro, 21,nombre_archivo, mensaje);
    else
        return rastro_proceso_update(rastro, 23,null, mensaje);
    end if;
end;
/
show errors;