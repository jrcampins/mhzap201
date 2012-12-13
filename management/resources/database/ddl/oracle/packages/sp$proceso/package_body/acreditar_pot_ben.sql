--
--Descripción: Este procedimiento acredita los potenciales beneficiarios, 
--para ello calcula el icv de aquellos que tengan ficha hogar y verifica la acreditacion de cada uno
--@param rastro: Identificador del proceso ejecutado.
--@param ubicacion: Identificador de la ubicación para filtrar potenciales beneficiarios
--@param fecha_registro_desde: Fecha de registro para filtrar potenciales beneficiarios
--@param fecha_registro_hasta: Fecha de registro para filtrar potenciales beneficiarios
--@return: mensaje indicando el resultado de la acreditación
--
function acreditar_pot_ben(ubicacion number,fecha_registro_desde timestamp, fecha_registro_hasta timestamp) return varchar2 is
    mensaje varchar2(2000);
    total number:=0;
    total_no_acreditados number:=0;
    total_acreditados number:=0;
    total_errores number:=0;
    segmento_consulta varchar2(2000):='';
        
    type ben_acr is record( 
          id_potencial_ben number , 
          nombre_potencial_ben varchar2 (200), 
          codigo_potencial_ben varchar2 (50), 
          fecha_registro_pot_ben timestamp,
          id_persona number,
          nombre_persona varchar2(200),
          codigo_persona varchar2 (50),
          id_distrito number,
          id_departamento number,
          id_barrio number,
          id_ficha_persona number,
          codigo_ficha_persona varchar2(50),
          nombre_ficha_persona varchar2 (200),
          id_ficha_hogar number,
          codigo_ficha_hogar varchar2 (200),
          indice_calidad_vida number
    ); 
    type cons_ben_acr is table of ben_acr;
    id_reg number;
    vista_ben cons_ben_acr;
    type log_proceso is table of log_pro_acr_pot_ben%rowtype;
    table_log log_proceso;
    reg log_pro_acr_pot_ben%rowtype;   
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
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
    execute immediate 'select * from vista_log_pro_acr_pot_ben '||segmento_consulta
        bulk collect into vista_ben;
    for i in vista_ben.first..vista_ben.last loop
      id_reg:=utils.bigintid();
      insert into log_pro_acr_pot_ben values (
          id_reg,
          vista_ben(i).id_potencial_ben,
          vista_ben(i).nombre_potencial_ben, 
          vista_ben(i).codigo_potencial_ben, 
          vista_ben(i).fecha_registro_pot_ben,
          vista_ben(i).id_persona,
          vista_ben(i).nombre_persona,
          vista_ben(i).codigo_persona,
          vista_ben(i).id_distrito,
          vista_ben(i).id_departamento,
          vista_ben(i).id_barrio,
          vista_ben(i).id_ficha_persona,
          vista_ben(i).codigo_ficha_persona,
          vista_ben(i).nombre_ficha_persona,
          vista_ben(i).id_ficha_hogar,
          vista_ben(i).codigo_ficha_hogar,
          vista_ben(i).indice_calidad_vida,
          null,
          null,
          current_timestamp);
      dbms_output.put_line( 'Insertando id ('||i||')='||vista_ben(i).id_potencial_ben ); --do something here
    end loop;
--     for current_row in execute  loop
--         current_row.id_log_pro_acr_pot_ben:=utils.bigintid();
--         insert into log_pro_acr_pot_ben values (current_row.*);
--     end loop;
       
    execute immediate 'select * from log_pro_acr_pot_ben where procesado is null '
    bulk collect into table_log;
    
    for i in table_log.first..table_log.last loop
        begin
            total:=total+1;
            mensaje:=sp$potencial_ben.acreditar(table_log(i).id_potencial_ben);
            if mensaje like '%Potencial Beneficiario Acreditado%' then 
                total_acreditados:=total_acreditados+1;
                execute immediate 'update log_pro_acr_pot_ben
                               set procesado=1, 
                               observacion='''||mensaje||
                               ''',fecha_transaccion='''||current_timestamp||
                               ''' where id_log_pro_acr_pot_ben='||table_log(i).id_log_pro_acr_pot_ben;
            else
                total_no_acreditados:=total_no_acreditados+1;
                execute immediate 'update log_pro_acr_pot_ben 
                               set procesado=0, 
                               observacion='''||mensaje||
                               ''',fecha_transaccion='''||current_timestamp||
                               ''' where id_log_pro_acr_pot_ben='||table_log(i).id_log_pro_acr_pot_ben;
            end if;
        exception when others then
            mensaje:=SQLERRM;
            execute immediate 'update log_pro_acr_pot_ben 
                     set procesado=0, 
                     observacion= ''Error: '||mensaje||
                     ''',fecha_transaccion='''||current_timestamp||
                     ''' where id_log_pro_acr_pot_ben='||table_log(i).id_log_pro_acr_pot_ben;
            total_errores:=total_errores+1;
            continue;
        end;
    end loop;
    mensaje:='Total: '||total||', Acreditados: '||total_acreditados||', No Acreditados: '||total_no_acreditados||', Errores: '||total_errores;
    return mensaje;
end;