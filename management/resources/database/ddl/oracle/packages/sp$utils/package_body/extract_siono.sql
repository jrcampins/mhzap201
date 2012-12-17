function extract_siono(str varchar2) return number is

    siono number:= null;
begin
    if str is not null then
        siono:=to_number(str);
        if siono=1 or siono=6 then
            return siono;
        else
            return null;
        end if;
    end if;
return siono;
end;
