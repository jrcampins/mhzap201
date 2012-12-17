function extract_tipo_relacion_lab(str varchar2) return number is

    tipo_relacion_lab number:= null;
begin
    if str is not null then
        tipo_relacion_lab:=to_number(str);
        if tipo_relacion_lab>=1 and tipo_relacion_lab<=8 then
            return tipo_relacion_lab;
        else
            return null;
        end if;
    end if;
return tipo_relacion_lab;
end;
