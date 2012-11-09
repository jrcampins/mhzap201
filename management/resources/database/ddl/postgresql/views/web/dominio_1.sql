/**/
DROP VIEW IF EXISTS consulta_dominio_1;
/**/
CREATE OR REPLACE VIEW consulta_dominio_1 AS
SELECT
	dominio.id_dominio AS id_dominio,
	dominio.version_dominio AS version_dominio,
	dominio.codigo_dominio AS codigo_dominio,
	dominio.nombre_dominio AS nombre_dominio,
	dominio.descripcion_dominio AS descripcion_dominio,
	dominio.nombre_tabla AS nombre_tabla,
	dominio.numero_tipo_dominio AS numero_tipo_dominio,
		tipo_dominio_1x1.codigo_tipo_dominio AS codigo_tipo_dominio_1x1y2,
	dominio.id_clase_recurso AS id_clase_recurso,
		clase_recurso_1x2.codigo_clase_recurso AS codigo_clase_recurso_1x2y3,
		clase_recurso_1x2.nombre_clase_recurso AS nombre_clase_recurso_1x2y4,
		clase_recurso_1x2.descripcion_clase_recurso AS descripcion_clase_recurs_1x2y5,
		clase_recurso_1x2.es_clase_recurso_independiente AS es_clase_recurso_indepen_1x2y6,
		clase_recurso_1x2.es_clase_recurso_sin_detalle AS es_clase_recurso_sin_det_1x2y7,
		clase_recurso_1x2.es_clase_recurso_con_arbol AS es_clase_recurso_con_arb_1x2y8,
		clase_recurso_1x2.numero_tipo_clase_recurso AS numero_tipo_clase_recurs_1x2y9,
		clase_recurso_1x2.numero_tipo_recurso AS numero_tipo_recurso_1x2y10,
		clase_recurso_1x2.id_funcion_seleccion AS id_funcion_seleccion_1x2y11,
		clase_recurso_1x2.id_pagina_seleccion AS id_pagina_seleccion_1x2y12,
		clase_recurso_1x2.id_pagina_detalle AS id_pagina_detalle_1x2y13,
		clase_recurso_1x2.id_clase_recurso_maestro AS id_clase_recurso_maestr_1x2y14,
		clase_recurso_1x2.id_clase_recurso_segmento AS id_clase_recurso_segmen_1x2y15,
		clase_recurso_1x2.id_clase_recurso_base AS id_clase_recurso_base_1x2y16,
		clase_recurso_1x2.id_grupo_aplicacion AS id_grupo_aplicacion_1x2y17,
		clase_recurso_1x2.id_aplicacion_web AS id_aplicacion_web_1x2y18,
		clase_recurso_1x2.limite_filas_consulta AS limite_filas_consulta_1x2y19,
		clase_recurso_1x2.limite_filas_informe AS limite_filas_informe_1x2y20,
		clase_recurso_1x2.orden_presentacion AS orden_presentacion_1x2y21,
		clase_recurso_1x2.es_clase_recurso_insertable AS es_clase_recurso_insert_1x2y22,
		clase_recurso_1x2.es_clase_recurso_modificable AS es_clase_recurso_modifi_1x2y23,
		clase_recurso_1x2.es_clase_recurso_eliminable AS es_clase_recurso_elimin_1x2y24,
		clase_recurso_1x2.es_clase_recurso_extendida AS es_clase_recurso_extend_1x2y25,
		clase_recurso_1x2.etiqueta_hipervinculo AS etiqueta_hipervinculo_1x2y26,
		clase_recurso_1x2.es_enumerador_con_numero AS es_enumerador_con_numer_1x2y27,
		clase_recurso_1x2.alias_clase_recurso AS alias_clase_recurso_1x2y28,
	dominio.id_funcion_seleccion AS id_funcion_seleccion,
		funcion_1x3.codigo_funcion AS codigo_funcion_1x3y3,
		funcion_1x3.nombre_funcion AS nombre_funcion_1x3y4,
		funcion_1x3.descripcion_funcion AS descripcion_funcion_1x3y5,
		funcion_1x3.numero_tipo_funcion AS numero_tipo_funcion_1x3y6,
		funcion_1x3.numero_tipo_rastro_fun AS numero_tipo_rastro_fun_1x3y7,
		funcion_1x3.id_dominio AS id_dominio_1x3y8,
		funcion_1x3.clausula_where AS clausula_where_1x3y9,
		funcion_1x3.clausula_order AS clausula_order_1x3y10,
		funcion_1x3.es_publica AS es_publica_1x3y11,
		funcion_1x3.es_programatica AS es_programatica_1x3y12,
		funcion_1x3.es_personalizada AS es_personalizada_1x3y13,
		funcion_1x3.es_segmentada AS es_segmentada_1x3y14,
		funcion_1x3.id_grupo_proceso AS id_grupo_proceso_1x3y15,
	dominio.id_dominio_segmento AS id_dominio_segmento,
		dominio_1x4.codigo_dominio AS codigo_dominio_1x4y3,
		dominio_1x4.nombre_dominio AS nombre_dominio_1x4y4,
		dominio_1x4.descripcion_dominio AS descripcion_dominio_1x4y5,
		dominio_1x4.nombre_tabla AS nombre_tabla_1x4y6,
		dominio_1x4.numero_tipo_dominio AS numero_tipo_dominio_1x4y7,
		dominio_1x4.id_clase_recurso AS id_clase_recurso_1x4y8,
		dominio_1x4.id_funcion_seleccion AS id_funcion_seleccion_1x4y9,
		dominio_1x4.id_dominio_segmento AS id_dominio_segmento_1x4y10,
		dominio_1x4.id_paquete AS id_paquete_1x4y11,
	dominio.id_paquete AS id_paquete,
		paquete_1x5.codigo_paquete AS codigo_paquete_1x5y3
FROM
	dominio dominio
	INNER JOIN tipo_dominio tipo_dominio_1x1 ON tipo_dominio_1x1.numero_tipo_dominio = dominio.numero_tipo_dominio
	INNER JOIN clase_recurso clase_recurso_1x2 ON clase_recurso_1x2.id_clase_recurso = dominio.id_clase_recurso
	LEFT OUTER JOIN funcion funcion_1x3 ON funcion_1x3.id_funcion = dominio.id_funcion_seleccion
	LEFT OUTER JOIN dominio dominio_1x4 ON dominio_1x4.id_dominio = dominio.id_dominio_segmento
	LEFT OUTER JOIN paquete paquete_1x5 ON paquete_1x5.id_paquete = dominio.id_paquete;

