create or replace function rol_funcion_after_update() returns trigger as $$
begin
        update usuario set es_usuario_modificado = 1 where id_usuario in (
        select id_usuario from rol_usuario where id_rol = new.id_rol);
        /**/
	return null;
end;
$$ language plpgsql;
