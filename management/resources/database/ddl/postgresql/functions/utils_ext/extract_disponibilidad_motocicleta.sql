create or replace function extract_disponibilidad_motocicleta(str varchar) returns integer as $$
declare
    disponibilidad_motocicleta integer:= null;
begin
    if str is not null then
        disponibilidad_motocicleta:=cast_varchar_as_integer(str);
        if disponibilidad_motocicleta=7 then
            return 1;
        elsif disponibilidad_motocicleta=0 then
            return 6;
        else
            return null;
        end if;
    end if;
return disponibilidad_motocicleta;
end;
$$ language'plpgsql';