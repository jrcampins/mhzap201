function extract_es_paraguayo(str varchar) return number is

    nacionalidad number:= 0;
begin
    if str is not null then
        nacionalidad:=to_number(str);
        if nacionalidad=226 then
            return 1;
        else
            return 0;
        end if;
    end if;
    return nacionalidad;
exception
	when others then
		return null;
end;
