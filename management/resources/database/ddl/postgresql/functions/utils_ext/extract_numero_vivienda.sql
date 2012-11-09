create or replace function extract_numero_vivienda(str1 varchar) returns integer as $$
declare
    retorno integer:= null;
begin
    if cast_varchar_as_integer(str1)>=1 and cast_varchar_as_integer(str1)<=10000 then
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