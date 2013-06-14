-- 
-- Este procedimiento importa un archivo de datos externos, particularmente un listado de personas fallecidas
-- @param nombre_archivo: Nombre del archivo a importar
-- @param codigo_Archivo: Codigo del archivo a importar
-- @returns numero de registros importados
--
procedure importar_deudores(nombre_archivo varchar2, codigo_archivo varchar2, retorno out number) as
    --retorno number:=0;
    archivo varchar2(2000);
    codigo varchar2(200);
    nombre_tabla varchar2(200):='csv_log_imp_deu';
    tipo_arch varchar2(10);
    deudor log_imp_deu%rowtype;
    id_persona_act number;
    p_id_persona number;
    p_numero_cedula number;
    p_letra_cedula char:=null;
    observacion_no_elegible varchar2(2000):='';
    mensaje varchar2(2000):='';
    row_objecion objecion_ele_pen%rowtype;
    row_arc_dat_ext archivo_datos_ext%rowtype;
    row_persona persona%rowtype;
    id_proveedor number;
    tipo_archivo number;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
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
            if tipo_arch!='203' then
                msg_string := 'Archivo ' || codigo_archivo || ' NO es de deudores ';
                raise_application_error(err_number, msg_string, true);
            end if;
        end if;
    end if;
    --Se marca el archivo como importado
    update archivo_datos_ext set es_archivo_datos_ext_importado=1, fecha_hora_ultima_importacion=current_timestamp where codigo_archivo_datos_ext=codigo_archivo;
    --Ubicamos el archivo de datos externos
    begin
        select * into row_arc_dat_ext from archivo_datos_ext where codigo_archivo_datos_ext=codigo;
    exception
        when no_data_found then
            null;
    end;
    if not sql%found then
        msg_string:= 'Código de archivo de datos externos inválido';
        raise_application_error(err_number, msg_string, true);
    else
        --Ubicamos el proveedor de datos externos
        id_proveedor:=row_arc_dat_ext.id_proveedor_dat_ext;
        --Determinamos el tipo de archivo
        tipo_archivo:=row_arc_dat_ext.numero_tipo_arc_dat_ext;
    end if;
    --Eliminamos el log anterior de ese archivo (recuerda que hay varios archivos de deudores)
    delete from log_imp_deu l where l.codigo_archivo=codigo;
    --creamos y llenamos la tabla externa csv_log_imp_ids
    sp$100.create_csv_log_imp_deu(nombre_archivo, 'WE8ISO8859P1', '1', ';', '"');
    insert into log_imp_deu
           (id_log_imp_deu,
            cedula,
            primer_nombre,
            segundo_nombre,
            primer_apellido,
            segundo_apellido,
            apellido_casada,
            referencia,
            es_importado,
            codigo_archivo,
            nombre_archivo,
            fecha_hora_transaccion,
            observacion
            )
    select
            utils.bigintid(),
            cedula,
            primer_nombre,
            segundo_nombre,
            primer_apellido,
            segundo_apellido,
            apellido_casada,
            referencia,
            1,
            codigo,
            archivo,
            current_timestamp,
            'Registro cargado. Objeción pendiente por actualizar'
    from csv_log_imp_deu;
    --Se retorna el numero de registros
    select count(id_log_imp_deu) into retorno from log_imp_deu where codigo_archivo=codigo;
   end;