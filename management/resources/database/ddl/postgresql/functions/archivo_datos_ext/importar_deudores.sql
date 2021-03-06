-- 
-- Este procedimiento importa un archivo de datos externos, particularmente un listado de personas con deuda
-- @param nombre_archivo: Nombre del archivo a importar
-- @param codigo_Archivo: Codigo del archivo a importar
-- @returns numero de registros importados
--
create or replace function importar_deudores(nombre_archivo varchar,codigo_archivo varchar) returns integer as $$
declare
    retorno integer:=0;
    path_domain varchar:='';
    path_archivos_externos varchar:='';
    path_archivo_importar varchar:='';
    deudor record;
    id_persona_act bigint;
    p_id_persona bigint;
    p_numero_cedula integer;
    p_letra_cedula char:=null;
    observacion_no_elegible varchar:='';
    mensaje varchar:='';
    row_objecion objecion_ele_pen;
    row_archivo_datos_ext archivo_datos_ext;
    row_persona persona;
    id_proveedor bigint;
    tipo_archivo bigint;
begin
    if nombre_archivo is null then
        raise exception 'Archivo No Existe';
    end if;
    --Copiamos la ruta del domain
    select valor_opcion_sistema 
    into path_domain 
    from opcion_sistema 
    where id_opcion_sistema=104;
    if not found then
        raise exception 'Ruta de dominio inv�lida, verifique opciones del sistema';
    end if;
    --Copiamos la ruta de archivos externos
    select valor_opcion_sistema 
    into path_archivos_externos
    from opcion_sistema 
    where id_opcion_sistema=105;
    if not found then
        raise exception 'Ruta de archivos externos inv�lida, verifique opciones del sistema';
    end if;
    --Ubicamos el archivo de datos externos
    select *
    into row_archivo_datos_ext
    from archivo_datos_ext
    where codigo_archivo_datos_ext=codigo_archivo;
    if not found then
        raise exception 'C�digo de archivo de datos externos inv�lido';
    end if;
    --Ubicamos el proveedor de datos externos
    id_proveedor:=row_archivo_datos_ext.id_proveedor_dat_ext;
    --Determinamos el tipo de archivo
    tipo_archivo:=row_archivo_datos_ext.numero_tipo_arc_dat_ext;
    --Se limpia el nombre del archivo
    nombre_archivo:=trim(both ' ' from nombre_archivo);
    --Copiamos la ruta con el nombre del archivo
    path_archivo_importar:=path_domain||path_archivos_externos||nombre_archivo;
    --Se cambia la codificacion
    set client_encoding to LATIN1;
    --Se copia el contenido del archivo en la tabla de log
    execute'copy log_imp_deu 
            (cedula, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, apellido_casada) from E'''
           || path_archivo_importar||
           ''' with delimiter as '';'' csv header;';
    --Se desactivan todas las objeciones de deuda de ese proveedor
    update objecion_ele_pen
    set es_objecion_ele_pen_inactiva=1,
    fecha_ultima_actualizacion=current_timestamp
    where numero_tipo_obj_ele_pen=23
    and id_proveedor_dat_ext=id_proveedor;
    --Se procesan los registros que no han sido importados antes
    for deudor in select * from log_imp_deu 
                  where importado is null loop
        begin
            id_persona_act:=extract_id_persona(deudor.cedula,deudor.primer_nombre,deudor.segundo_nombre,deudor.primer_apellido,deudor.segundo_apellido,deudor.apellido_casada);
            if id_persona_act is null then
                raise exception 'Persona no encontrada';
            else
                --Se selecciona la persona
                select * 
                into row_persona
                from persona
                where id_persona=id_persona_act;
                --Se verifica si ya existe una objecion
                select *
                into row_objecion
                from objecion_ele_pen
                where id_persona=row_persona.id_persona
                and numero_tipo_obj_ele_pen=23
                and id_proveedor_dat_ext=id_proveedor;
                if found then
                    --Si consigue la objecion la mantiene activa
                    update objecion_ele_pen
                    set es_objecion_ele_pen_inactiva=0,
                    fecha_ultima_actualizacion=current_timestamp
                    where id_objecion_ele_pen=row_objecion.id_objecion_ele_pen;
                else
                    --Si no la consigue, la inserta como nueva
                    row_objecion.id_objecion_ele_pen:=bigintid();
                    row_objecion.version_objecion_ele_pen:=0;
                    row_objecion.id_persona:=row_persona.id_persona;
                    row_objecion.id_proveedor_dat_ext:=id_proveedor;
                    row_objecion.numero_tipo_obj_ele_pen:=23;
                    row_objecion.es_objecion_ele_pen_inactiva:=0;
                    row_objecion.fecha_ultima_actualizacion:=current_timestamp;
                    row_objecion.nombre_archivo_ultima_act:=nombre_archivo;
                    insert into objecion_ele_pen
                    values(row_objecion.*);
                end if;
                --Se incrementa el n�mero de importados
                retorno:=retorno+1;
                execute 'update log_imp_deu
                         set importado=1, 
                         nombre_archivo=E'''||nombre_archivo||''',
                         codigo_archivo=E'''||codigo_archivo||''',
                         fecha_transaccion=current_timestamp 
                         where id_log_imp_deu='||deudor.id_log_imp_deu;
            end if;
            --Si hubo algun error se indica
        exception when others then
            mensaje:='Error: '||SQLERRM;
            execute 'update log_imp_deu
                        set importado=0,
                        nombre_archivo=E'''||nombre_archivo||''',
                        codigo_archivo=E'''||codigo_archivo||''',
                        fecha_transaccion=current_timestamp,
                        observacion='''||mensaje||''' 
                        where id_log_imp_deu = '||deudor.id_log_imp_deu||';';
            continue;
        end;
    end loop;
    set client_encoding to UTF8;
    return retorno;
end;
$$ language plpgsql;