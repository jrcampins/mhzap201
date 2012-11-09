create or replace function extract_tipo_pieza_bano(str varchar) returns integer as $$
declare
    tipo_pieza_bano integer:= null;
begin
    if str is not null then
        tipo_pieza_bano:=cast_varchar_as_integer(str);
        if tipo_pieza_bano>=1 and tipo_pieza_bano<=6 then
            return tipo_pieza_bano;
        else
            return null;
        end if;
    end if;
return tipo_pieza_bano;
end;
$$ language'plpgsql';