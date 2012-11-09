CREATE OR REPLACE FUNCTION extract_letra_from_cedula(ced varchar) RETURNS char AS $$
declare
    letra_cedula char:=null;
    cedula varchar:='';
begin
    if ced is not null then
        if length(btrim(ced,'1234567890-._ '))=1 then
            letra_cedula:=btrim(ced,'1234567890-._');
        end if;
    end if;
return letra_cedula;
end;
$$ LANGUAGE 'plpgsql';