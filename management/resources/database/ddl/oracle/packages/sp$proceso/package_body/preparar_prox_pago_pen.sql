--
--Descripción: Este procedimiento realiza las verificaciones necesarias para 
--validar la elegibilidad de potenciales beneficiarios
--@param ubicacion_consultada:
--@return: mensaje indicando el numero de registros procesados, aprobados y denegados
-- 
function preparar_prox_pago_pen(ubicacion_consultada number,fecha_solicitud_desde timestamp, fecha_solicitud_hasta timestamp) return varchar2 is
     mensaje varchar2(2000):='';
     mensaje_retorno varchar2(2000):='';
     segmento_consulta varchar2(2000):='';
     reproceso_pension_activo number:=0;
     causa_denegacion number:=0;
     otra_causa_denegacion varchar2(2000):='';
     causa_revocacion number:=0;
     condicion_elegibilidad number:=0;
     condicion_vigencia number:=0;
     total_aprobados number :=0;
     total_denegados number :=0;
     total_reco_apr number:=0;
     total_reco_den number:=0;
     total_denu_conf number:=0;
     total_denu_desm number :=0;
     total_revocadas number:=0;
     total_no_revocadas number:=0;
     total_errores number:=0;
     total number:=0;
     conta number:=0;
     type prox_pag is record(
          id_persona number,
          codigo_persona varchar2 (50),
          nombre_persona varchar2(200),
          id_departamento number,
          id_distrito number,
          id_barrio number,
          numero_condicion_pension number,
          fecha_solicitud_pen timestamp,
          numero_condicion_denu_pen number,
          numero_condicion_reco_pen number);
     type cons_prox_pag is table of prox_pag;
     id_reg number;
     vista_prox_pag cons_prox_pag;
     type log_proceso is table of log_pro_pre_pro_pag%rowtype;
     table_log log_proceso;
begin
     --Determinamos si la ubicación sera un parametro a consultar o no
    if ubicacion_consultada is not null then
        segmento_consulta:='and (id_departamento='||ubicacion_consultada 
                                 ||'or id_distrito='||ubicacion_consultada
                                 ||'or id_barrio='||ubicacion_consultada||')';
    end if;
    --Determinamos si la fecha sera un parametro a consultar 
    if fecha_solicitud_desde is not null then
            segmento_consulta:=segmento_consulta||' and fecha_solicitud_pension >= '''||to_char(fecha_solicitud_desde,'dd/mm/yyyy')||''' ';
    end if;
    if fecha_solicitud_hasta is not null then
            segmento_consulta:=segmento_consulta||' and fecha_solicitud_pension <= '''||to_char(fecha_solicitud_hasta,'dd/mm/yyyy')||''' ';
    end if;
     --Determinamos si se van a reprocesar las pensiones ya aprobadas
    select es_control_reproceso_pen_activ 
    into reproceso_pension_activo 
    from parametro_global;
    --Si se reprocesan pensiones solicitadas y otorgadas
    if reproceso_pension_activo=1 then
        --llenamos la tabla log con los registros a procesar
        execute immediate 'select * from vista_log_pro_pre_pro_pag where 
                                  (numero_condicion_pension=1
                                   or numero_condicion_pension=5
                                   or numero_condicion_reco_pen=1 
                                   or numero_condicion_denu_pen=1) '||segmento_consulta
        bulk collect into vista_prox_pag;
        if vista_prox_pag.count=0 then
            return 'No hay registros de Persona para Procesar';
        end if;
        for i in vista_prox_pag.first..vista_prox_pag.last loop
            id_reg:=utils.bigintid();
            insert into log_pro_pre_pro_pag values (
                    id_reg,
                    0, -- version
                    vista_prox_pag(i).id_persona,
                    vista_prox_pag(i).codigo_persona,
                    vista_prox_pag(i).nombre_persona,
                    vista_prox_pag(i).id_departamento,
                    vista_prox_pag(i).id_distrito,
                    vista_prox_pag(i).id_barrio,
                    vista_prox_pag(i).numero_condicion_pension,
                    vista_prox_pag(i).fecha_solicitud_pen,
                    vista_prox_pag(i).numero_condicion_denu_pen,
                    vista_prox_pag(i).numero_condicion_reco_pen,
                    0,
                    null,
                    current_timestamp);                       
            --dbms_output.put_line( 'Insertando id ('||i||')='||vista_prox_pag(i).id_persona );
        end loop;
    --Solo se procesan pensiones en estatus solicitada
    else
        --llenamos la tabla log con los registros a procesar
        execute immediate 'select * from vista_log_pro_pre_pro_pag where 
                                  (numero_condicion_pension=1
                                   or numero_condicion_reco_pen=1 
                                   or numero_condicion_denu_pen=1) '||segmento_consulta
        bulk collect into vista_prox_pag;
        if vista_prox_pag.count=0 then
            return 'No hay registros de Persona para Procesar';
        end if;
        for i in vista_prox_pag.first..vista_prox_pag.last loop
            id_reg:=utils.bigintid();
            insert into log_pro_pre_pro_pag values (
                    id_reg,
                    0, -- version
                    vista_prox_pag(i).id_persona,
                    vista_prox_pag(i).codigo_persona,
                    vista_prox_pag(i).nombre_persona,
                    vista_prox_pag(i).id_departamento,
                    vista_prox_pag(i).id_distrito,
                    vista_prox_pag(i).id_barrio,
                    vista_prox_pag(i).numero_condicion_pension,
                    vista_prox_pag(i).fecha_solicitud_pen,
                    vista_prox_pag(i).numero_condicion_denu_pen,
                    vista_prox_pag(i).numero_condicion_reco_pen,
                    0,
                    null,
                    current_timestamp);                       
            --dbms_output.put_line( 'Insertando id ('||i||')='||vista_prox_pag(i).id_persona );
        end loop;
    end if;
    --Se procesan los registros
    execute immediate 'select * from log_pro_pre_pro_pag where es_procesado=0 and observacion is null'
    bulk collect into table_log;
    if table_log.count=0 then
        return 'No hay registros de personas pendientes por procesar';
    end if;
    for i in table_log.first..table_log.last loop
        begin
            --dbms_output.put_line('Procesando linea '||i);
            total:=total+1;
            --Procesamos las pensiones solicitadas
            if table_log(i).numero_condicion_pension=1 then
                --dbms_output.put_line('Prnsion solicitada '||i);
                mensaje:= sp$persona.aprobar_pension(table_log(i).id_persona, 'Pensión Aprobada Automáticamente');
                --dbms_output.put_line('Mensaje de aprobacion '||mensaje);
                --Si se aprobo se actualiza la tabla temporal
                if mensaje like '%Pensión Aprobada%' then
                     total_aprobados:=total_aprobados+1;
                --Si no se aprobo fue por no elegibilidad, en otro caso se generaría una excepción
                else
                    --dbms_output.put_line('mensaje: '||mensaje);
                    total_denegados:=total_denegados+1;
                    --Se determina la causa de no elegibilidad
                    condicion_elegibilidad:=sp$persona.consultar_objeciones(table_log(i).id_persona);
                    --dbms_output.put_line('condición: '||condicion_elegibilidad);
                    if condicion_elegibilidad=99 then
                       causa_denegacion:=99;
                       otra_causa_denegacion:='Pensión con varias objeciones';
                    else
                       causa_denegacion:=condicion_elegibilidad;
                       otra_causa_denegacion:=null;
                    end if;
                    --Se deniega la pensión
                    mensaje:=sp$persona.objetar_pension(table_log(i).id_persona,causa_denegacion,otra_causa_denegacion,'Pensión Objetada Automáticamente');
                    --dbms_output.put_line('mensaje: '||mensaje);
                end if;
            --Procesamos las reconsideraciones solicitadas
            elsif table_log(i).numero_condicion_reco_pen=1 then
                --dbms_output.put_line('Pension reconsideracion '||i);
                mensaje:=sp$persona.proc_reco_pen(table_log(i).id_persona);
                --Si la reconsideración fue aprobada se registra la aprobación de la pensicón
                if mensaje like '%Reconsideración Aprobada%' then
                    total_reco_apr:=total_reco_apr+1;
                --Si la reconsideración fue denegada se actualiza el mensaje
                else
                    total_reco_den:=total_reco_den+1;
                end if;
            --Procesamos las denuncias registradas
            elsif table_log(i).numero_condicion_denu_pen=1 then
                --dbms_output.put_line('Prnsion denuncia '||i);
                mensaje:=sp$persona.proc_denu_pen(table_log(i).id_persona);
                --Si la denuncia fue desmentida se registra el desmentido de la denuncia
                if mensaje like '%Denuncia Desmentida%' then
                    total_denu_desm:=total_denu_desm+1;
                else
                    total_denu_conf:=total_denu_conf+1;
                end if;
            --Si la bandera está activa reprocesamos las pensiones ya otorgadas
            elsif table_log(i).numero_condicion_pension=5 then
                --dbms_output.put_line('Pension otorgada '||i);
                --Se verifica la vigencia de la pensión
                condicion_vigencia:=sp$persona.consultar_vig_pen(table_log(i).id_persona);
                --Si está vigente se verifica la elegibilidad
                if condicion_vigencia=0 then
                    --Se determina si hay causa de no elegibilidad
                    condicion_elegibilidad:=sp$persona.act_persona_elegible(table_log(i).id_persona);
                    --Si sigue siendo elegible no se hace nada
                    if condicion_elegibilidad=0 then
                        mensaje:='Pensión sigue estando vigente';
                    --Si no es elegible la causa de revocación es la no elegibilidad
                    else
                        causa_revocacion:=condicion_elegibilidad;
                    end if;
                 --Si no está vigente la causa de revocación es la no vigencia
                else
                    causa_revocacion:=condicion_vigencia;
                end if;
                --Si hay motivos para revocar la pensión, se revoca
                if causa_revocacion<>0 then
                    total_revocadas:=total_revocadas+1;
                    mensaje:=sp$persona.revocar_pension(table_log(i).id_persona,causa_revocacion,null,'Pensión Revocada Automáticamente');                    
                else
                    total_no_revocadas:=total_no_revocadas+1;
                end if;
            end if;
            --Se registra el resultado de procesar el registro
            update log_pro_pre_pro_pag
            set es_procesado=1, 
            observacion=mensaje,
            fecha_hora_transaccion=current_timestamp
            where id_log_pro_pre_pro_pag=table_log(i).id_log_pro_pre_pro_pag;
        exception when others then
            mensaje:=SQLERRM;
            total_errores:=total_errores+1;
            mensaje:=SQLERRM;
            update log_pro_pre_pro_pag
            set es_procesado=1, 
            observacion='Error: '||mensaje
            where id_log_pro_pre_pro_pag=table_log(i).id_log_pro_pre_pro_pag;
        end;                       
     end loop;
     mensaje_retorno:='Total de Personas Procesadas: '||total
                      ||', Solicitudes Aprobadas: '||total_aprobados
                      ||', Solicitudes Denegadas: '||total_denegados
                      ||', Reconsideraciones Aprobadas: '||total_reco_apr
                      ||', Reconsideraciones Denegadas: '||total_reco_den
                      ||', Denuncias Desmentidas: '||total_denu_desm
                      ||', Denuncias Confirmadas: '||total_denu_conf
                      ||', Reprocesadas Revocadas: '||total_revocadas
                      ||', Reprocesadas No Revocadas: '||total_no_revocadas
                      ||', Total Excepciones: '||total_errores;
     return mensaje_retorno;
end;