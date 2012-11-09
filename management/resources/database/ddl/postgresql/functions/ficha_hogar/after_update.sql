create or replace function ficha_hogar_after_update() returns trigger as $$
declare
    row_persona persona;
    row_ficha_persona ficha_persona;
begin
    if (new.codigo_ficha_hogar <> old.codigo_ficha_hogar) then
        update ficha_persona
        set    codigo_ficha_persona = null
        where  id_ficha_hogar = new.id_ficha_hogar;
    end if;        
    return null;
end;
$$ language plpgsql;
