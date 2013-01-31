function extract_tipo_abastecimiento(str varchar2) return number is
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
    tipo_abastecimiento number:= null;
begin
    begin
    if str is not null then
        tipo_abastecimiento:=to_number(str);
        if tipo_abastecimiento>=1 and tipo_abastecimiento<=3 then
            return tipo_abastecimiento;
        else
            return null;
        end if;
    end if;
    exception when others then
        msg_string:='Tipo de abastecimiento inválido';
        raise_application_error(err_number, msg_string, true);
    end;
return tipo_abastecimiento;
end;
