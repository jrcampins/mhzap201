create or replace function ubicacion_update_ramas(do_update boolean, mnj integer, idx bigint, njx integer, ccx varchar) returns integer as $$
declare
    row_ubicacion record;
    tny integer := 0; -- tipo nodo del nodo "y"
    njy integer := 0; -- nivel jerarquico del nodo "y"
    nsy integer := 0; -- numero secuencia del nodo "y"
    ccy varchar; -- clave concatenada del nodo "y"
    pdq integer := 0;
begin
    njy = njx + 1;
    for row_ubicacion in
    select *
    from ubicacion
    where id_ubicacion_superior=idx
    order by secuencia_ubicacion,codigo_ubicacion
    loop
        if njy > mnj then
            raise exception 'limite de % niveles jerarquicos excedido; nodo: "%" (%)',
                mnj, row_ubicacion.codigo_ubicacion, row_ubicacion.nombre_ubicacion;
        end if;
        nsy = nsy + 1;
        ccy = ccx || trim(both from to_char(nsy, '00'));
        select ubicacion_update_ramas(do_update, mnj, row_ubicacion.id_ubicacion, njy, ccy) into pdq;
        if pdq > 0 then
            tny = 2; -- rama
        else
            tny = 3; -- hoja
        end if;
        if do_update then
            update ubicacion
            set version_ubicacion=version_ubicacion+1, numero_tipo_nodo=tny, numero_nivel_ubicacion=njy, clave_ubicacion=ccy
            where id_ubicacion=row_ubicacion.id_ubicacion;
        end if;
    end loop;
    return nsy;
end;
$$ language plpgsql;
