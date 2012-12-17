function extract_causa_impedimento(str varchar2) return number is
    causa_impedimento number:= null;
begin
    if str is not null then
        causa_impedimento:=to_number(str);
        if causa_impedimento>=1 and causa_impedimento<=5 then
            return causa_impedimento;
        else
            return null;
        end if;
    end if;
return causa_impedimento;
end;