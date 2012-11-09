create or replace function extract_numero_hogar(str1 varchar) returns integer as $$
declare
    retorno integer:= null;
begin
    if cast_varchar_as_integer(str1)>=0 and cast_varchar_as_integer(str1)<=100 then
        retorno:=cast_varchar_as_integer(str1);
        return retorno;
    else
        return null;
    end if;
exception
	when others then
		return null;
end;
$$ language'plpgsql';