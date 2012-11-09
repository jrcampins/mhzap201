create or replace function extract_motivo_ina_esc(str varchar) returns integer as $$
declare
    motivo_ina_esc integer:= null;
begin
    if str is not null then
        motivo_ina_esc:=cast_varchar_as_integer(str);
        if motivo_ina_esc>=1 and motivo_ina_esc<=25 then
            return motivo_ina_esc;
        else
            return null;
        end if;
    end if;
return motivo_ina_esc;
end;
$$ language'plpgsql';