create or replace function rastro_proceso_check(rastro bigint, condicion integer) returns integer as $$
declare
	condicion_proceso integer;
	row_rastro_proceso rastro_proceso;
	row_grupo_proceso grupo_proceso;
begin
        select  *
        into    row_rastro_proceso
        from    rastro_proceso
        where   id_rastro_proceso = rastro;
        if not found then
		raise exception 'proceso no existe (id=%)', rastro;
        elseif (row_rastro_proceso.numero_condicion_eje_fun <> condicion) then
		raise exception 'proceso % no se encuentra en condicion % sino en condicion %', rastro, condicion, row_rastro_proceso.numero_condicion_eje_fun;
        elseif (row_rastro_proceso.id_rastro_proceso_superior is not null) then
		select	rastro_proceso_check(row_rastro_proceso.id_rastro_proceso_superior, 12) into condicion_proceso;
        elseif (row_rastro_proceso.id_grupo_proceso is not null) then
		select  *
		into    row_grupo_proceso
		from    grupo_proceso
		where   id_grupo_proceso = row_rastro_proceso.id_grupo_proceso;
		if not found then
			raise exception 'grupo no existe (id=%)', row_rastro_proceso.id_grupo_proceso;
		elseif (row_grupo_proceso.id_rastro_proceso is null or row_grupo_proceso.id_rastro_proceso <> row_rastro_proceso.id_rastro_proceso) then
			raise exception 'grupo no esta ejecutando el proceso (grupo=%, proceso=%)', row_rastro_proceso.id_grupo_proceso, row_rastro_proceso.id_rastro_proceso;
		elseif (row_grupo_proceso.numero_condicion_eje_fun is null or row_grupo_proceso.numero_condicion_eje_fun > 12) then
			raise exception 'grupo no esta ejecutando el proceso (grupo=%, proceso=%)', row_rastro_proceso.id_grupo_proceso, row_rastro_proceso.id_rastro_proceso;
		else
			condicion_proceso = row_grupo_proceso.numero_condicion_eje_fun;
		end if;
	else
		condicion_proceso = condicion;
        end if;
	return condicion_proceso;
end;
$$ language plpgsql;
