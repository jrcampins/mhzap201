-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- rastro_proceso
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
drop trigger if exists rastro_proceso_before_update_trigger on rastro_proceso cascade;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
create trigger rastro_proceso_before_update_trigger
before update on rastro_proceso
for each row execute procedure rastro_proceso_before_update();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
drop trigger if exists rastro_proceso_after_update_trigger on rastro_proceso cascade;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
create trigger rastro_proceso_after_update_trigger
after update on rastro_proceso
for each row execute procedure rastro_proceso_after_update();
