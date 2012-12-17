function extract_tipo_abastecimiento(str varchar2) return number is

    tipo_abastecimiento number:= null;
begin
    if str is not null then
        tipo_abastecimiento:=to_number(str);
        if tipo_abastecimiento>=1 and tipo_abastecimiento<=3 then
            return tipo_abastecimiento;
        else
            return null;
        end if;
    end if;
return tipo_abastecimiento;
end;
