/**/
DROP VIEW IF EXISTS consulta_rol_funcion_1;
/**/
CREATE OR REPLACE VIEW consulta_rol_funcion_1 AS
SELECT
	rol_funcion.id_rol_funcion AS id_rol_funcion,
	rol_funcion.version_rol_funcion AS version_rol_funcion,
	rol_funcion.id_rol AS id_rol,
		rol_1x1.codigo_rol AS codigo_rol_1x1y3,
		rol_1x1.nombre_rol AS nombre_rol_1x1y4,
		rol_1x1.descripcion_rol AS descripcion_rol_1x1y5,
		rol_1x1.numero_tipo_rol AS numero_tipo_rol_1x1y6,
		rol_1x1.id_grupo_aplicacion AS id_grupo_aplicacion_1x1y7,
	rol_funcion.id_funcion AS id_funcion,
		funcion_1x2.codigo_funcion AS codigo_funcion_1x2y3,
		funcion_1x2.nombre_funcion AS nombre_funcion_1x2y4,
		funcion_1x2.descripcion_funcion AS descripcion_funcion_1x2y5,
		funcion_1x2.numero_tipo_funcion AS numero_tipo_funcion_1x2y6,
		funcion_1x2.numero_tipo_rastro_fun AS numero_tipo_rastro_fun_1x2y7,
		funcion_1x2.id_dominio AS id_dominio_1x2y8,
		funcion_1x2.clausula_where AS clausula_where_1x2y9,
		funcion_1x2.clausula_order AS clausula_order_1x2y10,
		funcion_1x2.es_publica AS es_publica_1x2y11,
		funcion_1x2.es_programatica AS es_programatica_1x2y12,
		funcion_1x2.es_personalizada AS es_personalizada_1x2y13,
		funcion_1x2.es_segmentada AS es_segmentada_1x2y14,
		funcion_1x2.id_grupo_proceso AS id_grupo_proceso_1x2y15,
	rol_funcion.id_conjunto_segmento AS id_conjunto_segmento,
		conjunto_segmento_1x3.codigo_conjunto_segmento AS codigo_conjunto_segmento_1x3y3,
		conjunto_segmento_1x3.nombre_conjunto_segmento AS nombre_conjunto_segmento_1x3y4,
		conjunto_segmento_1x3.descripcion_conjunto_segmento AS descripcion_conjunto_seg_1x3y5,
		conjunto_segmento_1x3.id_clase_recurso AS id_clase_recurso_1x3y6
FROM
	rol_funcion rol_funcion
	INNER JOIN rol rol_1x1 ON rol_1x1.id_rol = rol_funcion.id_rol
	INNER JOIN funcion funcion_1x2 ON funcion_1x2.id_funcion = rol_funcion.id_funcion
	LEFT OUTER JOIN conjunto_segmento conjunto_segmento_1x3 ON conjunto_segmento_1x3.id_conjunto_segmento = rol_funcion.id_conjunto_segmento;

