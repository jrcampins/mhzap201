create or replace function extract_nivel_educativo_ultimo_curso_aprobado(str varchar) returns integer as $$
declare
    --Se retorna 99 si no responde
    nivel_educativo_uiltimo_curso_aprobado integer:= null;
begin
    if str is not null then
        nivel_educativo_uiltimo_curso_aprobado:=cast_varchar_as_integer(str);
        if nivel_educativo_uiltimo_curso_aprobado>=0 and nivel_educativo_uiltimo_curso_aprobado<=22 then
            return nivel_educativo_uiltimo_curso_aprobado;
        else
            return null;
        end if;
    end if;
return nivel_educativo_uiltimo_curso_aprobado;
end;
$$ language'plpgsql';