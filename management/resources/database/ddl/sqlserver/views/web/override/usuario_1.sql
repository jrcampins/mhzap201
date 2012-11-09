if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_usuario_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_usuario_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_usuario_1] AS
SELECT
--	persona.codigo_persona AS codigo_persona,
--	persona.nombre_persona AS nombre_persona,
	usuario.id_usuario AS id_usuario,
	usuario.version_usuario AS version_usuario,
	usuario.codigo_usuario AS codigo_usuario,
	usuario.nombre_usuario AS nombre_usuario,
	usuario.password_usuario AS password_usuario,
	usuario.es_super_usuario AS es_super_usuario,
	usuario.es_usuario_especial AS es_usuario_especial,
	usuario.es_usuario_inactivo AS es_usuario_inactivo,
	usuario.es_usuario_modificado AS es_usuario_modificado,
	usuario.correo_electronico AS correo_electronico,
	usuario.id_usuario_supervisor AS id_usuario_supervisor,
		usuario_1x1.codigo_usuario AS codigo_usuario_1x1,
		usuario_1x1.nombre_usuario AS nombre_usuario_1x1
FROM
	usuario usuario
--	LEFT JOIN persona persona ON persona.id_persona = usuario.id_usuario
	LEFT OUTER JOIN usuario usuario_1x1 ON usuario_1x1.id_usuario = usuario.id_usuario_supervisor
WHERE	usuario.es_usuario_especial=0
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
