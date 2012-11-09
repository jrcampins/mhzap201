-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- rol_funcion
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
drop trigger if exists rol_funcion_after_insert_trigger on rol_funcion cascade;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
create trigger rol_funcion_after_insert_trigger
after insert on rol_funcion
for each row execute procedure rol_funcion_after_insert();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
drop trigger if exists rol_funcion_after_update_trigger on rol_funcion cascade;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
create trigger rol_funcion_after_update_trigger
after update on rol_funcion
for each row execute procedure rol_funcion_after_update();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
drop trigger if exists rol_funcion_after_delete_trigger on rol_funcion cascade;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
create trigger rol_funcion_after_delete_trigger
after delete on rol_funcion
for each row execute procedure rol_funcion_after_delete();
