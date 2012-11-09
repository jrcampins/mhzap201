create or replace function opcion_menu_after_update_batch() returns trigger as $$
begin
--	perform opcion_menu_update_raices(false);
	return null;
end;
$$ language plpgsql;
