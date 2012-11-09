create or replace trigger persona_after_update
after update on persona
for each row
declare
    row_potencial_ben potencial_ben%rowtype;
    row_ficha_persona ficha_persona%rowtype;
begin
    --Se determina si hay un potencial_ben para actualizar
    begin
        select *
        into row_potencial_ben
        from potencial_ben
        where id_persona=:new.id_persona
        and es_potencial_ben_inactivo=0;
    exception
        when no_data_found then null;
    end;
    if sql%found then
        --Esta instruccion se ejecuta para mantener actualizada la copia de persona
        update potencial_ben
        set id_persona=:new.id_persona
        where id_persona=:new.id_persona;
        --Caso 1: Nuevo id_ficha_persona (anterior no null): Cuando se actualiza la ficha_persona
        if (:new.id_ficha_persona<>:old.id_ficha_persona)  then
            --Se anula el vinculo anterior de ficha_persona
            begin
                select *
                into row_ficha_persona 
                from ficha_persona 
                where id_ficha_persona=:old.id_ficha_persona;
            exception
                when no_data_found then null;
            end;
            --Si no está inactiva, se actualiza directamente
            if(row_ficha_persona.es_ficha_persona_inactiva=0)then
                update ficha_persona
                set    id_potencial_ben=null
                where id_ficha_persona=row_ficha_persona.id_ficha_persona;
            --Si esta inactiva hay que reactivar para poder actualizar
            else
                --Se reactiva para actualizar
                update ficha_persona
                set id_potencial_ben=null,
                    es_ficha_persona_inactiva=0
                where id_ficha_persona=row_ficha_persona.id_ficha_persona;
                --Se vuelve a inactivar
                update ficha_persona
                set es_ficha_persona_inactiva=1
                where id_ficha_persona=row_ficha_persona.id_ficha_persona;
            end if;
            --Se crea el nuevo vinculo de ficha_persona 
            begin
                select *
                into row_ficha_persona 
                from ficha_persona 
                where id_ficha_persona=:new.id_ficha_persona;
            exception
                when no_data_found then null;
            end;
            --Si no está inactiva, se actualiza directamente
            if(row_ficha_persona.es_ficha_persona_inactiva=0)then
                update ficha_persona
                set id_potencial_ben=row_potencial_ben.id_potencial_ben
                where id_ficha_persona=:new.id_ficha_persona;
            --Si esta inactiva hay que reactivar para poder actualizar
            else
                --Se reactiva para actualizar
                update ficha_persona
                set id_potencial_ben=row_potencial_ben.id_potencial_ben,
                    es_ficha_persona_inactiva=0
                where id_ficha_persona=row_ficha_persona.id_ficha_persona;
                --Se vuelve a inactivar
                update ficha_persona
                set es_ficha_persona_inactiva=1
                where id_ficha_persona=row_ficha_persona.id_ficha_persona;
            end if;
        --Caso 2: Nuevo id_ficha_persona no null(anterior null): Cuando se inserta una nueva ficha_persona para la persona
        elsif (:new.id_ficha_persona is not null
                and :old.id_ficha_persona is null )  then 
            --Se crea el nuevo vinculo de ficha_persona 
            begin
                select *
                into row_ficha_persona 
                from ficha_persona 
                where id_ficha_persona=:new.id_ficha_persona;
            exception
                when no_data_found then return;
            end;
            --Si no está inactiva, se actualiza directamente
            if(row_ficha_persona.es_ficha_persona_inactiva=0)then
                update ficha_persona
                set id_potencial_ben=row_potencial_ben.id_potencial_ben
                where id_ficha_persona=:new.id_ficha_persona;
            --Si esta inactiva hay que reactivar para poder actualizar
            else
                --Se reactiva para actualizar
                update ficha_persona
                set id_potencial_ben=row_potencial_ben.id_potencial_ben,
                    es_ficha_persona_inactiva=0
                where id_ficha_persona=row_ficha_persona.id_ficha_persona;
                --Se vuelve a inactivar
                update ficha_persona
                set es_ficha_persona_inactiva=1
                where id_ficha_persona=row_ficha_persona.id_ficha_persona;
            end if;
        --Caso 3: Nuevo id_ficha_persona null (anterior no null): Cuando se desvincula una ficha_persona
        elsif (:new.id_ficha_persona is null 
               and :old.id_ficha_persona is not null)  then
            --Se anula el vinculo anterior de ficha_persona
            begin
                select *
                into row_ficha_persona 
                from ficha_persona 
                where id_ficha_persona=:old.id_ficha_persona;
            exception
                when no_data_found then null;
            end;
            --Si no está inactiva, se actualiza directamente
            if(row_ficha_persona.es_ficha_persona_inactiva=0)then
                update ficha_persona
                set id_potencial_ben=null
                where id_ficha_persona=row_ficha_persona.id_ficha_persona;
            --Si esta inactiva hay que reactivar para poder actualizar
            else
                --Se reactiva para actualizar
                update ficha_persona
                set id_potencial_ben=null,
                    es_ficha_persona_inactiva=0
                where id_ficha_persona=row_ficha_persona.id_ficha_persona;
                --Se vuelve a inactivar
                update ficha_persona
                set es_ficha_persona_inactiva=1
                where id_ficha_persona=row_ficha_persona.id_ficha_persona;
            end if;
        end if;
    end if;
end;
/
show errors
