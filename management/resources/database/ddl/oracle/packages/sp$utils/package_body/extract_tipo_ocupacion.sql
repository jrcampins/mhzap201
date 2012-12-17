function extract_tipo_ocupacion(str varchar2) return number is

    tipo_ocupacion number:= null;
begin
    if str is not null then
        tipo_ocupacion:=to_number(str);
        if tipo_ocupacion>=1 and tipo_ocupacion<=6 then
            return tipo_ocupacion;
        else
            return null;
        end if;
    end if;
return tipo_ocupacion;
end;
