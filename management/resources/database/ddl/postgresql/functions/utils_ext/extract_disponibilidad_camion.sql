create or replace function extract_disponibilidad_camion(str varchar) returns integer as $$
declare
    disponibilidad_camion integer:= null;
begin
    if str is not null then
        disponibilidad_camion:=cast_varchar_as_integer(str);
        if disponibilidad_camion=6 then
            return 1;
        elsif disponibilidad_camion=0 then
            return 6;
        else
            return null;
        end if;
    end if;
return disponibilidad_camion;
end;
$$ language'plpgsql';