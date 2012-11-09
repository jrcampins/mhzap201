/**/
DROP VIEW IF EXISTS consulta_rastro_proceso_1;
/**/
CREATE OR REPLACE VIEW consulta_rastro_proceso_1 AS
SELECT
	rastro_proceso.id_rastro_proceso AS id_rastro_proceso,
	rastro_proceso.version_rastro_proceso AS version_rastro_proceso,
	rastro_proceso.fecha_hora_inicio_ejecucion AS fecha_hora_inicio_ejecucion,
	rastro_proceso.fecha_hora_fin_ejecucion AS fecha_hora_fin_ejecucion,
	rastro_proceso.id_usuario AS id_usuario,
	rastro_proceso.id_funcion AS id_funcion,
		funcion_1x1.codigo_funcion AS codigo_funcion_1x1y3,
		funcion_1x1.nombre_funcion AS nombre_funcion_1x1y4,
		funcion_1x1.descripcion_funcion AS descripcion_funcion_1x1y5,
		funcion_1x1.numero_tipo_funcion AS numero_tipo_funcion_1x1y6,
		funcion_1x1.numero_tipo_rastro_fun AS numero_tipo_rastro_fun_1x1y7,
		funcion_1x1.id_dominio AS id_dominio_1x1y8,
		funcion_1x1.clausula_where AS clausula_where_1x1y9,
		funcion_1x1.clausula_order AS clausula_order_1x1y10,
		funcion_1x1.es_publica AS es_publica_1x1y11,
		funcion_1x1.es_programatica AS es_programatica_1x1y12,
		funcion_1x1.es_personalizada AS es_personalizada_1x1y13,
		funcion_1x1.es_segmentada AS es_segmentada_1x1y14,
		funcion_1x1.id_grupo_proceso AS id_grupo_proceso_1x1y15,
	rastro_proceso.numero_condicion_eje_fun AS numero_condicion_eje_fun,
		condicion_eje_fun_1x2.codigo_condicion_eje_fun AS codigo_condicion_eje_fun_1x2y2,
	rastro_proceso.nombre_archivo AS nombre_archivo,
	rastro_proceso.descripcion_error AS descripcion_error,
	rastro_proceso.id_grupo_proceso AS id_grupo_proceso,
	rastro_proceso.id_rastro_proceso_superior AS id_rastro_proceso_superior,
	rastro_proceso.subprocesos AS subprocesos,
	rastro_proceso.subprocesos_pendientes AS subprocesos_pendientes,
	rastro_proceso.subprocesos_en_progreso AS subprocesos_en_progreso,
	rastro_proceso.subprocesos_sin_errores AS subprocesos_sin_errores,
	rastro_proceso.subprocesos_con_errores AS subprocesos_con_errores,
	rastro_proceso.subprocesos_cancelados AS subprocesos_cancelados,
	rastro_proceso.procedimiento_after_update AS procedimiento_after_update
FROM
	rastro_proceso rastro_proceso
	INNER JOIN funcion funcion_1x1 ON funcion_1x1.id_funcion = rastro_proceso.id_funcion
	INNER JOIN condicion_eje_fun condicion_eje_fun_1x2 ON condicion_eje_fun_1x2.numero_condicion_eje_fun = rastro_proceso.numero_condicion_eje_fun;

