-- delimiter ??
create or replace function rol_modificar_conjunto(rastro bigint, r bigint, c bigint, segmentada integer) returns integer as $$
declare
	mensaje varchar;
begin
	mensaje = rol_modificar_conjunto(r, c, segmentada);
	return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
-- ??
create or replace function rol_modificar_conjunto(r bigint, c bigint, segmentada integer) returns varchar as $$
declare
	row_rol rol;
	row_conjunto_segmento conjunto_segmento;
--	row_clase_recurso clase_recurso;
	mensaje varchar;
begin
	select * into row_rol from rol where id_rol = r;
	if not found then
		raise exception 'rol no existe (id=%)', r;
	end if;
	/**/
	select * into row_conjunto_segmento from conjunto_segmento where id_conjunto_segmento = c;
	if not found then
		raise exception 'conjunto de segmentos no existe (id=%)', c;
	end if;
	/*
	select * into row_clase_recurso from clase_recurso where id_clase_recurso = row_conjunto_segmento.id_clase_recurso;
	if not found then
		raise exception 'clase de recursos no existe (id=%)', row_conjunto_segmento.id_clase_recurso;
	end if;
	*/
	if segmentada <> 0 then
--		mensaje = 'se modificaron solo las funciones del rol que ya estaban segmentadas con un conjunto de segmentos de la clase "' || row_clase_recurso.nombre_clase_recurso || '"';
		mensaje = 'se modificaron solo las funciones del rol que ya estaban segmentadas con un conjunto de la misma clase del conjunto de segmentos especificado';
		update	rol_funcion
		set	id_conjunto_segmento = c
		where	id_rol = r
		and	id_conjunto_segmento in
			(
			select	id_conjunto_segmento
			from	conjunto_segmento
			where	id_clase_recurso = row_conjunto_segmento.id_clase_recurso
			)
		and	id_conjunto_segmento <> c;
	else
		mensaje = 'se modificaron todas las funciones del rol que podian ser segmentadas utilizando el conjunto de segmentos especificado';
		update	rol_funcion
		set	id_conjunto_segmento = c
		where	id_rol = r
		and	id_funcion in
			(
			select	id_funcion
			from	funcion
			inner	join dominio on dominio.id_dominio = funcion.id_dominio
			inner	join clase_recurso on clase_recurso.id_clase_recurso = dominio.id_clase_recurso
			where	funcion.es_segmentada = 1
			and	clase_recurso.id_clase_recurso_segmento = row_conjunto_segmento.id_clase_recurso
			)
		and	(id_conjunto_segmento is null or id_conjunto_segmento <> c);
	end if;
	/**/
	return mensaje;
end;
$$ language plpgsql;
-- ??
