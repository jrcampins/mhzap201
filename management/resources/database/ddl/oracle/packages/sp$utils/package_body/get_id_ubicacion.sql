function get_id_ubicacion(str varchar2) return number is

    id_ubicacion_retornar number:= 0;
begin
    if str is not null then
        begin
            select id_ubicacion into id_ubicacion_retornar from ubicacion where nombre_ubicacion like str;
        exception
            when no_data_found then
                raise_application_error(-20001, 'Ubicación '''||str||''' no encontrada');  
        end;
        if not sql%found then
            id_ubicacion_retornar:=0;
        end if;
    end if;
return id_ubicacion_retornar;
end;
