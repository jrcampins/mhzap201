create or replace function get_numero_tipo_area(id_barrio bigint) returns integer as $$
declare
    row_ubicacion ubicacion;
    tipo_area integer:=null;
begin
    if id_barrio is not null then
        select numero_tipo_area
        into tipo_area
        from ubicacion
        where id_ubicacion=id_barrio;
    end if;
return tipo_area;
end;
$$ language'plpgsql';