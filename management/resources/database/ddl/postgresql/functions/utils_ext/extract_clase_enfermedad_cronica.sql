create or replace function extract_clase_enf_cronica(str varchar) returns integer as $$
declare
    clase_enf_cronica integer:= 6;
begin
    if str is not null then
        clase_enf_cronica:=cast_varchar_as_integer(str);
        if clase_enf_cronica>=11 and clase_enf_cronica<=42 then
            return clase_enf_cronica;
        else
            return 6;
        end if;
    end if;
return clase_enf_cronica;
end;
$$ language'plpgsql';