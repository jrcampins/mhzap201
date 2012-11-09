create or replace function extract_clase_impedimento(str varchar) returns integer as $$
declare
    clase_impedimento integer:= null;
begin
    if str is not null then
        clase_impedimento:=cast_varchar_as_integer(str);
        if clase_impedimento>=1 and clase_impedimento<=13 or clase_impedimento=16 then
            return clase_impedimento;
        else
            return null;
        end if;
    end if;
return clase_impedimento;
end;
$$ language'plpgsql';