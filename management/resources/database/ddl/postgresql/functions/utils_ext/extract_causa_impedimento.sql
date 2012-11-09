create or replace function extract_causa_impedimento(str varchar) returns integer as $$
declare
    causa_impedimento integer:= null;
begin
    if str is not null then
        causa_impedimento:=cast_varchar_as_integer(str);
        if causa_impedimento>=1 and causa_impedimento<=5 then
            return causa_impedimento;
        else
            return null;
        end if;
    end if;
return causa_impedimento;
end;
$$ language'plpgsql';