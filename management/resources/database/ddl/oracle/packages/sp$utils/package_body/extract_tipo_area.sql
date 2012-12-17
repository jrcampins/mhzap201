function extract_tipo_area(str varchar2) return number is

    tipo_area number:= null;
begin
    if str is not null then
        if str='1' then
            tipo_area:=1;
        elsif str='6' then
            tipo_area:=6;
        end if;
    end if;
return tipo_area;
end;