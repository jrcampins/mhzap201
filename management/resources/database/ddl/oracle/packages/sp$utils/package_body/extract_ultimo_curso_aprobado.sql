function extract_ultimo_curso_aprobado(str varchar2) return number is

    --Se retorna 99 si no responde
    ultimo_curso_aprobado number:= 99;
begin
    if str is not null then
        ultimo_curso_aprobado:=to_number(str);
        if ultimo_curso_aprobado>=1 and ultimo_curso_aprobado<=12 then
            return ultimo_curso_aprobado;
        else
            return 99;
        end if;
    end if;
return ultimo_curso_aprobado;
end;
