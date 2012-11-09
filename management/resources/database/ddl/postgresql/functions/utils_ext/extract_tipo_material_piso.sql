create or replace function extract_tipo_mat_piso(str varchar) returns integer as $$
declare
    tipo_mat_piso integer:= null;
begin
    if str is not null then
        tipo_mat_piso:=cast_varchar_as_integer(str);
        if tipo_mat_piso>=1 and tipo_mat_piso<=7 then
            return tipo_mat_piso;
        else
            return null;
        end if;
    end if;
return tipo_mat_piso;
end;
$$ language'plpgsql';