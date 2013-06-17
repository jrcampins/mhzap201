function extract_tipo_mat_techo(str varchar2) return number is
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
    tipo_mat_techo number:= null;
begin
    begin
    if str is not null then
        tipo_mat_techo:=to_number(str);
        if (tipo_mat_techo>=1 and tipo_mat_techo<=4) or tipo_mat_techo=9 then
            return tipo_mat_techo;
        else
            msg_string:='Tipo de material techo inválido';
            raise_application_error(err_number, msg_string, true);
        end if;
    end if;
    exception when others then
        msg_string:='Error de datos: Tipo de material de techo inválido';
        raise_application_error(err_number, msg_string, true);
    end;
return tipo_mat_techo;
end;
