create or replace function extract_tipo_servicio_agua(str varchar) returns integer as $$
declare
    tipo_servicio_agua integer:= null;
begin
    if str is not null then
        tipo_servicio_agua:=cast_varchar_as_integer(str);
        if tipo_servicio_agua>=1 and tipo_servicio_agua<=6 then
            return tipo_servicio_agua;
        else
            return null;
        end if;
    end if;
return tipo_servicio_agua;
end;
$$ language'plpgsql';