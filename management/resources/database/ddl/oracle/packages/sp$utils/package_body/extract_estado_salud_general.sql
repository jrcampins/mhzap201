function extract_estado_salud(str varchar2) return number is

    --Se retorna 99 si no responde
    estado_salud number:= 6;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
begin
    begin
    if str is not null then
        estado_salud:=to_number(str);
        if estado_salud>=1 and estado_salud<=3 then
            return estado_salud;
        else
            return 6;
        end if;
    end if;
    exception when others then
        msg_string:='Error de datos: Estado de salud inválido';
        raise_application_error(err_number, msg_string, true);
     end;
return estado_salud;
end;
