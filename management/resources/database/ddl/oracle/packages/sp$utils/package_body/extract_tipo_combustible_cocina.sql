function extract_tipo_combustible(str varchar2) return number is

    tipo_combustible number:= null;
begin
    if str is not null then
        tipo_combustible:=to_number(str);
        if tipo_combustible>=1 and tipo_combustible<=6 then
            return tipo_combustible;
        else
            return null;
        end if;
    end if;
return tipo_combustible;
end;
