create or replace function rastro_proceso_insert(id number, usuario number, funcion number) return number is
    row_rastro_proceso rastro_proceso%rowtype;
begin
    row_rastro_proceso.id_rastro_proceso                  := id;
    row_rastro_proceso.version_rastro_proceso             := 0;
    row_rastro_proceso.fecha_hora_inicio_ejecucion        := CURRENT_TIMESTAMP;
    row_rastro_proceso.id_usuario                         := usuario;
    row_rastro_proceso.id_funcion                         := funcion;
    row_rastro_proceso.numero_condicion_eje_fun           := 11;
    row_rastro_proceso.id_grupo_proceso            	  := sp$grupo_proceso.do_lock(id, funcion);
    row_rastro_proceso.subprocesos             	          := 0;
    row_rastro_proceso.subprocesos_pendientes             := 0;
    row_rastro_proceso.subprocesos_en_progreso            := 0;
    row_rastro_proceso.subprocesos_sin_errores            := 0;
    row_rastro_proceso.subprocesos_con_errores            := 0;
    row_rastro_proceso.subprocesos_cancelados             := 0;
    /**/
    insert into rastro_proceso values row_rastro_proceso;
    /**/
    return 0;
end;
/
show errors
