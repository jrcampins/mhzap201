function extract_motivo_no_atencion(str varchar2) return number is

    motivo_no_atencion number:= null;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
begin
    begin
    if str is not null then
        motivo_no_atencion:=to_number(str);
        if (motivo_no_atencion>=1 and motivo_no_atencion<=9) or motivo_no_atencion=99 then
            return motivo_no_atencion;
        else
            return null;
        end if;
    end if;
    exception when others then
        msg_string:='Error de datos: Motivo de no atención inválido';
        raise_application_error(err_number, msg_string, true);
     end;
return motivo_no_atencion;
end;
