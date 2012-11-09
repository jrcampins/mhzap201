if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_clase_recurso_par_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_clase_recurso_par_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_clase_recurso_par_1] AS
SELECT
	clase_recurso_par.id_clase_recurso_par AS id_clase_recurso_par,
	clase_recurso_par.version_clase_recurso_par AS version_clase_recurso_par,
	clase_recurso_par.id_clase_recurso AS id_clase_recurso,
		clase_recurso_1x1.codigo_clase_recurso AS codigo_clase_recurso_1x1y3,
		clase_recurso_1x1.nombre_clase_recurso AS nombre_clase_recurso_1x1y4,
		clase_recurso_1x1.descripcion_clase_recurso AS descripcion_clase_recurs_1x1y5,
		clase_recurso_1x1.es_clase_recurso_independiente AS es_clase_recurso_indepen_1x1y6,
		clase_recurso_1x1.es_clase_recurso_sin_detalle AS es_clase_recurso_sin_det_1x1y7,
		clase_recurso_1x1.es_clase_recurso_con_arbol AS es_clase_recurso_con_arb_1x1y8,
		clase_recurso_1x1.numero_tipo_clase_recurso AS numero_tipo_clase_recurs_1x1y9,
		clase_recurso_1x1.numero_tipo_recurso AS numero_tipo_recurso_1x1y10,
		clase_recurso_1x1.id_funcion_seleccion AS id_funcion_seleccion_1x1y11,
		clase_recurso_1x1.id_pagina_seleccion AS id_pagina_seleccion_1x1y12,
		clase_recurso_1x1.id_pagina_detalle AS id_pagina_detalle_1x1y13,
		clase_recurso_1x1.id_clase_recurso_maestro AS id_clase_recurso_maestr_1x1y14,
		clase_recurso_1x1.id_clase_recurso_segmento AS id_clase_recurso_segmen_1x1y15,
		clase_recurso_1x1.id_clase_recurso_base AS id_clase_recurso_base_1x1y16,
		clase_recurso_1x1.id_grupo_aplicacion AS id_grupo_aplicacion_1x1y17,
		clase_recurso_1x1.id_aplicacion_web AS id_aplicacion_web_1x1y18,
		clase_recurso_1x1.limite_filas_consulta AS limite_filas_consulta_1x1y19,
		clase_recurso_1x1.limite_filas_informe AS limite_filas_informe_1x1y20,
		clase_recurso_1x1.orden_presentacion AS orden_presentacion_1x1y21,
		clase_recurso_1x1.es_clase_recurso_insertable AS es_clase_recurso_insert_1x1y22,
		clase_recurso_1x1.es_clase_recurso_modificable AS es_clase_recurso_modifi_1x1y23,
		clase_recurso_1x1.es_clase_recurso_eliminable AS es_clase_recurso_elimin_1x1y24,
		clase_recurso_1x1.es_clase_recurso_extendida AS es_clase_recurso_extend_1x1y25,
		clase_recurso_1x1.etiqueta_hipervinculo AS etiqueta_hipervinculo_1x1y26,
		clase_recurso_1x1.es_enumerador_con_numero AS es_enumerador_con_numer_1x1y27,
		clase_recurso_1x1.alias_clase_recurso AS alias_clase_recurso_1x1y28,
	clase_recurso_par.id_parametro AS id_parametro,
		parametro_1x2.codigo_parametro AS codigo_parametro_1x2y3,
		parametro_1x2.nombre_parametro AS nombre_parametro_1x2y4,
		parametro_1x2.detalle_parametro AS detalle_parametro_1x2y5,
		parametro_1x2.descripcion_parametro AS descripcion_parametro_1x2y6,
		parametro_1x2.numero_tipo_dato_par AS numero_tipo_dato_par_1x2y7,
		parametro_1x2.alias_parametro AS alias_parametro_1x2y8,
	clase_recurso_par.numero_tipo_parametro AS numero_tipo_parametro,
		tipo_parametro_1x3.codigo_tipo_parametro AS codigo_tipo_parametro_1x3y2,
	clase_recurso_par.numero_tipo_comparacion AS numero_tipo_comparacion,
		tipo_comparacion_1x4.codigo_tipo_comparacion AS codigo_tipo_comparacion_1x4y2,
	clase_recurso_par.id_funcion_referencia AS id_funcion_referencia,
		funcion_1x5.codigo_funcion AS codigo_funcion_1x5y3,
		funcion_1x5.nombre_funcion AS nombre_funcion_1x5y4,
		funcion_1x5.descripcion_funcion AS descripcion_funcion_1x5y5,
		funcion_1x5.numero_tipo_funcion AS numero_tipo_funcion_1x5y6,
		funcion_1x5.numero_tipo_rastro_fun AS numero_tipo_rastro_fun_1x5y7,
		funcion_1x5.id_dominio AS id_dominio_1x5y8,
		funcion_1x5.clausula_where AS clausula_where_1x5y9,
		funcion_1x5.clausula_order AS clausula_order_1x5y10,
		funcion_1x5.es_publica AS es_publica_1x5y11,
		funcion_1x5.es_programatica AS es_programatica_1x5y12,
		funcion_1x5.es_personalizada AS es_personalizada_1x5y13,
		funcion_1x5.es_segmentada AS es_segmentada_1x5y14,
		funcion_1x5.id_grupo_proceso AS id_grupo_proceso_1x5y15,
	clase_recurso_par.numero_tipo_valor AS numero_tipo_valor,
		tipo_valor_1x6.codigo_tipo_valor AS codigo_tipo_valor_1x6y2,
	clase_recurso_par.id_lista_valor AS id_lista_valor,
	clase_recurso_par.id_clase_objeto_valor AS id_clase_objeto_valor,
	clase_recurso_par.id_clase_recurso_valor AS id_clase_recurso_valor,
		clase_recurso_1x7.codigo_clase_recurso AS codigo_clase_recurso_1x7y3,
		clase_recurso_1x7.nombre_clase_recurso AS nombre_clase_recurso_1x7y4,
		clase_recurso_1x7.descripcion_clase_recurso AS descripcion_clase_recurs_1x7y5,
		clase_recurso_1x7.es_clase_recurso_independiente AS es_clase_recurso_indepen_1x7y6,
		clase_recurso_1x7.es_clase_recurso_sin_detalle AS es_clase_recurso_sin_det_1x7y7,
		clase_recurso_1x7.es_clase_recurso_con_arbol AS es_clase_recurso_con_arb_1x7y8,
		clase_recurso_1x7.numero_tipo_clase_recurso AS numero_tipo_clase_recurs_1x7y9,
		clase_recurso_1x7.numero_tipo_recurso AS numero_tipo_recurso_1x7y10,
		clase_recurso_1x7.id_funcion_seleccion AS id_funcion_seleccion_1x7y11,
		clase_recurso_1x7.id_pagina_seleccion AS id_pagina_seleccion_1x7y12,
		clase_recurso_1x7.id_pagina_detalle AS id_pagina_detalle_1x7y13,
		clase_recurso_1x7.id_clase_recurso_maestro AS id_clase_recurso_maestr_1x7y14,
		clase_recurso_1x7.id_clase_recurso_segmento AS id_clase_recurso_segmen_1x7y15,
		clase_recurso_1x7.id_clase_recurso_base AS id_clase_recurso_base_1x7y16,
		clase_recurso_1x7.id_grupo_aplicacion AS id_grupo_aplicacion_1x7y17,
		clase_recurso_1x7.id_aplicacion_web AS id_aplicacion_web_1x7y18,
		clase_recurso_1x7.limite_filas_consulta AS limite_filas_consulta_1x7y19,
		clase_recurso_1x7.limite_filas_informe AS limite_filas_informe_1x7y20,
		clase_recurso_1x7.orden_presentacion AS orden_presentacion_1x7y21,
		clase_recurso_1x7.es_clase_recurso_insertable AS es_clase_recurso_insert_1x7y22,
		clase_recurso_1x7.es_clase_recurso_modificable AS es_clase_recurso_modifi_1x7y23,
		clase_recurso_1x7.es_clase_recurso_eliminable AS es_clase_recurso_elimin_1x7y24,
		clase_recurso_1x7.es_clase_recurso_extendida AS es_clase_recurso_extend_1x7y25,
		clase_recurso_1x7.etiqueta_hipervinculo AS etiqueta_hipervinculo_1x7y26,
		clase_recurso_1x7.es_enumerador_con_numero AS es_enumerador_con_numer_1x7y27,
		clase_recurso_1x7.alias_clase_recurso AS alias_clase_recurso_1x7y28,
	clase_recurso_par.valor_minimo AS valor_minimo,
	clase_recurso_par.valor_maximo AS valor_maximo,
	clase_recurso_par.valor_omision AS valor_omision,
	clase_recurso_par.es_parametro_omisible AS es_parametro_omisible,
	clase_recurso_par.es_parametro_inmutable AS es_parametro_inmutable,
	clase_recurso_par.es_parametro_submit AS es_parametro_submit,
	clase_recurso_par.es_parametro_primordial AS es_parametro_primordial,
	clase_recurso_par.es_parametro_maestro AS es_parametro_maestro,
	clase_recurso_par.es_parametro_segmento AS es_parametro_segmento,
	clase_recurso_par.es_parametro_sin_rastro AS es_parametro_sin_rastro,
	clase_recurso_par.es_parametro_sincronizado AS es_parametro_sincronizado,
	clase_recurso_par.orden_presentacion AS orden_presentacion,
	clase_recurso_par.id_clase_recurso_sec AS id_clase_recurso_sec,
		clase_recurso_sec_1x8.id_clase_recurso AS id_clase_recurso_1x8y3,
		clase_recurso_sec_1x8.etiqueta_clase_recurso_sec AS etiqueta_clase_recurso_s_1x8y4,
		clase_recurso_sec_1x8.descripcion_clase_recurso_sec AS descripcion_clase_recurs_1x8y5,
		clase_recurso_sec_1x8.orden_presentacion AS orden_presentacion_1x8y6,
		clase_recurso_sec_1x8.es_pestana_detalle AS es_pestana_detalle_1x8y7,
	clase_recurso_par.es_referencia_alternativa AS es_referencia_alternativa,
	clase_recurso_par.numero_tipo_valor_alternativo AS numero_tipo_valor_alternativo,
		tipo_valor_1x9.codigo_tipo_valor AS codigo_tipo_valor_1x9y2,
	clase_recurso_par.id_funcion_referencia_alt AS id_funcion_referencia_alt,
	clase_recurso_par.id_lista_valor_alternativa AS id_lista_valor_alternativa,
	clase_recurso_par.id_clase_objeto_valor_alt AS id_clase_objeto_valor_alt,
	clase_recurso_par.id_clase_recurso_valor_alt AS id_clase_recurso_valor_alt,
	clase_recurso_par.orden_pagina_seleccion AS orden_pagina_seleccion
FROM
	clase_recurso_par clase_recurso_par
	INNER JOIN clase_recurso clase_recurso_1x1 ON clase_recurso_1x1.id_clase_recurso = clase_recurso_par.id_clase_recurso
	INNER JOIN parametro parametro_1x2 ON parametro_1x2.id_parametro = clase_recurso_par.id_parametro
	INNER JOIN tipo_parametro tipo_parametro_1x3 ON tipo_parametro_1x3.numero_tipo_parametro = clase_recurso_par.numero_tipo_parametro
	LEFT OUTER JOIN tipo_comparacion tipo_comparacion_1x4 ON tipo_comparacion_1x4.numero_tipo_comparacion = clase_recurso_par.numero_tipo_comparacion
	LEFT OUTER JOIN funcion funcion_1x5 ON funcion_1x5.id_funcion = clase_recurso_par.id_funcion_referencia
	INNER JOIN tipo_valor tipo_valor_1x6 ON tipo_valor_1x6.numero_tipo_valor = clase_recurso_par.numero_tipo_valor
	LEFT OUTER JOIN clase_recurso clase_recurso_1x7 ON clase_recurso_1x7.id_clase_recurso = clase_recurso_par.id_clase_recurso_valor
	LEFT OUTER JOIN clase_recurso_sec clase_recurso_sec_1x8 ON clase_recurso_sec_1x8.id_clase_recurso_sec = clase_recurso_par.id_clase_recurso_sec
	LEFT OUTER JOIN tipo_valor tipo_valor_1x9 ON tipo_valor_1x9.numero_tipo_valor = clase_recurso_par.numero_tipo_valor_alternativo
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
