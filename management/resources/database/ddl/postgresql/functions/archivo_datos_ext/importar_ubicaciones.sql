-- --IGNORAR: Este segmento debera ser comentado al momento de agregar el nuevo prototipo
-- alter table ubicacion
-- add column numero_tipo_Area integer;
-- --IGNORAR FIN
-- 
-- Este procedimiento importa un archivo de datos externos, particularmente el archivo de ubicaciones
-- @param nombre_archivo: Nombre del archivo a importar
-- @param codigo_Archivo: Codigo del archivo a importar
-- @returns numero de registros importados
--
create or replace function importar_ubicaciones(nombre_archivo varchar,codigo_archivo varchar) returns integer as $$
declare
    retorno integer:=0;
    path_domain varchar:='';
    path_archivos_externos varchar:='';
    path_archivo_importar varchar:='';
    nombre_tabla varchar:='archivo_datos_ext';
    current_ubicacion record;
    codigo_ubicacion_superior varchar='';
    id_ubicacion_superior bigint:=0;
    new_ubicacion ubicacion%ROWTYPE;
    mensaje varchar:='';
begin
    if nombre_archivo is null or codigo_archivo is null then
        raise exception 'Archivo No Existe';
    end if;
    --Copiamos la ruta del domain
    select valor_opcion_sistema 
    into path_domain 
    from opcion_sistema 
    where id_opcion_sistema=104;
    if not found then
        raise exception 'Ruta de dominio inválida, verifique opciones del sistema';
    end if;
    --Copiamos la ruta de archivos externos
    select valor_opcion_sistema 
    into path_archivos_externos
    from opcion_sistema 
    where id_opcion_sistema=105;
    if not found then
        raise exception 'Ruta de archivos externos inválida, verifique opciones del sistema';
    end if;
    --Se limpia el nombre del archivo
    nombre_archivo:=trim(both ' ' from nombre_archivo);
    --Copiamos la ruta con el nombre del archivo
    path_archivo_importar:=path_domain||path_archivos_externos||nombre_archivo;
    --Se indica el nombre de la tabla temporal
    nombre_tabla:=lower(nombre_tabla||'_'||codigo_archivo);
    --Se crea la tabla temporal 
    execute 'drop table if exists  '||nombre_tabla||';
             create table '||nombre_tabla||'(
                id_reg serial,
                codigo character varying (15),
                ubicacion character varying (100),
                tipo_ubicacion character varying (50),
                tipo_area character varying (30),
                codigo_ubicacion_superior character varying (15),
                importado integer default 0,
                observacion character varying,
                constraint pk_'||nombre_tabla||'  primary key (id_reg)
                );';
    set client_encoding to LATIN1;
    --Se copia el contenido del archivo en la tabla temporal
    execute'copy '
           ||nombre_tabla||
           '(codigo,ubicacion,tipo_ubicacion,tipo_area,codigo_ubicacion_superior) from E'''
           || path_archivo_importar||
           ''' with delimiter as '';'' csv header;';
    set client_encoding to UTF8;
    --importamos departamentos
    for current_ubicacion in execute 'select * from '||nombre_tabla||' where btrim(tipo_ubicacion)=''DEPARTAMENTO''' loop
        begin
            --Reiniciar los valores de la nueva ubicacion para cada registro a importar
            new_ubicacion.id_ubicacion:=bigintid();
            new_ubicacion.version_ubicacion:=0;
            new_ubicacion.id_ubicacion_superior:=null;
            --Obtener valores
            new_ubicacion.codigo_ubicacion:=current_ubicacion.codigo;
            new_ubicacion.nombre_ubicacion:=current_ubicacion.ubicacion;
            --Se inserta el registro importado en la tabla persona
            insert into ubicacion values(new_ubicacion.*);
            --Se registra la inserción en la tabla intermedia
            execute 'update '
                ||nombre_tabla||
                ' set importado=1 where id_reg='||current_ubicacion.id_reg;
            --Se incrementa el numero de insertados
            retorno:=retorno+1;
            --Si no se pudo insertar el registro se marca el motivo
            exception when others then
                mensaje:='Error '||SQLSTATE||' : '||SQLERRM;
                execute 'update '||nombre_tabla||
                    ' set observacion='''||mensaje||''' where id_reg = '||current_ubicacion.id_reg||';';
                continue;
        end;
    end loop;
    --Distritos
    for current_ubicacion in execute 'select * from '||nombre_tabla||' where btrim(tipo_ubicacion)=''DISTRITO''' loop
        begin
            --Reiniciar los valores de la nueva ubicacion para cada registro a importar
            new_ubicacion.id_ubicacion:=bigintid();
            new_ubicacion.version_ubicacion:=0;
            new_ubicacion.id_ubicacion_superior:=null;
            --Obtener valores
            new_ubicacion.codigo_ubicacion:=current_ubicacion.codigo;
            new_ubicacion.nombre_ubicacion:=current_ubicacion.ubicacion;
            --Obtener ubicacion superior
            codigo_ubicacion_superior:=current_ubicacion.codigo_ubicacion_superior;
            if(codigo_ubicacion_superior is null) then
                raise exception 'Distrito %:% sin departamento',current_ubicacion.codigo,current_ubicacion.ubicacion;
            else
                execute 'select id_ubicacion from ubicacion where codigo_ubicacion='''||codigo_ubicacion_superior||''';' into id_ubicacion_superior ;
                if not found then
                    raise exception 'Ubicacion superior desconocida para %:%',current_ubicacion.codigo,current_ubicacion.ubicacion;
                end if;
                new_ubicacion.id_ubicacion_superior:=id_ubicacion_superior;
            end if;
            --Se inserta el registro importado en la tabla persona
            insert into ubicacion values(new_ubicacion.*);
            --Se registra la inserción en la tabla intermedia
            execute 'update '
                ||nombre_tabla||
                ' set importado=1 where id_reg='||current_ubicacion.id_reg;
            --Se incrementa el numero de insertados
            retorno:=retorno+1;
            --Si no se pudo insertar el registro se marca el motivo
            exception when others then
                mensaje:='Error '||SQLSTATE||' : '||SQLERRM;
                execute 'update '||nombre_tabla||
                    ' set observacion='''||mensaje||''' where id_reg = '||current_ubicacion.id_reg||';';
                continue;
        end;
    end loop;
    --Barrios
    for current_ubicacion in execute 'select * from '||nombre_tabla||' where btrim(tipo_ubicacion)=''BARRIO''' loop
        begin
            --Reiniciar los valores de la nueva ubicacion para cada registro a importar
            new_ubicacion.id_ubicacion:=bigintid();
            new_ubicacion.version_ubicacion:=0;
            new_ubicacion.id_ubicacion_superior:=null;
            --Obtener valores
            new_ubicacion.codigo_ubicacion:=current_ubicacion.codigo;
            new_ubicacion.nombre_ubicacion:=current_ubicacion.ubicacion;
            new_ubicacion.numero_tipo_area:=extract_tipo_area_ubicacion(current_ubicacion.tipo_area);
            --Obtener ubicacion superior
            codigo_ubicacion_superior:=current_ubicacion.codigo_ubicacion_superior;
            if(codigo_ubicacion_superior is null) then
                raise exception 'Barrio %:% sin distrito',current_ubicacion.codigo,current_ubicacion.ubicacion;
            else
                execute 'select id_ubicacion from ubicacion where codigo_ubicacion='''||codigo_ubicacion_superior||''';' into id_ubicacion_superior ;
                if not found then
                    raise exception 'Ubicacion superior desconocida para %:%',current_ubicacion.codigo,current_ubicacion.ubicacion;
                end if;
                new_ubicacion.id_ubicacion_superior:=id_ubicacion_superior;
            end if;
            --Se inserta el registro importado en la tabla persona
            insert into ubicacion values(new_ubicacion.*);
            --Se registra la inserción en la tabla intermedia
            execute 'update '
                ||nombre_tabla||
                ' set importado=1 where id_reg='||current_ubicacion.id_reg;
            --Se incrementa el numero de insertados
            retorno:=retorno+1;
            --Si no se pudo insertar el registro se marca el motivo
            exception when others then
                mensaje:='Error '||SQLSTATE||' : '||SQLERRM;
                execute 'update '||nombre_tabla||
                    ' set observacion='''||mensaje||''' where id_reg = '||current_ubicacion.id_reg||';';
                continue;
        end;
    end loop;
    return retorno;
end;
$$ language plpgsql;