-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- elemento_segmento
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
drop trigger if exists elemento_segmento_after_insert_trigger on elemento_segmento cascade;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
create trigger elemento_segmento_after_insert_trigger
after insert on elemento_segmento
for each row execute procedure elemento_segmento_after_insert();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
drop trigger if exists elemento_segmento_after_update_trigger on elemento_segmento cascade;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
create trigger elemento_segmento_after_update_trigger
after update on elemento_segmento
for each row execute procedure elemento_segmento_after_update();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
drop trigger if exists elemento_segmento_after_delete_trigger on elemento_segmento cascade;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
create trigger elemento_segmento_after_delete_trigger
after delete on elemento_segmento
for each row execute procedure elemento_segmento_after_delete();
