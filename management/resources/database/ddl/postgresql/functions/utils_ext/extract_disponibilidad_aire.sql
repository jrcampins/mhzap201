create or replace function extract_disponibilidad_aire(str varchar) returns integer as $$
declare
    disponibilidad_aire integer:= null;
begin
    if str is not null then
        disponibilidad_aire:=cast_varchar_as_integer(str);
        if disponibilidad_aire=4 then
            return 1;
        elsif disponibilidad_aire=0 then
            return 6;
        else
            return null;
        end if;
    end if;
return disponibilidad_aire;
end;
$$ language'plpgsql';