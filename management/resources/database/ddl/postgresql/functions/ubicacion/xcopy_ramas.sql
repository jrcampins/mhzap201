create or replace function ubicacion_xcopy_ramas(row_ubicacion_plus ubicacion_plus) returns integer as $$
declare
    row_ubicacion record;
    nsy integer := 0; -- numero secuencia del nodo "y"
begin	
    for row_ubicacion in
    select ubicacion.*,nivel_ubicacion.codigo_nivel_ubicacion
    from ubicacion,nivel_ubicacion
    where id_ubicacion_superior=row_ubicacion_plus.id_ubicacion
    and nivel_ubicacion.numero_nivel_ubicacion=ubicacion.numero_nivel_ubicacion
    order by id_ubicacion
    loop
        nsy = nsy + 1;
        row_ubicacion_plus.id_ubicacion           = row_ubicacion.id_ubicacion;
        row_ubicacion_plus.version_ubicacion      = row_ubicacion.version_ubicacion;
        row_ubicacion_plus.numero_tipo_nodo          = row_ubicacion.numero_tipo_nodo;
        row_ubicacion_plus.numero_nivel_ubicacion = row_ubicacion.numero_nivel_ubicacion;
        row_ubicacion_plus.codigo_nivel_ubicacion = row_ubicacion.codigo_nivel_ubicacion;
        row_ubicacion_plus.codigo_ubicacion       = row_ubicacion.codigo_ubicacion;
        row_ubicacion_plus.nombre_ubicacion       = row_ubicacion.nombre_ubicacion;
        row_ubicacion_plus.clave_ubicacion        = row_ubicacion.clave_ubicacion;
        /*
        if (row_ubicacion.numero_nivel_ubicacion = 1) then
            row_ubicacion_plus.codigo_nivel_ubicacion_01 = row_ubicacion.codigo_nivel_ubicacion;
            row_ubicacion_plus.codigo_ubicacion_01       = row_ubicacion.codigo_ubicacion;
            row_ubicacion_plus.nombre_ubicacion_01       = row_ubicacion.nombre_ubicacion;
            row_ubicacion_plus.clave_ubicacion_01        = row_ubicacion.clave_ubicacion;
        elseif (row_ubicacion.numero_nivel_ubicacion < 1) then
            row_ubicacion_plus.codigo_nivel_ubicacion_01 = null;
            row_ubicacion_plus.codigo_ubicacion_01       = null;
            row_ubicacion_plus.nombre_ubicacion_01       = null;
            row_ubicacion_plus.clave_ubicacion_01        = null;
        end if;
        */
        if (row_ubicacion.numero_nivel_ubicacion = 2) then
            row_ubicacion_plus.codigo_nivel_ubicacion_02 = row_ubicacion.codigo_nivel_ubicacion;
            row_ubicacion_plus.codigo_ubicacion_02       = row_ubicacion.codigo_ubicacion;
            row_ubicacion_plus.nombre_ubicacion_02       = row_ubicacion.nombre_ubicacion;
            row_ubicacion_plus.clave_ubicacion_02        = row_ubicacion.clave_ubicacion;
        elseif (row_ubicacion.numero_nivel_ubicacion < 2) then
            row_ubicacion_plus.codigo_nivel_ubicacion_02 = null;
            row_ubicacion_plus.codigo_ubicacion_02       = null;
            row_ubicacion_plus.nombre_ubicacion_02       = null;
            row_ubicacion_plus.clave_ubicacion_02        = null;
        end if;
        if (row_ubicacion.numero_nivel_ubicacion = 3) then
            row_ubicacion_plus.codigo_nivel_ubicacion_03 = row_ubicacion.codigo_nivel_ubicacion;
            row_ubicacion_plus.codigo_ubicacion_03       = row_ubicacion.codigo_ubicacion;
            row_ubicacion_plus.nombre_ubicacion_03       = row_ubicacion.nombre_ubicacion;
            row_ubicacion_plus.clave_ubicacion_03        = row_ubicacion.clave_ubicacion;
        elseif (row_ubicacion.numero_nivel_ubicacion < 3) then
            row_ubicacion_plus.codigo_nivel_ubicacion_03 = null;
            row_ubicacion_plus.codigo_ubicacion_03       = null;
            row_ubicacion_plus.nombre_ubicacion_03       = null;
            row_ubicacion_plus.clave_ubicacion_03        = null;
        end if;
        if (row_ubicacion.numero_nivel_ubicacion = 4) then
            row_ubicacion_plus.codigo_nivel_ubicacion_04 = row_ubicacion.codigo_nivel_ubicacion;
            row_ubicacion_plus.codigo_ubicacion_04       = row_ubicacion.codigo_ubicacion;
            row_ubicacion_plus.nombre_ubicacion_04       = row_ubicacion.nombre_ubicacion;
            row_ubicacion_plus.clave_ubicacion_04        = row_ubicacion.clave_ubicacion;
        elseif (row_ubicacion.numero_nivel_ubicacion < 4) then
            row_ubicacion_plus.codigo_nivel_ubicacion_04 = null;
            row_ubicacion_plus.codigo_ubicacion_04       = null;
            row_ubicacion_plus.nombre_ubicacion_04       = null;
            row_ubicacion_plus.clave_ubicacion_04        = null;
        end if;
        if (row_ubicacion.numero_nivel_ubicacion = 5) then
            row_ubicacion_plus.codigo_nivel_ubicacion_05 = row_ubicacion.codigo_nivel_ubicacion;
            row_ubicacion_plus.codigo_ubicacion_05       = row_ubicacion.codigo_ubicacion;
            row_ubicacion_plus.nombre_ubicacion_05       = row_ubicacion.nombre_ubicacion;
            row_ubicacion_plus.clave_ubicacion_05        = row_ubicacion.clave_ubicacion;
        elseif (row_ubicacion.numero_nivel_ubicacion < 5) then
            row_ubicacion_plus.codigo_nivel_ubicacion_05 = null;
            row_ubicacion_plus.codigo_ubicacion_05       = null;
            row_ubicacion_plus.nombre_ubicacion_05       = null;
            row_ubicacion_plus.clave_ubicacion_05        = null;
        end if;
        if (row_ubicacion.numero_nivel_ubicacion = 6) then
            row_ubicacion_plus.codigo_nivel_ubicacion_06 = row_ubicacion.codigo_nivel_ubicacion;
            row_ubicacion_plus.codigo_ubicacion_06       = row_ubicacion.codigo_ubicacion;
            row_ubicacion_plus.nombre_ubicacion_06       = row_ubicacion.nombre_ubicacion;
            row_ubicacion_plus.clave_ubicacion_06        = row_ubicacion.clave_ubicacion;
        elseif (row_ubicacion.numero_nivel_ubicacion < 6) then
            row_ubicacion_plus.codigo_nivel_ubicacion_06 = null;
            row_ubicacion_plus.codigo_ubicacion_06       = null;
            row_ubicacion_plus.nombre_ubicacion_06       = null;
            row_ubicacion_plus.clave_ubicacion_06        = null;
        end if;
        if (row_ubicacion.numero_nivel_ubicacion = 7) then
            row_ubicacion_plus.codigo_nivel_ubicacion_07 = row_ubicacion.codigo_nivel_ubicacion;
            row_ubicacion_plus.codigo_ubicacion_07       = row_ubicacion.codigo_ubicacion;
            row_ubicacion_plus.nombre_ubicacion_07       = row_ubicacion.nombre_ubicacion;
            row_ubicacion_plus.clave_ubicacion_07        = row_ubicacion.clave_ubicacion;
        elseif (row_ubicacion.numero_nivel_ubicacion < 7) then
            row_ubicacion_plus.codigo_nivel_ubicacion_07 = null;
            row_ubicacion_plus.codigo_ubicacion_07       = null;
            row_ubicacion_plus.nombre_ubicacion_07       = null;
            row_ubicacion_plus.clave_ubicacion_07        = null;
        end if;
        if (row_ubicacion.numero_nivel_ubicacion = 8) then
            row_ubicacion_plus.codigo_nivel_ubicacion_08 = row_ubicacion.codigo_nivel_ubicacion;
            row_ubicacion_plus.codigo_ubicacion_08       = row_ubicacion.codigo_ubicacion;
            row_ubicacion_plus.nombre_ubicacion_08       = row_ubicacion.nombre_ubicacion;
            row_ubicacion_plus.clave_ubicacion_08        = row_ubicacion.clave_ubicacion;
        elseif (row_ubicacion.numero_nivel_ubicacion < 8) then
            row_ubicacion_plus.codigo_nivel_ubicacion_08 = null;
            row_ubicacion_plus.codigo_ubicacion_08       = null;
            row_ubicacion_plus.nombre_ubicacion_08       = null;
            row_ubicacion_plus.clave_ubicacion_08        = null;
        end if;
        if (row_ubicacion.numero_nivel_ubicacion = 9) then
            row_ubicacion_plus.codigo_nivel_ubicacion_09 = row_ubicacion.codigo_nivel_ubicacion;
            row_ubicacion_plus.codigo_ubicacion_09       = row_ubicacion.codigo_ubicacion;
            row_ubicacion_plus.nombre_ubicacion_09       = row_ubicacion.nombre_ubicacion;
            row_ubicacion_plus.clave_ubicacion_09        = row_ubicacion.clave_ubicacion;
        elseif (row_ubicacion.numero_nivel_ubicacion < 9) then
            row_ubicacion_plus.codigo_nivel_ubicacion_09 = null;
            row_ubicacion_plus.codigo_ubicacion_09       = null;
            row_ubicacion_plus.nombre_ubicacion_09       = null;
            row_ubicacion_plus.clave_ubicacion_09        = null;
        end if;
        if (row_ubicacion.numero_nivel_ubicacion = 10) then
            row_ubicacion_plus.codigo_nivel_ubicacion_10 = row_ubicacion.codigo_nivel_ubicacion;
            row_ubicacion_plus.codigo_ubicacion_10       = row_ubicacion.codigo_ubicacion;
            row_ubicacion_plus.nombre_ubicacion_10       = row_ubicacion.nombre_ubicacion;
            row_ubicacion_plus.clave_ubicacion_10        = row_ubicacion.clave_ubicacion;
        elseif (row_ubicacion.numero_nivel_ubicacion < 10) then
            row_ubicacion_plus.codigo_nivel_ubicacion_10 = null;
            row_ubicacion_plus.codigo_ubicacion_10       = null;
            row_ubicacion_plus.nombre_ubicacion_10       = null;
            row_ubicacion_plus.clave_ubicacion_10        = null;
        end if;
        if (row_ubicacion.numero_nivel_ubicacion = 11) then
            row_ubicacion_plus.codigo_nivel_ubicacion_11 = row_ubicacion.codigo_nivel_ubicacion;
            row_ubicacion_plus.codigo_ubicacion_11       = row_ubicacion.codigo_ubicacion;
            row_ubicacion_plus.nombre_ubicacion_11       = row_ubicacion.nombre_ubicacion;
            row_ubicacion_plus.clave_ubicacion_11        = row_ubicacion.clave_ubicacion;
        elseif (row_ubicacion.numero_nivel_ubicacion < 11) then
            row_ubicacion_plus.codigo_nivel_ubicacion_11 = null;
            row_ubicacion_plus.codigo_ubicacion_11       = null;
            row_ubicacion_plus.nombre_ubicacion_11       = null;
            row_ubicacion_plus.clave_ubicacion_11        = null;
        end if;
        if (row_ubicacion.numero_nivel_ubicacion = 12) then
            row_ubicacion_plus.codigo_nivel_ubicacion_12 = row_ubicacion.codigo_nivel_ubicacion;
            row_ubicacion_plus.codigo_ubicacion_12       = row_ubicacion.codigo_ubicacion;
            row_ubicacion_plus.nombre_ubicacion_12       = row_ubicacion.nombre_ubicacion;
            row_ubicacion_plus.clave_ubicacion_12        = row_ubicacion.clave_ubicacion;
        elseif (row_ubicacion.numero_nivel_ubicacion < 12) then
            row_ubicacion_plus.codigo_nivel_ubicacion_12 = null;
            row_ubicacion_plus.codigo_ubicacion_12       = null;
            row_ubicacion_plus.nombre_ubicacion_12       = null;
            row_ubicacion_plus.clave_ubicacion_12        = null;
        end if;
        if (row_ubicacion.numero_nivel_ubicacion = 13) then
            row_ubicacion_plus.codigo_nivel_ubicacion_13 = row_ubicacion.codigo_nivel_ubicacion;
            row_ubicacion_plus.codigo_ubicacion_13       = row_ubicacion.codigo_ubicacion;
            row_ubicacion_plus.nombre_ubicacion_13       = row_ubicacion.nombre_ubicacion;
            row_ubicacion_plus.clave_ubicacion_13        = row_ubicacion.clave_ubicacion;
        elseif (row_ubicacion.numero_nivel_ubicacion < 13) then
            row_ubicacion_plus.codigo_nivel_ubicacion_13 = null;
            row_ubicacion_plus.codigo_ubicacion_13       = null;
            row_ubicacion_plus.nombre_ubicacion_13       = null;
            row_ubicacion_plus.clave_ubicacion_13        = null;
        end if;
        if (row_ubicacion.numero_nivel_ubicacion = 14) then
            row_ubicacion_plus.codigo_nivel_ubicacion_14 = row_ubicacion.codigo_nivel_ubicacion;
            row_ubicacion_plus.codigo_ubicacion_14       = row_ubicacion.codigo_ubicacion;
            row_ubicacion_plus.nombre_ubicacion_14       = row_ubicacion.nombre_ubicacion;
            row_ubicacion_plus.clave_ubicacion_14        = row_ubicacion.clave_ubicacion;
        elseif (row_ubicacion.numero_nivel_ubicacion < 14) then
            row_ubicacion_plus.codigo_nivel_ubicacion_14 = null;
            row_ubicacion_plus.codigo_ubicacion_14       = null;
            row_ubicacion_plus.nombre_ubicacion_14       = null;
            row_ubicacion_plus.clave_ubicacion_14        = null;
        end if;
        if (row_ubicacion.numero_nivel_ubicacion = 15) then
            row_ubicacion_plus.codigo_nivel_ubicacion_15 = row_ubicacion.codigo_nivel_ubicacion;
            row_ubicacion_plus.codigo_ubicacion_15       = row_ubicacion.codigo_ubicacion;
            row_ubicacion_plus.nombre_ubicacion_15       = row_ubicacion.nombre_ubicacion;
            row_ubicacion_plus.clave_ubicacion_15        = row_ubicacion.clave_ubicacion;
        elseif (row_ubicacion.numero_nivel_ubicacion < 15) then
            row_ubicacion_plus.codigo_nivel_ubicacion_15 = null;
            row_ubicacion_plus.codigo_ubicacion_15       = null;
            row_ubicacion_plus.nombre_ubicacion_15       = null;
            row_ubicacion_plus.clave_ubicacion_15        = null;
        end if;
        insert into ubicacion_plus select row_ubicacion_plus.*;
        perform ubicacion_xcopy_ramas(row_ubicacion_plus);
    end loop;
    return nsy;
end;
$$ language plpgsql;
