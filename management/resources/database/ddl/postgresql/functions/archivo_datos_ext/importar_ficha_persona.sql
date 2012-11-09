-- 
-- Este procedimiento importa un archivo de datos externos, particularmente un archivo que contiene fichas hogar
-- @param nombre_archivo: Nombre del archivo a importar
-- @param codigo_Archivo: Codigo del archivo a importar
-- @returns numero de registros importados
--
create or replace function importar_ficha_persona(nombre_archivo varchar,codigo_archivo varchar) returns integer as $$
declare
    retorno integer:=0;
    path_domain varchar:='';
    path_archivos_externos varchar:='';
    path_archivo_importar varchar:='';
    current_row record;
    new_ficha_persona ficha_persona%ROWTYPE;
    id_tabla varchar:='id_';
    texto_fecha character varying;
    mensaje character varying;
    row_ficha_hogar ficha_hogar%ROWTYPE;
    --Estas variables permiten identificar el id de ficha hogar asociada
    id_departamento_consultar bigint;
    id_distrito_consultar bigint;
    id_barrio_consultar bigint;
    numero_formulario_consultar bigint;
    texto_formulario varchar:='';
    numero_vivienda_consultar bigint;
    numero_hogar_consultar bigint;
    numero_respondente integer;
    id_ubicacion_retornado bigint;
    secuencia varchar:='';
    secuencia_anterior varchar:='';
    actualizar_ficha_hogar integer:=0;
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
    --Se cambia la codificación para importar caracteres latinos
    set client_encoding to LATIN1;
     --Se copia el contenido del archivo en la tabla temporal
    execute' copy log_imp_per
            (P01A,P01B,P01C,P01D,P02,P03,P104,P43,P45A,P45B,P44A,P44B,
             VAR00001,VAR00002,P46,P47,VAR00030,P48,P49,P50A,P50B,P50C,
             P51,VAR00003,VAR00004,P52D,P52M,P52A,P53A,P53B,P53C,P53Z,
             P54,P54E,P56,P58,P58E,P59,P60,P61,P62,P63,P64,P65,P65E,P66,
             P66E,P67,P68,P68E,P73,P74,VAR00006,VAR00007,VAR00008,VAR00009,
             VAR00010,VAR00011,VAR00031,VAR00012,VAR00013,P86,P87,P87E,P88,
             P88E,P91,VAR00017,VAR00018,VAR00019,VAR00020,VAR00021,VAR00022,
             VAR00023,VAR00024,VAR00025,VAR00026,VAR00027,VAR00028,P92,ICV)
             from E'''|| path_archivo_importar||''' with delimiter as '';'' csv header;';
    set client_encoding to UTF8;
    for current_row in select * from log_imp_per
                       where importado is null loop
        begin
            --Reiniciar los valores de la nueva ficha para cada registro a importar
            new_ficha_persona.id_ficha_persona:=bigintid();
            new_ficha_persona.version_ficha_persona:=0;
            new_ficha_persona.id_departamento_nacimiento:=null;
            new_ficha_persona.id_distrito_nacimiento:=null;
            new_ficha_persona.numero_tipo_area_lugar_nac:=null;
            new_ficha_persona.otra_clase_enf_cronica:=null;
            if current_row.P01A is null or current_row.P01B is null or current_row.P01C is null or current_row.P01D is null or current_row.P02 is null or current_row.P03 is null then
                raise exception 'Clave de Ficha Persona Inválida (Alguno de los campos es nulo)';
            end if;
            --Se determina la secuencia de campos claves
            secuencia:=current_row.P01A||current_row.P01B||current_row.P01C||current_row.P01D||current_row.P02||current_row.P03;
            --Si la secuencia es igual a la anterior no debo actualizar nada
            if secuencia<>secuencia_anterior then
                secuencia_anterior:=secuencia;          
                --Se ubica el id del departamento (P01A)
                id_departamento_consultar:= extract_id_departamento(current_row.P01A);
                if id_departamento_consultar is null then
                    raise exception 'Numero de Departamento No puede ser nulo';
                end if;
                --Se ubica el id del distrito (P01B)
                id_distrito_consultar:= extract_id_distrito(current_row.P01A,current_row.P01B);
                if id_distrito_consultar is null then
                    raise exception 'Numero de Distrito No puede ser nulo';
                end if;
                --Se ubica el id del barrio (P01C)
                id_barrio_consultar:= extract_id_barrio(current_row.P01A,current_row.P01B,current_row.P01C);
                if id_barrio_consultar is null then
                    raise exception 'Numero de Barrio No puede ser nulo';
                end if;
                --Se ubica el numero de formulario (P01D)
                numero_formulario_consultar:= cast_varchar_as_integer(current_row.P01D);
                if numero_formulario_consultar is null then
                    raise exception 'Numero de Formulario No puede ser nulo';
                end if;
                --Se convierte el texto recibido en distancia_este_utm (P02)
                numero_vivienda_consultar:=extract_numero_vivienda(current_row.P02);
                if numero_vivienda_consultar is null then
                    raise exception 'Numero de Vivienda No puede ser nulo';
                end if;
                --Se convierte el texto recibido en distancia_este_utm (P03)
                numero_hogar_consultar:=extract_numero_hogar(current_row.P03);
                if numero_hogar_consultar is null then
                    raise exception 'Numero de Hogar No puede ser nulo';
                end if;
                --Se determina la ficha hogar asociada
                execute'select *  from ficha_hogar  
                    where id_departamento='||id_departamento_consultar||
                    ' and id_distrito='||id_distrito_consultar||
                    ' and id_barrio='||id_barrio_consultar||
                    ' and numero_formulario='||numero_formulario_consultar||
                    ' and numero_vivienda='||numero_vivienda_consultar||
                    ' and numero_hogar='||numero_hogar_consultar||
                    ' ;' into row_ficha_hogar;
                --Si no hay ficha hogar, no tiene sentido procesar la ficha
                if not found then 
                    raise exception 'No hay Ficha Hogar asociada a la Persona';
                end if;
                --Se indica que más adelante hay que actualizar
                actualizar_ficha_hogar:=1;
            end if;
                --Se copia el id de ficha hogar
                if row_ficha_hogar.id_ficha_hogar is not null then
                    new_ficha_persona.id_ficha_hogar:=row_ficha_hogar.id_ficha_hogar;
                else
                    raise exception 'No hay Id de Ficha hogar asociado a la Persona';
                end if;
                --Se toma el numero del respondente
                numero_respondente:=cast_varchar_as_integer(current_row.P104);
                if numero_respondente is null then
                    raise exception 'Numero de Respondente No puede ser nulo';
                end if;
                --Se toma el orden de identificacion
                new_ficha_persona.numero_orden_identificacion:=cast_varchar_as_integer(current_row.P43);
                if new_ficha_persona.numero_orden_identificacion is null then
                    raise exception 'Numero de Orden de Identificación No puede ser nulo';
                end if;
                --Se determina si la persona es el respondente
                if numero_respondente=new_ficha_persona.numero_orden_identificacion then
                    new_ficha_persona.es_respondente:=1;
                else
                    new_ficha_persona.es_respondente:=0;
                end if;
                --Nombres (P44,P45,VAR00001 y VAR00002)
                new_ficha_persona.primer_nombre:=current_row.P45A;
                new_ficha_persona.segundo_nombre:=current_row.P45B;
                new_ficha_persona.primer_apellido:=current_row.P44A;
                new_ficha_persona.segundo_apellido:=current_row.P44B;
                new_ficha_persona.apellido_casada:=current_row.VAR00001;
                new_ficha_persona.apodo:=current_row.VAR00002;
                --Edad (P46)
                new_ficha_persona.edad:=cast_varchar_as_integer(current_row.P46);
                --Sexo (P47)
                new_ficha_persona.numero_sexo_persona:=extract_sexo_ficha_persona(current_row.P47);
                --Estado civil (VAR00030)
                new_ficha_persona.numero_estado_civil:=extract_estado_civil(current_row.VAR00030);
                --Parentesco con el Jefe del Hogar (P48)
                new_ficha_persona.numero_tipo_persona_hogar :=extract_tipo_persona_hogar(current_row.P48);
                --Es miembro del hogar (P49)
                new_ficha_persona.numero_siono_miembro_hogar :=extract_siono(current_row.P49);
                --Numero de orden del conyuge(P50A)
                new_ficha_persona.numero_orden_iden_conyuge :=extract_numero_orden_identificacion(current_row.P50A);
                --´Numero de orden del padre(P50B)
                new_ficha_persona.numero_orden_iden_padre :=extract_numero_orden_identificacion(current_row.P50A);
                -- Numero de orden de la madre (P50C)
                new_ficha_persona.numero_orden_iden_padre :=extract_numero_orden_identificacion(current_row.P50C);
                -- Numero de cedula (P51) 
                new_ficha_persona.numero_cedula:=extract_numero_from_cedula(current_row.P51);
                -- Letra de cedula (VAR00003)
                new_ficha_persona.letra_cedula:=extract_letra_from_cedula(current_row.VAR00003);
                -- Numero de tipo de excepcion de cedula (VAR000004)
                new_ficha_persona.numero_tipo_excepcion_ced:=extract_letra_from_cedula(current_row.VAR00004);
                -- Fecha de Nacimiento (P52D,P52M,P52A)
                new_ficha_persona.fecha_nacimiento:=extract_fecha(current_row.P52D,current_row.P52M,current_row.P52A);
                -- Nombre de departamento de nacimiento (P53A)
                id_ubicacion_retornado:=get_id_ubicacion(current_row.P53A);
                if id_ubicacion_retornado<>0 then
                    new_ficha_persona.id_departamento_nacimiento:=id_ubicacion_retornado;
                end if;
                --Nombre de distrito de nacimiento (P53B)
                id_ubicacion_retornado:=get_id_ubicacion(current_row.P53B);
                if id_ubicacion_retornado<>0 then
                    new_ficha_persona.id_distrito_nacimiento:=id_ubicacion_retornado;
                end if;
                --Codigo del distrito de nacimiento (P53C)No se utiliza
                --Tipo de Area de Nacimiento (P53Z)
                new_ficha_persona.numero_tipo_area_lugar_nac :=extract_tipo_area(current_row.P53Z);
                --Idioma que habla el mayor tiempo (P54)
                new_ficha_persona.numero_idioma_hogar:=extract_idioma_hogar(current_row.P54);
                if new_ficha_persona.numero_idioma_hogar=4 then
                    --Otro idioma (P54E)
                    new_ficha_persona.otro_idioma_hogar:=current_row.P54E;
                end if;
                --Asisitio a instituto (P56)
                new_ficha_persona.numero_siono_asistencia_esc:=extract_siono(current_row.P56);
                --Motivo de inasistencia (P58)
                new_ficha_persona.numero_motivo_ina_esc:=extract_motivo_ina_esc(current_row.P58);
                if new_ficha_persona.numero_motivo_ina_esc=25 then
                    --Otro motivo de inasistencia (P58E)
                    new_ficha_persona.otro_motivo_ina_esc:=current_row.P58E;
                end if;
                --Piensa Matricularse este año (P59)
                new_ficha_persona.numero_siono_matriculacion_esc:=extract_siono(current_row.P59);
                --Ultimo grado aprobado (P60)
                new_ficha_persona.ultimo_curso_aprobado:=extract_ultimo_curso_aprobado(current_row.P60);
                --Nivel del ultimo curso aprobado (P61)
                new_ficha_persona.numero_nivel_edu_ult_cur_aprob:=extract_nivel_educativo_ultimo_curso_aprobado(current_row.P61);
                --Realizo curso no formal  (P62)
                new_ficha_persona.numero_siono_curso_no_formal:=extract_siono(current_row.P62);
                --Tiene seguro medico vigente (P63)
                new_ficha_persona.numero_tipo_seguro_medico:=extract_tipo_seguro_medico(current_row.P63);
                --Estado de salud general (P64)
                new_ficha_persona.numero_estado_salud:=extract_estado_salud(current_row.P64);
                --Clase de enfermedad (P65)
                new_ficha_persona.numero_clase_enf_acc:=extract_clase_enf_acc(current_row.P65);
                if new_ficha_persona.numero_clase_enf_acc=44 then
                    --Otro tipo de enfermedad accidente (P65E)
                    new_ficha_persona.otra_clase_enf_acc :=current_row.P65E;
                end if;
                --Clase de enfermedad cronica (P66)
                new_ficha_persona.numero_clase_enf_cronica:=extract_clase_enf_cronica(current_row.P66);
                if new_ficha_persona.numero_clase_enf_cronica=42 then
                    --Otro tipo de enfermedad cronica (P66E)
                    new_ficha_persona.otra_clase_enf_cronica :=current_row.P66E;
                end if;
                --Recibio atencion para accidente (P67)
                new_ficha_persona.numero_siono_atencion_medica:=extract_siono(current_row.P67);
                --Motivo de no atencion medica (P68)
                new_ficha_persona.numero_motivo_no_atencion :=extract_motivo_no_atencion(current_row.P68);
                if new_ficha_persona.numero_motivo_no_atencion=42 then
                    --Otro motivo de no asistencia (P68E)
                    new_ficha_persona.otro_motivo_no_atencion :=current_row.P68E;
                end if;
                --Tiene carner te vacunacion(P73)
                new_ficha_persona.numero_siono_carnet_vacunacion:=extract_siono(current_row.P73);
                --Clase de impedimento (P74)
                new_ficha_persona.numero_clase_impedimento:=extract_clase_impedimento(current_row.P74);
                if new_ficha_persona.numero_clase_impedimento=13 then
                    --Otra clase de impedimento (VAR00006)
                    new_ficha_persona.otra_clase_impedimento  :=current_row.VAR00006;
                end if;
                --Causa de impedimento (VAR00007)
                new_ficha_persona.numero_causa_impedimento  :=extract_causa_impedimento(current_row.VAR00007);
                if new_ficha_persona.numero_causa_impedimento=5 then
                    --Otra causa de impedimento (VAR00008)
                    new_ficha_persona.otra_clase_impedimento  :=current_row.VAR00008;
                end if;
                --Dificultad para caminar (VAR00009)
                new_ficha_persona.numero_siono_dif_para_caminar:=extract_siono(current_row.VAR00009);
                --Dificultad para vestirse (VAR00010)
                new_ficha_persona.numero_siono_dif_para_vestirse:=extract_siono(current_row.VAR00010);
                --Dificultad para bañarse (VAR00011)
                new_ficha_persona.numero_siono_dif_para_banarse:=extract_siono(current_row.VAR00011);
                --Dificultad para comer (VAR00031)
                new_ficha_persona.numero_siono_dif_para_comer:=extract_siono(current_row.VAR00031);
                --Dificultad para la cama (VAR00012)
                new_ficha_persona.numero_siono_dif_para_la_cama:=extract_siono(current_row.VAR00012);
                --Dificultad ir al baño (VAR00013
                new_ficha_persona.numero_siono_dif_para_el_bano:=extract_siono(current_row.VAR00013);
                --Tiene Trabajo (P86)
                new_ficha_persona.numero_siono_trabajo:=extract_siono(current_row.P86);
                --Motivo de No Trabajo (P87)
                new_ficha_persona.numero_motivo_no_trabajo:=extract_motivo_no_trabajo(current_row.P87);
                if new_ficha_persona.numero_motivo_no_trabajo=9 then
                    --Otro motivo de no trabajo (P87E)
                    new_ficha_persona.otro_motivo_no_trabajo:=current_row.P87E;
                end if;
                --Descripción de ocupacion principal (P88)
                new_ficha_persona.descripcion_ocupacion_prin:=current_row.P88;
                --Descripción de dedicacion principal (P88E)
                new_ficha_persona.descripcion_dedicacion_prin:=current_row.P88E;
                --Tipo de relacion laboral (P91)
                new_ficha_persona.numero_tipo_relacion_lab:=extract_tipo_relacion_lab(current_row.P91);
                --Monto de Ingreso ocupacion principal (VAR00017)
                new_ficha_persona.monto_ingreso_ocupacion_prin:=cast_varchar_as_decimal(current_row.VAR00017);
                --Monto de Ingreso ocupacion secundaria (VAR00018)
                new_ficha_persona.monto_ingreso_ocupacion_secun:=cast_varchar_as_decimal(current_row.VAR00018);
                --Monto de Ingreso otras ocupaciones (VAR00019)
                new_ficha_persona.monto_ingreso_otras_ocup:=cast_varchar_as_decimal(current_row.VAR00019);
                --Monto de Ingreso por alquileres (VAR00020)
                new_ficha_persona.monto_ingreso_alquileres:=cast_varchar_as_decimal(current_row.VAR00020);
                --Monto de Ingreso por Intereses (VAR00021)
                new_ficha_persona.monto_ingreso_intereses:=cast_varchar_as_decimal(current_row.VAR00021);
                --Monto de Ingreso por ayuda familiar pais(VAR00022)
                new_ficha_persona.monto_ingreso_ayuda_fam_pais:=cast_varchar_as_decimal(current_row.VAR00022);
                --Monto de Ingreso por ayuda familiar exterior(VAR00023)
                new_ficha_persona.monto_ingreso_ayuda_fam_exter:=cast_varchar_as_decimal(current_row.VAR00023);
                --Monto de Ingreso por jubilacion (VAR00024)
                new_ficha_persona.monto_ingreso_jubilacion:=cast_varchar_as_decimal(current_row.VAR00024);
                --Monto de Ingreso por pensiones (VAR00025)
                new_ficha_persona.monto_ingreso_pensiones:=cast_varchar_as_decimal(current_row.VAR00025);
                --Monto de Ingreso por tekopora (VAR00026)
                new_ficha_persona.monto_ingreso_tekopora:=cast_varchar_as_decimal(current_row.VAR00026);
                --Monto Ingreso por programas (VAR00027)
                new_ficha_persona.monto_ingreso_programas:=cast_varchar_as_decimal(current_row.VAR00027);
                --Monto Ingreso adicional (VAR00028)
                new_ficha_persona.monto_ingreso_adicional:=cast_varchar_as_decimal(current_row.VAR00028);
                --Monto Ingreso total mensual (P92)
                new_ficha_persona.total_ingreso_mensual:=cast_varchar_as_decimal(current_row.P92);
                --Se copia el id de ficha hogar
                new_ficha_persona.id_ficha_hogar:=row_ficha_hogar.id_ficha_hogar;
                --Se inactiva la ficha persona para evitar calcular de nuevo ICV
                new_ficha_persona.es_ficha_persona_inactiva:=1;
                --Si hay que actualizar, se actualiza la ficha hogar
                if actualizar_ficha_hogar=1 then
                    --Indice de Calidad de Vida de Ficha Hogar
                    current_row.icv:=replace(current_row.icv, ',', '.');
                    row_ficha_hogar.indice_calidad_vida:=round(cast (current_row.icv AS numeric), 4);
                    --Se actualiza el icv
                    update ficha_hogar 
                    set indice_calidad_vida=row_ficha_hogar.indice_calidad_vida, 
                    es_ficha_hogar_inactiva=0
                    where id_ficha_hogar=row_ficha_hogar.id_ficha_hogar;
                    --Se inactiva la ficha_hogar
                    update ficha_hogar 
                    set es_ficha_hogar_inactiva=1
                    where id_ficha_hogar=row_ficha_hogar.id_ficha_hogar;
                    actualizar_ficha_hogar:=0;
                end if;
                --Se inserta la ficha persona
                insert into ficha_persona values(new_ficha_persona.*);
                --Se incrementa el numero de insertados
                retorno:=retorno+1;
                --Se registra la inserción en la tabla intermedia
                execute 'update log_imp_per
                         set importado=1,
                         nombre_archivo=E'''||nombre_archivo||''',
                         codigo_archivo=E'''||codigo_archivo||''',
                         fecha_transaccion=current_timestamp 
                         where id_log_imp_per='||current_row.id_log_imp_per;
            --Si no se pudo insertar el registro se marca el motivo
        exception when others then
            mensaje:='Error : '||SQLERRM;
            execute 'update log_imp_per
                     set importado=0,
                     nombre_archivo=E'''||nombre_archivo||''',
                     codigo_archivo=E'''||codigo_archivo||''',
                     fecha_transaccion=current_timestamp,
                     observacion='''||mensaje||''' where id_log_imp_per = '||current_row.id_log_imp_per||';';
            continue;
         end;
    end loop;
    return retorno;    
end;
$$ language plpgsql;