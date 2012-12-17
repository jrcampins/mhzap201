function extract_franja_utm(str varchar2) return char is

    franja_utm char(1):= null;
begin
    if str is not null then
        if str >='C' and str <= 'X'  and str <> 'O' and str <> 'I' then
            franja_utm:=str;
        else
            return null;
        end if;
    end if;
return franja_utm;
end;