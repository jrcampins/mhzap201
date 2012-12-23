--
--Descripción: Este procedimiento otorga las pensiones aprobadas
--@param ubicacion_consultada: Identificacion de la ubicacion donde se aprobaran las pensiones
--@param numero_resolucion: numero de la resolución en la que se otorga la pensión
--@param fecha_resolucion: fecha de la resolución en la que se otorga la pensión
--@return: mensaje indicando el numero de pensiones otorgadas
--
function otorgar_pensiones_apr(ubicacion_consultada number,numero_resolucion varchar2, fecha_resolucion timestamp) return varchar2 is

    mensaje varchar2(2000):='';
    mensaje_retorno varchar2(2000):='';
    segmento_consulta_ubicacion varchar2(2000):='';
    total number:=0;
    total_otorgados number:=0;
    total_rechazados number:=0;
    total_errores number:=0;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    type pen_oto is record(
          id_persona number,
          codigo_persona varchar2 (50),
          nombre_persona varchar2(200),
          id_distrito number,
          id_departamento number,
          id_barrio number,
          numero_condicion_pension number);
     type cons_pen_oto is table of pen_oto;
     id_reg number;
     vista_pen_oto cons_pen_oto;
     type log_proceso is table of log_pro_oto_pen_apr%rowtype;
     table_log log_proceso;
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
    --actualizados como aprobados en el proceso anterior y que desde ese proceso
    --no hayan sido revocados
    execute immediate 'select id_persona, 
                              codigo_persona, 
                              nombre_persona, 
                              id_distrito, 
                              id_departamento, 
                              id_barrio , 
                              numero_condicion_pension
                       from persona 
                       where numero_condicion_pension=2 '||segmento_consulta_ubicacion
    bulk collect into vista_pen_oto;
    if vista_pen_oto.count=0 then
        return 'No hay Personas pendientes por otorgar pensión';
    end if;
    for i in vista_pen_oto.first..vista_pen_oto.last loop
            id_reg:=utils.bigintid();
            insert into log_pro_oto_pen_apr values (
                        id_reg,
                        0, -- version
                        vista_pen_oto(i).id_persona, 
                        vista_pen_oto(i).codigo_persona, 
                        vista_pen_oto(i).nombre_persona, 
                        vista_pen_oto(i).id_distrito, 
                        vista_pen_oto(i).id_departamento, 
                        vista_pen_oto(i).id_barrio, 
                        vista_pen_oto(i).numero_condicion_pension,
                        0,
                        null,
                        current_timestamp);
            --dbms_output.put_line( 'Insertando id ('||i||')='||vista_pen_oto(i).id_persona );
    end loop;
    --Se procesan los registros
    execute immediate 'select * from log_pro_oto_pen_apr where es_procesado=0 and observacion is null'
    bulk collect into table_log;
    if table_log.count=0 then
        return 'No hay registros de personas pendientes por procesar';
    end if;
    for i in table_log.first..table_log.last loop
        begin
            total:=total+1;
            mensaje:= sp$persona.otorgar_pension(table_log(i).id_persona,numero_resolucion,fecha_resolucion, 'Pensión Otorgada Automáticamente');
            if(mensaje like '%Pensión Otorgada%') then
                total_otorgados:=total_otorgados+1;
            else
                total_rechazados:=total_rechazados+1;
            end if;
            execute immediate 'update log_pro_oto_pen_apr
                     set es_procesado=1, observacion='''||mensaje||
                     ''' where id_log_pro_oto_pen_apr='||table_log(i).id_log_pro_oto_pen_apr;
        exception when others then
            total_errores:=total_errores+1;
            mensaje:=SQLERRM;
            execute immediate 'update log_pro_oto_pen_apr
                     set es_procesado=1, observacion='''||mensaje||
                     ''' where id_log_pro_oto_pen_apr='||table_log(i).id_log_pro_oto_pen_apr;
        end;                       
     end loop;
     mensaje_retorno:='Total de Personas Procesadas: '||total
                      ||', Pensiones Otorgadas: '||total_otorgados
                      ||', Pensiones No Otorgadas: '||total_rechazados
                      ||', Total Excepciones: '||total_errores ;
     return mensaje_retorno;                 
end;
