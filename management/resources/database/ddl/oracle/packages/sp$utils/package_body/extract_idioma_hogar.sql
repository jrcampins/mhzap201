function extract_idioma_hogar(str varchar2) return number is

    idioma_hogar number:= null; 
        err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000);
begin
    begin
    if str is not null then
        idioma_hogar:=to_number(str);
        if (idioma_hogar>=1 and idioma_hogar<=5) or idioma_hogar=9 then
            return idioma_hogar;
        else
            msg_string:='Idioma de hogar inválido';
            raise_application_error(err_number, msg_string, true);
        end if;
    end if;
    exception when others then
        msg_string:='Error de datos: Idioma inválido';
        raise_application_error(err_number, msg_string, true);
     end;
return idioma_hogar;
exception
	when others then
		return null;
end;
