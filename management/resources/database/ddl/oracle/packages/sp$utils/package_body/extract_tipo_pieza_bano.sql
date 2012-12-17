function extract_tipo_pieza_bano(str varchar2) return number is

    tipo_pieza_bano number:= null;
begin
    if str is not null then
        tipo_pieza_bano:=to_number(str);
        if tipo_pieza_bano>=1 and tipo_pieza_bano<=6 then
            return tipo_pieza_bano;
        else
            return null;
        end if;
    end if;
return tipo_pieza_bano;
end;
