create or replace function get_id_ubicacion(str varchar) returns bigint as $$
declare
    id_ubicacion_retornar bigint:= 0;
begin
    if str is not null then
        select id_ubicacion into id_ubicacion_retornar from ubicacion where nombre_ubicacion ilike str;
        if not found then
            id_ubicacion_retornar:=0;
        end if;
    end if;
return id_ubicacion_retornar;
end;
$$ language'plpgsql';