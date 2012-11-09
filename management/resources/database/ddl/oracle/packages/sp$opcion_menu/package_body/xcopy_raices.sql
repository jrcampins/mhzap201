function xcopy_raices return number is
--  row_opcion_menu record;
    row_opcion_menu_plus opcion_menu_plus%rowtype;
    nsx number := 0; -- numero secuencia del nodo "x"
    retcode number;
begin
    delete from opcion_menu_plus;
    for row_opcion_menu in (
        select opcion_menu.*, nivel_opcion_menu.codigo_nivel_opcion_menu 
        from opcion_menu, nivel_opcion_menu 
        where id_opcion_menu_superior is null 
        and nivel_opcion_menu.numero_nivel_opcion_menu=opcion_menu.numero_nivel_opcion_menu 
        order by id_opcion_menu 
    )
    loop
        nsx := nsx + 1;
        row_opcion_menu_plus.id_opcion_menu              := row_opcion_menu.id_opcion_menu;
        row_opcion_menu_plus.version_opcion_menu         := row_opcion_menu.version_opcion_menu;
        row_opcion_menu_plus.numero_tipo_nodo            := row_opcion_menu.numero_tipo_nodo;
        row_opcion_menu_plus.numero_nivel_opcion_menu    := row_opcion_menu.numero_nivel_opcion_menu;
        row_opcion_menu_plus.codigo_nivel_opcion_menu    := row_opcion_menu.codigo_nivel_opcion_menu;
        row_opcion_menu_plus.codigo_opcion_menu          := row_opcion_menu.codigo_opcion_menu;
        row_opcion_menu_plus.nombre_opcion_menu          := row_opcion_menu.nombre_opcion_menu;
        row_opcion_menu_plus.clave_opcion_menu           := row_opcion_menu.clave_opcion_menu;
        row_opcion_menu_plus.codigo_nivel_opcion_menu_01 := row_opcion_menu.codigo_nivel_opcion_menu;
        row_opcion_menu_plus.codigo_opcion_menu_01       := row_opcion_menu.codigo_opcion_menu;
        row_opcion_menu_plus.nombre_opcion_menu_01       := row_opcion_menu.nombre_opcion_menu;
        row_opcion_menu_plus.clave_opcion_menu_01        := row_opcion_menu.clave_opcion_menu;
        insert into opcion_menu_plus values row_opcion_menu_plus;
        retcode := xcopy_ramas(row_opcion_menu_plus);
    end loop; 
    return nsx;
end;
