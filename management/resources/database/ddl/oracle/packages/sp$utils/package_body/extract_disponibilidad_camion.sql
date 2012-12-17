function extract_dispo_camion(str varchar) return number is
    disponibilidad_camion number:= null;
begin
    if str is not null then
        disponibilidad_camion:=to_number(str);
        if disponibilidad_camion=6 then
            return 1;
        elsif disponibilidad_camion=0 then
            return 6;
        else
            return null;
        end if;
    end if;
return disponibilidad_camion;
end;