function get_id_distrito_sw(departamento varchar2,distrito varchar2) return number is
    id_distrito_retornar number:= 0;
begin
    if departamento is not null and distrito is not null then
        begin
            select id_ubicacion into id_distrito_retornar from ubicacion_arbol_1_nivel where nombre_ubicacion like distrito and nombre_ubicacion_superior like departamento;
        exception
            when no_data_found then
                null;
            end;
        if not sql%found then
            id_distrito_retornar:=0;
        end if;
    end if;
return id_distrito_retornar;
end;
