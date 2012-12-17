function extract_motivo_ina_esc(str varchar2) return number is

    motivo_ina_esc number:= null;
begin
    if str is not null then
        motivo_ina_esc:=to_number(str);
        if motivo_ina_esc>=1 and motivo_ina_esc<=25 then
            return motivo_ina_esc;
        else
            return null;
        end if;
    end if;
return motivo_ina_esc;
end;
