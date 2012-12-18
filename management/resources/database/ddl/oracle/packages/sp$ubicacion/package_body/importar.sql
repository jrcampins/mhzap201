procedure importar(nombre_archivo varchar2) as
    retorno number:=0;
    nombre_tabla varchar2(200):='csv_log_imp_ubi';
    current_ubicacion log_imp_ubi%rowtype;
    codigo_ubicacion_superior varchar2(200):='';
    id_ubicacion_superior number:=0;
    new_ubicacion ubicacion%rowtype;
    mensaje varchar2(2000):='';
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    if nombre_archivo is null then
        msg_string := 'archivo no existe';
        raise_application_error(err_number, msg_string, true);
    end if;
    --creamos y llenamos la tabla externa csv_log_imp_ubi
    sp$archivo_datos_ext.create_csv_log_imp_ubi(nombre_archivo, 'WE8ISO8859P1', '1', ';', '"');
    delete from log_imp_ubi;
    insert into log_imp_ubi
        (
        id_log_imp_ubi ,
        codigo ,
        ubicacion,
        tipo_ubicacion ,
        tipo_area ,
        codigo_ubicacion_superior 
        )
    select
        utils.bigintid(),
        codigo ,
        ubicacion,
        tipo_ubicacion ,
        tipo_area ,
        codigo_ubicacion_superior 
    from csv_log_imp_ubi;    
    --importamos departamentos
    for current_ubicacion in (select * from log_imp_ubi where trim(tipo_ubicacion)='DEPARTAMENTO')
    loop
        begin
            --Reiniciar los valores de la nueva ubicacion para cada registro a importar
            new_ubicacion.id_ubicacion:=current_ubicacion.id_log_imp_ubi; -- ya se inicializo con bigintid()
            new_ubicacion.version_ubicacion:=0;
            new_ubicacion.id_ubicacion_superior:=null;
            --Obtener valores
            new_ubicacion.codigo_ubicacion:=current_ubicacion.codigo;
            new_ubicacion.nombre_ubicacion:=current_ubicacion.ubicacion;
            --Se inserta el registro es_importado en la tabla persona
            insert into ubicacion values new_ubicacion; 
            --Se registra la inserción en la tabla intermedia
            update log_imp_ubi set es_importado=1 where id_log_imp_ubi=current_ubicacion.id_log_imp_ubi;
            --Se incrementa el numero de insertados
            retorno:=retorno+1;
            --Si no se pudo insertar el registro se marca el motivo
            exception
                when others then
                    mensaje:='Error '||SQLCODE||'('||SQLERRM||')';
                    update log_imp_ubi set observacion=mensaje where id_log_imp_ubi=current_ubicacion.id_log_imp_ubi;
        end;
    end loop;
    --Distritos
    for current_ubicacion in (select * from log_imp_ubi where trim(tipo_ubicacion)='DISTRITO')
    loop
        begin
            --Reiniciar los valores de la nueva ubicacion para cada registro a importar
            new_ubicacion.id_ubicacion:=current_ubicacion.id_log_imp_ubi; -- ya se inicializo con bigintid()
            new_ubicacion.version_ubicacion:=0;
            new_ubicacion.id_ubicacion_superior:=null;
            --Obtener valores
            new_ubicacion.codigo_ubicacion:=current_ubicacion.codigo;
            new_ubicacion.nombre_ubicacion:=current_ubicacion.ubicacion;
            --Obtener ubicacion superior
            codigo_ubicacion_superior:=current_ubicacion.codigo_ubicacion_superior;
            if(codigo_ubicacion_superior is null) then
                msg_string := 'distrito '||current_ubicacion.codigo||' sin departamento';
                raise_application_error(err_number, msg_string, true);
            else
                begin
                    select id_ubicacion into id_ubicacion_superior from ubicacion where codigo_ubicacion=codigo_ubicacion_superior;
                exception
                    when no_data_found then
                        msg_string := 'departamento '||codigo_ubicacion_superior||' no existe; '
                                   || 'no se puede agregar el distrito '||current_ubicacion.codigo||'';
                        raise_application_error(err_number, msg_string, true);
                end;
                new_ubicacion.id_ubicacion_superior:=id_ubicacion_superior;
            end if;
            --Se inserta el registro es_importado en la tabla persona
            insert into ubicacion values new_ubicacion; 
            --Se registra la inserción en la tabla intermedia
            update log_imp_ubi set es_importado=1 where id_log_imp_ubi=current_ubicacion.id_log_imp_ubi;
            --Se incrementa el numero de insertados
            retorno:=retorno+1;
            --Si no se pudo insertar el registro se marca el motivo
            exception
                when others then
                    mensaje:='Error '||SQLCODE||'('||SQLERRM||')';
                    update log_imp_ubi set observacion=mensaje where id_log_imp_ubi=current_ubicacion.id_log_imp_ubi;
        end;
    end loop;
    --Barrios
    for current_ubicacion in (select * from log_imp_ubi where trim(tipo_ubicacion)='BARRIO')
    loop
        begin
            --Reiniciar los valores de la nueva ubicacion para cada registro a importar
            new_ubicacion.id_ubicacion:=current_ubicacion.id_log_imp_ubi; -- ya se inicializo con bigintid()
            new_ubicacion.version_ubicacion:=0;
            new_ubicacion.id_ubicacion_superior:=null;
            --Obtener valores
            new_ubicacion.codigo_ubicacion:=current_ubicacion.codigo;
            new_ubicacion.nombre_ubicacion:=current_ubicacion.ubicacion;
            new_ubicacion.numero_tipo_area:=sp$utils.extract_tipo_area_ubicacion(current_ubicacion.tipo_area);
            --Obtener ubicacion superior
            codigo_ubicacion_superior:=current_ubicacion.codigo_ubicacion_superior;
            if(codigo_ubicacion_superior is null) then
                msg_string := 'barrio '||current_ubicacion.codigo||' sin distrito';
                raise_application_error(err_number, msg_string, true);
            else
                begin
                    select id_ubicacion into id_ubicacion_superior from ubicacion where codigo_ubicacion=codigo_ubicacion_superior;
                exception
                    when no_data_found then
                        msg_string := 'distrito '||codigo_ubicacion_superior||' no existe; '
                                   || 'no se puede agregar el barrio '||current_ubicacion.codigo||'';
                        raise_application_error(err_number, msg_string, true);
                end;
                new_ubicacion.id_ubicacion_superior:=id_ubicacion_superior;
            end if;
            --Se inserta el registro es_importado en la tabla persona
            insert into ubicacion values new_ubicacion; 
            --Se registra la inserción en la tabla intermedia
            update log_imp_ubi set es_importado=1 where id_log_imp_ubi=current_ubicacion.id_log_imp_ubi;
            --Se incrementa el numero de insertados
            retorno:=retorno+1;
            --Si no se pudo insertar el registro se marca el motivo
            exception
                when others then
                    mensaje:='Error '||SQLCODE||'('||SQLERRM||')';
                    update log_imp_ubi set observacion=mensaje where id_log_imp_ubi=current_ubicacion.id_log_imp_ubi;
        end;
    end loop;
end;
