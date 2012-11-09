create or replace function extract_tipo_combustible(str varchar) returns integer as $$
declare
    tipo_combustible integer:= null;
begin
    if str is not null then
        tipo_combustible:=cast_varchar_as_integer(str);
        if tipo_combustible>=1 and tipo_combustible<=6 then
            return tipo_combustible;
        else
            return null;
        end if;
    end if;
return tipo_combustible;
end;
$$ language'plpgsql';