--
--Descripción: Este procedimiento otorga las pensiones aprobadas 
--@param rastro: Identificador del proceso ejecutado.
--@param ubicacion_consultada: Identificador de la ubicacion a consultar
--@param numero_resolucion: numero de la resolución en la que se otorgan las pensiones
--@param fecha_resolucion: fecha de la resolución en la que se otorgan las pensiones
--@return: 0 si no se produjo ninguna excepcion.
--
create or replace function proceso_otorgar_pensiones_apr(rastro bigint,ubicacion_consultada bigint,numero_resolucion varchar, fecha_resolucion timestamp) returns integer as $$
declare
mensaje varchar:='';
begin
    select proceso_otorgar_pensiones_apr(ubicacion_consultada,numero_resolucion,fecha_resolucion) into mensaje;
    return rastro_proceso_update(rastro, 21, null, mensaje);
end;
$$ language plpgsql;
--
--Descripción: Este procedimiento otorga las pensiones aprobadas
--@param ubicacion_consultada: Identificacion de la ubicacion donde se aprobaran las pensiones
--@param numero_resolucion: numero de la resolución en la que se otorga la pensión
--@param fecha_resolucion: fecha de la resolución en la que se otorga la pensión
--@return: mensaje indicando el numero de pensiones otorgadas
--
create or replace function proceso_otorgar_pensiones_apr(ubicacion_consultada bigint,numero_resolucion varchar, fecha_resolucion timestamp) returns varchar as $$
declare
    mensaje varchar:='';
    mensaje_retorno varchar:='';
    current_row log_pro_oto_pen_apr;
    segmento_consulta_ubicacion varchar:='';
    total integer:=0;
    total_otorgados integer:=0;
    total_rechazados integer:=0;
    total_errores integer:=0;
begin
    if numero_resolucion is null then
        raise exception 'Número de Resolución no puede ser vacío';
    end if;
    if fecha_resolucion is null then
        raise exception 'Fecha de Resolución no puede ser vacía';
    end if;
    --Determinamos si la ubicación sera un parametro a consultar o no
    if ubicacion_consultada is not null then
        segmento_consulta_ubicacion:='and (id_departamento='||ubicacion_consultada 
                                       ||'or id_distrito='||ubicacion_consultada
                                       ||'or id_barrio='||ubicacion_consultada||');';
    else
         segmento_consulta_ubicacion:=';';
    end if;
    --llenamos la tabla log con los registros a procesar
    --Se procesan los registros que hayan sido 
    --actualizados como aprobados en el proceso anterior y que desde ese proceso
    --no hayan sido revocados
    for current_row in execute 'select null, id_persona, codigo_persona, nombre_persona, 
                                id_distrito, id_departamento, id_barrio , numero_condicion_pension
                                from persona 
                                where numero_condicion_pension=2 '||segmento_consulta_ubicacion loop
        current_row.id_log_pro_oto_pen_apr:=bigintid();
        insert into log_pro_oto_pen_apr values (current_row.*);                        
    end loop;
    --Se procesan los registros
    for current_row in select * from log_pro_oto_pen_apr where procesado is null loop
        begin
            total:=total+1;
            mensaje:= persona_otorgar_pension_aprobada(current_row.id_persona,numero_resolucion,fecha_resolucion, 'Pensión Otorgada Automáticamente');
            if(mensaje like '%Pensión Otorgada%') then
                total_otorgados:=total_otorgados+1;
            else
                total_rechazados:=total_rechazados+1;
            end if;
            execute 'update log_pro_oto_pen_apr
                     set procesado=1, observacion='''||mensaje||
                     ''' where id_log_pro_oto_pen_apr='||current_row.id_log_pro_oto_pen_apr;
        exception when others then
            total_errores:=total_errores+1;
            mensaje:=SQLERRM;
            execute 'update log_pro_oto_pen_apr
                     set procesado=1, observacion='''||mensaje||
                     ''' where id_log_pro_oto_pen_apr='||current_row.id_log_pro_oto_pen_apr;
        end;                       
     end loop;
     mensaje_retorno:='Total de Personas Procesadas: '||total
                      ||', Pensiones Otorgadas: '||total_otorgados
                      ||', Pensiones No Otorgadas: '||total_rechazados
                      ||', Errores: '||total_errores ;
     return mensaje_retorno;                 
end;
$$ language plpgsql;