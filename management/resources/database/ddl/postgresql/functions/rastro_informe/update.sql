create or replace function rastro_informe_update(rastro bigint, condicion integer, archivo varchar, mensaje varchar) returns integer as $$
declare
	ts timestamp := NULL;
begin
	if (condicion > 12) then
		ts = CURRENT_TIMESTAMP;
	end if;
	/**/
	update	rastro_informe
	set	fecha_hora_fin_ejecucion = ts,
		numero_condicion_eje_fun = condicion,
		nombre_archivo = cast(archivo as varchar(100)),
		descripcion_error = cast(mensaje as varchar(2000))
	where	id_rastro_informe = rastro
	and	numero_condicion_eje_fun < condicion;
	/**/
	if not found then
		raise exception 'informe no existe (id=%) o no se puede colocar en condicion %', rastro, condicion;
	end if;
	/**/
	return	0;
end;
$$ language plpgsql;
