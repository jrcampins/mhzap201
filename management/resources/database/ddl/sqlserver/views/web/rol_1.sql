if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_rol_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_rol_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_rol_1] AS
SELECT
	rol.id_rol AS id_rol,
	rol.version_rol AS version_rol,
	rol.codigo_rol AS codigo_rol,
	rol.nombre_rol AS nombre_rol,
	rol.descripcion_rol AS descripcion_rol,
	rol.numero_tipo_rol AS numero_tipo_rol,
		tipo_rol_1x1.codigo_tipo_rol AS codigo_tipo_rol_1x1y2,
	rol.id_grupo_aplicacion AS id_grupo_aplicacion,
		grupo_aplicacion_1x2.codigo_grupo_aplicacion AS codigo_grupo_aplicacion_1x2y3,
		grupo_aplicacion_1x2.nombre_grupo_aplicacion AS nombre_grupo_aplicacion_1x2y4,
		grupo_aplicacion_1x2.descripcion_grupo_aplicacion AS descripcion_grupo_aplica_1x2y5
FROM
	rol rol
	LEFT OUTER JOIN tipo_rol tipo_rol_1x1 ON tipo_rol_1x1.numero_tipo_rol = rol.numero_tipo_rol
	LEFT OUTER JOIN grupo_aplicacion grupo_aplicacion_1x2 ON grupo_aplicacion_1x2.id_grupo_aplicacion = rol.id_grupo_aplicacion
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
