create or replace function extract_siono(str varchar) returns integer as $$
declare
    siono integer:= null;
begin
    if str is not null then
        siono:=cast_varchar_as_integer(str);
        if siono=1 or siono=6 then
            return siono;
        else
            return null;
        end if;
    end if;
return siono;
end;
$$ language'plpgsql';