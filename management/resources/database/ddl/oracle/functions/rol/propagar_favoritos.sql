create or replace function rol_propagar_favoritos(rastro number, rol number) return number is
    retcode number;
begin
    retcode := sp$rol.propagar_favoritos(rol);
    retcode := rastro_proceso_update(rastro, 21, null, 'favoritos propagados exitosamente');
    return 0;
end;
/
show errors
