-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- opcion_menu
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
drop trigger if exists opcion_menu_before_update_trigger on opcion_menu cascade;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
create trigger opcion_menu_before_update_trigger
before update on opcion_menu
for each row execute procedure opcion_menu_before_update();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
drop trigger if exists opcion_menu_after_update_batch_trigger on opcion_menu cascade;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
create trigger opcion_menu_after_update_batch_trigger
after update on opcion_menu
for each statement execute procedure opcion_menu_after_update_batch();
