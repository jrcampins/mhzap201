create or replace function extract_sexo_ficha_persona(str1 varchar) returns integer as $$
declare
    retorno integer:= null;
begin
    if cast_varchar_as_integer(str1)=1 or cast_varchar_as_integer(str1)=6 then
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