function extract_dispo_lavarropas(str varchar2) return number is
    disponibilidad_lavarropas number:= null;
begin
    if str is not null then
        disponibilidad_lavarropas:=to_number(str);
        if disponibilidad_lavarropas=2 then
            return 1;
        elsif disponibilidad_lavarropas=0 then
            return 6;
        elsif disponibilidad_lavarropas=9 then
            return 9;
        else
            return null;
        end if;
    end if;
return disponibilidad_lavarropas;
end;
