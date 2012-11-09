create or replace function opcion_menu_reconstruir(rastro number) return number is
    retcode number;
begin
    retcode := sp$opcion_menu.rebuild();
    retcode := rastro_proceso_update(rastro, 21, null, 'arbol de opciones de menu reconstruido exitosamente');
    return 0;
end;
/
show errors
