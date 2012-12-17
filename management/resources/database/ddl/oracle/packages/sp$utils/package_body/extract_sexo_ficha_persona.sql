function extract_sexo_ficha_persona(str1 varchar2) return number is

    retorno number:= null;
begin
    if to_number(str1)=1 or to_number(str1)=6 then
        retorno:=to_number(str1);
        return retorno;
    else
        return null;
    end if;
exception
	when others then
		return null;
end;
