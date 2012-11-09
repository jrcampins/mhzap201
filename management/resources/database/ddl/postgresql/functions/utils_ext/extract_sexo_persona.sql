create or replace function extract_sexo_persona(str1 varchar) returns integer as $$
declare
    retorno integer:= null;
begin
    if cast_varchar_as_integer(str1)=2 then
        retorno:=1;
    elsif cast_varchar_as_integer(str1)=1 then
        retorno:=6;
    else
        return null;
    end if;
return retorno;
exception
	when others then
		return null;
end;
$$ language'plpgsql';