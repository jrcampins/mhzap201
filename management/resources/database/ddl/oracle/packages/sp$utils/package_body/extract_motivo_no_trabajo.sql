function extract_motivo_no_trabajo(str varchar2) return number is

    motivo_no_trabajo number:= null;
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    err_number number:=-20000;
begin
    begin
    if str is not null then
        motivo_no_trabajo:=to_number(str);
        if (motivo_no_trabajo>=1 and motivo_no_trabajo<=9) or motivo_no_trabajo=99 then
            return motivo_no_trabajo;
        else
            return null;
        end if;
    end if;
    exception when others then
        msg_string:='Error de datos: Motivo de no trabajo inválido';
        raise_application_error(err_number, msg_string, true);
     end;
return motivo_no_trabajo;
end;
