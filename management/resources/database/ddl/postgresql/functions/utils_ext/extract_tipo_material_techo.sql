create or replace function extract_tipo_mat_techo(str varchar) returns integer as $$
declare
    tipo_mat_techo integer:= null;
begin
    if str is not null then
        tipo_mat_techo:=cast_varchar_as_integer(str);
        if tipo_mat_techo>=1 and tipo_mat_techo<=4 then
            return tipo_mat_techo;
        else
            return null;
        end if;
    end if;
return tipo_mat_techo;
end;
$$ language'plpgsql';