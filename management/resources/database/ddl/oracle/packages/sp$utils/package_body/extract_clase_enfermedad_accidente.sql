function extract_clase_enf_acc(str varchar2) return number is
    clase_enf_acc number:= null;
begin
    if str is not null then
        clase_enf_acc:=to_number(str);
        if clase_enf_acc>=11 and clase_enf_acc<=44 then
            return clase_enf_acc;
        else
            return null;
        end if;
    end if;
return clase_enf_acc;
end;