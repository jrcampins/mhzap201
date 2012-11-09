--Este método se ejecuta luego de insertar un nuevo potencial_ben
--Para garantizar que la ficha_persona siempre apunte al potencial_ben
--se ejecuta la vinculacion despues de cada inserción
create or replace trigger potencial_ben_after_insert
after insert on potencial_ben
for each row
declare
    row_ficha_persona ficha_persona%rowtype;
begin
    if :new.id_ficha_persona is not null then
        begin
            select *
            into row_ficha_persona
            from ficha_persona
            where id_ficha_persona=:new.id_ficha_persona;
        exception
            when no_data_found then null;
        end;
        if(row_ficha_persona.es_ficha_persona_inactiva=0) then
            update ficha_persona
            set id_potencial_ben=:new.id_potencial_ben
            where id_ficha_persona =:new.id_ficha_persona;
        else
            update ficha_persona
            set id_potencial_ben=:new.id_potencial_ben, es_ficha_persona_inactiva=0
            where id_ficha_persona =:new.id_ficha_persona;
            update ficha_persona
            set es_ficha_persona_inactiva=1
            where id_ficha_persona =:new.id_ficha_persona;
        end if;
    end if;
end;
/
show errors
