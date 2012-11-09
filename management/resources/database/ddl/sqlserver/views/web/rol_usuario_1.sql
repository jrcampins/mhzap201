if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_rol_usuario_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_rol_usuario_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_rol_usuario_1] AS
SELECT
	rol_usuario.id_rol_usuario AS id_rol_usuario,
	rol_usuario.version_rol_usuario AS version_rol_usuario,
	rol_usuario.id_rol AS id_rol,
		rol_1x1.codigo_rol AS codigo_rol_1x1y3,
		rol_1x1.nombre_rol AS nombre_rol_1x1y4,
		rol_1x1.descripcion_rol AS descripcion_rol_1x1y5,
		rol_1x1.numero_tipo_rol AS numero_tipo_rol_1x1y6,
		rol_1x1.id_grupo_aplicacion AS id_grupo_aplicacion_1x1y7,
	rol_usuario.id_usuario AS id_usuario,
		usuario_1x2.codigo_usuario AS codigo_usuario_1x2y3,
		usuario_1x2.nombre_usuario AS nombre_usuario_1x2y4,
		usuario_1x2.password_usuario AS password_usuario_1x2y5,
		usuario_1x2.correo_electronico AS correo_electronico_1x2y6,
		usuario_1x2.id_usuario_supervisor AS id_usuario_supervisor_1x2y7,
		usuario_1x2.es_super_usuario AS es_super_usuario_1x2y8,
		usuario_1x2.es_usuario_especial AS es_usuario_especial_1x2y9,
		usuario_1x2.es_usuario_inactivo AS es_usuario_inactivo_1x2y10,
		usuario_1x2.es_usuario_modificado AS es_usuario_modificado_1x2y11
FROM
	rol_usuario rol_usuario
	INNER JOIN rol rol_1x1 ON rol_1x1.id_rol = rol_usuario.id_rol
	INNER JOIN usuario usuario_1x2 ON usuario_1x2.id_usuario = rol_usuario.id_usuario
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
