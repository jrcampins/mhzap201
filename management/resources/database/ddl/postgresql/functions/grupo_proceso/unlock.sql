create or replace function grupo_proceso_unlock(grupo bigint) returns integer as $$
begin
        update	grupo_proceso
        set	id_rastro_proceso = null,
                numero_condicion_eje_fun = null
        where	id_grupo_proceso = grupo;
        /**/
	return 0;
end;
$$ language plpgsql;
