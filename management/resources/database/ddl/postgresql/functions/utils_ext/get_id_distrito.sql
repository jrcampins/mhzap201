create or replace function get_id_distrito(departamento varchar,distrito varchar) returns bigint as $$
declare
    id_distrito_retornar bigint:= 0;
begin
    if departamento is not null and distrito is not null then
        select id_ubicacion into id_distrito_retornar from ubicacion_arbol_1_nivel where nombre_ubicacion ilike distrito and nombre_ubicacion_superior ilike departamento;
        if not found then
            id_distrito_retornar:=0;
        end if;
    end if;
return id_distrito_retornar;
end;
$$ language'plpgsql';