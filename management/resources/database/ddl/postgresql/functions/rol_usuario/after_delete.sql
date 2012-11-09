create or replace function rol_usuario_after_delete() returns trigger as $$
begin
        update usuario set es_usuario_modificado = 1 where id_usuario = old.id_usuario;
	return null;
end;
$$ language plpgsql;
