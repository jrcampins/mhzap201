function extract_disp_heladera(str varchar2) return number is
    disponibilidad_heladera number:= null;
begin
    if str is not null then
        disponibilidad_heladera:=to_number(str);
        if disponibilidad_heladera=1 then
            return 1;
        elsif disponibilidad_heladera=0 then
            return 6;
        else
            return null;
        end if;
    end if;
return disponibilidad_heladera;
end;
