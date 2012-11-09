create or replace trigger rol_usuario_after_insert
after insert on rol_usuario
for each row
declare
    retcode number;
begin
    retcode := sp$rol.propagar_filtros(:new.id_rol, :new.id_usuario, :new.id_rol_usuario);
    retcode := sp$rol.propagar_favoritos(:new.id_rol, :new.id_usuario, :new.id_rol_usuario);
    update usuario set es_usuario_modificado = 1 where id_usuario = :new.id_usuario;
end;
/
show errors
