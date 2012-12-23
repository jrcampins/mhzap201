--Descripción: Este procedimiento importa todos los archivos de datos externos cargados en el sistema 
--actualizando aquellos que no hayan sido importados
--@return: mensaje indicando el numero de archivos importados
--
function importar_archivos_ext(param varchar2) return varchar2 is
    mensaje varchar2(2000):='';
    mensaje_retorno varchar2(2000):='';
    total number:=0;
    total_importados number:=0;
    total_no_importados number :=0;
    total_errores number:=0;

    type arc_imp is record(
        id_archivo_datos_ext number,
        cod_tipo_arc varchar2(255),
        num_tipo_arc number,
        nombre_proveedor_dat_ext varchar2(255),
        codigo_proveedor_dat_ext varchar2(255),
        codigo_archivo_dat_ext varchar2(255),
        nombre_archivo_dat_ext varchar2(255)); 
    type cons_arc_imp is table of arc_imp;
    vista_arc cons_arc_imp;
    type log_proceso is table of log_pro_imp_arc_ext%rowtype;
    table_log log_proceso;
    reg log_pro_imp_arc_ext%rowtype;
    id_reg number;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    --Se seleccionan los archivos a importar,
    --El orden influye sobre la importación, por ejemplo las fichas_persona 
    --deben importarse luego de las fichas_hogar
    execute immediate 'select ae.id_archivo_datos_ext,
                              ta.codigo_tipo_arc_dat_ext,
                              ta.numero_tipo_arc_dat_ext,
                              pd.nombre_proveedor_dat_ext,
                              pd.codigo_proveedor_dat_ext,
                              ae.codigo_archivo_datos_ext,
                              ae.nombre_archivo_datos_ext
        from archivo_datos_ext ae
        left join tipo_arc_dat_ext ta 
        on ae.numero_tipo_arc_dat_ext=ta.numero_tipo_arc_dat_ext
        left join proveedor_dat_ext pd
        on ae.id_proveedor_dat_ext=pd.id_proveedor_dat_ext
        where ae.es_archivo_datos_ext_importado=0 and
        ae.es_archivo_datos_ext_inactivo=0 and
        ae.nombre_archivo_datos_ext is not null 
        order by ae.numero_tipo_arc_dat_ext'
        bulk collect into vista_arc;


    for i in vista_arc.first..vista_arc.last loop
        id_reg:=utils.bigintid();
        insert into log_pro_imp_arc_ext values (
            id_reg,
            0, -- version
            vista_arc(i).id_archivo_datos_ext,
            vista_arc(i).cod_tipo_arc,
            vista_arc(i).num_tipo_arc,
            vista_arc(i).nombre_proveedor_dat_ext,
            vista_arc(i).codigo_proveedor_dat_ext,
            vista_arc(i).codigo_archivo_dat_ext,
            vista_arc(i).nombre_archivo_dat_ext,
            0,
            null,
            current_timestamp);
    end loop;
    execute immediate 'select * from log_pro_imp_arc_ext where es_importado=0 '
        bulk collect into table_log;        
    for i in table_log.first..table_log.last loop
        begin
            total:=total+1;
            mensaje:=sp$archivo_datos_ext.importar(table_log(i).id_archivo_datos_ext);
            if mensaje like 'Registros %' then
                update log_pro_imp_arc_ext set es_importado=1, observacion=mensaje ,fecha_hora_transaccion=current_timestamp where id_log_pro_imp_arc_ext= table_log(i).id_log_pro_imp_arc_ext;
                total_importados:=total_importados+1;
            else
                update log_pro_imp_arc_ext set es_importado=0, observacion=mensaje ,fecha_hora_transaccion=current_timestamp where id_log_pro_imp_arc_ext= table_log(i).id_log_pro_imp_arc_ext;
                total_no_importados:=total_no_importados+1;
            end if;
        exception when others then
            mensaje:=SQLERRM;
            update log_pro_imp_arc_ext set es_importado=0, observacion= mensaje ,fecha_hora_transaccion= current_timestamp where id_log_pro_imp_arc_ext= table_log(i).id_log_pro_imp_arc_ext;
            total_errores:=total_errores+1;
            continue;
        end;
    end loop;
    mensaje_retorno:='Total: '||total||', Importados: '||total_importados||', No Importados: '||total_no_importados||' Errores: '||total_errores;
    return mensaje_retorno;
end;