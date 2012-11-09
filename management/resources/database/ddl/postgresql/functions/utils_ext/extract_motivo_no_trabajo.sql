create or replace function extract_motivo_no_trabajo(str varchar) returns integer as $$
declare
    motivo_no_trabajo integer:= null;
begin
    if str is not null then
        motivo_no_trabajo:=cast_varchar_as_integer(str);
        if motivo_no_trabajo>=1 and motivo_no_trabajo<=9 then
            return motivo_no_trabajo;
        else
            return null;
        end if;
    end if;
return motivo_no_trabajo;
end;
$$ language'plpgsql';