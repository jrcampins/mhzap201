create or replace function ubicacion_check_update(inferior bigint, superior bigint) returns integer as $$
declare
    row_ubicacion record;
begin
    if (superior = inferior) then
        raise exception 'la ubicacion superior no puede ser igual a la ubicacion';
    else
        select * into row_ubicacion from ubicacion where id_ubicacion = superior;
        if not found then
            raise exception 'la ubicacion superior no esta definida';
        elseif (row_ubicacion.id_ubicacion_superior is null) then
            return 1;
        elseif (row_ubicacion.id_ubicacion_superior = inferior) then
            raise exception 'la ubicacion superior no puede estar subordinada a la ubicacion';
        else
            return 1 + ubicacion_check_update(inferior, row_ubicacion.id_ubicacion_superior);
        end if;
    end if;
end;
$$ language plpgsql;
