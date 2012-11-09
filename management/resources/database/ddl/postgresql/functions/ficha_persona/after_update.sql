--Cada vez que se actualiza una ficha persona, puede ser necesario cambiar la vinculacion a la persona
--Para garantizar que la persona asociada tenga siempre actualizado su icv,
--se ejecuta la vinculacion despues de cada inserción.
--Adicionalmente si se produce cambio en la cedula se elimina el vinculo a la otra persona
create or replace function ficha_persona_after_update() returns trigger as $$
declare
    cambios integer;
begin
    --Si cambia cualquier información que pueda desvincular a la persona
    cambios:=verificar_cambio_vinculo(old,new);
    --Si no hay cambios no se hace nada
    if(cambios=0) then
        return new;
    --Si hay cambios se desvincula y luego se vincula
    else
        perform ficha_persona_eliminar_vinculos(old);
        perform ficha_persona_actualizar_vinculos(new);
    end if;
    return new;
end;
$$ language plpgsql;
