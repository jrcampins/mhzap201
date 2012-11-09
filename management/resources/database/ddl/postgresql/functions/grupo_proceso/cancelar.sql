create or replace function grupo_proceso_cancelar(rastro bigint, grupo bigint) returns integer as $$
begin
	perform grupo_proceso_unlock(grupo);
	perform rastro_proceso_update(rastro, 21, null, 'la ejecución del proceso del grupo ha sido cancelada');
	return 0;
end;
$$ language plpgsql;
