function extract_tipo_mat_paredes(str varchar2) return number is
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
    tipo_mat_paredes number:= null;
begin
    begin
    if str is not null then
        tipo_mat_paredes:=to_number(str);
        if (tipo_mat_paredes>=1 and tipo_mat_paredes<=7) or tipo_mat_paredes=9 then
            return tipo_mat_paredes;
        else
            msg_string:='Tipo de material paredes inválido';
            raise_application_error(err_number, msg_string, true);
        end if;
    end if;
    exception when others then
        msg_string:='Error de datos: Tipo de material paredes inválido';
        raise_application_error(err_number, msg_string, true);
    end;
return tipo_mat_paredes;
end;
