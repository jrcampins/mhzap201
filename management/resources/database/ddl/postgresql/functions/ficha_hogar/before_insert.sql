create or replace function ficha_hogar_before_insert () returns trigger as $$
begin
    new.codigo_ficha_hogar = ficha_hogar_concat_codigo_ficha_hogar(new);
    return new;
end;
$$ language 'plpgsql' volatile called on null input security invoker;
