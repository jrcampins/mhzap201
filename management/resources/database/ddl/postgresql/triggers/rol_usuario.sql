-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- rol_usuario
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
drop trigger if exists rol_usuario_after_insert_trigger on rol_usuario cascade;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
create trigger rol_usuario_after_insert_trigger
after insert on rol_usuario
for each row execute procedure rol_usuario_after_insert();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
drop trigger if exists rol_usuario_after_update_trigger on rol_usuario cascade;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
create trigger rol_usuario_after_update_trigger
after update on rol_usuario
for each row execute procedure rol_usuario_after_update();
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
drop trigger if exists rol_usuario_after_delete_trigger on rol_usuario cascade;
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
create trigger rol_usuario_after_delete_trigger
after delete on rol_usuario
for each row execute procedure rol_usuario_after_delete();
