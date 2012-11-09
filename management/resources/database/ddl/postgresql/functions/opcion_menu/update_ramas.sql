create or replace function opcion_menu_update_ramas(do_update boolean, mnj integer, idx bigint, njx integer, ccx varchar) returns integer as $$
declare
	row_opcion_menu record;
	tny integer := 0; -- tipo nodo del nodo "y"
	njy integer := 0; -- nivel jerarquico del nodo "y"
	nsy integer := 0; -- numero secuencia del nodo "y"
	ccy varchar; -- clave concatenada del nodo "y"
	pdq integer := 0;
begin
	njy = njx + 1;
	for row_opcion_menu in 
	select * 
	from opcion_menu 
	where id_opcion_menu_superior=idx 
	order by secuencia_opcion_menu,codigo_opcion_menu 
	loop
		if njy > mnj then
			raise exception 'limite de % niveles jerarquicos excedido; nodo: "%" (%)', 
				mnj, row_opcion_menu.codigo_opcion_menu, row_opcion_menu.nombre_opcion_menu;
		end if;
		nsy = nsy + 1;
		ccy = ccx || trim(both from to_char(nsy, '00'));
		select opcion_menu_update_ramas(do_update, mnj, row_opcion_menu.id_opcion_menu, njy, ccy) into pdq;
		if pdq > 0 then
			tny = 2; -- rama
		else
			tny = 3; -- hoja
		end if;
		if do_update then
			update opcion_menu 
				set version_opcion_menu=version_opcion_menu+1, numero_tipo_nodo=tny, numero_nivel_opcion_menu=njy, clave_opcion_menu=ccy
				where id_opcion_menu=row_opcion_menu.id_opcion_menu;
		end if;
	end loop; 
	return nsy;
end;
$$ language plpgsql;
