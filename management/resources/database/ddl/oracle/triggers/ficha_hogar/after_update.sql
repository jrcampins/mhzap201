create or replace trigger ficha_hogar_after_update
after update on ficha_hogar
for each row
declare
    row_persona persona%rowtype;
    row_ficha_persona ficha_persona%rowtype;
begin
    if (:new.codigo_ficha_hogar <> :old.codigo_ficha_hogar) then
        update ficha_persona
        set    codigo_ficha_persona = null
        where  id_ficha_hogar = :new.id_ficha_hogar;
    end if;        
end;
/
show errors
