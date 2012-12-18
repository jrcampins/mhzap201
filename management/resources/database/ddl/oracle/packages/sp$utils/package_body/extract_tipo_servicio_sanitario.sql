function extract_tipo_servicio_san(str varchar2) return number is

    tipo_servicio_san number:= null;
begin
    if str is not null then
        tipo_servicio_san:=to_number(str);
        if tipo_servicio_san>=1 and tipo_servicio_san<=6 then
            return tipo_servicio_san;
        else
            return null;
        end if;
    end if;
return tipo_servicio_san;
end;