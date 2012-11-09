-- 
-- Este procedimiento importa los archivos de datos externos cargados en el sistema
-- @param rastro: Identificador del proceso ejecutado.
-- @returns 0 si no se produjo ningún error
--
create or replace function proceso_importar_archivos_ext(rastro bigint) returns integer as $$
declare
    mensaje varchar:='';
begin
    select proceso_importar_archivos_ext() into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento importa todos los archivos de datos externos cargados en el sistema 
--actualizando aquellos que no hayan sido importados
--@return: mensaje indicando el numero de archivos importados
--
create or replace function proceso_importar_archivos_ext() returns varchar as $$
declare
    mensaje varchar:='';
    mensaje_retorno varchar:='';
    total integer:=0;
    total_importados integer:=0;
    total_no_importados integer :=0;
    total_errores integer:=0;
    current_row log_pro_imp_arc_ext;
begin
    --Se seleccionan los archivos a importar,
    --El orden influye sobre la importación, por ejemplo las fichas_persona 
    --deben importarse luego de las fichas_hogar
    for current_row in select null,ae.id_archivo_datos_ext,
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
        order by ae.numero_tipo_arc_dat_ext
    loop
        current_row.id_log_pro_imp_arc_ext:=bigintid();
        insert into log_pro_imp_arc_ext values (current_row.*);
    end loop;
    for current_row in select * from log_pro_imp_arc_ext where importado is null loop
        begin
            total:=total+1;
            mensaje:=archivo_datos_ext_importar(current_row.id_archivo_datos_ext);
            if mensaje like 'Registros %' then
                execute 'update log_pro_imp_arc_ext
                         set importado=1, 
                         observacion='''||mensaje||
                         ''',fecha_transaccion='''||current_timestamp||
                         ''' where id_log_pro_imp_arc_ext='||current_row.id_log_pro_imp_arc_ext;
                total_importados:=total_importados+1;
            else
                execute 'update log_pro_imp_arc_ext
                         set importado=0, 
                         observacion='''||mensaje||
                         ''',fecha_transaccion='''||current_timestamp||
                         ''' where id_log_pro_imp_arc_ext='||current_row.id_log_pro_imp_arc_ext;
                total_no_importados:=total_no_importados+1;
            end if;
        exception when others then
            mensaje:=SQLERRM;
            execute 'update log_pro_imp_arc_ext
                     set importado=0, 
                     observacion= ''Error: '||mensaje||
                     ''',fecha_transaccion='''||current_timestamp||
                     ''' where id_log_pro_imp_arc_ext='||current_row.id_log_pro_imp_arc_ext;
            total_errores:=total_errores+1;
        continue;
        end;
    end loop;
    mensaje_retorno:='Total: '||total||', Importados: '||total_importados||', No Importados: '||total_no_importados||' Errores: '||total_errores;
    return mensaje_retorno;
end;
$$ language plpgsql;