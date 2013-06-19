function extract_dispo_termo(str varchar2) return number is

    disponibilidad_termo number:= null;
begin
    if str is not null then
        disponibilidad_termo:=to_number(str);
        if disponibilidad_termo=3 then
            return 1;
        elsif disponibilidad_termo=0 then
            return 6;
        elsif disponibilidad_termo=9 then
            return 9;
        else
            return null;
        end if;
    end if;
return disponibilidad_termo;
end;
