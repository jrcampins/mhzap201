create or replace function extract_tipo_abastecimiento(str varchar) returns integer as $$
declare
    tipo_abastecimiento integer:= null;
begin
    if str is not null then
        tipo_abastecimiento:=cast_varchar_as_integer(str);
        if tipo_abastecimiento>=1 and tipo_abastecimiento<=3 then
            return tipo_abastecimiento;
        else
            return null;
        end if;
    end if;
return tipo_abastecimiento;
end;
$$ language'plpgsql';