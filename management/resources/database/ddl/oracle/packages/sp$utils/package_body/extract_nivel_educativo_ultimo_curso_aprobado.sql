function extract_nivel_educ(str varchar2) return number is

    --Se retorna 99 si no responde
    nivel_educativo_ult number:= null;
begin
    if str is not null then
        nivel_educativo_ult:=to_number(str);
        if nivel_educativo_ult >=0 and nivel_educativo_ult <=22 then
            return nivel_educativo_ult;
        else
            return null;
        end if;
    end if;
return nivel_educativo_ult;
end;
