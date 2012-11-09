create or replace function extract_tipo_area_ubicacion(str varchar) returns integer as $$
declare
    tipo_area integer:= null;
begin
    if str is not null then
        if str ilike 'URBANA' then
            tipo_area:=1;
        elsif str ilike 'RURAL' then
            tipo_area:=6;
        end if;
    end if;
return tipo_area;
end;
$$ LANGUAGE 'plpgsql';