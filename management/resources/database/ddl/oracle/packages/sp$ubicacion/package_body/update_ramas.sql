function update_ramas(do_update boolean, mnj number, idx number, njx number, ccx varchar2) return number is
    row_ubicacion ubicacion%rowtype;
    tny number := 0; -- tipo nodo del nodo "y"
    njy number := 0; -- nivel jerarquico del nodo "y"
    nsy number := 0; -- numero secuencia del nodo "y"
    ccy varchar2(200); -- clave concatenada del nodo "y"
    pdq number := 0;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    njy := njx + 1;
    for row_ubicacion in (
        select * 
        from ubicacion 
        where id_ubicacion_superior=idx 
        order by secuencia_ubicacion,codigo_ubicacion
    )
    loop
        if njy > mnj then
            msg_string := 'limite de '||mnj
                ||' niveles jerarquicos excedido; nodo: "'||row_ubicacion.codigo_ubicacion||'"'
                ||' ('||row_ubicacion.nombre_ubicacion||')';
            raise_application_error(err_number, msg_string, true);
        end if;
        nsy := nsy + 1;
        ccy := ccx || trim(to_char(nsy, '00'));
        pdq := update_ramas(do_update, mnj, row_ubicacion.id_ubicacion, njy, ccy);
        if pdq > 0 then
            tny := 2; -- rama
        else
            tny := 3; -- hoja
        end if;
        if do_update then
            update ubicacion 
            set version_ubicacion=version_ubicacion+1, numero_tipo_nodo=tny, numero_nivel_ubicacion=njy, clave_ubicacion=ccy
            where id_ubicacion=row_ubicacion.id_ubicacion;
        end if;
    end loop; 
    return nsy;
end;
