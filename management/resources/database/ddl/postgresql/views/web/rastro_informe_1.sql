/**/
DROP VIEW IF EXISTS consulta_rastro_informe_1;
/**/
CREATE OR REPLACE VIEW consulta_rastro_informe_1 AS
SELECT
	rastro_informe.id_rastro_informe AS id_rastro_informe,
	rastro_informe.version_rastro_informe AS version_rastro_informe,
	rastro_informe.fecha_hora_inicio_ejecucion AS fecha_hora_inicio_ejecucion,
	rastro_informe.fecha_hora_fin_ejecucion AS fecha_hora_fin_ejecucion,
	rastro_informe.id_usuario AS id_usuario,
	rastro_informe.id_funcion AS id_funcion,
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
	rastro_informe.numero_condicion_eje_fun AS numero_condicion_eje_fun,
		condicion_eje_fun_1x2.codigo_condicion_eje_fun AS codigo_condicion_eje_fun_1x2y2,
	rastro_informe.nombre_archivo AS nombre_archivo,
	rastro_informe.descripcion_error AS descripcion_error
FROM
	rastro_informe rastro_informe
	INNER JOIN funcion funcion_1x1 ON funcion_1x1.id_funcion = rastro_informe.id_funcion
	INNER JOIN condicion_eje_fun condicion_eje_fun_1x2 ON condicion_eje_fun_1x2.numero_condicion_eje_fun = rastro_informe.numero_condicion_eje_fun;

