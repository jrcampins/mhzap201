-- 
-- Este procedimiento importa un archivo de datos externos, particularmente un listado de personas fallecidas
-- @param nombre_archivo: Nombre del archivo a importar
-- @param codigo_Archivo: Codigo del archivo a importar
-- @returns numero de registros importados
--
procedure importar_fallecidos(nombre_archivo varchar2, codigo_archivo varchar2, retorno out number) as
    --retorno number:=0;
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
            defuncion)
    select
            utils.bigintid(),
            cedula,
            primer_nombre,
            segundo_nombre,
            primer_apellido,
            segundo_apellido,
            apellido_casada,
            fecha_defuncion
    from csv_log_imp_fal;
    for fallecido in (select * from log_imp_fal where es_importado=0)
    loop
        begin
            id_persona_act:=sp$utils.extract_id_persona(fallecido.cedula,fallecido.primer_nombre,fallecido.segundo_nombre,fallecido.primer_apellido,fallecido.segundo_apellido,fallecido.apellido_casada);
            if id_persona_act is null then
                msg_string:= 'Persona no encontrada';
                raise_application_error(err_number, msg_string, true);
            --Se registra la inserción en la tabla intermedia
            else
                 --Se selecciona la persona
                begin
                    select * into row_persona from persona where id_persona=id_persona_act;
                exception when no_data_found then 
                    null;
                end;
                if not sql%found then
                    msg_string := 'Persona no encontrada';
                    raise_application_error(err_number, msg_string, true);
                end if;
                p_fecha_defuncion:=to_timestamp(fallecido.defuncion,'dd/mm/yyyy');
                mensaje_defuncion:=sp$persona.registrar_cer_defun(row_persona.id_persona,'S/N',p_fecha_defuncion);
                dbms_output.put_line(p_fecha_defuncion||' : '||mensaje_defuncion);
                retorno:=retorno+1;
                --Se registra la inserción en la tabla intermedia
                update log_imp_fal set es_importado=1, 
                       nombre_archivo=nombre_Archivo, 
                       codigo_archivo=codigo_archivo, 
                       fecha_hora_transaccion= current_timestamp 
                where id_log_imp_fal=fallecido.id_log_imp_fal;
            end if;
        --Si no se pudo insertar el registro se marca el motivo
        exception
                when others then
                    mensaje:='Error '||SQLCODE||'('||SQLERRM||')';
                    update log_imp_fal set es_importado=0, nombre_archivo=nombre_Archivo, codigo_archivo=codigo_archivo, fecha_hora_transaccion= current_timestamp, observacion=mensaje where id_log_imp_fal=fallecido.id_log_imp_fal;
                    continue;
        end;
    end loop;
end;
        