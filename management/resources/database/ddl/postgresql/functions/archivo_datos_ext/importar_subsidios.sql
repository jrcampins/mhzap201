-- 
-- Este procedimiento importa un archivo de datos externos, particularmente un listado de personas con subsidios
-- @param nombre_archivo: Nombre del archivo a importar
-- @param codigo_Archivo: Codigo del archivo a importar
-- @returns numero de registros importados
--
create or replace function importar_subsidios(nombre_archivo varchar,codigo_archivo varchar) returns integer as $$
declare
    retorno integer:=0;
    path_domain varchar:='';
    path_archivos_externos varchar:='';
    path_archivo_importar varchar:='';
    subsidio record;
    id_persona_Act bigint;
    p_id_persona bigint;
    p_numero_cedula integer;
    p_letra_cedula char:=null;
    observacion_no_elegible varchar:='';
    mensaje varchar:='';
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
    --Se cambia la codificacion
    set client_encoding to LATIN1;
    --Se copia el contenido del archivo en la tabla de log
    execute'copy log_imp_sub 
            (cedula, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, apellido_casada) from E'''
           || path_archivo_importar||
           ''' with delimiter as '';'' csv header;';
    --Inicializamos la tabla persona
    update persona set es_persona_con_subsidio=0 where es_persona_con_subsidio=1;
    --Se procesan los registros que no han sido importados antes
    for subsidio in select * from log_imp_sub 
                  where importado is null loop
        begin
            id_persona_act:=extract_id_persona(subsidio.cedula,subsidio.primer_nombre,subsidio.segundo_nombre,subsidio.primer_apellido,subsidio.segundo_apellido,subsidio.apellido_casada);
            if id_persona_act is null then
                raise exception 'Persona no encontrada';
            --Se registra la inserción en la tabla intermedia
            else
                --Se incrementa el número de importados
                update persona set es_persona_con_subsidio=1 where id_persona=id_persona_act;
                retorno:=retorno+1;
                execute 'update log_imp_sub
                         set importado=1, 
                         nombre_archivo=E'''||nombre_archivo||''',
                         codigo_archivo=E'''||codigo_archivo||''',
                         fecha_transaccion=current_timestamp 
                         where id_log_imp_sub='||subsidio.id_log_imp_sub;
            end if;
            --Si hubo algun error se indica
        exception when others then
            mensaje:='Error: '||SQLERRM;
            execute 'update log_imp_sub
                        set importado=0,
                        nombre_archivo=E'''||nombre_archivo||''',
                        codigo_archivo=E'''||codigo_archivo||''',
                        fecha_transaccion=current_timestamp,
                        observacion='''||mensaje||''' 
                        where id_log_imp_sub = '||subsidio.id_log_imp_sub||';';
            continue;
        end;
    end loop;
    set client_encoding to UTF8;
    return retorno;
end;
$$ language plpgsql;