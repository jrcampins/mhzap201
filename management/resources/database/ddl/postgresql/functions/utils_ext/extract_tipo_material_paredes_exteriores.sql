create or replace function extract_tipo_mat_paredes(str varchar) returns integer as $$
declare
    tipo_mat_paredes integer:= null;
begin
    if str is not null then
        tipo_mat_paredes:=cast_varchar_as_integer(str);
        if tipo_mat_paredes>=1 and tipo_mat_paredes<=7 then
            return tipo_mat_paredes;
        else
            return null;
        end if;
    end if;
return tipo_mat_paredes;
end;
$$ language'plpgsql';