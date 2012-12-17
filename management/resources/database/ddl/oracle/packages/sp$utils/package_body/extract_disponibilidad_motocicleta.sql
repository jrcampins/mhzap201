function extract_dispo_motocicleta(str varchar2) return number is

    disponibilidad_motocicleta number:= null;
begin
    if str is not null then
        disponibilidad_motocicleta:=to_number(str);
        if disponibilidad_motocicleta=7 then
            return 1;
        elsif disponibilidad_motocicleta=0 then
            return 6;
        else
            return null;
        end if;
    end if;
return disponibilidad_motocicleta;
end;
