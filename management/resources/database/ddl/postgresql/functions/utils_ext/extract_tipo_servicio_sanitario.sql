create or replace function extract_tipo_servicio_san(str varchar) returns integer as $$
declare
    tipo_servicio_san integer:= null;
begin
    if str is not null then
        tipo_servicio_san:=cast_varchar_as_integer(str);
        if tipo_servicio_san>=1 and tipo_servicio_san<=6 then
            return tipo_servicio_san;
        else
            return null;
        end if;
    end if;
return tipo_servicio_san;
end;
$$ language'plpgsql';