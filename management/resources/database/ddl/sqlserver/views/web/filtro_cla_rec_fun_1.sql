if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_filtro_cla_rec_fun_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_filtro_cla_rec_fun_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_filtro_cla_rec_fun_1] AS
SELECT
	filtro_cla_rec_fun.id_filtro_cla_rec_fun AS id_filtro_cla_rec_fun,
	filtro_cla_rec_fun.version_filtro_cla_rec_fun AS version_filtro_cla_rec_fun,
	filtro_cla_rec_fun.id_funcion AS id_funcion,
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
	filtro_cla_rec_fun.id_clase_recurso_par_columna AS id_clase_recurso_par_columna,
		clase_recurso_par_1x2.id_clase_recurso AS id_clase_recurso_1x2y3,
		clase_recurso_par_1x2.id_parametro AS id_parametro_1x2y4,
		clase_recurso_par_1x2.numero_tipo_parametro AS numero_tipo_parametro_1x2y5,
		clase_recurso_par_1x2.numero_tipo_comparacion AS numero_tipo_comparacion_1x2y6,
		clase_recurso_par_1x2.id_funcion_referencia AS id_funcion_referencia_1x2y7,
		clase_recurso_par_1x2.numero_tipo_valor AS numero_tipo_valor_1x2y8,
		clase_recurso_par_1x2.id_lista_valor AS id_lista_valor_1x2y9,
		clase_recurso_par_1x2.id_clase_objeto_valor AS id_clase_objeto_valor_1x2y10,
		clase_recurso_par_1x2.id_clase_recurso_valor AS id_clase_recurso_valor_1x2y11,
		clase_recurso_par_1x2.valor_minimo AS valor_minimo_1x2y12,
		clase_recurso_par_1x2.valor_maximo AS valor_maximo_1x2y13,
		clase_recurso_par_1x2.valor_omision AS valor_omision_1x2y14,
		clase_recurso_par_1x2.es_parametro_omisible AS es_parametro_omisible_1x2y15,
		clase_recurso_par_1x2.es_parametro_inmutable AS es_parametro_inmutable_1x2y16,
		clase_recurso_par_1x2.es_parametro_submit AS es_parametro_submit_1x2y17,
		clase_recurso_par_1x2.es_parametro_primordial AS es_parametro_primordial_1x2y18,
		clase_recurso_par_1x2.es_parametro_maestro AS es_parametro_maestro_1x2y19,
		clase_recurso_par_1x2.es_parametro_segmento AS es_parametro_segmento_1x2y20,
		clase_recurso_par_1x2.es_parametro_sin_rastro AS es_parametro_sin_rastro_1x2y21,
		clase_recurso_par_1x2.es_parametro_sincronizado AS es_parametro_sincroniza_1x2y22,
		clase_recurso_par_1x2.orden_presentacion AS orden_presentacion_1x2y23,
		clase_recurso_par_1x2.id_clase_recurso_sec AS id_clase_recurso_sec_1x2y24,
		clase_recurso_par_1x2.es_referencia_alternativa AS es_referencia_alternati_1x2y25,
		clase_recurso_par_1x2.numero_tipo_valor_alternativo AS numero_tipo_valor_alter_1x2y26,
		clase_recurso_par_1x2.id_funcion_referencia_alt AS id_funcion_referencia_a_1x2y27,
		clase_recurso_par_1x2.id_lista_valor_alternativa AS id_lista_valor_alternat_1x2y28,
		clase_recurso_par_1x2.id_clase_objeto_valor_alt AS id_clase_objeto_valor_a_1x2y29,
		clase_recurso_par_1x2.id_clase_recurso_valor_alt AS id_clase_recurso_valor__1x2y30,
		clase_recurso_par_1x2.orden_pagina_seleccion AS orden_pagina_seleccion_1x2y31,
	filtro_cla_rec_fun.numero_operador_com AS numero_operador_com,
		operador_com_1x3.codigo_operador_com AS codigo_operador_com_1x3y2,
	filtro_cla_rec_fun.id_clase_recurso_par_valor AS id_clase_recurso_par_valor,
		clase_recurso_par_1x4.id_clase_recurso AS id_clase_recurso_1x4y3,
		clase_recurso_par_1x4.id_parametro AS id_parametro_1x4y4,
		clase_recurso_par_1x4.numero_tipo_parametro AS numero_tipo_parametro_1x4y5,
		clase_recurso_par_1x4.numero_tipo_comparacion AS numero_tipo_comparacion_1x4y6,
		clase_recurso_par_1x4.id_funcion_referencia AS id_funcion_referencia_1x4y7,
		clase_recurso_par_1x4.numero_tipo_valor AS numero_tipo_valor_1x4y8,
		clase_recurso_par_1x4.id_lista_valor AS id_lista_valor_1x4y9,
		clase_recurso_par_1x4.id_clase_objeto_valor AS id_clase_objeto_valor_1x4y10,
		clase_recurso_par_1x4.id_clase_recurso_valor AS id_clase_recurso_valor_1x4y11,
		clase_recurso_par_1x4.valor_minimo AS valor_minimo_1x4y12,
		clase_recurso_par_1x4.valor_maximo AS valor_maximo_1x4y13,
		clase_recurso_par_1x4.valor_omision AS valor_omision_1x4y14,
		clase_recurso_par_1x4.es_parametro_omisible AS es_parametro_omisible_1x4y15,
		clase_recurso_par_1x4.es_parametro_inmutable AS es_parametro_inmutable_1x4y16,
		clase_recurso_par_1x4.es_parametro_submit AS es_parametro_submit_1x4y17,
		clase_recurso_par_1x4.es_parametro_primordial AS es_parametro_primordial_1x4y18,
		clase_recurso_par_1x4.es_parametro_maestro AS es_parametro_maestro_1x4y19,
		clase_recurso_par_1x4.es_parametro_segmento AS es_parametro_segmento_1x4y20,
		clase_recurso_par_1x4.es_parametro_sin_rastro AS es_parametro_sin_rastro_1x4y21,
		clase_recurso_par_1x4.es_parametro_sincronizado AS es_parametro_sincroniza_1x4y22,
		clase_recurso_par_1x4.orden_presentacion AS orden_presentacion_1x4y23,
		clase_recurso_par_1x4.id_clase_recurso_sec AS id_clase_recurso_sec_1x4y24,
		clase_recurso_par_1x4.es_referencia_alternativa AS es_referencia_alternati_1x4y25,
		clase_recurso_par_1x4.numero_tipo_valor_alternativo AS numero_tipo_valor_alter_1x4y26,
		clase_recurso_par_1x4.id_funcion_referencia_alt AS id_funcion_referencia_a_1x4y27,
		clase_recurso_par_1x4.id_lista_valor_alternativa AS id_lista_valor_alternat_1x4y28,
		clase_recurso_par_1x4.id_clase_objeto_valor_alt AS id_clase_objeto_valor_a_1x4y29,
		clase_recurso_par_1x4.id_clase_recurso_valor_alt AS id_clase_recurso_valor__1x4y30,
		clase_recurso_par_1x4.orden_pagina_seleccion AS orden_pagina_seleccion_1x4y31,
	filtro_cla_rec_fun.valor AS valor
FROM
	filtro_cla_rec_fun filtro_cla_rec_fun
	INNER JOIN funcion funcion_1x1 ON funcion_1x1.id_funcion = filtro_cla_rec_fun.id_funcion
	INNER JOIN clase_recurso_par clase_recurso_par_1x2 ON clase_recurso_par_1x2.id_clase_recurso_par = filtro_cla_rec_fun.id_clase_recurso_par_columna
	INNER JOIN operador_com operador_com_1x3 ON operador_com_1x3.numero_operador_com = filtro_cla_rec_fun.numero_operador_com
	LEFT OUTER JOIN clase_recurso_par clase_recurso_par_1x4 ON clase_recurso_par_1x4.id_clase_recurso_par = filtro_cla_rec_fun.id_clase_recurso_par_valor
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
