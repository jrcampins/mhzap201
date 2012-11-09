create or replace function opcion_menu_reconstruir(rastro bigint) returns integer as $$
begin
	perform opcion_menu_rebuild();
	perform rastro_proceso_update(rastro, 21, null, 'arbol de opciones de menu reconstruido exitosamente');
	return 0;
end;
$$ language plpgsql;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
create or replace function opcion_menu_deploy() returns integer as $$
begin
	perform opcion_menu_rebuild();
	update opcion_menu set es_opcion_menu_inactiva=1 where codigo_opcion_menu like'N9%';
	return 0;
end;
$$ language plpgsql;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
create or replace function opcion_menu_rebuild() returns integer as $$
begin
	perform opcion_menu_update_raices(true);
	perform opcion_menu_xcopy_raices();
	return 0;
end;
$$ language plpgsql;
