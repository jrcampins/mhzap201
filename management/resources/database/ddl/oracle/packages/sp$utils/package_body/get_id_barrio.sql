function get_id_barrio(distrito varchar2,barrio varchar2) return number is
    id_barrio_retornar number:= 0;
begin
    if barrio is not null  and distrito is not null then
        begin
            select id_ubicacion into id_barrio_retornar from ubicacion_arbol_2_nivel where ubicacion_arbol_2_nivel.nombre_ubicacion like barrio and ubicacion_arbol_2_nivel.nombre_ubicacion_superior like distrito;
        exception
            when no_data_found then
                --raise_application_error(-20001, 'Barrio '||barrio||' no encontrado en distrito '||distrito);  
                id_barrio_retornar:=0;
                return id_barrio_retornar;
        end;
        if not sql%found then
            id_barrio_retornar:=0;
        end if;
    end if;
return id_barrio_retornar;
end;