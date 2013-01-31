function extract_clase_impedimento(str varchar2) return number is
    clase_impedimento number:= null;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
begin
    begin
    if str is not null then
        clase_impedimento:=to_number(str);
        if clase_impedimento>=1 and clase_impedimento<=13 or clase_impedimento=16 then
            return clase_impedimento;
        else
            msg_string:='Clase de impedimento inválida';
            raise_application_error(err_number, msg_string, true);
        end if;
    end if;
    exception when others then
        msg_string:='Error de datos: Clase de impedimento inválida';
        raise_application_error(err_number, msg_string, true);
    end;
return clase_impedimento;
end;