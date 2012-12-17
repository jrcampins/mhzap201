function extract_estado_salud(str varchar2) return number is

    --Se retorna 99 si no responde
    estado_salud number:= 6;
begin
    if str is not null then
        estado_salud:=to_number(str);
        if estado_salud>=1 and estado_salud<=3 then
            return estado_salud;
        else
            return 6;
        end if;
    end if;
return estado_salud;
end;
