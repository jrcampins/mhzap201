create or replace function grupo_proceso_lock(rastro bigint, f bigint) returns bigint as $$
declare
	grupo bigint;
	codigo varchar;
begin
	select	id_grupo_proceso
	into	grupo
	from	funcion
	where	id_funcion = f;
        /**/
        if not found then
		raise exception 'funcion no existe (id=%)', f;
        end if;
	/**/
	if (grupo is not null) then
		select	codigo_grupo_proceso
		into	codigo
		from	grupo_proceso
		where	id_grupo_proceso = grupo;
		/**/
		update	grupo_proceso
		set	id_rastro_proceso = rastro,
			numero_condicion_eje_fun = 11
		where	id_grupo_proceso = grupo 
		and 	(
			numero_condicion_eje_fun is null 
		or 	numero_condicion_eje_fun > 12
			);
		/**/
		if not found then
			raise exception 'no se puede ejecutar este proceso en este momento porque se esta ejecutando otro proceso del grupo %', codigo;
		end if;
	end if;
	return grupo;
end;
$$ language plpgsql;
