create or replace function extract_disponibilidad_automovil(str varchar) returns integer as $$
declare
    disponibilidad_automovil integer:= null;
begin
    if str is not null then
        disponibilidad_automovil:=cast_varchar_as_integer(str);
        if disponibilidad_automovil=5 then
            return 1;
        elsif disponibilidad_automovil=0 then
            return 6;
        else
            return null;
        end if;
    end if;
return disponibilidad_automovil;
end;
$$ language'plpgsql';