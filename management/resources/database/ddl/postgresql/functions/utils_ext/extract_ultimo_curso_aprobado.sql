create or replace function extract_ultimo_curso_aprobado(str varchar) returns integer as $$
declare
    --Se retorna 99 si no responde
    ultimo_curso_aprobado integer:= 99;
begin
    if str is not null then
        ultimo_curso_aprobado:=cast_varchar_as_integer(str);
        if ultimo_curso_aprobado>=1 and ultimo_curso_aprobado<=12 then
            return ultimo_curso_aprobado;
        else
            return 99;
        end if;
    end if;
return ultimo_curso_aprobado;
end;
$$ language'plpgsql';