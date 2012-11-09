create or replace function ubicacion_reconstruir(rastro bigint) returns integer as $$
declare
    ok integer := 0;
begin
    perform ubicacion_rebuild();
    perform rastro_proceso_update(rastro, 21, null, 'arbol de ubicaciones reconstruido exitosamente');
    return ok;
end;
$$ language plpgsql;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
create or replace function ubicacion_rebuild() returns integer as $$
declare
    ok integer := 0;
begin
    perform ubicacion_update_raices(true);
    perform ubicacion_xcopy_raices();
    return ok;
end;
$$ language plpgsql;
