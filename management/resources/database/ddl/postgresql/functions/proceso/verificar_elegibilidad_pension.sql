--
--Descripción: Este procedimiento realiza las verificaciones necesarias para 
--validar la elegibilidad de potenciales beneficiarios
--@param rastro: Identificador del proceso ejecutado.
--@param ubicacion_consultada: Identificador de la ubicacion a consultar
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function proceso_verificar_ele_pen(rastro bigint,ubicacion_consultada bigint) returns integer as $$
declare
mensaje varchar:='';
begin
    select proceso_verificar_ele_pen(ubicacion_consultada) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento realiza las verificaciones necesarias para 
--validar la elegibilidad de potenciales beneficiarios, previo a la aprobación
--o denegación de la solicitud de pensión
--@param ubicacion_consultada: Identificador de la ubicacion a consultar
--@return: mensaje indicando la cantidad de personas elegibles y no elegibles
--
create or replace function proceso_verificar_ele_pen(ubicacion_consultada bigint) returns varchar as $$
declare
     mensaje varchar:='';
     mensaje_retorno varchar:='';
     segmento_consulta_ubicacion varchar:='';
     reproceso_pension_activo integer:=0;
     current_row log_pro_ver_ele_pen;
     condicion_elegibilidad integer;
     condicion_vigencia integer;
     total integer:=0;
     total_elegibles integer:=0;
     total_reprocesadas integer:=0;
     total_reprocesadas_elegibles integer:=0;
     total_reprocesadas_no_elegibles integer:=0;
     total_no_elegibles integer:=0;
     total_no_vigentes integer:=0;
     total_vigentes integer:=0;
     total_errores integer:=0;
begin
    --Determinamos si la ubicación sera un parametro para filtrar los registros
    if ubicacion_consultada is not null then
        segmento_consulta_ubicacion:='and (id_departamento='||ubicacion_consultada 
                                       ||'or id_distrito='||ubicacion_consultada
                                       ||'or id_barrio='||ubicacion_consultada||');';     
    else
         segmento_consulta_ubicacion:=';';
    end if;
    --Determinamos si se van a reprocesar las pensiones ya aprobadas
    select es_control_reproceso_pen_activ 
    into reproceso_pension_activo 
    from parametro_global;
    --Si el reproceso de pensiones está activo, se seleccionan las pensiones ya aprobadas
    if reproceso_pension_activo=1 then
        --Se llena la tabla log con los registros a procesar
        for current_row in execute 'select null, id_persona, codigo_persona, nombre_persona, 
                                    id_distrito, id_departamento, id_barrio , 
                                    indice_calidad_vida,numero_condicion_pension,
                                    numero_condicion_denu_pen, numero_condicion_reco_pen
                                    from persona 
                                    where numero_condicion_pension=1
                                    or numero_condicion_pension=2
                                    or numero_condicion_reco_pen=1 
                                    or numero_condicion_denu_pen=1 '||segmento_consulta_ubicacion loop
             current_row.id_log_pro_ver_ele_pen :=bigintid();
             insert into log_pro_ver_ele_pen values (current_row.*);                        
        end loop;
    else       
    --llenamos la tabla log con los registros a procesar
        for current_row in execute 'select null, id_persona, codigo_persona, nombre_persona, 
                                    id_distrito, id_departamento, id_barrio , 
                                    indice_calidad_vida,numero_condicion_pension,
                                    numero_condicion_denu_pen, numero_condicion_reco_pen
                                    from persona 
                                    where numero_condicion_pension=1
                                    or numero_condicion_reco_pen=1 
                                    or numero_condicion_denu_pen=1 '||segmento_consulta_ubicacion loop
             current_row.id_log_pro_ver_ele_pen :=bigintid();
             insert into log_pro_ver_ele_pen values (current_row.*);                       
        end loop;
    end if;
    --Se procesan los registros
    for current_row in select * from log_pro_ver_ele_pen
                       where procesado is null loop
        begin
            total:=total+1;
            --Procesamos las pensiones solicitadas
            if (current_row.numero_condicion_pension=1) then
                condicion_elegibilidad:=persona_actualizar_persona_elegible(current_row.id_persona);
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
                    mensaje:='Persona No Elegible para Pensión por varios motivos';
                    total_no_elegibles:=total_no_elegibles+1;
                end if;
            --Reprocesamos las pensiones aprobadas
            elsif (current_row.numero_condicion_pension=2) then
                total_reprocesadas:=total_reprocesadas+1;
                condicion_vigencia:=persona_consultar_vigencia_pension(current_row.id_persona);
                --Si está vigente se verifica la elegibilidad
                if condicion_vigencia=0 then
                    total_vigentes:=total_vigentes+1;
                    condicion_elegibilidad:=persona_actualizar_persona_elegible(current_row.id_persona);
                    if condicion_elegibilidad=0 then
                        --Actualizamos mensaje
                        mensaje:='Pensión Reprocesada. Persona Elegible para Pensión';
                        total_reprocesadas_elegibles:=total_reprocesadas_elegibles+1;
                    elsif condicion_elegibilidad <>99 then
                        --Se determina la causa de no elegibilidad
                        select codigo_tipo_obj_ele_pen
                        into mensaje
                        from tipo_obj_ele_pen
                        where numero_tipo_obj_ele_pen=condicion_elegibilidad;
                        --Actualizamos mensaje
                        mensaje:='Pensión Reprocesada. Persona No Elegible para Pensión: '||mensaje;
                        total_reprocesadas_no_elegibles:=total_reprocesadas_no_elegibles+1;
                    else
                        --Actualizamos mensaje
                        mensaje:='Pensión Reprocesada. Persona No Elegible para Pensión por varios motivos';
                        total_reprocesadas_no_elegibles:=total_reprocesadas_no_elegibles+1;
                    end if;
                --Si no está vigente se registra como no elegible
                else
                    --Actualizamos la persona como No elegible
                    update persona
                    set es_persona_elegible_para_pen=0
                    where id_persona=current_row.id_persona;
                    --Se determina la causa de no vigencia
                    select codigo_causa_den_pension
                    into mensaje
                    from causa_den_pension
                    where numero_causa_den_pension=condicion_vigencia;
                    mensaje:='Pensión Reprocesada. '||mensaje;    
                    total_no_vigentes:=total_no_vigentes+1;
                end if;
            end if;
            execute 'update log_pro_ver_ele_pen
                     set procesado=1, observacion='''||mensaje||
                     ''',fecha_transaccion=CURRENT_TIMESTAMP 
                     where id_log_pro_ver_ele_pen='
                    ||current_row.id_log_pro_ver_ele_pen;
        exception when others then
            total_errores:=total_errores+1;
            mensaje:=SQLERRM;
            execute 'update log_pro_ver_ele_pen
                     set procesado=0, observacion=''Error: '||mensaje||
                     ''',fecha_transaccion=CURRENT_TIMESTAMP 
                     where id_log_pro_ver_ele_pen='
                    ||current_row.id_log_pro_ver_ele_pen;
        end;                       
    end loop;
    mensaje_retorno:='Total Personas Procesadas: '||total||
                     ', Total Elegibles: '||total_elegibles||
                     ', Total No Elegibles: '||total_no_elegibles||
                     ', Total Reprocesadas: '||total_reprocesadas||
                     ', Total Reprocesadas Elegibles: '||total_reprocesadas_elegibles||
                     ', Total Reprocesadas No Elegibles: '||total_reprocesadas_no_elegibles||
                     ', Total Vigentes: '||total_vigentes||
                     ', Total No Vigentes: '||total_no_vigentes||
                     ', Total Errores: '||total_errores;
    return mensaje_retorno;
end;
$$ language plpgsql;