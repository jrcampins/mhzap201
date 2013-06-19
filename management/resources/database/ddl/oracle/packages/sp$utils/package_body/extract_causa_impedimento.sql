function extract_causa_impedimento(str varchar2) return number is
    causa_impedimento number:= null;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
    if str is not null then
        causa_impedimento:=to_number(str);
        if (causa_impedimento>=1 and causa_impedimento<=5) or causa_impedimento=99 then
            return causa_impedimento;
        else
            msg_string:='Causa de impedimento inválida';
            raise_application_error(err_number, msg_string, true);
        end if;
    end if;
    exception when others then
        msg_string:='Error de datos: Causa de impedimento inválida';
        raise_application_error(err_number, msg_string, true);
    end;
return causa_impedimento;
end;