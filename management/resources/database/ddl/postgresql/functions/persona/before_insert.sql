create or replace function persona_before_insert () returns trigger as $$
begin
    new.codigo_persona = persona_concat_codigo_persona(new);
    new.nombre_persona = persona_concat_nombre_persona(new);
    perform persona_before_insert_update(new);
    return new;
end;
$$ language 'plpgsql' volatile called on null input security invoker;
