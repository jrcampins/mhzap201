create or replace function extract_tipo_desecho_bas(str varchar) returns integer as $$
declare
    tipo_desecho_bas integer:= null;
begin
    if str is not null then
        tipo_desecho_bas:=cast_varchar_as_integer(str);
        if tipo_desecho_bas>=1 and tipo_desecho_bas<=6 then
            return tipo_desecho_bas;
        else
            return null;
        end if;
    end if;
return tipo_desecho_bas;
end;
$$ language'plpgsql';