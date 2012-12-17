function extract_numero_hogar(str1 varchar2) return number is

    retorno number:= null;
begin
    if to_number(str1)>=0 and to_number(str1)<=100 then
        retorno:=to_number(str1);
        return retorno;
    else
        return null;
    end if;
exception
	when others then
		return null;
end;
