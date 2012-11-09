--Este procedimiento elimina el vinculo entre una ficha persona, una persona 
--y el potencial beneficiario, colocando el id de ficha persona en null 
--Es ejecutado como parte del trigger de ficha de persona
--@param ficha a desvincular
--@return 0 si se ejecuto sin errores.
procedure eliminar_vinculos(xold ficha_persona%rowtype) is
    id_persona_actualizar number;
    row_persona persona%rowtype;
    row_ficha_hogar ficha_hogar%rowtype;
    id_potencial_ben_actualizar number;
begin        
    --Si la cedula no aparece registrada no se vincula
    if (xold.numero_cedula is null) then
        return;
    end if;
    --Se busca si hay un id de persona
    id_persona_actualizar:=extract_id_persona(xold);
    --Si no se consigue la persona no hay nada que buscar
    if id_persona_actualizar is null then
        return;
    end if; 
    --Si se consigue la persona, se actualiza para que apunte a null
    --Se ajusta el enlace de ficha_persona al potencial_ben asociado
    --Al actualizar id_ficha_persona, se copia sobre potencial_ben
    --Se actualiza la persona 
    update persona  
    set id_ficha_persona=null
    where id_persona=id_persona_actualizar;  
end;
