create or replace function extract_tipo_relacion_lab(str varchar) returns integer as $$
declare
    tipo_relacion_lab integer:= null;
begin
    if str is not null then
        tipo_relacion_lab:=cast_varchar_as_integer(str);
        if tipo_relacion_lab>=1 and tipo_relacion_lab<=8 then
            return tipo_relacion_lab;
        else
            return null;
        end if;
    end if;
return tipo_relacion_lab;
end;
$$ language'plpgsql';