if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_paquete_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_paquete_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_paquete_1] AS
SELECT
	paquete.id_paquete AS id_paquete,
	paquete.version_paquete AS version_paquete,
	paquete.codigo_paquete AS codigo_paquete
FROM
	paquete paquete
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
