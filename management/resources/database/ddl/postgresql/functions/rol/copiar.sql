-- delimiter ??
create or replace function rol_copiar(rastro bigint, id_rol_viejo bigint, codigo varchar, nombre varchar) returns integer as $$
begin
	perform rol_copiar(id_rol_viejo, codigo, nombre);
	return rastro_proceso_update(rastro, 21, null, 'rol copiado exitosamente');
end;
$$ language plpgsql;
-- ??
create or replace function rol_copiar(id_rol_viejo bigint, codigo varchar, nombre varchar) returns integer as $$
declare
	row_rol rol;
	row_rol_funcion rol_funcion;
	id_rol_nuevo bigint;
	id_rol_funcion_nuevo bigint;
	codigo_rol_nuevo varchar;
	nombre_rol_nuevo varchar;
	descripcion_rol_nueva varchar;
begin
	select * into row_rol from rol where id_rol = id_rol_viejo;
	if not found then
		raise exception 'rol no existe (id=%)', id_rol_viejo;
	end if;
	/**/
	select bigintid() into id_rol_nuevo;
	/**/
	if codigo is not null then
		codigo_rol_nuevo = cast(codigo as varchar(100));
	else
		codigo_rol_nuevo = cast(row_rol.codigo_rol as varchar(80)) || cast(id_rol_nuevo as varchar(20));
	end if;
	/**/
	if nombre is not null then
		nombre_rol_nuevo = cast(nombre as varchar(100));
	else
		nombre_rol_nuevo = row_rol.nombre_rol;
	end if;
	/**/
	descripcion_rol_nueva = '*** Copia de ' || row_rol.codigo_rol || ' ***';
	/*
	raise notice 'id=%, codigo=%, nombre=%, id=%, codigo=%, nombre=%', row_rol.id_rol, row_rol.codigo_rol, row_rol.nombre_rol, id_rol_nuevo, codigo_rol_nuevo, nombre_rol_nuevo;
	*/
	insert into rol (id_rol, codigo_rol, nombre_rol, descripcion_rol)
	values (id_rol_nuevo, codigo_rol_nuevo, nombre_rol_nuevo, descripcion_rol_nueva);
	/*
  	insert into rol_funcion (id_rol_funcion, id_rol, id_funcion, id_conjunto_segmento)
  	select bigintid(), id_rol_nuevo, id_funcion, id_conjunto_segmento from rol_funcion where id_rol = id_rol_viejo order by id_rol_funcion;
	*/
	for row_rol_funcion in select * from rol_funcion where id_rol = id_rol_viejo order by id_rol_funcion
	loop
		select bigintid() into id_rol_funcion_nuevo;
		insert into rol_funcion (id_rol_funcion, id_rol, id_funcion, id_conjunto_segmento)
		values (id_rol_funcion_nuevo, id_rol_nuevo, row_rol_funcion.id_funcion, row_rol_funcion.id_conjunto_segmento);
	end loop;
	/**/
	return 0;
end;
$$ language plpgsql;
-- ??
