function extract_sexo_persona(str1 varchar2) return number is

    retorno number:= null;
begin
    if to_number(str1)=2 then
        retorno:=1;
    elsif to_number(str1)=1 then
        retorno:=6;
    else
        return null;
    end if;
return retorno;
exception
	when others then
		return null;
end;
