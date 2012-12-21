procedure importar_ficha_hogar(nombre_archivo varchar2, codigo_archivo varchar2, retorno out number) as
    --retorno number:=0;
    nombre_tabla varchar2(200):='csv_log_imp_hog';
    tipo_arch varchar2(10);
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
    end if;
    
    update archivo_datos_ext set es_archivo_datos_ext_importado=1, fecha_hora_ultima_importacion=current_timestamp where codigo_archivo_datos_ext=codigo_archivo;
    --creamos y llenamos la tabla externa csv_log_imp_ids
    sp$100.create_csv_log_imp_hog(nombre_archivo, 'WE8ISO8859P1', '1', ';', '"');
    insert into log_imp_hog
        (
            id_log_imp_hog,
            P20D,
            P20M,
            P20A,
            P17,
            P18,
            VAR00001,
            P19,
            observaciones,
            UTM,
            GPS,
            ORDEN,
            COORDX,
            P01A,
            P01B,
            P01C,
            P01D,
            P02,
            P03,
            P04,
            P05,
            P06,
            P08,
            P07,
            P09,
            P14,
            P15,
            P16,
            P24,
            P25,
            P26,
            P27,
            P27E,
            P28A,
            P28B,
            P29,
            P30,
            P31,
            P32,
            P33,
            P34,
            P35,
            P36,
            P37,
            Nro_celular ,
            P38,
            Nro_linea_baja ,
            P391,
            P392,
            P393,
            P394,
            P395,
            P396,
            P397,
            P42N,
            P42CI,
            letra_ci,
            P43,
            VAR00002,
            VAR00003,
            VAR00004,
            P104
        )
    select
        utils.bigintid(),
        p20d,
        p20m,
        p20a,
        p17,
        p18,
        var00001,
        p19,
        observaciones,
        utm,
        gps,
        orden,
        coordx,
        p01a,
        p01b,
        p01c,
        p01d,
        p02,
        p03,
        p04,
        p05,
        p06,
        p08,
        p07,
        p09,
        p14,
        p15,
        p16,
        p24,
        p25,
        p26,
        p27,
        p27e,
        p28a,
        p28b,
        p29,
        p30,
        p31,
        p32,
        p33,
        p34,
        p35,
        p36,
        p37,
        nro_celular ,
        p38,
        nro_linea_baja ,
        p391,
        p392,
        p393,
        p394,
        p395,
        p396,
        p397,
        p42n,
        p42ci,
        letra_ci,
        p43,
        var00002,
        var00003,
        var00004,
        p104
    from csv_log_imp_hog;
    --importar fichas
    for current_row in (select * from log_imp_hog where es_importado=0)
    loop
        begin
            --Reiniciar los valores de la nueva ficha para cada registro a importar
            new_ficha_hogar.id_ficha_hogar:=utils.bigintid();
            new_ficha_hogar.version_ficha_hogar:=0;
            --OJO--new_ficha_hogar.codigo_ficha_hogar:=extract_codigo_ficha_hogar(current_row.p01a,current_row.p01b,current_row.p01c,current_row.p01d,current_row.p02,current_row.p03);
            --Unir dia (P20D), mes (P20M) y anyo (P20A) en timestamp
            new_ficha_hogar.fecha_entrevista:=sp$utils.concat_fecha(current_row.p20d,current_row.p20m,current_row.p20a);
            --Buscar a los funcionarios responsables (si los hay)
            --Funcionario censista (p17)
            --Funcionario censista (p17)
            begin 
                select f.id_funcionario into new_ficha_hogar.id_funcionario_censista  from funcionario f where f.codigo_funcionario=current_row.P17;
            exception
                when no_data_found then
                new_ficha_hogar.id_funcionario_censista:=null;
            end;
            if not sql%found then
                new_ficha_hogar.id_funcionario_censista:=null;
            end if;
            --Funcionario supervisor (p18)
            begin
                select f.id_funcionario into new_ficha_hogar.id_funcionario_supervisor  from funcionario f where f.codigo_funcionario=current_row.P18;
            exception
                when no_data_found then
                new_ficha_hogar.id_funcionario_supervisor:=null;
            end;
            if not sql%found then
                new_ficha_hogar.id_funcionario_supervisor:=null;
            end if;
            --Funcionario decodificador (VAR00001)
            begin
                select f.id_funcionario into new_ficha_hogar.id_funcionario_critico_deco  from funcionario f where f.codigo_funcionario=current_row.VAR00001;
            
            exception 
                when no_data_found then
                new_ficha_hogar.id_funcionario_critico_deco:=null;
            end ;
            if not sql%found then
                new_ficha_hogar.id_funcionario_supervisor:=null;
            end if;
            --Observaciones (observaciones)
            new_ficha_hogar.observaciones:=current_row.observaciones;
            --Se convierte el texto recibido en huso utm (UTM)
            new_ficha_hogar.huso_utm:=sp$utils.extract_huso_utm(current_row.utm);
            --Se convierte el texto recibido en codigo de gps (GPS)
            new_ficha_hogar.franja_utm:=sp$utils.extract_franja_utm(current_row.gps);
            --Se convierte el texto recibido en distancia_este_utm (ORDEN)
            new_ficha_hogar.distancia_este_utm:=sp$utils.extract_distancia(current_row.orden);
            --Se convierte el texto recibido en distancia_este_utm (COORDX)
            new_ficha_hogar.distancia_norte_utm:=sp$utils.extract_distancia(current_row.coordx);
            --Se ubica el id del departamento (P01A)
            new_ficha_hogar.id_departamento:= sp$utils.extract_id_departamento(current_row.P01A);
            if new_ficha_hogar.id_departamento is null then
                msg_string:= 'Numero de Departamento No puede ser nulo';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se ubica el id del distrito (P01B)
            new_ficha_hogar.id_distrito:= sp$utils.extract_id_distrito(current_row.P01A,current_row.P01B);
            if new_ficha_hogar.id_distrito is null then
                msg_string:= 'Numero de Distrito No puede ser nulo';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se ubica el id del barrio (P01C)
            new_ficha_hogar.id_barrio:= sp$utils.extract_id_barrio(current_row.P01A,current_row.P01B,current_row.P01C);
            if new_ficha_hogar.id_barrio is null then
                 msg_string:= 'Numero de Barrio No puede ser nulo';
                 raise_application_error(err_number, msg_string, true);
            end if;
            --Se ubica el numero de ficha (P01D)
            new_ficha_hogar.numero_formulario:= to_number(current_row.P01D);
            if new_ficha_hogar.numero_formulario is null then
                msg_string:= 'Numero de Formulario No puede ser nulo';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se convierte el texto recibido en distancia_este_utm (P02)
            new_ficha_hogar.numero_vivienda:=sp$utils.extract_numero_vivienda(current_row.P02);
            if new_ficha_hogar.numero_vivienda is null then
                msg_string:= 'Numero de Vivienda No puede ser nulo';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se convierte el texto recibido en distancia_este_utm (P03)
            new_ficha_hogar.numero_hogar:=sp$utils.extract_numero_hogar(current_row.P03);
            if new_ficha_hogar.numero_hogar is null then
                msg_string:='Numero de Hogar No puede ser nulo';
                raise_application_error(err_number, msg_string, true);
            end if;
            --Se convierte el texto recibido en tipo de area
            new_ficha_hogar.numero_tipo_area:=sp$utils.extract_tipo_area(current_row.P06);
            --Se extrae el nombre de la manzana
            new_ficha_hogar.manzana:= current_row.P08;
            --Se extrae la dirección (P09)
            new_ficha_hogar.direccion:=current_row.P09;
            --Se convierte el texto recibido en total personas (P14)
            new_ficha_hogar.total_personas:=to_number(current_row.P14);
            --Se convierte el texto recibido en total hombres (P15)
            new_ficha_hogar.total_hombres:=to_number(current_row.P15);
            --Se convierte el texto recibido en total hombres (P16)
            new_ficha_hogar.total_mujeres:=to_number(current_row.P16);
            -- Numero de material paredes exteriores (P24)
            new_ficha_hogar.numero_tipo_mat_paredes:=sp$utils.extract_tipo_mat_paredes(current_row.P24);
            -- Tipo de material de piso (P25) 
            new_ficha_hogar.numero_tipo_mat_piso:=sp$utils.extract_tipo_mat_piso(current_row.P25);
            -- Tipo de material de techo (P26)
            new_ficha_hogar.numero_tipo_mat_techo:=sp$utils.extract_tipo_mat_techo(current_row.P26);
            -- Tipo de ocupación de vivienda (P27)
            new_ficha_hogar.numero_tipo_ocupacion_viv:=sp$utils.extract_tipo_ocupacion(current_row.P27);
            -- Otro tipo de ocupación de vivienda (27E)
            new_ficha_hogar.otro_tipo_ocupacion_viv:=sp$utils.extract_otro_tipo_ocupacion(current_row.P27,current_row.P27E);
            -- Numero de piezas (P28A)
            new_ficha_hogar.cantidad_piezas:=to_number(current_row.P28A);
            -- Numero de dormitorios (P28B)
            new_ficha_hogar.cantidad_dormitorios:=to_number(current_row.P28B);
            -- Disponibilidad de cocina (P29)
            new_ficha_hogar.numero_siono_pieza_cocina:=sp$utils.extract_siono(current_row.P29);
            -- Tipo de combustible de cocina (P30)
            new_ficha_hogar.numero_tipo_combustible:=sp$utils.extract_tipo_combustible(current_row.P30);
            -- Tipo de pieza de baño (P31)
            new_ficha_hogar.numero_tipo_pieza_bano:=sp$utils.extract_tipo_pieza_bano(current_row.P31);
            -- Tipo de servicio sanitario (P32)
            new_ficha_hogar.numero_tipo_servicio_san:=sp$utils.extract_tipo_servicio_san(current_row.P32);
            -- Tipo de servicio de agua (P33)
            new_ficha_hogar.numero_tipo_servicio_agua:=sp$utils.extract_tipo_servicio_agua(current_row.P33);
            -- Tipo de abastecimiento de agua (P34)
            new_ficha_hogar.numero_tipo_aba_agua:=sp$utils.extract_tipo_abastecimiento(current_row.P34);
            -- Disponibilidad de corriente electrica (P35)
            new_ficha_hogar.numero_siono_corriente_elec:=sp$utils.extract_siono(current_row.P35);
            -- Tipo de desecho de basura (P36)
            new_ficha_hogar.numero_tipo_desecho_bas:=sp$utils.extract_tipo_desecho_bas(current_row.P36);
            -- Disponibilidad de telefono celular (P37)
            new_ficha_hogar.numero_siono_telefono_celular:=sp$utils.extract_siono(current_row.P37);
            -- Numero de telefono celular (Nro_celular)
            new_ficha_hogar.numero_telefono_celular:=sp$utils.extract_telefono(current_row.P37,current_row.Nro_celular);
            -- Disponibilidad de linea baja (P38)
            new_ficha_hogar.numero_siono_tlf_linea_baja:=sp$utils.extract_siono(current_row.P38);
            -- Numero de linea baja (Nro_linea_baja)
            new_ficha_hogar.numero_telefono_linea_baja:=sp$utils.extract_telefono(current_row.P38,current_row.Nro_linea_baja);
            -- Los valores de estas variables no son 1 y 0, sino dependiendo de la respuesta tienen un valor, por eso se transforman a 1 y 6
            -- Disponibilidad heladera (P391)
            new_ficha_hogar.numero_siono_disp_heladera:=sp$utils.extract_disp_heladera(current_row.P391);
            -- Disponibilidad lavarropas (P392)
            new_ficha_hogar.numero_siono_disp_lavarropas:=sp$utils.extract_dispo_lavarropas(current_row.P392);
            -- Disponibilidad termo (P393)
            new_ficha_hogar.numero_siono_disp_termo:=sp$utils.extract_dispo_termo(current_row.P393);
            -- Disponibilidad aire acondicionado (P394)
            new_ficha_hogar.numero_siono_disp_aire_acon:=sp$utils.extract_dispo_aire(current_row.P394);
            -- Disponibilidad automovil (P395)
            new_ficha_hogar.numero_siono_disp_automovil:=sp$utils.extract_dispo_auto(current_row.P395);
            -- Disponibilidad camion (P396)
            new_ficha_hogar.numero_siono_disp_camion:=sp$utils.extract_dispo_camion(current_row.P396);
            -- Disponibilidad motocicleta (P397)
            new_ficha_hogar.numero_siono_disp_motocicleta:=sp$utils.extract_dispo_motocicleta(current_row.P397);
            --Se extrae el nombre del jefe del hogar (P42N)
            new_ficha_hogar.nombre_jefe_hogar:=current_row.P42N;
            --Se extrae la cedula del jefe del hogar (P42CI)
            new_ficha_hogar.numero_cedula_jefe_hogar:=sp$utils.extract_numero_from_cedula(current_row.P42CI);
            if current_row.P43 is not null then
                new_ficha_hogar.letra_cedula_jefe_hogar:=current_row.letra_ci;
            else
                new_ficha_hogar.letra_cedula_jefe_hogar:=sp$utils.extract_letra_from_cedula(current_row.P42CI);
            end if;
            --Se extrae el orden de identificacion del jefe del hogar (P43)
            new_ficha_hogar.numero_orden_iden_jefe_hogar:=to_number(current_row.P43);
            --Se extrae el nombre del respondente (VAR00002)
            new_ficha_hogar.nombre_respondente:=current_row.VAR00002;
            --Se extrae la cedula del respondente (VAR00003 y VAR00004)
            new_ficha_hogar.numero_cedula_respondente:=to_number(current_row.VAR00003);
            --Se extrae la letra de la cedula (Si la tiene en VAR00003 o en VAR00004)
            if current_row.P43 is not null then
                new_ficha_hogar.letra_cedula_jefe_hogar:=current_row.VAR00004;
            else
                new_ficha_hogar.letra_cedula_jefe_hogar:=sp$utils.extract_letra_from_cedula(current_row.VAR00003);
            end if;
            --Se extrae el orden de identificacion del respondente (P104)
            new_ficha_hogar.numero_orden_iden_respondente:=to_number(current_row.P104);
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
                    msg_string:= 'Codigo de Archivo Inválido';
                    raise_application_error(err_number, msg_string, true);
            end;
            --Se inserta el registro importado en la tabla Ficha Hogar
            --dbms_output.put_line('Insertando '||new_ficha_hogar.id_ficha_hogar||' '||new_ficha_hogar.codigo_ficha_hogar);
            insert into ficha_hogar values new_ficha_hogar; 
            --Se incrementa el numero de insertados
            retorno:=retorno+1;
            
            update log_imp_hog set es_importado=1, 
                                nombre_archivo=nombre_Archivo, 
                                codigo_archivo=codigo_archivo, 
                                fecha_hora_transaccion= current_timestamp 
            where id_log_imp_hog=current_row.id_log_imp_hog;
             --Si no se pudo insertar el registro se marca el motivo
        exception
                when others then
                    mensaje:='Error '||SQLCODE||'('||SQLERRM||')';
                    update log_imp_hog set es_importado=0, nombre_archivo=nombre_Archivo, codigo_archivo=codigo_archivo, fecha_hora_transaccion= current_timestamp, observacion=mensaje where id_log_imp_hog=current_row.id_log_imp_hog;
                    continue;
        end;
    end loop;
end;