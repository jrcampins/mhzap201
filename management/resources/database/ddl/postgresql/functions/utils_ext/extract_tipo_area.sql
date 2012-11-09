create or replace function extract_tipo_area(str varchar) returns integer as $$
declare
    tipo_area integer:= null;
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
$$ LANGUAGE 'plpgsql';