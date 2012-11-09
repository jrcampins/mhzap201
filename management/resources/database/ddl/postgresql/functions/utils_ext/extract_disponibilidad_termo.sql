create or replace function extract_disponibilidad_termo(str varchar) returns integer as $$
declare
    disponibilidad_termo integer:= null;
begin
    if str is not null then
        disponibilidad_termo:=cast_varchar_as_integer(str);
        if disponibilidad_termo=3 then
            return 1;
        elsif disponibilidad_termo=0 then
            return 6;
        else
            return null;
        end if;
    end if;
return disponibilidad_termo;
end;
$$ language'plpgsql';