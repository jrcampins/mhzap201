function get_id_departamento(departamento varchar2) return number is

    id_departamento_retornar number:= 0;
begin
    if departamento is not null then
        begin
            select id_ubicacion into id_departamento_retornar from ubicacion where id_ubicacion_superior is null and nombre_ubicacion like departamento ;
        exception
            when no_data_found then
                raise_application_error(-20001, 'Ubicación no encontrada');  
        end;
        if not sql%found then
            id_departamento_retornar:=0;
        end if;
    end if;
return id_departamento_retornar;
end;
