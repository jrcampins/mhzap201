if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_funcion_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_funcion_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_funcion_1] AS
SELECT
	funcion.id_funcion AS id_funcion,
	funcion.version_funcion AS version_funcion,
	funcion.codigo_funcion AS codigo_funcion,
	funcion.nombre_funcion AS nombre_funcion,
	funcion.descripcion_funcion AS descripcion_funcion,
	funcion.numero_tipo_funcion AS numero_tipo_funcion,
		tipo_funcion_1x1.codigo_tipo_funcion AS codigo_tipo_funcion_1x1y2,
	funcion.numero_tipo_rastro_fun AS numero_tipo_rastro_fun,
		tipo_rastro_fun_1x2.codigo_tipo_rastro_fun AS codigo_tipo_rastro_fun_1x2y2,
	funcion.id_dominio AS id_dominio,
		dominio_1x3.codigo_dominio AS codigo_dominio_1x3y3,
		dominio_1x3.nombre_dominio AS nombre_dominio_1x3y4,
		dominio_1x3.descripcion_dominio AS descripcion_dominio_1x3y5,
		dominio_1x3.nombre_tabla AS nombre_tabla_1x3y6,
		dominio_1x3.numero_tipo_dominio AS numero_tipo_dominio_1x3y7,
		dominio_1x3.id_clase_recurso AS id_clase_recurso_1x3y8,
		dominio_1x3.id_funcion_seleccion AS id_funcion_seleccion_1x3y9,
		dominio_1x3.id_dominio_segmento AS id_dominio_segmento_1x3y10,
		dominio_1x3.id_paquete AS id_paquete_1x3y11,
	funcion.clausula_where AS clausula_where,
	funcion.clausula_order AS clausula_order,
	funcion.es_publica AS es_publica,
	funcion.es_programatica AS es_programatica,
	funcion.es_personalizada AS es_personalizada,
	funcion.es_segmentada AS es_segmentada,
	funcion.id_grupo_proceso AS id_grupo_proceso,
		grupo_proceso_1x4.codigo_grupo_proceso AS codigo_grupo_proceso_1x4y3,
		grupo_proceso_1x4.nombre_grupo_proceso AS nombre_grupo_proceso_1x4y4,
		grupo_proceso_1x4.descripcion_grupo_proceso AS descripcion_grupo_proces_1x4y5,
		grupo_proceso_1x4.id_rastro_proceso AS id_rastro_proceso_1x4y6,
		grupo_proceso_1x4.numero_condicion_eje_fun AS numero_condicion_eje_fun_1x4y7
FROM
	funcion funcion
	INNER JOIN tipo_funcion tipo_funcion_1x1 ON tipo_funcion_1x1.numero_tipo_funcion = funcion.numero_tipo_funcion
	INNER JOIN tipo_rastro_fun tipo_rastro_fun_1x2 ON tipo_rastro_fun_1x2.numero_tipo_rastro_fun = funcion.numero_tipo_rastro_fun
	LEFT OUTER JOIN dominio dominio_1x3 ON dominio_1x3.id_dominio = funcion.id_dominio
	LEFT OUTER JOIN grupo_proceso grupo_proceso_1x4 ON grupo_proceso_1x4.id_grupo_proceso = funcion.id_grupo_proceso
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
