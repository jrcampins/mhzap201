function get_numero_tipo_area(id_barrio number) return number is

    row_ubicacion ubicacion%rowtype;
    tipo_area number:=null;
begin
    if id_barrio is not null then
        begin 
            select numero_tipo_area into tipo_area from ubicacion where id_ubicacion=id_barrio;
        exception
            when no_data_found then
                raise_application_error(-20001, 'Ubicación no encontrada');  
        end;
    end if;
return tipo_area;
end;
