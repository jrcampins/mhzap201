function extract_clase_impedimento(str varchar2) return number is
    clase_impedimento number:= null;
begin
    if str is not null then
        clase_impedimento:=to_number(str);
        if clase_impedimento>=1 and clase_impedimento<=13 or clase_impedimento=16 then
            return clase_impedimento;
        else
            return null;
        end if;
    end if;
return clase_impedimento;
end;