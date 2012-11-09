-- 
-- Este procedimiento importa un archivo de datos externos, particularmente el archivo de potenciales beneficiarios
-- @param nombre_archivo: Nombre del archivo a importar
-- @param codigo_Archivo: Codigo del archivo a importar
-- @returns numero de registros importados
--
create or replace function importar_potenciales_beneficiarios(nombre_archivo varchar,codigo_archivo varchar) returns integer as $$
declare
    retorno integer:=0;
    path_domain varchar:='';
    path_archivos_externos varchar:='';
    path_archivo_importar varchar:='';
    nombre_tabla varchar:='archivo_datos_ext';
    registro record;
    id_ubicacion_insertar bigint;
    new_potencial_ben potencial_ben%ROWTYPE;
    array_nombres varchar[];
    mensaje varchar:='';
    nombre_beneficiario varchar:='';
    id_distrito_potencial_ben bigint:=0;
    id_departamento_potencial_ben bigint:=0;
    id_barrio_potencial_ben bigint:=0;
    id_persona_asociada bigint :=null;
    id_ficha_persona_asociada bigint:=null;
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
    execute'copy log_imp_pot
            (departamento,distrito,nombres_apellidos,apodo,edad,
             fecha_nacimiento,numero_cedula,numero_telefono,direccion,
             referencia,barrio,nombre_referente,numero_telefono_referente) 
             from E'''|| path_archivo_importar||
           ''' with delimiter as '';'' csv header;';
    --Se devuelve el cambio en la codificacion
    set client_encoding to UTF8;
    for registro in select * from log_imp_pot
                    where importado is null loop
        begin
            --Reiniciar los valores de la nueva persona para cada registro a importar
            new_potencial_ben.id_potencial_ben:=bigintid();
            new_potencial_ben.version_potencial_ben:=0;
            new_potencial_ben.es_paraguayo_natural:=1;
            new_potencial_ben.es_indigena:=0;
            new_potencial_ben.numero_tipo_reg_pot_ben:=0;
            new_potencial_ben.numero_cedula:=null;
            new_potencial_ben.letra_cedula:=null;
            new_potencial_ben.primer_nombre:=null;
            new_potencial_ben.segundo_nombre:=null;
            new_potencial_ben.primer_apellido:=null;
            new_potencial_ben.apellido_casada:=null;
            new_potencial_ben.segundo_apellido:=null;
            new_potencial_ben.apodo:=null;
            new_potencial_ben.es_persona_con_empleo:=0;
            new_potencial_ben.es_persona_con_jubilacion:= 0;
            new_potencial_ben.es_persona_con_pension:=0;
            new_potencial_ben.es_persona_con_subsidio:=0;
            new_potencial_ben.es_persona_con_deuda:=0;
            new_potencial_ben.es_persona_con_pena_judicial:=0;
            new_potencial_ben.es_persona_con_cer_vida:=0;
            new_potencial_ben.es_persona_con_carta_renuncia:=0;
            new_potencial_ben.es_potencial_ben_inactivo:=0;
            new_potencial_ben.letra_cedula:=null;
            new_potencial_ben.numero_telefono_resp_hogar:=null;
            new_potencial_ben.direccion:=null;
            new_potencial_ben.id_barrio:=null;
            --new_potencial_ben.numero_tipo_area:=null;
            new_potencial_ben.id_departamento:=null;
            new_potencial_ben.id_distrito:=null;
            new_potencial_ben.nombre_referente:=null;
            new_potencial_ben.numero_telefono_referente:=null;
            new_potencial_ben.id_persona:=null;
            id_persona_asociada:=null;
            id_ficha_persona_asociada:=null;
            --Se captura el departamento
            id_departamento_potencial_ben:=get_id_departamento(registro.departamento);
            if(id_departamento_potencial_ben<>0 )then
                new_potencial_ben.id_departamento:=id_departamento_potencial_ben;
            end if;
            --Se captura el distrito
            id_distrito_potencial_ben:=get_id_distrito(registro.departamento,registro.distrito);
            if(id_distrito_potencial_ben<>0 )then
                new_potencial_ben.id_distrito:=id_distrito_potencial_ben;
            end if;
            --Se importa el barrio, para ello, primero se ubica el barrio en la tabla correspondiente
            id_barrio_potencial_ben:=get_id_barrio(registro.distrito,registro.barrio);
            if(id_barrio_potencial_ben<>0 )then
                new_potencial_ben.id_barrio:=id_barrio_potencial_ben;
                --new_potencial_ben.numero_tipo_area:=get_numero_tipo_area(id_barrio_potencial_ben);
            end if;
            --Se capturan los nombres
            if(registro.nombres_apellidos is not null) then
                new_potencial_ben.nombre_potencial_ben:= btrim(registro.nombres_apellidos);
            else
                raise exception'Nombres y apellidos no pueden ser vacios';
            end if;
            --Se asigna el apodo del potencial beneficiario
            new_potencial_ben.apodo:=registro.apodo;            
            --Se asigna la fecha de nacimiento
            new_potencial_ben.fecha_nacimiento:=cast_varchar_as_timestamp(registro.fecha_nacimiento);
            --Se calcula la edad
            if(new_potencial_ben.fecha_nacimiento is not null) then
                new_potencial_ben.edad=date_part('year',age(new_potencial_ben.fecha_nacimiento));
            end if;
            --Se asigna el numero de cedula y tipo de registro
            if extract_numero_from_cedula(registro.numero_cedula) is not null then
                new_potencial_ben.numero_cedula:=extract_numero_from_cedula(registro.numero_cedula);
            end if;
            --Si la cedula tiene letra, se importa como campo aparte
            if extract_letra_from_cedula(registro.numero_cedula) is not null then
                new_potencial_ben.letra_cedula:=extract_letra_from_cedula(registro.numero_cedula);
            end if;
            --Se importa el telefono del responsable del hogar
            new_potencial_ben.numero_telefono_resp_hogar:=registro.numero_telefono;
            --Se importa la direccion
            new_potencial_ben.direccion:=registro.direccion;
            if(new_potencial_ben.id_barrio is null and registro.barrio is not null) then
                new_potencial_ben.direccion:=new_potencial_ben.direccion||' ('||registro.barrio||')';
            end if;
            --Se importa la referencia
            new_potencial_ben.referencia_direccion=registro.referencia;
            --Se importa el referente
            new_potencial_ben.nombre_referente:=registro.nombre_referente;
            --Se importa el telefono del referente
            new_potencial_ben.numero_telefono_referente:=registro.numero_telefono_referente;
            --Se importa como potencial beneficiario a censar
            new_potencial_ben.numero_condicion_censo:=1;
            --Se coloca fecha de registro la fecha actual
            --new_potencial_ben.fecha_registro_pot_ben:=current_timestamp;
            if(new_potencial_ben.numero_cedula is not null) then           
                id_persona_asociada=extract_id_persona_potencial_ben(new_potencial_ben);
                --Si se pudo obtener un id de persona se vincula
                if id_persona_asociada is not null then
                    new_potencial_ben.numero_tipo_reg_pot_ben:=1;
                    new_potencial_ben.id_persona:=id_persona_asociada;
                --Sino se registra sin cedula
                else               
                    new_potencial_ben.numero_tipo_reg_pot_ben:=2;
                    new_potencial_ben.numero_cedula:=null;
                    new_potencial_ben.letra_cedula:=null;
                    --Se notifica que se insertará sin cédula
                    update log_imp_pot
                    set observacion='Persona no encontrada. Cédula ignorada'
                    where id_log_imp_pot=registro.id_log_imp_pot;
                end if;
            else
                new_potencial_ben.numero_tipo_reg_pot_ben:=2;
                new_potencial_ben.letra_cedula:=null;
            end if;
            --Se inserta el registro importado en la tabla potencial_ben
            insert into potencial_ben values(new_potencial_ben.*);
            --Se incrementa el numero de insertados
            retorno:=retorno+1;
            --Se registra la inserción en la tabla intermedia
            execute 'update log_imp_pot
                     set importado=1, 
                     nombre_archivo=E'''||nombre_archivo||''',
                     codigo_archivo=E'''||codigo_archivo||''',
                     fecha_transaccion=current_timestamp 
                     where id_log_imp_pot='
                     ||registro.id_log_imp_pot||';';           
        --Si no se pudo insertar el registro se marca el motivo
        exception when others then
            mensaje:='Error: '||SQLERRM;
            execute 'update log_imp_pot
                     set importado=0,
                     nombre_archivo=E'''||nombre_archivo||''',
                     codigo_archivo=E'''||codigo_archivo||''',
                     fecha_transaccion=current_timestamp,
                     observacion='''||mensaje||
                     ''' where id_log_imp_pot='
                     ||registro.id_log_imp_pot||';';
            continue;
        end;
    end loop;
    return retorno;
end;
$$ language plpgsql;