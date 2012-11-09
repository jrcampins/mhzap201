create or replace function rastro_proceso_check_update(rastro bigint) returns integer as $$
declare
	condicion_proceso integer;
begin
	select	rastro_proceso_check(rastro, 11) into condicion_proceso;
	/**/
	update	rastro_proceso
	set	numero_condicion_eje_fun = 12,
		descripcion_error = 'ejecucion del proceso ' || rastro || ' en progreso'
	where	id_rastro_proceso = rastro
	and	numero_condicion_eje_fun = 11;
	/**/
	if not found then
		raise exception 'proceso % no se puede colocar en condicion %', rastro, 12;
	end if;
	/**/
	return	condicion_proceso;
end;
$$ language plpgsql;
