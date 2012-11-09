create or replace function opcion_menu_check_update(inferior bigint, superior bigint) returns integer as $$
declare
	row_opcion_menu record;
begin
	if (superior = inferior) then
		raise exception 'la opcion de menu superior no puede ser igual a la opcion de menu';
	else
		select * into row_opcion_menu from opcion_menu where id_opcion_menu = superior;
		if not found then
			raise exception 'la opcion de menu superior no esta definida';
		elseif (row_opcion_menu.id_opcion_menu_superior is null) then
			return 1;
		elseif (row_opcion_menu.id_opcion_menu_superior = inferior) then
			raise exception 'la opcion de menu superior no puede estar subordinada a la opcion de menu';
		else
			return 1 + opcion_menu_check_update(inferior, row_opcion_menu.id_opcion_menu_superior);
		end if;	
	end if;
end;
$$ language plpgsql;
