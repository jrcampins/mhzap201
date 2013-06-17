function extract_tipo_combustible(str varchar2) return number is
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
    tipo_combustible number:= null;
begin
    begin
    if str is not null then
        tipo_combustible:=to_number(str);
        if (tipo_combustible>=1 and tipo_combustible<=6) or tipo_combustible=9 then
            return tipo_combustible;
        else
            return null;
        end if;
    end if;
    exception when others then
        msg_string:='Error de datos: Tipo de combustible inválido';
        raise_application_error(err_number, msg_string, true);
    end;
return tipo_combustible;
end;
