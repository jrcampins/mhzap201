-- 
-- Este procedimiento importa un archivo de datos externos, particularmente un listado de personas fallecidas
-- @param nombre_archivo: Nombre del archivo a importar
-- @param codigo_Archivo: Codigo del archivo a importar
-- @returns numero de registros importados
--
create or replace function importar_fallecidos(nombre_archivo varchar,codigo_archivo varchar) returns integer as $$
declare
    retorno integer:=0;
    path_domain varchar:='';
    path_archivos_externos varchar:='';
    path_archivo_importar varchar:='';
    fallecido record;
    id_persona_act bigint;
    p_id_persona bigint;
    p_numero_cedula integer;
    p_letra_cedula char:=null;
    p_fecha_defuncion timestamp;
    row_persona persona%ROWTYPE;
    mensaje_defuncion varchar:='';
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
    --Se cambia la codificacion para aceptar caracteres especiales
    set client_encoding to LATIN1;
    --Se copia el contenido del archivo en la tabla temporal
    execute' copy log_imp_fal
           (cedula,primer_nombre,segundo_nombre,primer_apellido,segundo_apellido,apellido_casada,fecha_defuncion) from E'''
           || path_archivo_importar||
           ''' with delimiter as '';'' csv header;';
    set client_encoding to UTF8;
    --Se va actualizando cada registro recibido
    for fallecido in select * from log_imp_fal
                     where importado is null loop
        begin
            id_persona_act:=extract_id_persona(fallecido.cedula,fallecido.primer_nombre,fallecido.segundo_nombre,fallecido.primer_apellido,fallecido.segundo_apellido,fallecido.apellido_casada);
            if id_persona_act is null then
                raise exception 'Persona no encontrada';
            --Se registra la inserción en la tabla intermedia
            else
                 --Se selecciona la persona
                select * 
                into row_persona
                from persona
                where id_persona=id_persona_act;

                perform persona_registrar_cer_defun(row_persona.id_persona,'S/N',p_fecha_defuncion);
                retorno:=retorno+1;
                execute 'update log_imp_fal
                         set importado=1, 
                         nombre_archivo=E'''||nombre_archivo||''',
                         codigo_archivo=E'''||codigo_archivo||''',
                         fecha_transaccion=current_timestamp 
                         where id_log_imp_fal='||fallecido.id_log_imp_fal;
            end if;
            exception when others then
                mensaje:='Error '||SQLERRM;
                execute 'update log_imp_fal
                     set importado=0,
                     nombre_archivo=E'''||nombre_archivo||''',
                     codigo_archivo=E'''||codigo_archivo||''',
                     fecha_transaccion=current_timestamp,
                     observacion='''||mensaje||''' 
                     where id_log_imp_fal = '||fallecido.id_log_imp_fal||';';
                continue;
            end;
    end loop;
    return retorno;
end;
$$ language plpgsql;