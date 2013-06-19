function extract_tipo_relacion_lab(str varchar2) return number is
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    tipo_relacion_lab number:= null;
begin
    begin
    if str is not null then
        tipo_relacion_lab:=to_number(str);
        if (tipo_relacion_lab>=1 and tipo_relacion_lab<=8) or tipo_relacion_lab=9 then
            return tipo_relacion_lab;
        else
            msg_string:='Tipo de relación laboral inválido';
        raise_application_error(err_number, msg_string, true);
        end if;
    end if;
    exception when others then
        msg_string:='Error de datos: Relación Laboral inválida';
        raise_application_error(err_number, msg_string, true);
    end;
return tipo_relacion_lab;
end;
