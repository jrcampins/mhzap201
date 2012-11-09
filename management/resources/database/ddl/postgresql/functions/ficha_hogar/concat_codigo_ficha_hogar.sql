create or replace function ficha_hogar_concat_codigo_ficha_hogar (row_ficha_hogar ficha_hogar) returns varchar as $$
declare
    codigo varchar;
begin
    if (row_ficha_hogar.id_manzana is not null) then
        select codigo_ubicacion
        into   codigo
        from   ubicacion
        where  id_ubicacion = row_ficha_hogar.id_manzana;
        /**/
        if not found then
            raise exception 'manzana no existe (id=%)', row_ficha_hogar.id_manzana;
        end if;
    elsif (row_ficha_hogar.id_barrio is not null) then
        select codigo_ubicacion
        into   codigo
        from   ubicacion
        where  id_ubicacion = row_ficha_hogar.id_barrio;
        /**/
        if not found then
            raise exception 'barrio no existe (id=%)', row_ficha_hogar.id_barrio;
        end if;
    elsif (row_ficha_hogar.id_distrito is not null) then
        select codigo_ubicacion
        into   codigo
        from   ubicacion
        where  id_ubicacion = row_ficha_hogar.id_distrito;
        /**/
        if not found then
            raise exception 'distrito no existe (id=%)', row_ficha_hogar.id_distrito;
        end if;
    elsif (row_ficha_hogar.id_departamento is not null) then
        select codigo_ubicacion
        into   codigo
        from   ubicacion
        where  id_ubicacion = row_ficha_hogar.id_departamento;
        /**/
        if not found then
            raise exception 'departamento no existe (id=%)', row_ficha_hogar.id_departamento;
        end if;
    else
        codigo = '?';
    end if;
    codigo = codigo
        || '-' || row_ficha_hogar.numero_tipo_area
        || '-' || replace(substring(cast(row_ficha_hogar.fecha_entrevista as varchar) from 1 for 10),'-','')
        || '-' || row_ficha_hogar.numero_formulario
        || '-' || row_ficha_hogar.numero_vivienda
        || '-' || row_ficha_hogar.numero_hogar;
    /**/
    return cast(codigo as varchar(30));
end;
$$ language 'plpgsql' volatile called on null input security invoker;
