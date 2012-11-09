--
--Descripción: Este procedimiento acredita los potenciales beneficiarios
--@param rastro: Identificador del proceso ejecutado.
--@param ubicacion: Identificador de la ubicación para filtrar potenciales beneficiarios
--@param fecha_registro_desde: Fecha de registro para filtrar potenciales beneficiarios
--@param fecha_registro_hasta: Fecha de registro para filtrar potenciales beneficiarios
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function proceso_acreditar_pot_ben(rastro bigint,ubicacion bigint,fecha_registro_desde timestamp, fecha_registro_hasta timestamp) returns integer as $$
declare
    mensaje varchar:='';
begin
    select proceso_acreditar_pot_ben(ubicacion,fecha_registro_desde,fecha_registro_hasta) into mensaje;         
    return rastro_proceso_update(rastro, 21, null, mensaje);     
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento acredita los potenciales beneficiarios, 
--para ello calcula el icv de aquellos que tengan ficha hogar y verifica la acreditacion de cada uno
--@param rastro: Identificador del proceso ejecutado.
----@param ubicacion: Identificador de la ubicación para filtrar potenciales beneficiarios
--@param fecha_registro_desde: Fecha de registro para filtrar potenciales beneficiarios
--@param fecha_registro_hasta: Fecha de registro para filtrar potenciales beneficiarios
--@return: mensaje indicando el resultado de la acreditación
--
create or replace function proceso_acreditar_pot_ben(ubicacion bigint,fecha_registro_desde timestamp, fecha_registro_hasta timestamp) returns varchar as $$
declare
    mensaje varchar:='';
    total integer:=0;
    total_no_acreditados integer:=0;
    total_acreditados integer:=0;
    total_errores integer:=0;
    segmento_consulta varchar:='';
    current_row log_pro_acr_pot_ben;
begin
    --Determinamos si la ubicación sera un parametro a consultar o no
    if ubicacion is not null then
        segmento_consulta:=' where (id_departamento='||ubicacion
                            ||' or id_distrito='||ubicacion
                            ||' or id_barrio='||ubicacion||')';
    end if;
    --Determinamos si la fecha sera un parametro a consultar 
    if fecha_registro_desde is not null then
        if segmento_consulta<>'' then
            segmento_consulta:=segmento_consulta||' and fecha_registro_pot_ben >= '''||fecha_registro_desde||''' ';
        else
            segmento_consulta:=' where fecha_registro_pot_ben >= '''||fecha_registro_desde||''' ';
        end if;
    end if;
    if fecha_registro_hasta is not null then
        if segmento_consulta<>'' then
            segmento_consulta:=segmento_consulta||' and fecha_registro_pot_ben <= '''||fecha_registro_hasta||''' ';
        else
            segmento_consulta:=' where fecha_registro_pot_ben <= '''||fecha_registro_hasta||''' ';
        end if;
    end if;
    segmento_consulta:=segmento_consulta||';';
    --Se insertan los registros a procesar en la tabla temporal 
    for current_row in execute 'select * from vista_log_pro_acr_pot_ben '||segmento_consulta loop
        current_row.id_log_pro_acr_pot_ben:=bigintid();
        insert into log_pro_acr_pot_ben values (current_row.*);
    end loop;
    --Se procesan los potenciales beneficiarios a acreditar
    for current_row in select * from log_pro_acr_pot_ben where procesado is null loop
        begin
            total:=total+1;
            mensaje:=potencial_ben_acreditar(current_row.id_potencial_ben);
            if mensaje like '%Potencial Beneficiario Acreditado%' then 
                total_acreditados:=total_acreditados+1;
                execute 'update log_pro_acr_pot_ben
                         set procesado=1, 
                         observacion='''||mensaje||
                         ''',fecha_transaccion='''||current_timestamp||
                         ''' where id_log_pro_acr_pot_ben='||current_row.id_log_pro_acr_pot_ben;
            else
                total_no_acreditados:=total_no_acreditados+1;
                execute 'update log_pro_acr_pot_ben 
                         set procesado=0, 
                         observacion='''||mensaje||
                         ''',fecha_transaccion='''||current_timestamp||
                        ''' where id_log_pro_acr_pot_ben='||current_row.id_log_pro_acr_pot_ben;
            end if;
        exception when others then
            mensaje:=SQLERRM;
            execute 'update log_pro_acr_pot_ben 
                     set procesado=0, 
                     observacion= ''Error: '||mensaje||
                     ''',fecha_transaccion='''||current_timestamp||
                     ''' where id_log_pro_acr_pot_ben='||current_row.id_log_pro_acr_pot_ben;
            total_errores:=total_errores+1;
            continue;
       end;
    end loop;
    mensaje:='Total: '||total||', Acreditados: '||total_acreditados||', No Acreditados: '||total_no_acreditados||', Errores: '||total_errores;
    return mensaje;
end;
$$ language plpgsql;