create or replace function opcion_menu_before_update() returns trigger as $$
declare
	nivel_opcion_menu_superior integer := 0;
begin
	if (new.id_opcion_menu_superior is not null) then
		if (old.id_opcion_menu_superior is null or old.id_opcion_menu_superior <> new.id_opcion_menu_superior) then
			select opcion_menu_check_update(new.id_opcion_menu, new.id_opcion_menu_superior) 
				into nivel_opcion_menu_superior;
		end if;
	end if;
	return new;
end;
$$ language plpgsql;
