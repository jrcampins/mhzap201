if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_mensaje_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_mensaje_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_mensaje_1] AS
SELECT
	mensaje.id_mensaje AS id_mensaje,
	mensaje.version_mensaje AS version_mensaje,
	mensaje.codigo_mensaje AS codigo_mensaje,
	mensaje.patron_mensaje AS patron_mensaje,
	mensaje.descripcion_mensaje AS descripcion_mensaje
FROM
	mensaje mensaje
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
