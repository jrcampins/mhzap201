create or replace function opcion_menu_update_raices(do_update boolean) returns integer as $$
declare
	row_opcion_menu record;
	mnj integer := 0; -- maximo nivel jerarquico
	nnj integer := 0; -- numero nivel jerarquico
	tnx integer := 1; -- tipo nodo del nodo "x" (en este caso, el nodo raiz)
	njx integer := 1; -- nivel jerarquico del nodo "x" (en este caso, el nodo raiz)
	nsx integer := 0; -- numero secuencia del nodo "x" (en este caso, el nodo raiz)
	ccx varchar; -- clave concatenada del nodo "x" (en este caso, el nodo raiz)
	pdq integer := 0;
begin	
	select max(numero_nivel_opcion_menu),count(numero_nivel_opcion_menu) into mnj,nnj from nivel_opcion_menu;
	if not found then
		raise exception 'los niveles jerarquicos de opcion de menu no estan definidos';
	elseif (mnj < 1 or nnj < 1 or mnj <> nnj) then
		raise exception 'los niveles jerarquicos de opcion de menu no estan correctamente definidos';
	end if;
	for row_opcion_menu in 
	select * 
	from opcion_menu 
	where id_opcion_menu_superior is null 
	order by secuencia_opcion_menu,codigo_opcion_menu 
	loop
		nsx = nsx + 1;
		ccx = trim(both from to_char(nsx, '00'));
		select opcion_menu_update_ramas(do_update, mnj, row_opcion_menu.id_opcion_menu, njx, ccx) into pdq;
		if do_update then
			update opcion_menu
				set version_opcion_menu=version_opcion_menu+1, numero_tipo_nodo=tnx, numero_nivel_opcion_menu=njx, clave_opcion_menu=ccx
				where id_opcion_menu=row_opcion_menu.id_opcion_menu;
		end if;
	end loop; 
	return nsx;
end;
$$ language plpgsql;
