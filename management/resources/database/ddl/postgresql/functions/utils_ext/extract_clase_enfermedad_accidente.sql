create or replace function extract_clase_enf_acc(str varchar) returns integer as $$
declare
    clase_enf_acc integer:= null;
begin
    if str is not null then
        clase_enf_acc:=cast_varchar_as_integer(str);
        if clase_enf_acc>=11 and clase_enf_acc<=44 then
            return clase_enf_acc;
        else
            return null;
        end if;
    end if;
return clase_enf_acc;
end;
$$ language'plpgsql';