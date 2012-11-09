create or replace function extract_es_indigena(str varchar) returns integer as $$
declare
    indigena integer:= 0;
    retorno integer:=0;
begin
    if str is not null then
        indigena:=cast_varchar_as_integer(str);
        if indigena=1 then
            retorno:= 1;
        else
            retorno:= 0;
        end if;
    end if;
return retorno;
exception
	when others then
		return 0;
end;
$$ language'plpgsql';