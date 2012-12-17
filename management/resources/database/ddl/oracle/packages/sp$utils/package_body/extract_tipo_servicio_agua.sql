function extract_tipo_servicio_agua(str varchar2) return number is

    tipo_servicio_agua number:= null;
begin
    if str is not null then
        tipo_servicio_agua:=to_number(str);
        if tipo_servicio_agua>=1 and tipo_servicio_agua<=6 then
            return tipo_servicio_agua;
        else
            return null;
        end if;
    end if;
return tipo_servicio_agua;
end;
