function copiar(id_rol_viejo number, codigo varchar2, nombre varchar2) return number is
    row_rol rol%rowtype;
    row_rol_funcion rol_funcion%rowtype;
    id_rol_nuevo number;
    id_rol_funcion_nuevo number;
    codigo_rol_nuevo varchar2(200);
    nombre_rol_nuevo varchar2(200);
    descripcion_rol_nueva varchar2(4000);
    err_number constant number := -20000; -- an integer in the range -20000..-20999
    msg_string varchar2(2000); -- a character string of at most 2048 bytes
begin
    begin
	select * into row_rol from rol where id_rol = id_rol_viejo;
    exception
        when no_data_found then
            msg_string := 'rol ' || id_rol_viejo || ' no existe ';
            raise_application_error(err_number, msg_string, true);
    end;
    /**/
    id_rol_nuevo := utils.bigintid();
    /**/
    if codigo is not null then
        select cast(codigo as varchar2(200)) into codigo_rol_nuevo from dual;
    else
        select cast(row_rol.codigo_rol as varchar2(180)) || cast(id_rol_nuevo as varchar2(20))
             into codigo_rol_nuevo from dual;
    end if;
    /**/
    if nombre is not null then
        select cast(nombre as varchar2(200)) into nombre_rol_nuevo from dual;
    else
        nombre_rol_nuevo := row_rol.nombre_rol;
    end if;
    /**/
    descripcion_rol_nueva := '*** Copia de ' || row_rol.codigo_rol || ' ***';
    /**/
    insert into rol (id_rol, codigo_rol, nombre_rol, descripcion_rol)
    values (id_rol_nuevo, codigo_rol_nuevo, nombre_rol_nuevo, descripcion_rol_nueva);
    /**/
    for row_rol_funcion in (select * from rol_funcion where id_rol = id_rol_viejo order by id_rol_funcion)
    loop
        id_rol_funcion_nuevo := utils.bigintid();
        insert into rol_funcion (id_rol_funcion, id_rol, id_funcion, id_conjunto_segmento)
        values (id_rol_funcion_nuevo, id_rol_nuevo, row_rol_funcion.id_funcion, row_rol_funcion.id_conjunto_segmento);
    end loop;
    /**/
    return 0;
end;
