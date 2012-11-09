create or replace function get_id_barrio(distrito varchar,barrio varchar) returns bigint as $$
declare
    id_barrio_retornar bigint:= 0;
begin
    if barrio is not null  and distrito is not null then
        select id_ubicacion into id_barrio_retornar from
               ubicacion_arbol_2_nivel
        where ubicacion_arbol_2_nivel.nombre_ubicacion ilike barrio and ubicacion_arbol_2_nivel.nombre_ubicacion_superior ilike distrito;
        if not found then
            id_barrio_retornar:=0;
        end if;
    end if;
return id_barrio_retornar;
end;
$$ language'plpgsql';