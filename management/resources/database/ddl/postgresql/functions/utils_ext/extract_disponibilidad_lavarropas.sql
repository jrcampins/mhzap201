create or replace function extract_disponibilidad_lavarropas(str varchar) returns integer as $$
declare
    disponibilidad_lavarropas integer:= null;
begin
    if str is not null then
        disponibilidad_lavarropas:=cast_varchar_as_integer(str);
        if disponibilidad_lavarropas=2 then
            return 1;
        elsif disponibilidad_lavarropas=0 then
            return 6;
        else
            return null;
        end if;
    end if;
return disponibilidad_lavarropas;
end;
$$ language'plpgsql';