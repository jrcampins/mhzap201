create or replace trigger elemento_segmento_after_delete
after delete on elemento_segmento
for each row
begin
        update usuario set es_usuario_modificado = 1 where id_usuario in (
        select id_usuario from rol_usuario where id_rol in (
        select id_rol from rol_funcion where id_conjunto_segmento = :old.id_conjunto_segmento));
end;
/
show errors
