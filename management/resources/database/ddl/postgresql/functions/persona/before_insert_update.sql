create or replace function persona_before_insert_update (row_persona persona) returns integer as $$
declare
    ok integer := 0;
begin
    if row_persona.fecha_nacimiento > now()::date then
        raise exception 'la fecha de nacimiento no puede ser mayor que la fecha de hoy (%)', now()::date;
    end if;
    return ok;
end;
$$ language 'plpgsql' volatile called on null input security invoker;
