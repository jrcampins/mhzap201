function xcopy_ramas(row_opcion_menu_plus in out opcion_menu_plus%rowtype) return number is
--  row_opcion_menu record;
    superior number;
    nsy number := 0; -- numero secuencia del nodo "y"
    retcode number;
begin
    superior := row_opcion_menu_plus.id_opcion_menu;
    for row_opcion_menu in (
        select opcion_menu.*, nivel_opcion_menu.codigo_nivel_opcion_menu
        from opcion_menu, nivel_opcion_menu 
        where id_opcion_menu_superior = superior
        and nivel_opcion_menu.numero_nivel_opcion_menu=opcion_menu.numero_nivel_opcion_menu 
        order by id_opcion_menu
    )
    loop
        nsy := nsy + 1;
        row_opcion_menu_plus.id_opcion_menu           := row_opcion_menu.id_opcion_menu;
        row_opcion_menu_plus.version_opcion_menu      := row_opcion_menu.version_opcion_menu;
        row_opcion_menu_plus.numero_tipo_nodo         := row_opcion_menu.numero_tipo_nodo;
        row_opcion_menu_plus.numero_nivel_opcion_menu := row_opcion_menu.numero_nivel_opcion_menu;
        row_opcion_menu_plus.codigo_nivel_opcion_menu := row_opcion_menu.codigo_nivel_opcion_menu;
        row_opcion_menu_plus.codigo_opcion_menu       := row_opcion_menu.codigo_opcion_menu;
        row_opcion_menu_plus.nombre_opcion_menu       := row_opcion_menu.nombre_opcion_menu;
        row_opcion_menu_plus.clave_opcion_menu        := row_opcion_menu.clave_opcion_menu;
        if (row_opcion_menu.numero_nivel_opcion_menu = 2) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_02 := row_opcion_menu.codigo_nivel_opcion_menu;
            row_opcion_menu_plus.codigo_opcion_menu_02       := row_opcion_menu.codigo_opcion_menu;
            row_opcion_menu_plus.nombre_opcion_menu_02       := row_opcion_menu.nombre_opcion_menu;
            row_opcion_menu_plus.clave_opcion_menu_02        := row_opcion_menu.clave_opcion_menu;
        elsif (row_opcion_menu.numero_nivel_opcion_menu < 2) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_02 := null;
            row_opcion_menu_plus.codigo_opcion_menu_02       := null;
            row_opcion_menu_plus.nombre_opcion_menu_02       := null;
            row_opcion_menu_plus.clave_opcion_menu_02        := null;
        end if;
        if (row_opcion_menu.numero_nivel_opcion_menu = 3) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_03 := row_opcion_menu.codigo_nivel_opcion_menu;
            row_opcion_menu_plus.codigo_opcion_menu_03       := row_opcion_menu.codigo_opcion_menu;
            row_opcion_menu_plus.nombre_opcion_menu_03       := row_opcion_menu.nombre_opcion_menu;
            row_opcion_menu_plus.clave_opcion_menu_03        := row_opcion_menu.clave_opcion_menu;
        elsif (row_opcion_menu.numero_nivel_opcion_menu < 3) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_03 := null;
            row_opcion_menu_plus.codigo_opcion_menu_03       := null;
            row_opcion_menu_plus.nombre_opcion_menu_03       := null;
            row_opcion_menu_plus.clave_opcion_menu_03        := null;
        end if;
        if (row_opcion_menu.numero_nivel_opcion_menu = 4) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_04 := row_opcion_menu.codigo_nivel_opcion_menu;
            row_opcion_menu_plus.codigo_opcion_menu_04       := row_opcion_menu.codigo_opcion_menu;
            row_opcion_menu_plus.nombre_opcion_menu_04       := row_opcion_menu.nombre_opcion_menu;
            row_opcion_menu_plus.clave_opcion_menu_04        := row_opcion_menu.clave_opcion_menu;
        elsif (row_opcion_menu.numero_nivel_opcion_menu < 4) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_04 := null;
            row_opcion_menu_plus.codigo_opcion_menu_04       := null;
            row_opcion_menu_plus.nombre_opcion_menu_04       := null;
            row_opcion_menu_plus.clave_opcion_menu_04        := null;
        end if;
        if (row_opcion_menu.numero_nivel_opcion_menu = 5) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_05 := row_opcion_menu.codigo_nivel_opcion_menu;
            row_opcion_menu_plus.codigo_opcion_menu_05       := row_opcion_menu.codigo_opcion_menu;
            row_opcion_menu_plus.nombre_opcion_menu_05       := row_opcion_menu.nombre_opcion_menu;
            row_opcion_menu_plus.clave_opcion_menu_05        := row_opcion_menu.clave_opcion_menu;
        elsif (row_opcion_menu.numero_nivel_opcion_menu < 5) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_05 := null;
            row_opcion_menu_plus.codigo_opcion_menu_05       := null;
            row_opcion_menu_plus.nombre_opcion_menu_05       := null;
            row_opcion_menu_plus.clave_opcion_menu_05        := null;
        end if;
        if (row_opcion_menu.numero_nivel_opcion_menu = 6) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_06 := row_opcion_menu.codigo_nivel_opcion_menu;
            row_opcion_menu_plus.codigo_opcion_menu_06       := row_opcion_menu.codigo_opcion_menu;
            row_opcion_menu_plus.nombre_opcion_menu_06       := row_opcion_menu.nombre_opcion_menu;
            row_opcion_menu_plus.clave_opcion_menu_06        := row_opcion_menu.clave_opcion_menu;
        elsif (row_opcion_menu.numero_nivel_opcion_menu < 6) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_06 := null;
            row_opcion_menu_plus.codigo_opcion_menu_06       := null;
            row_opcion_menu_plus.nombre_opcion_menu_06       := null;
            row_opcion_menu_plus.clave_opcion_menu_06        := null;
        end if;
        if (row_opcion_menu.numero_nivel_opcion_menu = 7) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_07 := row_opcion_menu.codigo_nivel_opcion_menu;
            row_opcion_menu_plus.codigo_opcion_menu_07       := row_opcion_menu.codigo_opcion_menu;
            row_opcion_menu_plus.nombre_opcion_menu_07       := row_opcion_menu.nombre_opcion_menu;
            row_opcion_menu_plus.clave_opcion_menu_07        := row_opcion_menu.clave_opcion_menu;
        elsif (row_opcion_menu.numero_nivel_opcion_menu < 7) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_07 := null;
            row_opcion_menu_plus.codigo_opcion_menu_07       := null;
            row_opcion_menu_plus.nombre_opcion_menu_07       := null;
            row_opcion_menu_plus.clave_opcion_menu_07        := null;
        end if;
        if (row_opcion_menu.numero_nivel_opcion_menu = 8) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_08 := row_opcion_menu.codigo_nivel_opcion_menu;
            row_opcion_menu_plus.codigo_opcion_menu_08       := row_opcion_menu.codigo_opcion_menu;
            row_opcion_menu_plus.nombre_opcion_menu_08       := row_opcion_menu.nombre_opcion_menu;
            row_opcion_menu_plus.clave_opcion_menu_08        := row_opcion_menu.clave_opcion_menu;
        elsif (row_opcion_menu.numero_nivel_opcion_menu < 8) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_08 := null;
            row_opcion_menu_plus.codigo_opcion_menu_08       := null;
            row_opcion_menu_plus.nombre_opcion_menu_08       := null;
            row_opcion_menu_plus.clave_opcion_menu_08        := null;
        end if;
        if (row_opcion_menu.numero_nivel_opcion_menu = 9) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_09 := row_opcion_menu.codigo_nivel_opcion_menu;
            row_opcion_menu_plus.codigo_opcion_menu_09       := row_opcion_menu.codigo_opcion_menu;
            row_opcion_menu_plus.nombre_opcion_menu_09       := row_opcion_menu.nombre_opcion_menu;
            row_opcion_menu_plus.clave_opcion_menu_09        := row_opcion_menu.clave_opcion_menu;
        elsif (row_opcion_menu.numero_nivel_opcion_menu < 9) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_09 := null;
            row_opcion_menu_plus.codigo_opcion_menu_09       := null;
            row_opcion_menu_plus.nombre_opcion_menu_09       := null;
            row_opcion_menu_plus.clave_opcion_menu_09        := null;
        end if;
        if (row_opcion_menu.numero_nivel_opcion_menu = 10) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_10 := row_opcion_menu.codigo_nivel_opcion_menu;
            row_opcion_menu_plus.codigo_opcion_menu_10       := row_opcion_menu.codigo_opcion_menu;
            row_opcion_menu_plus.nombre_opcion_menu_10       := row_opcion_menu.nombre_opcion_menu;
            row_opcion_menu_plus.clave_opcion_menu_10        := row_opcion_menu.clave_opcion_menu;
        elsif (row_opcion_menu.numero_nivel_opcion_menu < 10) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_10 := null;
            row_opcion_menu_plus.codigo_opcion_menu_10       := null;
            row_opcion_menu_plus.nombre_opcion_menu_10       := null;
            row_opcion_menu_plus.clave_opcion_menu_10        := null;
        end if;
        if (row_opcion_menu.numero_nivel_opcion_menu = 11) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_11 := row_opcion_menu.codigo_nivel_opcion_menu;
            row_opcion_menu_plus.codigo_opcion_menu_11       := row_opcion_menu.codigo_opcion_menu;
            row_opcion_menu_plus.nombre_opcion_menu_11       := row_opcion_menu.nombre_opcion_menu;
            row_opcion_menu_plus.clave_opcion_menu_11        := row_opcion_menu.clave_opcion_menu;
        elsif (row_opcion_menu.numero_nivel_opcion_menu < 11) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_11 := null;
            row_opcion_menu_plus.codigo_opcion_menu_11       := null;
            row_opcion_menu_plus.nombre_opcion_menu_11       := null;
            row_opcion_menu_plus.clave_opcion_menu_11        := null;
        end if;
        if (row_opcion_menu.numero_nivel_opcion_menu = 12) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_12 := row_opcion_menu.codigo_nivel_opcion_menu;
            row_opcion_menu_plus.codigo_opcion_menu_12       := row_opcion_menu.codigo_opcion_menu;
            row_opcion_menu_plus.nombre_opcion_menu_12       := row_opcion_menu.nombre_opcion_menu;
            row_opcion_menu_plus.clave_opcion_menu_12        := row_opcion_menu.clave_opcion_menu;
        elsif (row_opcion_menu.numero_nivel_opcion_menu < 12) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_12 := null;
            row_opcion_menu_plus.codigo_opcion_menu_12       := null;
            row_opcion_menu_plus.nombre_opcion_menu_12       := null;
            row_opcion_menu_plus.clave_opcion_menu_12        := null;
        end if;
        if (row_opcion_menu.numero_nivel_opcion_menu = 13) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_13 := row_opcion_menu.codigo_nivel_opcion_menu;
            row_opcion_menu_plus.codigo_opcion_menu_13       := row_opcion_menu.codigo_opcion_menu;
            row_opcion_menu_plus.nombre_opcion_menu_13       := row_opcion_menu.nombre_opcion_menu;
            row_opcion_menu_plus.clave_opcion_menu_13        := row_opcion_menu.clave_opcion_menu;
        elsif (row_opcion_menu.numero_nivel_opcion_menu < 13) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_13 := null;
            row_opcion_menu_plus.codigo_opcion_menu_13       := null;
            row_opcion_menu_plus.nombre_opcion_menu_13       := null;
            row_opcion_menu_plus.clave_opcion_menu_13        := null;
        end if;
        if (row_opcion_menu.numero_nivel_opcion_menu = 14) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_14 := row_opcion_menu.codigo_nivel_opcion_menu;
            row_opcion_menu_plus.codigo_opcion_menu_14       := row_opcion_menu.codigo_opcion_menu;
            row_opcion_menu_plus.nombre_opcion_menu_14       := row_opcion_menu.nombre_opcion_menu;
            row_opcion_menu_plus.clave_opcion_menu_14        := row_opcion_menu.clave_opcion_menu;
        elsif (row_opcion_menu.numero_nivel_opcion_menu < 14) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_14 := null;
            row_opcion_menu_plus.codigo_opcion_menu_14       := null;
            row_opcion_menu_plus.nombre_opcion_menu_14       := null;
            row_opcion_menu_plus.clave_opcion_menu_14        := null;
        end if;
        if (row_opcion_menu.numero_nivel_opcion_menu = 15) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_15 := row_opcion_menu.codigo_nivel_opcion_menu;
            row_opcion_menu_plus.codigo_opcion_menu_15       := row_opcion_menu.codigo_opcion_menu;
            row_opcion_menu_plus.nombre_opcion_menu_15       := row_opcion_menu.nombre_opcion_menu;
            row_opcion_menu_plus.clave_opcion_menu_15        := row_opcion_menu.clave_opcion_menu;
        elsif (row_opcion_menu.numero_nivel_opcion_menu < 15) then
            row_opcion_menu_plus.codigo_nivel_opcion_menu_15 := null;
            row_opcion_menu_plus.codigo_opcion_menu_15       := null;
            row_opcion_menu_plus.nombre_opcion_menu_15       := null;
            row_opcion_menu_plus.clave_opcion_menu_15        := null;
        end if;
        insert into opcion_menu_plus values row_opcion_menu_plus;
        retcode := xcopy_ramas(row_opcion_menu_plus);
    end loop; 
    return nsy;
end;
