create or replace function ubicacion_update_raices(do_update boolean) returns integer as $$
declare
    row_ubicacion record;
    mnj integer := 0; -- maximo nivel jerarquico
    nnj integer := 0; -- numero nivel jerarquico
    tnx integer := 1; -- tipo nodo del nodo "x" (en este caso, el nodo raiz)
    njx integer := 1; -- nivel jerarquico del nodo "x" (en este caso, el nodo raiz)
    nsx integer := 0; -- numero secuencia del nodo "x" (en este caso, el nodo raiz)
    ccx varchar; -- clave concatenada del nodo "x" (en este caso, el nodo raiz)
    pdq integer := 0;
begin	
    select max(numero_nivel_ubicacion),count(numero_nivel_ubicacion) into mnj,nnj from nivel_ubicacion;
    if not found then
        raise exception 'los niveles jerarquicos de ubicacion no estan definidos';
    elseif (mnj < 1 or nnj < 1 or mnj <> nnj) then
        raise exception 'los niveles jerarquicos de ubicacion no estan correctamente definidos';
    end if;
    for row_ubicacion in
    select *
    from ubicacion
    where id_ubicacion_superior is null
    order by secuencia_ubicacion,codigo_ubicacion
    loop
        nsx = nsx + 1;
        ccx = trim(both from to_char(nsx, '00'));
        select ubicacion_update_ramas(do_update, mnj, row_ubicacion.id_ubicacion, njx, ccx) into pdq;
        if do_update then
                update ubicacion
                        set version_ubicacion=version_ubicacion+1, numero_tipo_nodo=tnx, numero_nivel_ubicacion=njx, clave_ubicacion=ccx
                        where id_ubicacion=row_ubicacion.id_ubicacion;
        end if;
    end loop;
    return nsx;
end;
$$ language plpgsql;
