-- delimiter ??
create or replace function rol_propagar_filtros(rastro bigint, rol bigint) returns integer as $$
begin
    perform rol_propagar_filtros(rol);
    return rastro_proceso_update(rastro, 21, null, 'filtros propagados exitosamente');
end;
$$ language plpgsql;
-- ??
create or replace function rol_propagar_filtros(r$ bigint) returns integer as $$
declare
    u$ bigint;
    x$ bigint;
begin
    for u$ in
        select id_usuario from rol_usuario where id_rol = r$ order by id_usuario
    loop
        perform rol_propagar_filtros(r$, u$, x$);
    end loop;
    /**/
    return 0;
end;
$$ language plpgsql;
-- ??
create or replace function rol_propagar_filtros(r$ bigint, u$ bigint, x$ bigint) returns integer as $$
declare
    row1 filtro_funcion;
    row2 filtro_funcion_par;
    id_filtro_funcion_nuevo bigint;
    codigo_filtro_funcion_nuevo varchar;
begin
    for row1 in
        select  filtro_funcion.*
        from    filtro_funcion, rol_filtro_funcion
        where   rol_filtro_funcion.id_rol = r$
        and     rol_filtro_funcion.id_filtro_funcion = filtro_funcion.id_filtro_funcion
        and     rol_filtro_funcion.id_filtro_funcion not in (select id_filtro_funcion_original from filtro_funcion where id_usuario = u$)
        order   by  filtro_funcion.id_filtro_funcion
    loop
        select bigintid() into id_filtro_funcion_nuevo;
        codigo_filtro_funcion_nuevo = cast(id_filtro_funcion_nuevo as varchar);
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
            u$,
            row1.id_filtro_funcion
            );
        for row2 in
            select  filtro_funcion_par.*
            from    filtro_funcion_par
            where   id_filtro_funcion = row1.id_filtro_funcion
            order   by id_filtro_funcion_par
        loop
            insert into filtro_funcion_par
                (
                id_filtro_funcion_par,
                id_filtro_funcion,
                id_funcion_parametro,
                numero_operador_comparacion,
                id_valor_lista,
                id_objeto_valor,
                id_recurso_valor,
                valor_parametro,
                significado_parametro
                )
            values
                (
                bigintid(),
                id_filtro_funcion_nuevo,
                row2.id_funcion_parametro,
                row2.numero_operador_comparacion,
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
$$ language plpgsql;
-- ??
