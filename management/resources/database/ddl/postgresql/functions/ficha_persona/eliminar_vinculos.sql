--Este procedimiento elimina el vinculo entre una ficha persona, una persona 
--y el potencial beneficiario, colocando el id de ficha persona en null 
--Es ejecutado como parte del trigger de ficha de persona
--@param ficha a desvincular
--@return 0 si se ejecuto sin errores.
create or replace function ficha_persona_eliminar_vinculos(row_ficha_persona ficha_persona) returns ficha_persona as $$
declare
    id_persona_actualizar bigint;
    row_persona persona;
    row_ficha_hogar ficha_hogar;
    id_potencial_ben_actualizar bigint;
begin        
    --Si la cedula no aparece registrada no se vincula
    if (row_ficha_persona.numero_cedula is null) then
        return row_ficha_persona;
    --Se busca si hay un id de persona
    else
        id_persona_actualizar:=extract_id_persona_ficha_persona(row_ficha_persona);
    end if;
    --Si no se consigue la persona no hay nada que buscar
    if id_persona_actualizar is null then
        return row_ficha_persona;
    --Si se consigue la persona, se actualiza para que apunte a null
    --Se ajusta el enlace de ficha_persona al potencial_ben asociado
    --Al actualizar id_ficha_persona, se copia sobre potencial_ben
    else
        --Se actualiza la persona 
        update persona  
        set id_ficha_persona=null
        where id_persona=id_persona_actualizar;  
    end if; 
    return row_ficha_persona;
end;
$$ language plpgsql;