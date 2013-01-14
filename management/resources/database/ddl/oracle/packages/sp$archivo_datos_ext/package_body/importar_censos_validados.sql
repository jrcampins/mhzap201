-- 
-- Este procedimiento importa un archivo de datos externos, particularmente un listado de censos validados
-- @param nombre_archivo: Nombre del archivo a importar
-- @param codigo_Archivo: Codigo del archivo a importar
-- @returns numero de registros importados
--
procedure importar_censos_validados(nombre_archivo varchar2, codigo_archivo varchar2, retorno out number) as
    --retorno number:=0;
    nombre_tabla varchar2(200):='csv_log_imp_cen';
    tipo_arch varchar2(10);
    censo log_imp_cen%rowtype;
    id_persona_act number;
    p_id_persona number;
    p_numero_cedula number;
    p_letra_cedula char:=null;
    observacion_no_elegible varchar2(2000):='';
    mensaje varchar2(2000):='';
    row_objecion objecion_ele_pen%rowtype;
    row_arc_dat_ext archivo_datos_ext%rowtype;
    row_potencial_ben potencial_ben%rowtype;
    id_potencial_ben number;
    id_funcionario number;
    id_proveedor number;
    tipo_archivo number;
    icv_pot_ben number;
    icv_comparar number;
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
            if tipo_arch!='501' then
                msg_string := 'Archivo ' || codigo_archivo || ' NO es de censos validados ';
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
    sp$100.create_csv_log_imp_cen(nombre_archivo, 'WE8ISO8859P1', '1', ';', '"');
    insert into log_imp_cen
           (id_log_imp_cen,
            barrio,
            direccion,
            telefono,
            primer_nombre,
            segundo_nombre,
            primer_apellido,
            segundo_apellido,
            edad_a_la_fecha,
            sexo,
            parentesco,
            cedula,
            nombre_jefe_hogar,
            cedula_jefe_hogar,
            icv,
            validado,
            observaciones,
            funcionario,
            causa_invalidacion)
    select
            utils.bigintid(),
            barrio,
            direccion,
            telefono,
            primer_nombre,
            segundo_nombre,
            primer_apellido,
            segundo_apellido,
            edad_a_la_fecha,
            sexo,
            parentesco,
            cedula,
            nombre_jefe_hogar,
            cedula_jefe_hogar,
            icv,
            validado,
            observaciones,
            funcionario,
            causa_invalidacion
    from csv_log_imp_cen;
    --
    for censo in (select * from log_imp_cen where es_importado=0)
    loop
        begin
            id_potencial_ben:=sp$utils.extract_id_pot_ben(censo.cedula,censo.primer_nombre,censo.segundo_nombre,censo.primer_apellido,censo.segundo_apellido);
            if id_potencial_ben=0 then
                msg_string := 'Potencial Beneficiario No encontrado ';
                raise_application_error(err_number, msg_string, true);
            else
                begin
                    select * into row_potencial_ben from potencial_ben p where p.id_potencial_ben=id_potencial_ben;
                exception
                    when no_data_found then null;
                end;
                --Si no se encuentra un registro, no se hace nada
                if not sql%found then
                    msg_string:='Potencial beneficiario no existe';
                    raise_application_error(err_number, msg_string, true);
                end if;
                if row_potencial_ben.id_ficha_persona is not null then
                    begin
                        select fh.indice_calidad_vida into icv_pot_ben from ficha_persona fp left join ficha_hogar fh on fp.id_ficha_hogar=fh.id_ficha_hogar;
                    exception
                        when no_data_found then null;
                    end;
                    if not sql%found then
                        msg_string:='Error obteniendo ICV de ficha hogar';
                        raise_application_error(err_number, msg_string, true);
                    end if;
                    icv_comparar:=to_number(replace(censo.icv,',','.'),'9999.99');
                    if icv_pot_ben <> icv_comparar then
                        msg_string:='ICV de ficha hogar NO coincide con valor de archivo';
                        raise_application_error(err_number, msg_string, true);
                    end if;
                    id_funcionario:=sp$utils.extract_id_funcionario(censo.funcionario);
                    if(upper(censo.validado)='SI') then
                        mensaje:=sp$potencial_ben.validar_censo(id_potencial_ben,id_funcionario,censo.observaciones);
                    else
                        mensaje:=sp$potencial_ben.invalidar_censo(id_potencial_ben,id_funcionario,99,censo.observaciones,'Censo invalidado mediante archivo externo');
                    end if;
                else
                    msg_string:='Potencial beneficiario no tiene Ficha Hogar';
                    raise_application_error(err_number, msg_string, true);
                end if;
            end if;
            --Se incrementa el número de importados
            retorno:=retorno+1;
            --Se registra la inserción en la tabla intermedia
            update log_imp_cen set es_importado=1, 
                   nombre_archivo=nombre_archivo, 
                   codigo_archivo=codigo_archivo, 
                   fecha_hora_transaccion= current_timestamp 
            where id_log_imp_cen=censo.id_log_imp_cen;
        --Si no se pudo insertar el registro se marca el motivo
        exception
                when others then
                    mensaje:='Error '||SQLCODE||'('||SQLERRM||')';
                    update log_imp_cen set es_importado=0, nombre_archivo=nombre_Archivo, codigo_archivo=codigo_archivo, fecha_hora_transaccion= current_timestamp, observacion=mensaje where id_log_imp_cen=censo.id_log_imp_cen;
                    continue;
        end;
     end loop;
end;
        