function extract_clase_enf_cronica(str varchar2) return number is
    clase_enf_cronica number:= 6;
begin
    if str is not null then
        clase_enf_cronica:=to_number(str);
        if clase_enf_cronica>=11 and clase_enf_cronica<=42 then
            return clase_enf_cronica;
        else
            return 6;
        end if;
    end if;
return clase_enf_cronica;
end;