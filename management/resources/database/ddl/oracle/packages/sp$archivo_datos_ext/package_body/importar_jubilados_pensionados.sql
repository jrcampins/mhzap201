-- 
-- Este procedimiento importa un archivo de datos externos, particularmente un listado de personas fallecidas
-- @param nombre_archivo: Nombre del archivo a importar
-- @param codigo_Archivo: Codigo del archivo a importar
-- @returns numero de registros importados
--
procedure importar_jubilados_pens(nombre_archivo varchar2, codigo_archivo varchar2, retorno out number) as
    --retorno number:=0;
    nombre_tabla varchar2(200):='csv_log_imp_jub';
    tipo_arch varchar2(10);
    jubilado log_imp_jub%rowtype;
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
            if tipo_arch!='202' and  tipo_arch!='205' then
                msg_string := 'Archivo ' || codigo_archivo || ' NO es de jubilados ni de pensionados ';
                raise_application_error(err_number, msg_string, true);
            end if;
        end if;
    end if;
    update archivo_datos_ext set es_archivo_datos_ext_importado=1, fecha_hora_ultima_importacion=current_timestamp where codigo_archivo_datos_ext=codigo_archivo;
    --Ubicamos el archivo de datos externos
    begin
        select * into row_arc_dat_ext from archivo_datos_ext where codigo_archivo_datos_ext=codigo_archivo;
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

    --creamos y llenamos la tabla externa csv_log_imp_ids
    sp$100.create_csv_log_imp_jub(nombre_archivo, 'WE8ISO8859P1', '1', ';', '"');
    insert into log_imp_jub
           (id_log_imp_jub,
            cedula,
            primer_nombre,
            segundo_nombre,
            primer_apellido,
            segundo_apellido,
            apellido_casada,
            tipo_registro)
    select
            utils.bigintid(),
            cedula,
            primer_nombre,
            segundo_nombre,
            primer_apellido,
            segundo_apellido,
            apellido_casada,
            tipo_registro
    from csv_log_imp_jub;
    --Se desactivan todas las objeciones de deuda de ese proveedor
    update objecion_ele_pen
    set es_objecion_ele_pen_inactiva=1,
    fecha_ultima_actualizacion=current_timestamp
    where numero_tipo_obj_ele_pen=22
    or numero_tipo_obj_ele_pen=25
    and id_proveedor_dat_ext=id_proveedor;
    --
    for jubilado in (select * from log_imp_jub where es_importado=0)
    loop
        begin
            id_persona_act:=sp$utils.extract_id_persona(jubilado.cedula,jubilado.primer_nombre,jubilado.segundo_nombre,jubilado.primer_apellido,jubilado.segundo_apellido,jubilado.apellido_casada);
            if id_persona_act is null then
                msg_string:= 'Persona no encontrada';
                raise_application_error(err_number, msg_string, true);
            --Se registra la inserción en la tabla intermedia
            else
                ----dbms_output.put_line('buscando persona');
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
                --Se verifica si ya existe una objecion
                if upper(jubilado.tipo_registro) like '%PENSIONADO%' then
                    --Se verifica si ya existe una objecion
                    begin
                        select * into row_objecion from objecion_ele_pen where id_persona=row_persona.id_persona and numero_tipo_obj_ele_pen=25 and id_proveedor_dat_ext=id_proveedor;
                    exception when no_data_found then 
                        null;
                    end;
                    if sql%found then
                        ----dbms_output.put_line('Pensionado');
                        --Si consigue la objecion la mantiene activa
                        update objecion_ele_pen
                        set es_objecion_ele_pen_inactiva=0,
                        fecha_ultima_actualizacion=current_timestamp
                        where id_objecion_ele_pen=row_objecion.id_objecion_ele_pen;
                    else
                        --Si no la consigue, la inserta como nueva
                        row_objecion.id_objecion_ele_pen:=utils.bigintid();
                        row_objecion.version_objecion_ele_pen:=0;
                        row_objecion.id_persona:=row_persona.id_persona;
                        row_objecion.id_proveedor_dat_ext:=id_proveedor;
                        row_objecion.numero_tipo_obj_ele_pen:=25;
                        row_objecion.es_objecion_ele_pen_inactiva:=0;
                        row_objecion.fecha_ultima_actualizacion:=current_timestamp;
                        row_objecion.nombre_archivo_ultima_act:=nombre_archivo;
                        insert into objecion_ele_pen values row_objecion;
                    end if;
                elsif upper(jubilado.tipo_registro) like '%JUBILADO%' then
                    ----dbms_output.put_line('Jubilado');
                --Se verifica si ya existe una objecion
                    begin
                        select * into row_objecion from objecion_ele_pen where id_persona=row_persona.id_persona and numero_tipo_obj_ele_pen=22 and id_proveedor_dat_ext=id_proveedor;
                    exception when no_data_found then 
                        null;
                    end;
                    if sql%found then
                        --Si consigue la objecion la mantiene activa
                        update objecion_ele_pen
                        set es_objecion_ele_pen_inactiva=0,
                        fecha_ultima_actualizacion=current_timestamp
                        where id_objecion_ele_pen=row_objecion.id_objecion_ele_pen;
                    else
                        --Si no la consigue, la inserta como nueva
                        row_objecion.id_objecion_ele_pen:=utils.bigintid();
                        row_objecion.version_objecion_ele_pen:=0;
                        row_objecion.id_persona:=row_persona.id_persona;
                        row_objecion.id_proveedor_dat_ext:=id_proveedor;
                        row_objecion.numero_tipo_obj_ele_pen:=22;
                        row_objecion.es_objecion_ele_pen_inactiva:=0;
                        row_objecion.fecha_ultima_actualizacion:=current_timestamp;
                        row_objecion.nombre_archivo_ultima_act:=nombre_archivo;
                        insert into objecion_ele_pen values row_objecion;
                    end if;
                else
                    msg_string := 'Tipo de registro inválido';
                    raise_application_error(err_number, msg_string, true);
                end if;
                --Se incrementa el número de importados
                retorno:=retorno+1;
                ----dbms_output.put_line('retorno'||retorno);
                --Se registra la inserción en la tabla intermedia
                update log_imp_jub set es_importado=1, 
                       nombre_archivo=nombre_Archivo, 
                       codigo_archivo=codigo_archivo, 
                       fecha_hora_transaccion= current_timestamp 
                where id_log_imp_jub=jubilado.id_log_imp_jub;
            end if;
        --Si no se pudo insertar el registro se marca el motivo
        exception
                when others then
                    mensaje:='Error '||SQLCODE||'('||SQLERRM||')';
                    update log_imp_jub set es_importado=0, nombre_archivo=nombre_Archivo, codigo_archivo=codigo_archivo, fecha_hora_transaccion= current_timestamp, observacion=mensaje where id_log_imp_jub=jubilado.id_log_imp_jub;
                    continue;
        end;
    end loop;
end;
        