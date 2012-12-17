function extract_telefono(str1 varchar2,str2 varchar2) return varchar2 is

    numero_celular varchar2(30):= null;
begin
    if str1='1' and str2 is not null then
        numero_celular:=str2;
        return numero_celular;
    elsif str1='1' and str2 is null then
        numero_celular:='?';
        return numero_celular;
    else
        return null;
    end if;
return numero_celular;
end;
