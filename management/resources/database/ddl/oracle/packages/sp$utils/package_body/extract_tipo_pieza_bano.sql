function extract_tipo_pieza_bano(str varchar2) return number is
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
    tipo_pieza_bano number:= null;
begin
    begin
    if str is not null then
        tipo_pieza_bano:=to_number(str);
        if tipo_pieza_bano>=1 and tipo_pieza_bano<=6 then
            return tipo_pieza_bano;
        else
            msg_string:='Tipo de pieza de baño inválido';
        raise_application_error(err_number, msg_string, true);
        end if;
    end if;
    exception when others then
        msg_string:='Error de datos: Tipo de pieza de baño inválida';
        raise_application_error(err_number, msg_string, true);
    end;
return tipo_pieza_bano;
end;
