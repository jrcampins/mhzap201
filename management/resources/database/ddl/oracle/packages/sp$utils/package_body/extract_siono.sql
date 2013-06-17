function extract_siono(str varchar2) return number is
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    siono number:= null;
begin
    begin
        if str is not null then
            siono:=to_number(str);
            if siono=1 or siono=6 or siono=9 then
                return siono;
            else
                return null;
            end if;
        end if;
     exception when others then
        msg_string:='Error de datos: Opción si/no inválida';
        raise_application_error(err_number, msg_string, true);
     end;
return siono;
end;
