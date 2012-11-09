create or replace trigger rol_usuario_after_delete
after delete on rol_usuario
for each row
begin
    update usuario set es_usuario_modificado = 1 where id_usuario = :old.id_usuario;
end;
/
show errors
