if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_clase_recurso_sec_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_clase_recurso_sec_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_clase_recurso_sec_1] AS
SELECT
	clase_recurso_sec.id_clase_recurso_sec AS id_clase_recurso_sec,
	clase_recurso_sec.version_clase_recurso_sec AS version_clase_recurso_sec,
	clase_recurso_sec.id_clase_recurso AS id_clase_recurso,
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
	clase_recurso_sec.etiqueta_clase_recurso_sec AS etiqueta_clase_recurso_sec,
	clase_recurso_sec.descripcion_clase_recurso_sec AS descripcion_clase_recurso_sec,
	clase_recurso_sec.orden_presentacion AS orden_presentacion,
	clase_recurso_sec.es_pestana_detalle AS es_pestana_detalle
FROM
	clase_recurso_sec clase_recurso_sec
	INNER JOIN clase_recurso clase_recurso_1x1 ON clase_recurso_1x1.id_clase_recurso = clase_recurso_sec.id_clase_recurso
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
