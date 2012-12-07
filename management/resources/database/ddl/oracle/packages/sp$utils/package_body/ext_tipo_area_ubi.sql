function ext_tipo_area_ubi(str varchar2) return number is
    tipo_area number:= null;
begin
    if str is not null then
        if str = 'URBANA' then
            tipo_area:=1;
        elsif str = 'RURAL' then
            tipo_area:=6;
        end if;
    end if;
return tipo_area;
end;
