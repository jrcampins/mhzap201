function update_raices(do_update boolean) return number is
    row_opcion_menu opcion_menu%rowtype;
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
        select max(numero_nivel_opcion_menu),count(numero_nivel_opcion_menu) into mnj,nnj from nivel_opcion_menu;
    exception
        when no_data_found then null;
    end;
    if not sql%found then
        msg_string := 'los niveles jerarquicos de opcion de menu no estan definidos';
        raise_application_error(err_number, msg_string, true);
    elsif (mnj < 1 or nnj < 1 or mnj <> nnj) then
        msg_string := 'los niveles jerarquicos de opcion de menu no estan correctamente definidos';
        raise_application_error(err_number, msg_string, true);
    end if;
    for row_opcion_menu in (
        select * 
        from opcion_menu 
        where id_opcion_menu_superior is null 
        order by secuencia_opcion_menu,codigo_opcion_menu
    )
    loop
            nsx := nsx + 1;
            ccx := trim(both from to_char(nsx, '00'));
            pdq := update_ramas(do_update, mnj, row_opcion_menu.id_opcion_menu, njx, ccx);
            if do_update then
                update opcion_menu
                set version_opcion_menu=version_opcion_menu+1, numero_tipo_nodo=tnx, numero_nivel_opcion_menu=njx, clave_opcion_menu=ccx
                where id_opcion_menu=row_opcion_menu.id_opcion_menu;
            end if;
    end loop; 
    return nsx;
end;
