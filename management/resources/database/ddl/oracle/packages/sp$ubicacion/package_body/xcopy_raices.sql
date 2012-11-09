function xcopy_raices return number is
--  row_ubicacion record;
    row_ubicacion_plus ubicacion_plus%rowtype;
    nsx number := 0; -- numero secuencia del nodo "x"
    retcode number;
begin
    delete from ubicacion_plus;
    for row_ubicacion in (
        select ubicacion.*, nivel_ubicacion.codigo_nivel_ubicacion 
        from ubicacion, nivel_ubicacion 
        where id_ubicacion_superior is null 
        and nivel_ubicacion.numero_nivel_ubicacion=ubicacion.numero_nivel_ubicacion 
        order by id_ubicacion 
    )
    loop
        nsx := nsx + 1;
        row_ubicacion_plus.id_ubicacion              := row_ubicacion.id_ubicacion;
        row_ubicacion_plus.version_ubicacion         := row_ubicacion.version_ubicacion;
        row_ubicacion_plus.numero_tipo_nodo            := row_ubicacion.numero_tipo_nodo;
        row_ubicacion_plus.numero_nivel_ubicacion    := row_ubicacion.numero_nivel_ubicacion;
        row_ubicacion_plus.codigo_nivel_ubicacion    := row_ubicacion.codigo_nivel_ubicacion;
        row_ubicacion_plus.codigo_ubicacion          := row_ubicacion.codigo_ubicacion;
        row_ubicacion_plus.nombre_ubicacion          := row_ubicacion.nombre_ubicacion;
        row_ubicacion_plus.clave_ubicacion           := row_ubicacion.clave_ubicacion;
        row_ubicacion_plus.codigo_nivel_ubicacion_01 := row_ubicacion.codigo_nivel_ubicacion;
        row_ubicacion_plus.codigo_ubicacion_01       := row_ubicacion.codigo_ubicacion;
        row_ubicacion_plus.nombre_ubicacion_01       := row_ubicacion.nombre_ubicacion;
        row_ubicacion_plus.clave_ubicacion_01        := row_ubicacion.clave_ubicacion;
        insert into ubicacion_plus values row_ubicacion_plus;
        retcode := xcopy_ramas(row_ubicacion_plus);
    end loop; 
    return nsx;
end;
