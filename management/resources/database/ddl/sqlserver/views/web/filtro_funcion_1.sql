if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_filtro_funcion_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_filtro_funcion_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_filtro_funcion_1] AS
SELECT
	filtro_funcion.id_filtro_funcion AS id_filtro_funcion,
	filtro_funcion.version_filtro_funcion AS version_filtro_funcion,
	filtro_funcion.codigo_filtro_funcion AS codigo_filtro_funcion,
	filtro_funcion.nombre_filtro_funcion AS nombre_filtro_funcion,
	filtro_funcion.descripcion_filtro_funcion AS descripcion_filtro_funcion,
	filtro_funcion.id_funcion AS id_funcion,
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
	filtro_funcion.id_usuario AS id_usuario,
		usuario_1x2.codigo_usuario AS codigo_usuario_1x2y3,
		usuario_1x2.nombre_usuario AS nombre_usuario_1x2y4,
		usuario_1x2.password_usuario AS password_usuario_1x2y5,
		usuario_1x2.correo_electronico AS correo_electronico_1x2y6,
		usuario_1x2.id_usuario_supervisor AS id_usuario_supervisor_1x2y7,
		usuario_1x2.es_super_usuario AS es_super_usuario_1x2y8,
		usuario_1x2.es_usuario_especial AS es_usuario_especial_1x2y9,
		usuario_1x2.es_usuario_inactivo AS es_usuario_inactivo_1x2y10,
		usuario_1x2.es_usuario_modificado AS es_usuario_modificado_1x2y11,
	filtro_funcion.es_publico AS es_publico,
	filtro_funcion.id_filtro_funcion_original AS id_filtro_funcion_original
FROM
	filtro_funcion filtro_funcion
	INNER JOIN funcion funcion_1x1 ON funcion_1x1.id_funcion = filtro_funcion.id_funcion
	INNER JOIN usuario usuario_1x2 ON usuario_1x2.id_usuario = filtro_funcion.id_usuario
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
