--
--Descripción: Este procedimiento asigna mesa a un lote de potenciales beneficiarios
--@param rastro: Identificador del proceso ejecutado.
--@param lote: Identificador del lote
--@param sime: Número de mesa de entrada
--@return: mensaje indicando el número de registros actualizados
--
function asignar_monto_pension(sime varchar2,monto number) return varchar2 is
    mensaje varchar2(2000);
    total number:=0;
    total_asignados number:=0;
    total_errores number:=0;
    total_lote  number:=0;
    numero_lote number;
    type pen_oto is record(
          id_persona number,
          codigo_persona varchar2 (50),
          nombre_persona varchar2(200),
          id_departamento number,
          id_distrito number,
          id_barrio number,
          numero_condicion_pension number);
    type vista_cons is table of pen_oto;
    vista_pen_oto vista_cons;
    err_number  constant number := -20000; -- an integer in the range -20000..-20999
    msg_string  varchar2(2000); -- a character string of at most 2048 bytes
begin
    if sime is null then
        msg_string := 'SIME no puede ser vacío';
        raise_application_error(err_number, msg_string, true);
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
                       and numero_condicion_pension=5'
    bulk collect into vista_pen_oto;
    if vista_pen_oto.count=0 then
        return 'No hay Personas pendientes por otorgar pensión';
    end if;
    for i in vista_pen_oto.first..vista_pen_oto.last loop
        begin
            total:=total+1;
            mensaje:=sp$persona.asignar_monto_pension(vista_pen_oto(i).id_persona,monto);
            if mensaje like 'Monto de pensión%' then
                total_asignados:=total_asignados+1;
            else
                total_errores:=total_errores+1;
            end if;
        exception when others then
            total_errores:=total_errores+1;
            continue;
        end;
    end loop;
    mensaje:='Se asignó monto a '||total_asignados||' pensiones. ';
    if total_errores>0 then
        mensaje:=mensaje||total_errores||' errores: persona sin pensión otorgada';
    end if;
    return mensaje;
end;