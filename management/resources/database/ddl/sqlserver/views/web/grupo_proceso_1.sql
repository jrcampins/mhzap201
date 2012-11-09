if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_grupo_proceso_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_grupo_proceso_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_grupo_proceso_1] AS
SELECT
	grupo_proceso.id_grupo_proceso AS id_grupo_proceso,
	grupo_proceso.version_grupo_proceso AS version_grupo_proceso,
	grupo_proceso.codigo_grupo_proceso AS codigo_grupo_proceso,
	grupo_proceso.nombre_grupo_proceso AS nombre_grupo_proceso,
	grupo_proceso.descripcion_grupo_proceso AS descripcion_grupo_proceso,
	grupo_proceso.id_rastro_proceso AS id_rastro_proceso,
	grupo_proceso.numero_condicion_eje_fun AS numero_condicion_eje_fun,
		condicion_eje_fun_1x1.codigo_condicion_eje_fun AS codigo_condicion_eje_fun_1x1y2
FROM
	grupo_proceso grupo_proceso
	LEFT OUTER JOIN condicion_eje_fun condicion_eje_fun_1x1 ON condicion_eje_fun_1x1.numero_condicion_eje_fun = grupo_proceso.numero_condicion_eje_fun
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
