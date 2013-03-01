-- 
-- Este procedimiento importa un archivo de datos externos, particularmente un listado de personas fallecidas
-- @param nombre_archivo: Nombre del archivo a importar
-- @param codigo_Archivo: Codigo del archivo a importar
-- @returns numero de registros importados
--
procedure importar_fallecidos(nombre_archivo varchar2, codigo_archivo varchar2, retorno out number) as
    --retorno number:=0;
    archivo varchar2(2000);
    codigo varchar2(200);
    nombre_tabla varchar2(200):='csv_log_imp_fal';
    tipo_arch varchar2(10);
    fallecido log_imp_fal%rowtype;
    id_persona_act number;
    p_id_persona number;
    p_numero_cedula number;
    p_letra_cedula char:=null;
    p_fecha_defuncion timestamp;
    row_persona persona%ROWTYPE;
    mensaje_defuncion varchar2(2000):='';
    mensaje varchar2(2000):='';
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
            if tipo_arch!='301' then
                msg_string := 'Archivo ' || codigo_archivo || ' NO es de fallecidos ';
                raise_application_error(err_number, msg_string, true);
            end if;
        end if;
    end if;
    update archivo_datos_ext set es_archivo_datos_ext_importado=1, fecha_hora_ultima_importacion=current_timestamp where codigo_archivo_datos_ext=codigo_archivo;
    --creamos y llenamos la tabla externa csv_log_imp_ids
    sp$100.create_csv_log_imp_fal(nombre_archivo, 'WE8ISO8859P1', '1', ';', '"');
    insert into log_imp_fal
           (id_log_imp_fal,
            cedula,
            primer_nombre,
            segundo_nombre,
            primer_apellido,
            segundo_apellido,
            apellido_casada,
            defuncion,
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
            fecha_defuncion,
            1,
            codigo,
            archivo,
            current_timestamp,
            'Registro cargado. Objeción pendiente por actualizar'
    from csv_log_imp_fal;
    --Se retorna el numero de registros
    select count(cedula) into retorno from csv_log_imp_fal where codigo_archivo=codigo;
end;
        