function extract_dispo_auto(str varchar2) return number is
    disponibilidad_automovil number:= null;
begin
    if str is not null then
        disponibilidad_automovil:=to_number(str);
        if disponibilidad_automovil=5 then
            return 1;
        elsif disponibilidad_automovil=0 then
            return 6;
        else
            return null;
        end if;
    end if;
return disponibilidad_automovil;
end;