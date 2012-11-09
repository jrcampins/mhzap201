--
--Descripción: Este procedimiento realiza las aprobaciones y denegaciones correspondientes,
--procesa las reconsideraciones y denuncias
--@param rastro: Identificador del proceso ejecutado.
--@param ubicacion_consultada: Identificador de la ubicacion a consultar
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function proceso_preparar_prox_pago_pen(rastro bigint,ubicacion_consultada bigint,fecha_solicitud_desde timestamp, fecha_solicitud_hasta timestamp) returns integer as $$
declare
mensaje varchar:='';
begin
    select proceso_preparar_prox_pago_pen(ubicacion_consultada,fecha_solicitud_desde, fecha_solicitud_hasta)  into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento realiza las verificaciones necesarias para 
--validar la elegibilidad de potenciales beneficiarios
--@param ubicacion_consultada:
--@return: mensaje indicando el numero de registros procesados, aprobados y denegados
-- 
create or replace function proceso_preparar_prox_pago_pen(ubicacion_consultada bigint,fecha_solicitud_desde timestamp, fecha_solicitud_hasta timestamp) returns varchar as $$
declare
     mensaje varchar:='';
     mensaje_retorno varchar:='';
     segmento_consulta varchar:='';
     reproceso_pension_activo integer:=0;
     current_row log_pro_pre_pro_pag;
     causa_denegacion integer:=0;
     otra_causa_denegacion varchar:='';
     causa_revocacion integer:=0;
     condicion_elegibilidad integer:=0;
     condicion_vigencia integer:=0;
     total_aprobados integer :=0;
     total_denegados integer :=0;
     total_reconsideraciones_aprobadas integer:=0;
     total_reconsideraciones_denegadas integer:=0;
     total_denuncias_confirmadas integer:=0;
     total_denuncias_desmentidas integer :=0;
     total_revocadas integer:=0;
     total_no_revocadas integer:=0;
     total_errores integer:=0;
     total integer:=0;
begin
     --Determinamos si la ubicación sera un parametro a consultar o no
    if ubicacion_consultada is not null then
        segmento_consulta:='and (id_departamento='||ubicacion_consultada 
                                 ||'or id_distrito='||ubicacion_consultada
                                 ||'or id_barrio='||ubicacion_consultada||')';
    end if;
    --Determinamos si la fecha sera un parametro a consultar 
    if fecha_solicitud_desde is not null then
            segmento_consulta:=segmento_consulta||' and fecha_solicitud_pension >= '''||fecha_solicitud_desde||''' ';
    end if;
    if fecha_solicitud_hasta is not null then
            segmento_consulta:=segmento_consulta||' and fecha_solicitud_pension <= '''||fecha_solicitud_hasta||''' ';
    end if;
     --Determinamos si se van a reprocesar las pensiones ya aprobadas
    select es_control_reproceso_pen_activ 
    into reproceso_pension_activo 
    from parametro_global;
    --Si se reprocesan pensiones solicitadas y otorgadas
    if reproceso_pension_activo=1 then
        --llenamos la tabla log con los registros a procesar
        for current_row in execute 'select * from vista_log_pro_pre_pro_pag where 
                                  (numero_condicion_pension=1
                                   or numero_condicion_pension=5
                                   or numero_condicion_reco_pen=1 
                                   or numero_condicion_denu_pen=1) '||segmento_consulta loop
             current_row.id_log_pro_pre_pro_pag:=bigintid();
             insert into log_pro_pre_pro_pag values (current_row.*);                        
        end loop;
    --Solo se procesan pensiones en estatus solicitada
    else      
        --llenamos la tabla temporal con los registros a procesar
        for current_row in execute 'select * from vista_log_pro_pre_pro_pag where 
                                  (numero_condicion_pension=1
                                   or numero_condicion_reco_pen=1 
                                   or numero_condicion_denu_pen=1) '||segmento_consulta loop
             current_row.id_log_pro_pre_pro_pag:=bigintid();
             insert into log_pro_pre_pro_pag values (current_row.*);                        
        end loop;
    end if;
    --Se procesan los registros
    for current_row in select * from log_pro_pre_pro_pag where procesado is null loop
        begin
            total:=total+1;
            --Procesamos las pensiones solicitadas
            if current_row.numero_condicion_pension=1 then
                mensaje:= persona_aprobar_pension(current_row.id_persona, 'Pensión Aprobada Automáticamente');
                --Si se aprobo se actualiza la tabla temporal
                if mensaje ilike '%Pensión Aprobada%' then
                     total_aprobados:=total_aprobados+1;
                --Si no se aprobo fue por no elegibilidad, en otro caso se generaría una excepción
                else
                    total_denegados:=total_denegados+1;
                    --Se determina la causa de no elegibilidad
                    condicion_elegibilidad:=persona_actualizar_persona_elegible(current_row.id_persona);
                    if condicion_elegibilidad=99 then
                       causa_denegacion:=99;
                       otra_causa_denegacion:='Pensión denegada por varios motivos';
                    else
                       causa_denegacion:=condicion_elegibilidad;
                       otra_causa_denegacion:=null;
                    end if;
                    --Se determina el motivo de la denegación de pensión
                    mensaje:=persona_denegar_pension(current_row.id_persona,causa_denegacion,otra_causa_denegacion,'Pensión Denegada Automáticamente');
                end if;
            --Procesamos las reconsideraciones solicitadas
            elsif current_row.numero_condicion_reco_pen=1 then
                mensaje:=persona_procesar_reconsideración_pension(current_row.id_persona);
                --Si la reconsideración fue aprobada se registra la aprobación de la pensicón
                if mensaje like '%Reconsideración Aprobada%' then
                    total_reconsideraciones_aprobadas:=total_reconsideraciones_aprobadas+1;
                --Si la reconsideración fue denegada se actualiza el mensaje
                else
                    total_reconsideraciones_denegadas:=total_reconsideraciones_denegadas+1;
                end if;
            --Procesamos las denuncias registradas
            elsif current_row.numero_condicion_denu_pen=1 then
                mensaje:=persona_procesar_denuncia_pension(current_row.id_persona);
                --Si la denuncia fue desmentida se registra el desmentido de la denuncia
                if mensaje like '%Denuncia Desmentida%' then
                    total_denuncias_desmentidas:=total_denuncias_desmentidas+1;
                else
                    total_denuncias_confirmadas:=total_denuncias_confirmadas+1;
                end if;
            --Si la bandera está activa reprocesamos las pensiones ya otorgadas
            elsif current_row.numero_condicion_pension=5 then
                --Se verifica la vigencia de la pensión
                condicion_vigencia:=persona_consultar_vigencia_pension(current_row.id_persona);
                --Si está vigente se verifica la elegibilidad
                if condicion_vigencia=0 then
                    --Se determina si hay causa de no elegibilidad
                    condicion_elegibilidad:=persona_actualizar_persona_elegible(current_row.id_persona);
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
                    mensaje:=persona_revocar_pension(current_row.id_persona,causa_revocacion,null,'Pensión Revocada Automáticamente');                    
                else
                    total_no_revocadas:=total_no_revocadas+1;
                end if;
            end if;
            --Se registra el resultado de procesar el registro
            execute 'update log_pro_pre_pro_pag
                     set procesado=1, observacion='''||mensaje||
                     ''' where id_log_pro_pre_pro_pag='||current_row.id_log_pro_pre_pro_pag;
        exception when others then
            total_errores:=total_errores+1;
            mensaje:=SQLERRM;
            execute 'update log_pro_pre_pro_pag
                     set procesado=0, observacion=''Error: '||mensaje||
                     ''' where id_log_pro_pre_pro_pag='||current_row.id_log_pro_pre_pro_pag;
        end;                       
     end loop;
     mensaje_retorno:='Total de Personas Procesadas: '||total
                      ||', Solicitudes Aprobadas: '||total_aprobados
                      ||', Solicitudes Denegadas: '||total_denegados
                      ||', Reconsideraciones Aprobadas: '||total_reconsideraciones_aprobadas
                      ||', Reconsideraciones Denegadas: '||total_reconsideraciones_denegadas
                      ||', Denuncias Desmentidas: '||total_denuncias_desmentidas
                      ||', Denuncias Confirmadas: '||total_denuncias_confirmadas
                      ||', Reprocesadas Revocadas: '||total_revocadas
                      ||', Reprocesadas No Revocadas: '||total_no_revocadas
                      ||', Total Errores: '||total_errores;
     return mensaje_retorno;
end;
$$ language plpgsql;