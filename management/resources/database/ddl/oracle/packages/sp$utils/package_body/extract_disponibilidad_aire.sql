function extract_dispo_aire(str varchar2) return number is
    disponibilidad_aire number:= null;
begin
    if str is not null then
        disponibilidad_aire:=to_number(str);
        if disponibilidad_aire=4 then
            return 1;
        elsif disponibilidad_aire=0 then
            return 6;
        elsif disponibilidad_aire=9 then
            return 9;
        else
            return null;
        end if;
    end if;
return disponibilidad_aire;
end;