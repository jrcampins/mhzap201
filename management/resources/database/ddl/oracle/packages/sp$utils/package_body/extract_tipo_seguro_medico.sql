function extract_tipo_seguro_medico(str varchar2) return number is

    --Se retorna 99 si no responde
    tipo_seguro_medico number:= 6;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
    if str is not null then
        tipo_seguro_medico:=to_number(str);
        if tipo_seguro_medico>=1 and tipo_seguro_medico<=4 or tipo_seguro_medico=9 then
            return tipo_seguro_medico;
        else
            return 6;
        end if;
    end if; 
    exception when others then
        msg_string:='Error de datos: Tipo de seguro médico inválido';
        raise_application_error(err_number, msg_string, true);
    end;
return tipo_Seguro_medico;
end;
