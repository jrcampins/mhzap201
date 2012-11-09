if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_etnia_indigena_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_etnia_indigena_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_etnia_indigena_1] AS
SELECT
	etnia_indigena.id_etnia_indigena AS id_etnia_indigena,
	etnia_indigena.version_etnia_indigena AS version_etnia_indigena,
	etnia_indigena.codigo_etnia_indigena AS codigo_etnia_indigena,
	etnia_indigena.nombre_etnia_indigena AS nombre_etnia_indigena,
	etnia_indigena.descripcion_etnia_indigena AS descripcion_etnia_indigena
FROM
	etnia_indigena etnia_indigena
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
