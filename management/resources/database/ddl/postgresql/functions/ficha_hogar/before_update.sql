create or replace function ficha_hogar_before_update () returns trigger as $$
begin
    if (old.es_ficha_hogar_inactiva=1 and new.es_ficha_hogar_inactiva=1) then
        raise exception 'La Ficha Hogar está inactiva. No se puede actualizar';
    end if;
    new.codigo_ficha_hogar = ficha_hogar_concat_codigo_ficha_hogar(new);
    return new;
end;
$$ language 'plpgsql' volatile called on null input security invoker;
