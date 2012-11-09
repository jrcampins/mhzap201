create or replace function rol_usuario_after_update() returns trigger as $$
begin
    perform rol_propagar_filtros(new.id_rol, new.id_usuario, new.id_rol_usuario);
    perform rol_propagar_favoritos(new.id_rol, new.id_usuario, new.id_rol_usuario);
    update usuario set es_usuario_modificado = 1 where id_usuario = new.id_usuario;
    return null;
end;
$$ language plpgsql;
