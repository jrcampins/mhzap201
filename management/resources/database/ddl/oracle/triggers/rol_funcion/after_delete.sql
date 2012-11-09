create or replace trigger rol_funcion_after_delete
after delete on rol_funcion
for each row
begin
    update usuario set es_usuario_modificado = 1 where id_usuario in (
    select id_usuario from rol_usuario where id_rol = :old.id_rol);
end;
/
show errors
