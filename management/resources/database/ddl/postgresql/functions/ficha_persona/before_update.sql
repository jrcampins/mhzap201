create or replace function ficha_persona_before_update () returns trigger as $$
begin
    if (old.es_ficha_persona_inactiva=1 and new.es_ficha_persona_inactiva=1) then
        raise exception 'La Ficha Persona está inactiva. No se puede actualizar';
    end if;
    new.codigo_ficha_persona = ficha_persona_concat_codigo_ficha_persona(new);
    new.nombre_ficha_persona = ficha_persona_concat_nombre_ficha_persona(new);
    
    return new;
end;
$$ language 'plpgsql' volatile called on null input security invoker;
