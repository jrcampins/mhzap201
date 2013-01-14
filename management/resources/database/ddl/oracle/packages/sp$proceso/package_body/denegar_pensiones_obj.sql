--
--Descripción: Este procedimiento otorga las pensiones aprobadas
--@param ubicacion_consultada: Identificacion de la ubicacion donde se aprobaran las pensiones
--@param numero_resolucion: numero de la resolución en la que se otorga la pensión
--@param fecha_resolucion: fecha de la resolución en la que se otorga la pensión
--@return: mensaje indicando el numero de pensiones otorgadas
--
function denegar_pensiones_obj(ubicacion_consultada number,numero_resolucion varchar2, fecha_resolucion timestamp) return varchar2 is

    mensaje varchar2(2000):='';
    mensaje_retorno varchar2(2000):='';
    segmento_consulta_ubicacion varchar2(2000):='';
    total number:=0;
    total_denegados number:=0;
    total_errores number:=0;
    type pen_den is record(
          id_persona number,
          codigo_persona varchar2 (50),
          nombre_persona varchar2(200),
          id_distrito number,
          id_departamento number,
          id_barrio number,
          numero_condicion_pension number);
    type cons_pen_den is table of pen_den;
    id_reg number;
    vista_pen_den cons_pen_den;
    type log_proceso is table of log_pro_den_pen_obj%rowtype;
    table_log log_proceso;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    if numero_resolucion is null then
        msg_string:='Número de Resolución no puede ser vacío';
        raise_application_error(err_number, msg_string, true);
    end if;
    if fecha_resolucion is null then
        msg_string:='Fecha de Resolución no puede ser vacía';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Determinamos si la ubicación sera un parametro a consultar o no
    if ubicacion_consultada is not null then
        segmento_consulta_ubicacion:='and (id_departamento='||ubicacion_consultada 
                                       ||'or id_distrito='||ubicacion_consultada
                                       ||'or id_barrio='||ubicacion_consultada||')';
    else
         segmento_consulta_ubicacion:='';
    end if;
    --llenamos la tabla log con los registros a procesar
    --Se procesan los registros que hayan sido 
    --actualizados como objetados en el proceso anterior y que desde ese proceso
    --no hayan sido revocados
    execute immediate 'select id_persona, 
                              codigo_persona, 
                              nombre_persona, 
                              id_distrito, 
                              id_departamento, 
                              id_barrio , 
                              numero_condicion_pension
                       from persona 
                       where numero_condicion_pension=3 '||segmento_consulta_ubicacion
    bulk collect into vista_pen_den;
    if vista_pen_den.count=0 then
        return 'No hay Personas pendientes por resolución denegatoria';
    end if;
    for i in vista_pen_den.first..vista_pen_den.last loop
            id_reg:=utils.bigintid();
            insert into log_pro_den_pen_obj values (
                        id_reg,
                        0, -- version
                        vista_pen_den(i).id_persona, 
                        vista_pen_den(i).codigo_persona, 
                        vista_pen_den(i).nombre_persona, 
                        vista_pen_den(i).id_distrito, 
                        vista_pen_den(i).id_departamento, 
                        vista_pen_den(i).id_barrio, 
                        vista_pen_den(i).numero_condicion_pension,
                        0,
                        null,
                        current_timestamp);
            --dbms_output.put_line( 'Insertando id ('||i||')='||vista_pen_den(i).id_persona );
    end loop;
    --Se procesan los registros
    execute immediate 'select * from log_pro_den_pen_obj where es_procesado=0 and observacion is null'
    bulk collect into table_log;
    if table_log.count=0 then
        return 'No hay registros de personas pendientes por procesar';
    end if;
    for i in table_log.first..table_log.last loop
        begin
            total:=total+1;
            mensaje:= sp$persona.denegar_pension(table_log(i).id_persona,numero_resolucion,fecha_resolucion, 'Pensión Denegada Automáticamente');
            if(mensaje like '%Pensión Denegada%') then
                total_denegados:=total_denegados+1;
            else
                total_errores:=total_errores+1;
            end if;
            execute immediate 'update log_pro_den_pen_obj
                     set es_procesado=1, observacion='''||mensaje||
                     ''' where id_log_pro_den_pen_obj='||table_log(i).id_log_pro_den_pen_obj;
        exception when others then
            total_errores:=total_errores+1;
            mensaje:=SQLERRM;
            execute immediate 'update log_pro_den_pen_obj
                     set es_procesado=1, observacion='''||mensaje||
                     ''' where id_log_pro_oto_pen_apr='||table_log(i).id_log_pro_den_pen_obj;
        end;
        mensaje_retorno:='Total de Personas Procesadas: '||total
                      ||', Pensiones Denegadas: '||total_denegados
                      ||', Total Excepciones: '||total_errores ;
     end loop;
     return mensaje_retorno;                 
end;
