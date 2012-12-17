function extract_tipo_desecho_bas(str varchar2) return number is

    tipo_desecho_bas number:= null;
begin
    if str is not null then
        tipo_desecho_bas:=to_number(str);
        if tipo_desecho_bas>=1 and tipo_desecho_bas<=6 then
            return tipo_desecho_bas;
        else
            return null;
        end if;
    end if;
return tipo_desecho_bas;
end;
