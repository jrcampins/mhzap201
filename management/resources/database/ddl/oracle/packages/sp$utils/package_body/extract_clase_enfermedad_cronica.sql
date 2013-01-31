function extract_clase_enf_cronica(str varchar2) return number is
    clase_enf_cronica number:= 6;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
    if str is not null then
        clase_enf_cronica:=to_number(str);
        if clase_enf_cronica>=11 and clase_enf_cronica<=42 then
            return clase_enf_cronica;
        else
            return 6;
        end if;
    end if;
    exception when others then
        msg_string:='Error de datos: Enfermedad crónica inválida';
        raise_application_error(err_number, msg_string, true);
    end;
return clase_enf_cronica;
end;