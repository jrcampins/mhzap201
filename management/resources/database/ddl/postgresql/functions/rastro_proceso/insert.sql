create or replace function rastro_proceso_insert(rastro bigint, u bigint, f bigint) returns bigint as $$
declare
	grupo bigint := NULL;
	row_rastro_proceso rastro_proceso;
begin
	select grupo_proceso_lock(rastro, f) into grupo;
--	row_rastro_proceso.id_rastro_proceso                  = nextval('id_rastro_proceso');
--	row_rastro_proceso.id_rastro_proceso                  = EXTRACT(EPOCH FROM CURRENT_TIMESTAMP);
	row_rastro_proceso.id_rastro_proceso                  = rastro;
	row_rastro_proceso.version_rastro_proceso             = 0;
	row_rastro_proceso.fecha_hora_inicio_ejecucion        = CURRENT_TIMESTAMP;
	row_rastro_proceso.id_usuario                         = u;
	row_rastro_proceso.id_funcion                         = f;
	row_rastro_proceso.numero_condicion_eje_fun = 11;
	row_rastro_proceso.id_grupo_proceso            	      = grupo;
	row_rastro_proceso.subprocesos             	      = 0;
	row_rastro_proceso.subprocesos_pendientes             = 0;
	row_rastro_proceso.subprocesos_en_progreso            = 0;
	row_rastro_proceso.subprocesos_sin_errores            = 0;
	row_rastro_proceso.subprocesos_con_errores            = 0;
	row_rastro_proceso.subprocesos_cancelados             = 0;
	/**/
	insert into rastro_proceso select row_rastro_proceso.*;
	/**/
	return row_rastro_proceso.id_rastro_proceso;
end;
$$ language plpgsql;
