create or replace function extract_disponibilidad_heladera(str varchar) returns integer as $$
declare
    disponibilidad_heladera integer:= null;
begin
    if str is not null then
        disponibilidad_heladera:=cast_varchar_as_integer(str);
        if disponibilidad_heladera=1 then
            return 1;
        elsif disponibilidad_heladera=0 then
            return 6;
        else
            return null;
        end if;
    end if;
return disponibilidad_heladera;
end;
$$ language'plpgsql';