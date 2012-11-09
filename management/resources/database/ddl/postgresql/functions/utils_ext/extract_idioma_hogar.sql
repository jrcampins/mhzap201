create or replace function extract_idioma_hogar(str varchar) returns integer as $$
declare
    idioma_hogar integer:= null;
begin
    if str is not null then
        idioma_hogar:=cast_varchar_as_integer(str);
        if idioma_hogar>=1 and idioma_hogar<=5 then
            return idioma_hogar;
        else
            return null;
        end if;
    end if;
return idioma_hogar;
exception
	when others then
		return null;
end;
$$ language'plpgsql';