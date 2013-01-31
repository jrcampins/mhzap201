function extract_tipo_desecho_bas(str varchar2) return number is
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
    tipo_desecho_bas number:= null;
begin
    begin
    if str is not null then
        tipo_desecho_bas:=to_number(str);
        if tipo_desecho_bas>=1 and tipo_desecho_bas<=6 then
            return tipo_desecho_bas;
        else
            return null;
        end if;
    end if;
    exception when others then
        msg_string:='Error de datos: Tipo de tratamiento de desechos inválido';
        raise_application_error(err_number, msg_string, true);
    end;
return tipo_desecho_bas;
end;
