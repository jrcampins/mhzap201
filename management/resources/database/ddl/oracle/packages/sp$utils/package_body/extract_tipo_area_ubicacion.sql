function extract_tipo_area_ubicacion(str varchar2) return number is

    tipo_area number:= null;
begin
    if str is not null then
        if str like 'URBANA' then
            tipo_area:=1;
        elsif str like 'RURAL' then
            tipo_area:=6;
        end if;
    end if;
return tipo_area;
end;