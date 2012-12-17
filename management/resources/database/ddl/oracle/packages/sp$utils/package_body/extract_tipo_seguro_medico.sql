function extract_tipo_seguro_medico(str varchar2) return number is

    --Se retorna 99 si no responde
    tipo_seguro_medico number:= 6;
begin
    if str is not null then
        tipo_seguro_medico:=to_number(str);
        if tipo_seguro_medico>=1 and tipo_seguro_medico<=4 then
            return tipo_seguro_medico;
        else
            return 6;
        end if;
    end if;
return tipo_Seguro_medico;
end;
