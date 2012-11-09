create or replace function extract_numero_formulario(str1 varchar) returns integer as $$
declare
    retorno integer:= null;
begin
    if cast_varchar_as_integer(str1)>=1 and cast_varchar_as_integer(str1)<=1000000 then
        retorno:=cast_varchar_as_integer(str1);
    else
        return null;
    end if;
return retorno;
exception
	when others then
		return null;
end;
$$ language'plpgsql';