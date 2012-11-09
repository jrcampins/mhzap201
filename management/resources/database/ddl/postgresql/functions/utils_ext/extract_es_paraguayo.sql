create or replace function extract_es_paraguayo(str varchar) returns integer as $$
declare
    nacionalidad integer:= 0;
begin
    if str is not null then
        nacionalidad:=cast_varchar_as_integer(str);
        if nacionalidad=226 then
            return 1;
        else
            return 0;
        end if;
    end if;
    return nacionalidad;
exception
	when others then
		return null;
end;
$$ language'plpgsql';