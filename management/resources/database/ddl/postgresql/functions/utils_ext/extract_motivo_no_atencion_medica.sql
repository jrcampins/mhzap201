create or replace function extract_motivo_no_atencion(str varchar) returns integer as $$
declare
    motivo_no_atencion integer:= null;
begin
    if str is not null then
        motivo_no_atencion:=cast_varchar_as_integer(str);
        if motivo_no_atencion>=1 and motivo_no_atencion<=9 then
            return motivo_no_atencion;
        else
            return null;
        end if;
    end if;
return motivo_no_atencion;
end;
$$ language'plpgsql';