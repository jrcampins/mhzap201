create or replace function ficha_persona_before_insert () returns trigger as $$
begin
    new.codigo_ficha_persona = ficha_persona_concat_codigo_ficha_persona(new);
    new.nombre_ficha_persona = ficha_persona_concat_nombre_ficha_persona(new);
    return new;
end;
$$ language 'plpgsql' volatile called on null input security invoker;
