create or replace function elemento_segmento_after_insert() returns trigger as $$
begin
        update usuario set es_usuario_modificado = 1 where id_usuario in (
        select id_usuario from rol_usuario where id_rol in (
        select id_rol from rol_funcion where id_conjunto_segmento = new.id_conjunto_segmento));
        /**/
	return null;
end;
$$ language plpgsql;
