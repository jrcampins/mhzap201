function concat_codigo(xrow ficha_hogar%rowtype) return varchar2 is
    codigo varchar2(60);
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    if (xrow.id_manzana is not null) then
        begin
            select codigo_ubicacion
            into   codigo
            from   ubicacion
            where  id_ubicacion = xrow.id_manzana;
        exception
            when no_data_found then
                msg_string := 'manzana ' || xrow.id_manzana || ' no existe';
                raise_application_error(err_number, msg_string, true);
        end;
    elsif (xrow.id_barrio is not null) then
        begin
            select codigo_ubicacion
            into   codigo
            from   ubicacion
            where  id_ubicacion = xrow.id_barrio;
        exception
            when no_data_found then
                msg_string := 'barrio ' || xrow.id_barrio || ' no existe';
                raise_application_error(err_number, msg_string, true);
        end;
    elsif (xrow.id_distrito is not null) then
        begin
            select codigo_ubicacion
            into   codigo
            from   ubicacion
            where  id_ubicacion = xrow.id_distrito;
        exception
            when no_data_found then
                msg_string := 'distrito ' || xrow.id_distrito || ' no existe';
                raise_application_error(err_number, msg_string, true);
        end;
    elsif (xrow.id_departamento is not null) then
        begin
            select codigo_ubicacion
            into   codigo
            from   ubicacion
            where  id_ubicacion = xrow.id_departamento;
        exception
            when no_data_found then
                msg_string := 'departamento ' || xrow.id_departamento || ' no existe';
                raise_application_error(err_number, msg_string, true);
        end;
    else
        codigo := '?';
    end if;
    codigo := codigo
        || '-' || xrow.numero_tipo_area
        || '-' || to_char(xrow.fecha_entrevista, 'YYYYMMDD')
        || '-' || xrow.numero_formulario
        || '-' || xrow.numero_vivienda
        || '-' || xrow.numero_hogar;
    /**/
    return codigo;
end;
