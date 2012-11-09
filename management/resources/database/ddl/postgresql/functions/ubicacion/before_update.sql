create or replace function ubicacion_before_update() returns trigger as $$
declare
    nivel_ubicacion_superior integer := 0;
begin
    if (new.id_ubicacion_superior is not null) then
        if (old.id_ubicacion_superior is null or old.id_ubicacion_superior <> new.id_ubicacion_superior) then
            select ubicacion_check_update(new.id_ubicacion, new.id_ubicacion_superior)
            into nivel_ubicacion_superior;
        end if;
    end if;
    return new;
end;
$$ language plpgsql;
