--
--Descripción: Este procedimiento realiza las verificaciones necesarias para 
--validar la elegibilidad de potenciales beneficiarios, previo a la aprobación
--o denegación de la solicitud de pensión
--@param ubicacion_consultada: Identificador de la ubicacion a consultar
--@return: mensaje indicando la cantidad de personas elegibles y no elegibles
--
function verificar_ele_pen(ubicacion_consultada number) return varchar2 is
     mensaje varchar2(5000):='';
     mensaje_retorno varchar2(2000):='';
     segmento_consulta_ubicacion varchar2(2000):='';
     reproceso_pension_activo number:=0;
     condicion_elegibilidad number;
     condicion_vigencia number;
     total number:=0;
     total_elegibles number:=0;
     total_reprocesadas number:=0;
     total_rep_ele number:=0;
     total_rep_no_ele number:=0;
     total_no_elegibles number:=0;
     total_no_vigentes number:=0;
     total_vigentes number:=0;
     total_errores number:=0;
     conta number;
     type per_ele is record(
          id_persona number,
          nombre_persona varchar2(200),
          codigo_persona varchar2 (50),
          id_departamento number,
          id_distrito number,
          id_barrio number,
          indice_calidad_vida number,
          numero_condicion_pension number,
          numero_condicion_denu_pen number,
          numero_condicion_reco_pen number);
     type cons_per_ele is table of per_ele;
     id_reg number;
     vista_ele cons_per_ele;
     type log_proceso is table of log_pro_ver_ele_pen%rowtype;
     table_log log_proceso;
     reg log_pro_ver_ele_pen%rowtype;
     err_number  constant number := -20000; -- an integer in the range -20000..-20999
     msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    --Determinamos si la ubicación sera un parametro para filtrar los registros
    if ubicacion_consultada is not null then
        segmento_consulta_ubicacion:='where (id_departamento='||ubicacion_consultada 
                                       ||'or id_distrito='||ubicacion_consultada
                                       ||'or id_barrio='||ubicacion_consultada||')';     
    end if;
    --Determinamos si se van a reprocesar las pensiones ya aprobadas
    select es_control_reproceso_pen_activ 
    into reproceso_pension_activo 
    from parametro_global;
    --Si el reproceso de pensiones está activo, se seleccionan las pensiones ya aprobadas
    if reproceso_pension_activo=1 then
        --Se llena la tabla log con los registros a procesar
--         select count(id_persona) into conta from vista_log_pro_ver_ele_pen_1;
--         if conta =0 then
--             return 'No hay Personas para verificar elegibilidad';
--         end if;
        execute immediate 'select   * from vista_log_pro_ver_ele_pen_1 '||segmento_consulta_ubicacion 
        bulk collect into vista_ele;
        if vista_ele.count=0 then
            return'No hay Personas pendientes por consultar elegibilidad';
        end if;
        for i in vista_ele.first..vista_ele.last loop
            id_reg:=utils.bigintid();
            insert into log_pro_ver_ele_pen values (
                    id_reg,
                    0, -- version
                    vista_ele(i).id_persona,
                    vista_ele(i).nombre_persona,
                    vista_ele(i).codigo_persona,
                    vista_ele(i).id_departamento,
                    vista_ele(i).id_distrito,
                    vista_ele(i).id_barrio,
                    vista_ele(i).indice_calidad_vida,
                    vista_ele(i).numero_condicion_pension,
                    vista_ele(i).numero_condicion_denu_pen,
                    vista_ele(i).numero_condicion_reco_pen,
                    0,
                    null,
                    current_timestamp);
            --dbms_output.put_line( 'Insertando id ('||i||')='||vista_ele(i).id_persona );
        end loop;
    else       
    --llenamos la tabla log con los registros a procesar
        --Se llena la tabla log con los registros a procesar
--         select count(id_persona) into conta from vista_log_pro_ver_ele_pen_2;
--         if conta =0 then
--             return 'No hay Personas para verificar elegibilidad';
--         end if;
        execute immediate 'select   * from vista_log_pro_ver_ele_pen_2 '||segmento_consulta_ubicacion 
        bulk collect into vista_ele;
        if vista_ele.count=0 then
            return'No hay Personas pendientes por consultar elegibilidad';
        end if;
        for i in vista_ele.first..vista_ele.last loop
            id_reg:=utils.bigintid();
            insert into log_pro_ver_ele_pen values (
                    id_reg,
                    0, -- version
                    vista_ele(i).id_persona,
                    vista_ele(i).nombre_persona,
                    vista_ele(i).codigo_persona,
                    vista_ele(i).id_departamento,
                    vista_ele(i).id_distrito,
                    vista_ele(i).id_barrio,
                    vista_ele(i).indice_calidad_vida,
                    vista_ele(i).numero_condicion_pension,
                    vista_ele(i).numero_condicion_denu_pen,
                    vista_ele(i).numero_condicion_reco_pen,
                    0,
                    null,
                    current_timestamp);
            --dbms_output.put_line( 'Insertando id ('||i||')='||vista_ele(i).id_persona );
        end loop;
    end if;
--     select count(id_log_pro_ver_ele_pen) into conta from log_pro_ver_ele_pen;
--     if conta =0 then
--         return 'No hay registros de personas pendientes por procesar';
--     end if;
    execute immediate 'select * from log_pro_ver_ele_pen where es_procesado=0 and observacion is null '
    bulk collect into table_log;
    if table_log.count=0 then
        return 'No hay registros de personas pendientes por procesar';
    end if;
    for i in table_log.first..table_log.last loop
        begin
            total:=total+1;
            --Procesamos las pensiones solicitadas
            if (table_log(i).numero_condicion_pension=1) then
                condicion_elegibilidad:=sp$persona.act_persona_elegible(table_log(i).id_persona);
                --Si no tiene objeciones
                if condicion_elegibilidad=0 then
                    --Actualizamos mensaje
                    mensaje:='Persona Elegible para Pensión';
                    total_elegibles:=total_elegibles+1;
                --Si tiene una objecion puntual
                elsif condicion_elegibilidad <>99 then
                    --Se determina la causa de no elegibilidad
                    select codigo_tipo_obj_ele_pen
                    into mensaje
                    from tipo_obj_ele_pen
                    where numero_tipo_obj_ele_pen=condicion_elegibilidad;
                    --Actualizamos mensaje
                    mensaje:='Persona No Elegible para Pensión: '||mensaje;
                    total_no_elegibles:=total_no_elegibles+1;
                --Si tiene varias objeciones
                else
                    --Actualizamos mensaje
                    mensaje:='Persona No Elegible para Pensión por varias objeciones';
                    total_no_elegibles:=total_no_elegibles+1;
                end if;
            --Reprocesamos las pensiones aprobadas
            elsif (table_log(i).numero_condicion_pension=2) then
                total_reprocesadas:=total_reprocesadas+1;
                condicion_vigencia:=sp$persona.consultar_vig_pen(table_log(i).id_persona);
                --Si está vigente se verifica la elegibilidad
                if condicion_vigencia=0 then
                    total_vigentes:=total_vigentes+1;
                    condicion_elegibilidad:=sp$persona.act_persona_elegible(table_log(i).id_persona);
                    if condicion_elegibilidad=0 then
                        --Actualizamos mensaje
                        mensaje:='Pensión Reprocesada. Persona Elegible para Pensión';
                        total_rep_ele:=total_rep_ele+1;
                    elsif condicion_elegibilidad <>99 then
                        --Se determina la causa de no elegibilidad
                        select codigo_tipo_obj_ele_pen
                        into mensaje
                        from tipo_obj_ele_pen
                        where numero_tipo_obj_ele_pen=condicion_elegibilidad;
                        --Actualizamos mensaje
                        mensaje:='Pensión Reprocesada. Persona No Elegible para Pensión: '||mensaje;
                        total_rep_no_ele:=total_rep_no_ele+1;
                    else
                        --Actualizamos mensaje
                        mensaje:='Pensión Reprocesada. Persona No Elegible para Pensión por varias objeciones';
                        total_rep_no_ele:=total_rep_no_ele+1;
                    end if;
                --Si no está vigente se registra como no elegible
                else
                    --Actualizamos la persona como No elegible
                    update persona
                    set es_persona_elegible_para_pen=0
                    where id_persona=table_log(i).id_persona;
                    --Se determina la causa de no vigencia
                    select codigo_causa_den_pension
                    into mensaje
                    from causa_den_pension
                    where numero_causa_den_pension=condicion_vigencia;
                    mensaje:='Pensión Reprocesada. '||mensaje;    
                    total_no_vigentes:=total_no_vigentes+1;
                end if;
            end if;
            execute immediate 'update log_pro_ver_ele_pen
                     set es_procesado=1, observacion='''||mensaje||
                     ''',fecha_hora_transaccion=CURRENT_TIMESTAMP 
                     where id_log_pro_ver_ele_pen='||table_log(i).id_log_pro_ver_ele_pen;
        exception when others then
            mensaje:=SQLERRM;
            execute immediate 'update log_pro_ver_ele_pen
                     set es_procesado=1, observacion=''Error: '||mensaje||
                     ''',fecha_hora_transaccion=CURRENT_TIMESTAMP 
                     where id_log_pro_ver_ele_pen='||table_log(i).id_log_pro_ver_ele_pen;
            total_errores:=total_errores+1;
            continue;
        end;                       
    end loop;
    mensaje_retorno:='Total Personas Procesadas: '||total||
                     ', Total Elegibles: '||total_elegibles||
                     ', Total No Elegibles: '||total_no_elegibles||
                     ', Total Reprocesadas: '||total_reprocesadas||
                     ', Total Reprocesadas Elegibles: '||total_rep_ele||
                     ', Total Reprocesadas No Elegibles: '||total_rep_no_ele||
                     ', Total Vigentes: '||total_vigentes||
                     ', Total No Vigentes: '||total_no_vigentes||
                     ', Total Excepciones: '||total_errores;
    return mensaje_retorno;
end;