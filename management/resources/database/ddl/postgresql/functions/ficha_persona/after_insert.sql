--Este método se ejecuta luego de insertar una nueva ficha persona
--Para garantizar que la persona asociada tenga siempre actualizado su icv,
--se ejecuta la vinculacion despues de cada inserción
create or replace function ficha_persona_after_insert() returns trigger as $$
begin
    perform ficha_persona_actualizar_vinculos(new);
    return new;
end;
$$ language plpgsql;
