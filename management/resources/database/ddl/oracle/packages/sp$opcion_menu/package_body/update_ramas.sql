function update_ramas(do_update boolean, mnj number, idx number, njx number, ccx varchar2) return number is
    row_opcion_menu opcion_menu%rowtype;
    tny number := 0; -- tipo nodo del nodo "y"
    njy number := 0; -- nivel jerarquico del nodo "y"
    nsy number := 0; -- numero secuencia del nodo "y"
    ccy varchar2(200); -- clave concatenada del nodo "y"
    pdq number := 0;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    njy := njx + 1;
    for row_opcion_menu in (
        select * 
        from opcion_menu 
        where id_opcion_menu_superior=idx 
        order by secuencia_opcion_menu,codigo_opcion_menu
    )
    loop
        if njy > mnj then
            msg_string := 'limite de '||mnj
                ||' niveles jerarquicos excedido; nodo: "'||row_opcion_menu.codigo_opcion_menu||'"'
                ||' ('||row_opcion_menu.nombre_opcion_menu||')';
            raise_application_error(err_number, msg_string, true);
        end if;
        nsy := nsy + 1;
        ccy := ccx || trim(to_char(nsy, '00'));
        pdq := update_ramas(do_update, mnj, row_opcion_menu.id_opcion_menu, njy, ccy);
        if pdq > 0 then
            tny := 2; -- rama
        else
            tny := 3; -- hoja
        end if;
        if do_update then
            update opcion_menu 
            set version_opcion_menu=version_opcion_menu+1, numero_tipo_nodo=tny, numero_nivel_opcion_menu=njy, clave_opcion_menu=ccy
            where id_opcion_menu=row_opcion_menu.id_opcion_menu;
        end if;
    end loop; 
    return nsy;
end;
