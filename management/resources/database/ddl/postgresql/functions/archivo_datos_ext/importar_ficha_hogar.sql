-- 
-- Este procedimiento importa un archivo de datos externos, particularmente un archivo que contiene fichas hogar
-- @param nombre_archivo: Nombre del archivo a importar
-- @param codigo_Archivo: Codigo del archivo a importar. 
-- En este proceso el codigo es particularmente importante, pues permite ubicar el id del proveedor de datos externos
-- @returns numero de registros importados
--
create or replace function importar_ficha_hogar(nombre_archivo varchar,codigo_archivo varchar) returns integer as $$
declare
    retorno integer:=0;
    path_domain varchar:='';
    path_archivos_externos varchar:='';
    path_archivo_importar varchar:='';
    nombre_tabla varchar:='archivo_datos_ext';
    current_row record;
    new_ficha_hogar ficha_hogar%ROWTYPE;
    id_tabla varchar:='id_';
    texto_fecha character varying;
    texto_formulario character varying;
    mensaje character varying;
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
    --Se cambia la codificación para importar caracteres latinos
    set client_encoding to LATIN1;
     --Se copia el contenido del archivo en la tabla temporal
    execute' copy log_imp_hog
            (  P20D, P20M, P20A,
                P17, P18, VAR00001, P19, observaciones, UTM, GPS, ORDEN, COORDX, P01A, P01B, 
                P01C, P01D, P02, P03, P04, P05, P06, P08, P07, P09, P14, P15, P16, P24, P25,
                P26, P27, P27E, P28A, P28B, P29, P30, P31, P32, P33, P34, P35, P36, P37, Nro_celular,
                P38, Nro_linea_baja, P391, P392, P393, P394, P395, P396, P397,
                P42N, P42CI, letra_ci, P43, VAR00002, VAR00003, VAR00004, P104) 
            from E'''|| path_archivo_importar||''' with delimiter as '';'' csv header;';
    set client_encoding to UTF8;

    for current_row in select * from log_imp_hog 
                        where importado is null loop
        begin
            --Reiniciar los valores de la nueva ficha para cada registro a importar
            new_ficha_hogar.id_ficha_hogar:=bigintid();
            new_ficha_hogar.version_ficha_hogar:=0;            
            --OJO--new_ficha_hogar.codigo_ficha_hogar:=extract_codigo_ficha_hogar(current_row.p01a,current_row.p01b,current_row.p01c,current_row.p01d,current_row.p02,current_row.p03);
            --Unir dia (P20D), mes (P20M) y anyo (P20A) en timestamp
            new_ficha_hogar.fecha_entrevista:=concat_fecha(current_row.P20D,current_row.P20M,current_row.P20A);
            --Buscar a los funcionarios responsables (si los hay)
            --Funcionario censista (p17)
            select f.id_funcionario into new_ficha_hogar.id_funcionario_censista  from funcionario f where f.codigo_funcionario=current_row.P17;
            if not found then
                new_ficha_hogar.id_funcionario_censista:=null;
            end if;
            --Funcionario supervisor (p18)
            select f.id_funcionario into new_ficha_hogar.id_funcionario_supervisor  from funcionario f where f.codigo_funcionario=current_row.P18;
            if not found then
                new_ficha_hogar.id_funcionario_supervisor:=null;
            end if;
            --Funcionario decodificador (VAR00001)
            select f.id_funcionario into new_ficha_hogar.id_funcionario_critico_deco  from funcionario f where f.codigo_funcionario=current_row.VAR00001;
            if not found then
                new_ficha_hogar.id_funcionario_critico_deco:=null;
            end if;
            --Observaciones (observaciones)
            new_ficha_hogar.observaciones:=current_row.observaciones;
            --Se convierte el texto recibido en huso utm (UTM)
            new_ficha_hogar.huso_utm:=extract_huso_utm(current_row.UTM);
            --Se convierte el texto recibido en codigo de gps (GPS)
            new_ficha_hogar.franja_utm:=extract_franja_utm(current_row.GPS);
            --Se convierte el texto recibido en distancia_este_utm (ORDEN)
            new_ficha_hogar.distancia_este_utm:=extract_distancia(current_row.ORDEN);
            --Se convierte el texto recibido en distancia_este_utm (COORDX)
            new_ficha_hogar.distancia_norte_utm:=extract_distancia(current_row.COORDX);
            --Se ubica el id del departamento (P01A)
            new_ficha_hogar.id_departamento:= extract_id_departamento(current_row.P01A);
            if new_ficha_hogar.id_departamento is null then
                raise exception 'Numero de Departamento No puede ser nulo';
            end if;
            --Se ubica el id del distrito (P01B)
            new_ficha_hogar.id_distrito:= extract_id_distrito(current_row.P01A,current_row.P01B);
            if new_ficha_hogar.id_distrito is null then
                raise exception 'Numero de Distrito No puede ser nulo';
            end if;
            --Se ubica el id del barrio (P01C)
            new_ficha_hogar.id_barrio:= extract_id_barrio(current_row.P01A,current_row.P01B,current_row.P01C);
            if new_ficha_hogar.id_barrio is null then
                 raise exception 'Numero de Barrio No puede ser nulo';
            end if;
            --Se ubica el numero de ficha (P01D)
            new_ficha_hogar.numero_formulario:= cast_varchar_as_integer(current_row.P01D);
            if new_ficha_hogar.numero_formulario is null then
                raise exception 'Numero de Formulario No puede ser nulo';
            end if;
            --Se convierte el texto recibido en distancia_este_utm (P02)
            new_ficha_hogar.numero_vivienda:=extract_numero_vivienda(current_row.P02);
            if new_ficha_hogar.numero_vivienda is null then
                raise exception 'Numero de Vivienda No puede ser nulo';
            end if;
            --Se convierte el texto recibido en distancia_este_utm (P03)
            new_ficha_hogar.numero_hogar:=extract_numero_hogar(current_row.P03);
            if new_ficha_hogar.numero_hogar is null then
                raise exception 'Numero de Hogar No puede ser nulo';
            end if;
            --Se convierte el texto recibido en tipo de area
            new_ficha_hogar.numero_tipo_area:=extract_tipo_area(current_row.P06);
            --Se extrae el nombre de la manzana
            new_ficha_hogar.manzana:= current_row.P08;
            --Se extrae la dirección (P09)
            new_ficha_hogar.direccion:=current_row.P09;
            --Se convierte el texto recibido en total personas (P14)
            new_ficha_hogar.total_personas:=cast_varchar_as_integer(current_row.P14);
            --Se convierte el texto recibido en total hombres (P15)
            new_ficha_hogar.total_hombres:=cast_varchar_as_integer(current_row.P15);
            --Se convierte el texto recibido en total hombres (P16)
            new_ficha_hogar.total_mujeres:=cast_varchar_as_integer(current_row.P16);
            -- Numero de material paredes exteriores (P24)
            new_ficha_hogar.numero_tipo_mat_paredes:=extract_tipo_mat_paredes(current_row.P24);
            -- Tipo de material de piso (P25) 
            new_ficha_hogar.numero_tipo_mat_piso:=extract_tipo_mat_piso(current_row.P25);
            -- Tipo de material de techo (P26)
            new_ficha_hogar.numero_tipo_mat_techo:=extract_tipo_mat_techo(current_row.P26);
            -- Tipo de ocupación de vivienda (P27)
            new_ficha_hogar.numero_tipo_ocupacion_viv:=extract_tipo_ocupacion(current_row.P27);
            -- Otro tipo de ocupación de vivienda (27E)
            new_ficha_hogar.otro_tipo_ocupacion_viv:=extract_otro_tipo_ocupacion(current_row.P27,current_row.P27E);
            -- Numero de piezas (P28A)
            new_ficha_hogar.cantidad_piezas:=cast_varchar_as_integer(current_row.P28A);
            -- Numero de dormitorios (P28B)
            new_ficha_hogar.cantidad_dormitorios:=cast_varchar_as_integer(current_row.P28B);
            -- Disponibilidad de cocina (P29)
            new_ficha_hogar.numero_siono_pieza_cocina:=extract_siono(current_row.P29);
            -- Tipo de combustible de cocina (P30)
            new_ficha_hogar.numero_tipo_combustible:=extract_tipo_combustible(current_row.P30);
            -- Tipo de pieza de baño (P31)
            new_ficha_hogar.numero_tipo_pieza_bano:=extract_tipo_pieza_bano(current_row.P31);
            -- Tipo de servicio sanitario (P32)
            new_ficha_hogar.numero_tipo_servicio_san:=extract_tipo_servicio_san(current_row.P32);
            -- Tipo de servicio de agua (P33)
            new_ficha_hogar.numero_tipo_servicio_agua:=extract_tipo_servicio_agua(current_row.P33);
            -- Tipo de abastecimiento de agua (P34)
            new_ficha_hogar.numero_tipo_aba_agua:=extract_tipo_abastecimiento(current_row.P34);
            -- Disponibilidad de corriente electrica (P35)
            new_ficha_hogar.numero_siono_corriente_elec:=extract_siono(current_row.P35);
            -- Tipo de desecho de basura (P36)
            new_ficha_hogar.numero_tipo_desecho_bas:=extract_tipo_desecho_bas(current_row.P36);
            -- Disponibilidad de telefono celular (P37)
            new_ficha_hogar.numero_siono_telefono_celular:=extract_siono(current_row.P37);
            -- Numero de telefono celular (Nro_celular)
            new_ficha_hogar.numero_telefono_celular:=extract_telefono(current_row.P37,current_row.Nro_celular);
            -- Disponibilidad de linea baja (P38)
            new_ficha_hogar.numero_siono_tlf_linea_baja:=extract_siono(current_row.P38);
            -- Numero de linea baja (Nro_linea_baja)
            new_ficha_hogar.numero_telefono_linea_baja:=extract_telefono(current_row.P38,current_row.Nro_linea_baja);
            -- Los valores de estas variables no son 1 y 0, sino dependiendo de la respuesta tienen un valor, por eso se transforman a 1 y 6
            -- Disponibilidad heladera (P391)
            new_ficha_hogar.numero_siono_disp_heladera:=extract_disponibilidad_heladera(current_row.P391);
            -- Disponibilidad lavarropas (P392)
            new_ficha_hogar.numero_siono_disp_lavarropas:=extract_disponibilidad_lavarropas(current_row.P392);
            -- Disponibilidad termo (P393)
            new_ficha_hogar.numero_siono_disp_termo:=extract_disponibilidad_termo(current_row.P393);
            -- Disponibilidad aire acondicionado (P394)
            new_ficha_hogar.numero_siono_disp_aire_acon:=extract_disponibilidad_aire(current_row.P394);
            -- Disponibilidad automovil (P395)
            new_ficha_hogar.numero_siono_disp_automovil:=extract_disponibilidad_automovil(current_row.P395);
            -- Disponibilidad camion (P396)
            new_ficha_hogar.numero_siono_disp_camion:=extract_disponibilidad_camion(current_row.P396);
            -- Disponibilidad motocicleta (P397)
            new_ficha_hogar.numero_siono_disp_motocicleta:=extract_disponibilidad_motocicleta(current_row.P397);
            --Se extrae el nombre del jefe del hogar (P42N)
            new_ficha_hogar.nombre_jefe_hogar:=current_row.P42N;
            --Se extrae la cedula del jefe del hogar (P42CI)
            new_ficha_hogar.numero_cedula_jefe_hogar:=extract_numero_from_cedula(current_row.P42CI);
            --Se extrae la letra de la cedula (Si la tiene en P42CI o en letra_ci)
            if current_row.P43 is not null then
                new_ficha_hogar.letra_cedula_jefe_hogar:=current_row.letra_ci;
            else
                new_ficha_hogar.letra_cedula_jefe_hogar:=extract_letra_from_cedula(current_row.P42CI);
            end if;
            --Se extrae el orden de identificacion del jefe del hogar (P43)
            new_ficha_hogar.numero_orden_iden_jefe_hogar:=current_row.P43;
            --Se extrae el nombre del respondente (VAR00002)
            new_ficha_hogar.nombre_respondente:=current_row.VAR00002;
            --Se extrae la cedula del respondente (VAR00003 y VAR00004)
            new_ficha_hogar.numero_cedula_respondente:=cast_varchar_as_integer(current_row.VAR00003);
            --Se extrae la letra de la cedula (Si la tiene en VAR00003 o en VAR00004)
            if current_row.P43 is not null then
                new_ficha_hogar.letra_cedula_jefe_hogar:=current_row.VAR00004;
            else
                new_ficha_hogar.letra_cedula_jefe_hogar:=extract_letra_from_cedula(current_row.VAR00003);
            end if;
            --Se extrae el orden de identificacion del respondente (P104)
            new_ficha_hogar.numero_orden_iden_respondente:=cast_varchar_as_integer(current_row.P104);
            --Se coloca en inactiva=0 se inactivara cuando se importen las fichas persona con icv.
            new_ficha_hogar.es_ficha_hogar_inactiva:=0;
            --Se importa el proveedor de datos externos tomando el proveedor de acuerdo al codigo del archivo a importar
            select a.id_proveedor_dat_ext 
            into new_ficha_hogar.id_proveedor_dat_ext 
            from archivo_datos_ext a 
            where a.codigo_archivo_datos_ext=codigo_archivo;
            --Se inserta el registro importado en la tabla Ficha Hogar
            insert into ficha_hogar values(new_ficha_hogar.*); 
            --Se incrementa el numero de insertados
            retorno:=retorno+1;
            --Se registra la inserción en la tabla intermedia
            execute 'update log_imp_hog
                     set importado=1, 
                     nombre_archivo=E'''||nombre_archivo||''',
                     codigo_archivo=E'''||codigo_archivo||''',
                     fecha_transaccion=current_timestamp 
                     where id_log_imp_hog='||current_row.id_log_imp_hog||';';
            --Si no se pudo insertar el registro se marca el motivo
        exception when others then
            mensaje:='Error : '||SQLERRM;
            execute 'update log_imp_hog
                     set importado=0,
                     nombre_archivo=E'''||nombre_archivo||''',
                     codigo_archivo=E'''||codigo_archivo||''',
                     fecha_transaccion=current_timestamp,
                     observacion='''||mensaje||''' where id_log_imp_hog = '||current_row.id_log_imp_hog||';';
            continue;
        end;
    end loop;
    return retorno;
end;
$$ language plpgsql;