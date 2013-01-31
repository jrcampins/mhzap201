function extract_ultimo_curso_aprobado(str varchar2) return number is
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
    --Se retorna 99 si no responde
    ultimo_curso_aprobado number:= 99;
begin
    begin
    if str is not null then
        ultimo_curso_aprobado:=to_number(str);
        if ultimo_curso_aprobado>=1 and ultimo_curso_aprobado<=12 then
            return ultimo_curso_aprobado;
        else
            return 99;
        end if;
    end if;
    exception when others then
        msg_string:='Error de datos: Último curso inválido';
        raise_application_error(err_number, msg_string, true);
    end;
return ultimo_curso_aprobado;
end;
