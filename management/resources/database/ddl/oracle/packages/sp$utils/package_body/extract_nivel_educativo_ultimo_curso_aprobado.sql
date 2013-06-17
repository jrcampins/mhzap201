function extract_nivel_educ(str varchar2) return number is

    --Se retorna 99 si no responde
    nivel_educativo_ult number:= null;
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    err_number number:=-20000;
begin
    begin
    if str is not null then
        nivel_educativo_ult:=to_number(str);
        if (nivel_educativo_ult >=0 and nivel_educativo_ult <=22) or nivel_educativo_ult=99 then
            return nivel_educativo_ult;
        else
            return null;
        end if;
    end if;
    exception when others then  
       msg_string:='Error de datos: Nivel educativo de último curso inválido';
       raise_application_error(err_number, msg_string, true);
     end;
return nivel_educativo_ult;
end;
