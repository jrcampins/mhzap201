function extract_motivo_ina_esc(str varchar2) return number is

    motivo_ina_esc number:= null;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
begin
    begin
    if str is not null then
        motivo_ina_esc:=to_number(str);
        if motivo_ina_esc>=1 and motivo_ina_esc<=25 then
            return motivo_ina_esc;
        else
            msg_string:='Motivo de inasistencia inválida';
            raise_application_error(err_number, msg_string, true);
        end if;
    end if;
    exception when others then
        msg_string:='Error de datos: Motivo de inasistencia inválida';
        raise_application_error(err_number, msg_string, true);
     end;
return motivo_ina_esc;
end;
