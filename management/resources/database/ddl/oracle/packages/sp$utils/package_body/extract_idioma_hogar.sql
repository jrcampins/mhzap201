function extract_idioma_hogar(str varchar2) return number is

    idioma_hogar number:= null;
begin
    if str is not null then
        idioma_hogar:=to_number(str);
        if idioma_hogar>=1 and idioma_hogar<=5 then
            return idioma_hogar;
        else
            return null;
        end if;
    end if;
return idioma_hogar;
exception
	when others then
		return null;
end;
