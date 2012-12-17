function extract_motivo_no_trabajo(str varchar2) return number is

    motivo_no_trabajo number:= null;
begin
    if str is not null then
        motivo_no_trabajo:=to_number(str);
        if motivo_no_trabajo>=1 and motivo_no_trabajo<=9 then
            return motivo_no_trabajo;
        else
            return null;
        end if;
    end if;
return motivo_no_trabajo;
end;
