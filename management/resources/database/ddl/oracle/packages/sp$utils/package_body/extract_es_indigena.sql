function extract_es_indigena(str varchar2) return number is

    indigena number:= 0;
    retorno number:=0;
begin
    if str is not null then
        indigena:=to_number(str);
        if indigena=1 then
            retorno:= 1;
        else
            retorno:= 0;
        end if;
    end if;
return retorno;
exception
	when others then
		return 0;
end;
