--Este metodo devuelve 1 si hay cambios en la vinculacion y 0 si no hay cambios
create or replace function extract_id_persona_ficha_persona(ficha_persona_old ficha_persona,ficha_persona_new ficha_persona) returns bigint as $$
declare
cambios integer:=0;
id_persona_old bigint;
id_persona_new bigint;
begin
    --Extrae los id_persona
    id_persona_old:=extract_id_persona_ficha_persona(ficha_persona_old);
    id_persona_new:=extract_id_persona_ficha_persona(ficha_persona_new);
    --Compara los valores
    --Si siguen siendo nulos: no hay cambios
    if(id_persona_old is null and id_persona_new is null) then
        return 0;
    --Si siguen siendo iguales: no hay cambios
    elsif(id_persona_old=id_persona_new) then
        return 0;
    --En cualquier otro caso hay cambios
    else
        return 1;
    end if;
return cambios;    
end;
$$ language'plpgsql';