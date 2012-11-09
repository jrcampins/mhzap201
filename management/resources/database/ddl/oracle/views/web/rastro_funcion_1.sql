/**/
exec xsp.dropone('view','consulta_rastro_funcion_1');
/**/
CREATE VIEW consulta_rastro_funcion_1 AS
SELECT
	rastro_funcion.id_rastro_funcion AS id_rastro_funcion,
	rastro_funcion.fecha_hora_ejecucion AS fecha_hora_ejecucion,
	rastro_funcion.id_usuario AS id_usuario,
	rastro_funcion.id_funcion AS id_funcion,
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
	rastro_funcion.id_recurso AS id_recurso,
	rastro_funcion.version_recurso AS version_recurso,
	rastro_funcion.codigo_recurso AS codigo_recurso,
	rastro_funcion.nombre_recurso AS nombre_recurso,
	rastro_funcion.id_propietario_recurso AS id_propietario_recurso,
	rastro_funcion.id_segmento_recurso AS id_segmento_recurso,
	rastro_funcion.numero_error AS numero_error,
	rastro_funcion.descripcion_error AS descripcion_error
FROM
	rastro_funcion rastro_funcion
	INNER JOIN funcion funcion_1x1 ON funcion_1x1.id_funcion = rastro_funcion.id_funcion;

