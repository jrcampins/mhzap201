procedure importar_ficha_hogar_dgeec(nombre_archivo varchar2, codigo_archivo varchar2, retorno out number) as
    --retorno number:=0;
    archivo varchar2(2000);
    codigo varchar2(200);
    nombre_tabla varchar2(200):='csv_log_imp_hog_eec';
    tipo_arch varchar2(10);
    proveedor varchar2(10);
    numero_cedula number;
    letra_cedula char;
    current_row log_imp_hog%rowtype;
    new_ficha_hogar ficha_hogar%rowtype;
    mensaje varchar2(2000):='';
    array_nombres sp$utils.t_array;
    array_apellidos sp$utils.t_array;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    texto_fecha varchar2(100);
    texto_formulario varchar2(100);
begin
    archivo:=nombre_archivo;
    codigo:=codigo_archivo;
    retorno:=0;
    if nombre_archivo is null then
        msg_string := 'archivo no existe';
        raise_application_error(err_number, msg_string, true);
    end if;
    if codigo_archivo is null then
        msg_string := 'codigo de archivo no existe';
        raise_application_error(err_number, msg_string, true);
    else
        begin
            select numero_tipo_arc_dat_ext into tipo_arch from archivo_datos_ext where codigo_archivo_datos_ext=codigo_archivo;
        exception
            when no_data_found then
            msg_string := 'Archivo ' || codigo_archivo || ' no existe ';
            raise_application_error(err_number, msg_string, true);
        end;
        if sql%found then
            if tipo_arch!='401' then
                msg_string := 'Archivo ' || codigo_archivo || ' NO es de Ficha Hogar ';
                raise_application_error(err_number, msg_string, true);
            end if;
        end if;
        begin
            select p.codigo_proveedor_dat_ext 
            into proveedor 
            from archivo_datos_ext a 
            left join proveedor_dat_ext p on a.id_proveedor_dat_ext=p.id_proveedor_dat_ext 
            where a.codigo_archivo_datos_ext=codigo_archivo;
        exception
            when no_data_found then
            msg_string := 'Proveedor ' || proveedor || ' no existe ';
            raise_application_error(err_number, msg_string, true);
        end;
        if sql%found then
            if proveedor!='102' then
                msg_string := 'Proveedor ' || proveedor || ' no corresponde al tipo de archivo DGEEC '||codigo_archivo;
                raise_application_error(err_number, msg_string, true);
            end if;
        end if;
    end if;
    
    update archivo_datos_ext set es_archivo_datos_ext_importado=1, fecha_hora_ultima_importacion=current_timestamp where codigo_archivo_datos_ext=codigo_archivo;
    --creamos y llenamos la tabla externa csv_log_imp_ids
    sp$100.create_csv_log_imp_hog_eec(nombre_archivo, 'WE8ISO8859P1', '1', ';', '"');
    insert into log_imp_hog_eec
        (
        id_log_imp_hog_eec,
        dptod ,
	distritod ,
	distripg ,
	area ,
	barrio ,
	manzana ,
	formulario ,
	vivi ,
	hogar ,
	direccion ,
	nro_de ,
	telefono ,
	fecha ,
	dia ,
	mes ,
	ano ,
	v10t ,
	v11 ,
	v12 ,
	v13 ,
	v14 ,
	v15 ,
	v16 ,
	v16_otr ,
	v17a ,
	v17b ,
	v18 ,
	v19 ,
	v20 ,
	v21 ,
	v22 ,
	v23 ,
	v24 ,
	v25 ,
	v26 ,
	v26esp_celular ,
	v27 ,
	v27esp_linea,
	v28_1,
	v28_2,
	v28_3,
	v28_4,
	v28_5,
	v28_6,
	v28_7,
	v28_8,
	v29nombre_jefe,
	cedulajefe,
	var00001
        )
    select
        utils.bigintid(),
        dptod ,
	distritod ,
	distripg ,
	area ,
	barrio ,
	manzana ,
	formulario ,
	vivi ,
	hogar ,
	direccion ,
	nro_de ,
	telefono ,
	fecha ,
	dia ,
	mes ,
	ano ,
	v10t ,
	v11 ,
	v12 ,
	v13 ,
	v14 ,
	v15 ,
	v16 ,
	v16_otr ,
	v17a ,
	v17b ,
	v18 ,
	v19 ,
	v20 ,
	v21 ,
	v22 ,
	v23 ,
	v24 ,
	v25 ,
	v26 ,
	v26esp_celular ,
	v27 ,
	v27esp_linea,
	v28_1,
	v28_2,
	v28_3,
	v28_4,
	v28_5,
	v28_6,
	v28_7,
	v28_8,
	v29nombre_jefe,
	cedulajefe,
	var00001
    from csv_log_imp_hog_eec;
    --importar fichas
    for current_row in (select * from log_imp_hog_eec where es_importado=0 and observacion is null)
    loop
        begin
            --Reiniciar los valores de la nueva ficha para cada registro a importar
            new_ficha_hogar.id_ficha_hogar:=utils.bigintid();
            new_ficha_hogar.version_ficha_hogar:=0;
            --OJO--new_ficha_hogar.codigo_ficha_hogar:=extract_codigo_ficha_hogar(current_row.p01a,current_row.p01b,current_row.p01c,current_row.p01d,current_row.p02,current_row.p03);
            --Unir dia (DIA), mes (MES) y anyo (ANO) en timestamp
            new_ficha_hogar.fecha_entrevista:=sp$utils.concat_fecha(replace(current_row.dia,'.'),replace(current_row.mes,'.'),replace(current_row.ano,'.'));
            --Buscar a los funcionarios responsables (si los hay)
            --Funcionario censista NO APARECE
            new_ficha_hogar.id_funcionario_censista:=null;
            --Funcionario supervisor NO APARECE
            new_ficha_hogar.id_funcionario_supervisor:=null;
            --Funcionario decodificador NO APARECE
            new_ficha_hogar.id_funcionario_critico_deco:=null;
            --Observaciones NO APARECE
            new_ficha_hogar.observaciones:=null;
            --Se convierte el texto recibido en huso utm NO APARECE
            new_ficha_hogar.huso_utm:=null;
            --Se convierte el texto recibido en codigo de gps NO APARECE
            new_ficha_hogar.franja_utm:=null;
            --Se convierte el texto recibido en distancia_este_utm NO APARECE
            new_ficha_hogar.distancia_este_utm:=null;
            --Se convierte el texto recibido en distancia_este_utm NO APARECE
            new_ficha_hogar.distancia_norte_utm:=null;
            --Se ubica el id del departamento (dptod)
            new_ficha_hogar.id_departamento:= sp$utils.extract_id_departamento(current_row.dptod);
            if new_ficha_hogar.id_departamento is null then
                msg_string:= 'Numero de Departamento No puede ser nulo';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se ubica el id del distrito (distritod)
            new_ficha_hogar.id_distrito:= sp$utils.extract_id_distrito(current_row.dptod,current_row.distritod);
            if new_ficha_hogar.id_distrito is null then
                msg_string:= 'Numero de Distrito No puede ser nulo';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se ubica el id del barrio (barrio)
            new_ficha_hogar.id_barrio:= sp$utils.extract_id_barrio(current_row.dptod,current_row.distritod,current_row.barrio);
            if new_ficha_hogar.id_barrio is null then
                 msg_string:= 'Numero de Barrio No puede ser nulo';
                 raise_application_error(err_number, msg_string, true);
            end if;
            --Se ubica el numero de ficha (formulario)
            new_ficha_hogar.numero_formulario:= to_number(replace(current_row.formulario,'.'));
            if new_ficha_hogar.numero_formulario is null then
                msg_string:= 'Numero de Formulario No puede ser nulo';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se convierte el texto recibido en vivienda (vivi)
            new_ficha_hogar.numero_vivienda:=sp$utils.extract_numero_vivienda(current_row.vivi);
            if new_ficha_hogar.numero_vivienda is null then
                msg_string:= 'Numero de Vivienda No puede ser nulo';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se convierte el texto recibido en numero_hogar (hogar)
            new_ficha_hogar.numero_hogar:=sp$utils.extract_numero_hogar(current_row.hogar);
            if new_ficha_hogar.numero_hogar is null then
                msg_string:='Numero de Hogar No puede ser nulo';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se convierte el texto recibido en tipo de area (area)
            new_ficha_hogar.numero_tipo_area:=sp$utils.extract_tipo_area(current_row.area);
            --Se extrae el nombre de la manzana
            new_ficha_hogar.manzana:= to_number(replace(current_row.manzana,'.'));
            --Se extrae la dirección (direccion)
            new_ficha_hogar.direccion:=current_row.direccion;
            --Se convierte el texto recibido en total personas (v10T)
            new_ficha_hogar.total_personas:=to_number(replace(current_row.v10t,'.'));
            --Se convierte el texto recibido en total hombres (v11)
            new_ficha_hogar.total_hombres:=to_number(replace(current_row.v11,'.'));
            --Se convierte el texto recibido en total mujeres (v12)
            new_ficha_hogar.total_mujeres:=to_number(replace(current_row.v12,'.'));
            -- Numero de material paredes exteriores (v13)
            new_ficha_hogar.numero_tipo_mat_paredes:=sp$utils.extract_tipo_mat_paredes(current_row.v13);
            -- Tipo de material de piso (v14) 
            new_ficha_hogar.numero_tipo_mat_piso:=sp$utils.extract_tipo_mat_piso(current_row.v14);
            -- Tipo de material de techo (v15)
            new_ficha_hogar.numero_tipo_mat_techo:=sp$utils.extract_tipo_mat_techo(current_row.v15);
            -- Tipo de ocupación de vivienda (v16)
            new_ficha_hogar.numero_tipo_ocupacion_viv:=sp$utils.extract_tipo_ocupacion(current_row.v16);
            -- Otro tipo de ocupación de vivienda (v16_otr)
            new_ficha_hogar.otro_tipo_ocupacion_viv:=sp$utils.extract_otro_tipo_ocupacion(current_row.v16,current_row.v16_otr);
            -- Numero de piezas (V17A)
            new_ficha_hogar.cantidad_piezas:=to_number(replace(current_row.v17a,'.'));
            -- Numero de dormitorios (V17B)
            new_ficha_hogar.cantidad_dormitorios:=to_number(replace(current_row.v17b,'.'));
            -- Disponibilidad de cocina (v18)
            new_ficha_hogar.numero_siono_pieza_cocina:=sp$utils.extract_siono(current_row.v18);
            -- Tipo de combustible de cocina (v19)
            new_ficha_hogar.numero_tipo_combustible:=sp$utils.extract_tipo_combustible(current_row.v19);
            -- Tipo de pieza de baño (v20)
            new_ficha_hogar.numero_tipo_pieza_bano:=sp$utils.extract_tipo_pieza_bano(current_row.v20);
            -- Tipo de servicio sanitario (v21)
            new_ficha_hogar.numero_tipo_servicio_san:=sp$utils.extract_tipo_servicio_san(current_row.v21);
            -- Tipo de servicio de agua (v22)
            new_ficha_hogar.numero_tipo_servicio_agua:=sp$utils.extract_tipo_servicio_agua(current_row.v22);
            -- Tipo de abastecimiento de agua (v23)
            new_ficha_hogar.numero_tipo_aba_agua:=sp$utils.extract_tipo_abastecimiento(current_row.v23);
            -- Disponibilidad de corriente electrica (v24)
            new_ficha_hogar.numero_siono_corriente_elec:=sp$utils.extract_siono(current_row.v24);
            -- Tipo de desecho de basura (v25)
            new_ficha_hogar.numero_tipo_desecho_bas:=sp$utils.extract_tipo_desecho_bas(current_row.v25);
            -- Disponibilidad de telefono celular (v26)
            new_ficha_hogar.numero_siono_telefono_celular:=sp$utils.extract_siono(current_row.v26);
            -- Numero de telefono celular (Nro_celular)
            new_ficha_hogar.numero_telefono_celular:=sp$utils.extract_telefono(current_row.v26,current_row.v26esp_celular);
            -- Disponibilidad de linea baja (P38)
            new_ficha_hogar.numero_siono_tlf_linea_baja:=sp$utils.extract_siono(current_row.v27);
            -- Numero de linea baja (Nro_linea_baja)
            new_ficha_hogar.numero_telefono_linea_baja:=sp$utils.extract_telefono(current_row.v27,current_row.v27esp_linea);
            -- Los valores de estas variables no son 1 y 0, sino dependiendo de la respuesta tienen un valor, por eso se transforman a 1 y 6
            -- Disponibilidad heladera (v28_1)
            new_ficha_hogar.numero_siono_disp_heladera:=sp$utils.extract_disp_heladera(current_row.v28_1);
            -- Disponibilidad lavarropas (v28_2)
            new_ficha_hogar.numero_siono_disp_lavarropas:=sp$utils.extract_dispo_lavarropas(current_row.v28_2);
            -- Disponibilidad termo (v28_3)
            new_ficha_hogar.numero_siono_disp_termo:=sp$utils.extract_dispo_termo(current_row.v28_3);
            -- Disponibilidad aire acondicionado (v28_4)
            new_ficha_hogar.numero_siono_disp_aire_acon:=sp$utils.extract_dispo_aire(current_row.v28_4);
            -- Disponibilidad automovil (v28_5)
            new_ficha_hogar.numero_siono_disp_automovil:=sp$utils.extract_dispo_auto(current_row.v28_5);
            -- Disponibilidad camion (v28_6)
            new_ficha_hogar.numero_siono_disp_camion:=sp$utils.extract_dispo_camion(current_row.v28_6);
            -- Disponibilidad motocicleta (v28_7)
            new_ficha_hogar.numero_siono_disp_motocicleta:=sp$utils.extract_dispo_motocicleta(current_row.v28_7);
            --Se extrae el nombre del jefe del hogar (v29nombre_jefe)
            new_ficha_hogar.nombre_jefe_hogar:=current_row.v29nombre_jefe;
            --Se extrae la cedula del jefe del hogar (cedulajefe)
            new_ficha_hogar.numero_cedula_jefe_hogar:=sp$utils.extract_numero_from_cedula(current_row.cedulajefe);
            --Se extrae el orden de identificacion del jefe del hogar NO APARECE
            new_ficha_hogar.numero_orden_iden_jefe_hogar:=null;
            --Se extrae el nombre del respondente (VAR00002)
            new_ficha_hogar.nombre_respondente:=null;
            --Se extrae la cedula del respondente (VAR00003 y VAR00004)
            new_ficha_hogar.numero_cedula_respondente:=null;
            --Se extrae la letra de la cedula (Si la tiene en VAR00003 o en VAR00004)
            new_ficha_hogar.letra_cedula_jefe_hogar:=null;
            --Se extrae el orden de identificacion del respondente (P104)
            new_ficha_hogar.numero_orden_iden_respondente:=null;
            --Se coloca en inactiva=0 se inactivara cuando se importen las fichas persona con icv.
            new_ficha_hogar.es_ficha_hogar_inactiva:=0;
            --Se importa el proveedor de datos externos tomando el proveedor de acuerdo al codigo del archivo a importar
            begin
                select a.id_proveedor_dat_ext 
                into new_ficha_hogar.id_proveedor_dat_ext 
                from archivo_datos_ext a 
                where a.codigo_archivo_datos_ext=codigo_archivo;
            exception
                when no_data_found then
                    null;
            end;
            if not sql%found then
                msg_string:= 'Codigo de Archivo Inválido';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se inserta el registro importado en la tabla Ficha Hogar
            ----dbms_output.put_line('Insertando '||new_ficha_hogar.id_ficha_hogar||' '||new_ficha_hogar.codigo_ficha_hogar);
            insert into ficha_hogar values new_ficha_hogar; 
            --Se incrementa el numero de insertados
            retorno:=retorno+1;
            
            update log_imp_hog_eec set es_importado=1, 
                                nombre_archivo=archivo, 
                                codigo_archivo=codigo, 
                                fecha_hora_transaccion= current_timestamp 
            where id_log_imp_hog_eec=current_row.id_log_imp_hog_eec;
             --Si no se pudo insertar el registro se marca el motivo
        exception
                when others then
                    mensaje:='Error '||SQLCODE||'('||SQLERRM||')';
                    update log_imp_hog_eec set es_importado=0, nombre_archivo=archivo, codigo_archivo=codigo, fecha_hora_transaccion= current_timestamp, observacion=mensaje where id_log_imp_hog_eec=current_row.id_log_imp_hog_eec;
                    continue;
        end;
    end loop;
end;