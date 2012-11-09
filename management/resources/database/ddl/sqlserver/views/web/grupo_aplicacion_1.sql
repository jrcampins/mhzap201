if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_grupo_aplicacion_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_grupo_aplicacion_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_grupo_aplicacion_1] AS
SELECT
	grupo_aplicacion.id_grupo_aplicacion AS id_grupo_aplicacion,
	grupo_aplicacion.version_grupo_aplicacion AS version_grupo_aplicacion,
	grupo_aplicacion.codigo_grupo_aplicacion AS codigo_grupo_aplicacion,
	grupo_aplicacion.nombre_grupo_aplicacion AS nombre_grupo_aplicacion,
	grupo_aplicacion.descripcion_grupo_aplicacion AS descripcion_grupo_aplicacion
FROM
	grupo_aplicacion grupo_aplicacion
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
