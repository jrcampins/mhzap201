function extract_motivo_no_atencion(str varchar2) return number is

    motivo_no_atencion number:= null;
begin
    if str is not null then
        motivo_no_atencion:=to_number(str);
        if motivo_no_atencion>=1 and motivo_no_atencion<=9 then
            return motivo_no_atencion;
        else
            return null;
        end if;
    end if;
return motivo_no_atencion;
end;
