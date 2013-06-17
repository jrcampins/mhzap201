function extract_tipo_servicio_san(str varchar2) return number is
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
    tipo_servicio_san number:= null;
begin
    begin
    if str is not null then
        tipo_servicio_san:=to_number(str);
        if (tipo_servicio_san>=1 and tipo_servicio_san<=6) or tipo_servicio_san=9 then
            return tipo_servicio_san;
        else
            msg_string:='Tipo de servicio sanitario inválido';
        raise_application_error(err_number, msg_string, true);
        end if;
    end if;
    exception when others then
        msg_string:='Error de datos: Tipo de servicio sanitario inválido';
        raise_application_error(err_number, msg_string, true);
    end;
return tipo_servicio_san;
end;
