create or replace function rol_propagar_filtros(rastro number, rol number) return number is
    retcode number;
begin
    retcode := sp$rol.propagar_filtros(rol);
    retcode := rastro_proceso_update(rastro, 21, null, 'filtros propagados exitosamente');
    return 0;
end;
/
show errors
