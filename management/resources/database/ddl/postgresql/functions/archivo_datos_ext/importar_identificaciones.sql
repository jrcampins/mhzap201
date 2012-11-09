-- 
-- Este procedimiento importa un archivo de datos externos, particularmente el archivo de identificaciones
-- @param nombre_archivo: Nombre del archivo a importar
-- @param codigo_Archivo: Codigo del archivo a importar
-- @returns numero de registros importados
--
create or replace function importar_identificaciones(nombre_archivo varchar,codigo_archivo varchar) returns integer as $$
declare
    retorno integer:=0;
    path_domain varchar:='';
    path_archivos_externos varchar:='';
    path_archivo_importar varchar:='';
    nombre_tabla varchar:='archivo_datos_ext';
    identificacion record;
    new_persona persona%ROWTYPE;
    array_nombres varchar[];
    array_apellidos varchar[];
    numero_cedula decimal:=null;
    letra_cedula varchar:='';
    mensaje varchar:='';
    extension varchar:='';
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
    --Se cambia la codificacion para aceptar caracteres especiales
    set client_encoding to LATIN1;
    --Se copia el contenido del archivo en la tabla temporal
    execute'copy log_imp_ids'
           ||'(cedula,letra_cedula,apellidos,nombres,fecha_nacimiento,
               sexo,nacionalidad,estado_civil, lugar_nacimiento,es_indigena) 
               from E'''
           || path_archivo_importar||
           ''' with delimiter as '';'' csv header;';
    
    for identificacion in select * from log_imp_ids 
                       where importado is null loop
        begin
        --Reiniciar los valores de la nueva persona para cada registro a importar
        new_persona.id_persona:=bigintid();
        new_persona.version_persona=0;
        
        new_persona.numero_cedula:=null;
        new_persona.letra_cedula:=null;
        
        new_persona.es_indigena:=0;
        new_persona.es_certificado_vida_anulado:=0;
        new_persona.es_cer_defuncion_anulado:=0;
        new_persona.es_persona_con_empleo:=0;
        new_persona.es_persona_con_jubilacion:= 0;
        new_persona.es_persona_con_pension:=0;
        new_persona.es_persona_con_subsidio:=0;
        new_persona.es_persona_con_deuda:=0;
        new_persona.es_persona_con_pena_judicial:=0;
        new_persona.es_persona_con_cer_vida:=0;
        new_persona.es_persona_con_carta_renuncia:=0;
        new_persona.es_persona_elegible_para_pen:=0;
        new_persona.es_persona_acreditada_para_pen:=0;
        --Si la persona tiene cedula se inserta
        numero_cedula:=extract_numero_from_cedula(identificacion.cedula);
        if  numero_cedula is not null then
            new_persona.numero_cedula:=numero_cedula;
        else
        --Si no tiene cedula se actualiza el motivo de no inserción
            raise exception 'Cédula erronea %',identificacion.cedula;
        end if;
        --Si la cedula tiene letra, se importa como campo aparte
        letra_cedula:=extract_letra_from_cedula(identificacion.cedula);
        if letra_cedula is not null then
            new_persona.letra_cedula:=letra_cedula;
        end if;
        if identificacion.nombres is not null 
           and identificacion.apellidos is not null then
            new_persona.nombre_persona=identificacion.nombres
                                       ||' '||identificacion.apellidos;
        else
            raise exception 'Nombres y apellidos no pueden ser vacíos';
        end if;
        --Se separan los nombres en un array
        array_nombres:= split_with_spaces(identificacion.nombres);
        --Se asigna primer y segundo nombre a persona
        new_persona.primer_nombre:=array_nombres[1];
        new_persona.segundo_nombre:=array_nombres[2];
        if array_nombres[3] is not null then
            new_persona.segundo_nombre:=new_persona.segundo_nombre||' '||array_nombres[3];
        end if;
        --Se separan los apellidos en un array
        array_apellidos:=split_with_spaces(identificacion.apellidos);
        --Se asignan primer y segundo apellido a la persona
        new_persona.primer_apellido:=array_apellidos[1];
        new_persona.segundo_apellido:=array_apellidos[2];
        if array_apellidos[3] is not null then
            new_persona.segundo_apellido:=new_persona.segundo_apellido||' '||array_apellidos[3];
        end if;
        --Se extrae la fecha de nacimiento
        new_persona.fecha_nacimiento:=cast_varchar_without_slash_as_timestamp(identificacion.fecha_nacimiento);
        --Se convierte al formato requerido (2 Femenino pasa a 1 y 1 Masculino pasa a 6)
        new_persona.numero_sexo_persona:=extract_sexo_persona(identificacion.sexo);
        --Se convierte la nacionalidad al formato requerido ( si es 226 es paraguayo, cualquier otro numero no es paraguayo)
        new_persona.es_paraguayo_natural:=extract_es_paraguayo(identificacion.nacionalidad);
        --Se convierte el estado civil al formato requerido (1 soltero no se convierte, 2 casado no se convierte, 4 se convierte en 3 divorciado, 5 se convierte en 4 viudo) 
        new_persona.numero_estado_civil:=extract_estado_civil(identificacion.estado_civil);
        --Se convierte el numero de condicion de indigena (1 si es indigena, 0 si no lo es)
        new_persona.es_indigena:=extract_es_indigena(identificacion.es_indigena);
        --Se inserta el registro importado en la tabla persona
        insert into persona values(new_persona.*);
        --Se incrementa el numero de insertados
        retorno:=retorno+1;
        --Se registra la inserción en la tabla intermedia
        execute 'update log_imp_ids
                 set importado=1, 
                 nombre_archivo=E'''||nombre_archivo||''',
                 codigo_archivo=E'''||codigo_archivo||''',
                 fecha_transaccion=current_timestamp 
                 where id_log_imp_ids='||identificacion.id_log_imp_ids||';';
        --Si no se pudo insertar el registro se marca el motivo
        exception when others then
            mensaje:='Error: '||SQLERRM;
            execute 'update log_imp_ids
                     set importado=0,
                     nombre_archivo=E'''||nombre_archivo||''',
                     codigo_archivo=E'''||codigo_archivo||''',
                     fecha_transaccion=current_timestamp,
                     observacion='''||mensaje||''' where id_log_imp_ids = '||identificacion.id_log_imp_ids||';';
            continue;
        end;
    end loop;
    --Se retorna el cambio
    set client_encoding to UTF8;
    return retorno;
end;
$$ language plpgsql;