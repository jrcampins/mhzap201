function extract_tipo_ocupacion(str varchar2) return number is
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
    tipo_ocupacion number:= null;
begin
    begin
    if str is not null then
        tipo_ocupacion:=to_number(str);
        if tipo_ocupacion>=1 and tipo_ocupacion<=6 then
            return tipo_ocupacion;
        else
            msg_string:='Tipo de ocupación inválido';
            raise_application_error(err_number, msg_string, true);
        end if;
    end if;
    exception when others then
        msg_string:='Error de datos: Tipo de ocupación inválido';
        raise_application_error(err_number, msg_string, true);
    end;
return tipo_ocupacion;
end;
