create or replace function ubicacion_reconstruir(rastro number) return number is
    retcode number;
begin
    retcode := sp$ubicacion.rebuild();
    retcode := rastro_proceso_update(rastro, 21, null, 'arbol de ubicaciones reconstruido exitosamente');
    return 0;
end;
/
show errors
