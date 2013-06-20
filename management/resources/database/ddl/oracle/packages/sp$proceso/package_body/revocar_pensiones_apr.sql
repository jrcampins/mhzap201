--
--Descripción: Este procedimiento revoca las pensiones aprobadas
--@param ubicacion_consultada: Identificacion de la ubicacion donde se aprobaran las pensiones
--@param numero_resolucion: numero de la resolución en la que se otorga la pensión
--@param fecha_resolucion: fecha de la resolución en la que se otorga la pensión
--@return: mensaje indicando el numero de pensiones otorgadas
--
function revocar_pensiones_apr(sime varchar2, fecha_resolucion timestamp, numero_resolucion varchar2, cedula_desde varchar2, cedula_hasta varchar2) return varchar2 is

    mensaje varchar2(2000):='';
    mensaje_retorno varchar2(2000):='';
    segmento_consulta varchar2(2000):='';
    total number:=0;
    total_revrgados number:=0;
    total_rechazados number:=0;
    total_errores number:=0;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
    type pen_rev is record(
          id_persona number,
          codigo_persona varchar2 (50),
          nombre_persona varchar2(200),
          id_departamento number,
          id_distrito number,
          id_barrio number,
          numero_condicion_pension number);
     type cons_pen_rev is table of pen_rev;
     id_reg number;
     vista_pen_rev cons_pen_rev;
     valor_sime varchar2(2000);
begin
    valor_sime:=sime;
    if sime is null then
        msg_string:='Código de SIME no puede ser vacío';
        raise_application_error(err_number, msg_string, true);
    end if;
    if numero_resolucion is null then
        msg_string:='Número de Resolución no puede ser vacío';
        raise_application_error(err_number, msg_string, true);
    end if;
    if fecha_resolucion is null then
        msg_string:='Fecha de Resolución no puede ser vacía';
        raise_application_error(err_number, msg_string, true);
    end if;
    --Determinamos si la cédula será un parámetro a consultar o no
    if cedula_desde is not null then
        segmento_consulta:=segmento_consulta||' and numero_cedula>='''||cedula_desde||'''';
    end if;
    if cedula_hasta is not null then
        segmento_consulta:=segmento_consulta||' and numero_cedula<='''||cedula_hasta||'''';
    end if;
    --llenamos la tabla log con los registros a procesar
    --Se procesan los registros que hayan sido 
    --actualizados como aprobados en el proceso anterior y que desde ese proceso
    --no hayan sido revocados
    execute immediate 'select id_persona, 
                              codigo_persona, 
                              nombre_persona,
                              id_departamento,
                              id_distrito, 
                              id_barrio , 
                              numero_condicion_pension
                       from persona 
                       where codigo_sime='''||sime||'''
                       and numero_condicion_pension=4 '||segmento_consulta
    bulk collect into vista_pen_rev;
    if vista_pen_rev.count=0 then
        return 'No hay Personas pendientes por asignar resolución revocatoria';
    end if;
    for i in vista_pen_rev.first..vista_pen_rev.last loop
        total:=total+1;
        update persona
        set numero_resolucion_rev_pen=numero_resolucion,
        fecha_Resolucion_rev_pen=trunc(fecha_resolucion)
        where id_persona=vista_pen_rev(i).id_persona;
    end loop;
    mensaje_retorno:='Total de personas con resolución revocatoria ('||numero_resolucion||') : '||total;
    return mensaje_retorno;                 
end;
