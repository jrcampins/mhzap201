create or replace function extract_franja_utm(str varchar) returns varchar as $$
declare
    franja_utm varchar:= null;
begin
    if str is not null then
        if str >= 'C'::bpchar and str <= 'X' ::bpchar  and str <> 'O'::bpchar and str <> 'I'::bpchar then
            franja_utm:=str;
        else
            return null;
        end if;
    end if;
return franja_utm;
end;
$$ LANGUAGE 'plpgsql';