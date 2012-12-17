function extract_distancia(str1 varchar2) return number is

    retorno number:= null;
begin
    if to_number(str1)>=1 and to_number(str1)<=1000000 then
        retorno:=to_number(str1);
        return retorno;
    else
        return null;
    end if;
return retorno;
exception
	when others then
		return null;
end;
