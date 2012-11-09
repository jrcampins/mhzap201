function propagar_filtros(r number) return number is
    row1 rol_usuario%rowtype;
    x number;
    retcode number;
begin
    for row1 in (select * from rol_usuario where id_rol = r order by id_usuario)
    loop
        retcode := propagar_filtros(r, row1.id_usuario, x);
    end loop;
    /**/
    return 0;
end;

function propagar_filtros(r number, u number, x number) return number is
    row1 filtro_funcion%rowtype;
    row2 filtro_funcion_par%rowtype;
    id_filtro_funcion_nuevo number;
    id_filtro_funcion_par_nuevo number;
    codigo_filtro_funcion_nuevo varchar2(200);
begin
    for row1 in (
        select  filtro_funcion.*
        from    filtro_funcion, rol_filtro_funcion
        where   rol_filtro_funcion.id_rol = r
        and     rol_filtro_funcion.id_filtro_funcion = filtro_funcion.id_filtro_funcion
        and     rol_filtro_funcion.id_filtro_funcion not in (select id_filtro_funcion_original from filtro_funcion where id_usuario = u)
        order   by  filtro_funcion.id_filtro_funcion
    )
    loop
        id_filtro_funcion_nuevo := utils.bigintid();
        codigo_filtro_funcion_nuevo := ''||id_filtro_funcion_nuevo;
        insert into filtro_funcion
            (
            id_filtro_funcion,
            codigo_filtro_funcion,
            nombre_filtro_funcion,
            descripcion_filtro_funcion,
            id_funcion,
            id_usuario,
            id_filtro_funcion_original
            )
        values
            (
            id_filtro_funcion_nuevo,
            codigo_filtro_funcion_nuevo,
            row1.nombre_filtro_funcion,
            row1.descripcion_filtro_funcion,
            row1.id_funcion,
            u,
            row1.id_filtro_funcion
            );
        for row2 in (
            select  filtro_funcion_par.*
            from    filtro_funcion_par
            where   id_filtro_funcion = row1.id_filtro_funcion
            order   by id_filtro_funcion_par
        )
        loop
            id_filtro_funcion_par_nuevo := utils.bigintid();
            insert into filtro_funcion_par
                (
                id_filtro_funcion_par,
                id_filtro_funcion,
                id_funcion_parametro,
                numero_operador_com,
                id_valor_lista,
                id_objeto_valor,
                id_recurso_valor,
                valor_parametro,
                significado_parametro
                )
            values
                (
                id_filtro_funcion_par_nuevo,
                id_filtro_funcion_nuevo,
                row2.id_funcion_parametro,
                row2.numero_operador_com,
                row2.id_valor_lista,
                row2.id_objeto_valor,
                row2.id_recurso_valor,
                row2.valor_parametro,
                row2.significado_parametro
                );
        end loop;
    end loop;
    /**/
    return 0;
end;
