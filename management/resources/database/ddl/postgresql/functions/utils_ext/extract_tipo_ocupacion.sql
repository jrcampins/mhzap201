create or replace function extract_tipo_ocupacion(str varchar) returns integer as $$
declare
    tipo_ocupacion integer:= null;
begin
    if str is not null then
        tipo_ocupacion:=cast_varchar_as_integer(str);
        if tipo_ocupacion>=1 and tipo_ocupacion<=6 then
            return tipo_ocupacion;
        else
            return null;
        end if;
    end if;
return tipo_ocupacion;
end;
$$ language'plpgsql';