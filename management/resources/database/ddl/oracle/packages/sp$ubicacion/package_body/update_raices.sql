function update_raices(do_update boolean) return number is
    row_ubicacion ubicacion%rowtype;
    mnj number := 0; -- maximo nivel jerarquico
    nnj number := 0; -- numero nivel jerarquico
    tnx number := 1; -- tipo nodo del nodo "x" (en este caso, el nodo raiz)
    njx number := 1; -- nivel jerarquico del nodo "x" (en este caso, el nodo raiz)
    nsx number := 0; -- numero secuencia del nodo "x" (en este caso, el nodo raiz)
    ccx varchar2(200); -- clave concatenada del nodo "x" (en este caso, el nodo raiz)
    pdq number := 0;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin	
    begin
        select max(numero_nivel_ubicacion),count(numero_nivel_ubicacion) into mnj,nnj from nivel_ubicacion;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'los niveles jerarquicos de ubicacion no estan definidos';
        raise_application_error(err_number, msg_string, true);
    elsif (mnj < 1 or nnj < 1 or mnj <> nnj) then
        msg_string := 'los niveles jerarquicos de ubicacion no estan correctamente definidos';
        raise_application_error(err_number, msg_string, true);
    end if;
    for row_ubicacion in (
        select * 
        from ubicacion 
        where id_ubicacion_superior is null 
        order by secuencia_ubicacion,codigo_ubicacion
    )
    loop
            nsx := nsx + 1;
            ccx := trim(both from to_char(nsx, '00'));
            pdq := update_ramas(do_update, mnj, row_ubicacion.id_ubicacion, njx, ccx);
            if do_update then
                update ubicacion
                set version_ubicacion=version_ubicacion+1, numero_tipo_nodo=tnx, numero_nivel_ubicacion=njx, clave_ubicacion=ccx
                where id_ubicacion=row_ubicacion.id_ubicacion;
            end if;
    end loop; 
    return nsx;
end;
