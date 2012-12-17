function extract_numero_orden_id(str1 varchar2) return number is

    retorno number:= null;
begin
    if to_number(str1)>=1 and to_number(str1)<=99 then
        retorno:=to_number(str1);
        return retorno;
    else
        return null;
    end if;
exception
	when others then
		return null;
end;
