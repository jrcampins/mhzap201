--Este procedimiento crea el vinculo entre una ficha persona y una persona 
--a través de la cédula, este proceso es ejecutado como parte del trigger 
--de ficha de persona, de este modo, cada vez que se inserta una ficha 
--su informacion se actualiza
--@param ficha a vincular
--@return 0 si se ejecuto sin errores.
procedure actualizar_vinculos(xnew ficha_persona%rowtype) is
    id_persona_actualizar number;
    row_persona persona%rowtype;
    row_ficha_hogar ficha_hogar%rowtype;
begin        
    --Si la cedula no aparece registrada no se vincula
    if (xnew.numero_cedula is null) then
        return;
    end if;
    --Se busca si hay un id de persona
    id_persona_actualizar:=extract_id_persona(xnew);
    --Si no se consigue la persona no hay nada que buscar
    if id_persona_actualizar is null then
        return;
    end if; 
    --Si se consigue la persona, se actualiza para que apunte a Ficha_Persona
    --Se ajusta el enlace de ficha_persona al potencial_ben asociado
    --Al actualizar id_ficha_persona, se copia sobre potencial_ben
    begin
        select *
        into row_ficha_hogar
        from ficha_hogar
        where id_ficha_hogar=xnew.id_ficha_hogar;
    exception
        when no_data_found then null;
    end;
    begin
        select*
        into row_persona
        from persona
        where id_persona=id_persona_actualizar;
    exception
        when no_data_found then null;
    end;
    --Solo se actualiza cuando:
    --a) persona no tiene ficha persona
    --b) persona tiene ficha persona mas reciente y no ha sido acreditada
    if((row_persona.id_ficha_persona is null) or 
       (row_persona.fecha_ficha_persona<row_ficha_hogar.fecha_entrevista 
        and  row_persona.es_persona_acreditada_para_pen=0)) then
        --dbms_output.put_line('creando vinculo');
        update persona  
        set id_ficha_persona=xnew.id_ficha_persona
        where id_persona=id_persona_actualizar;
    end if;
end;
