if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_siono_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_siono_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_siono_1] AS
SELECT
	siono.numero_siono AS numero_siono,
	siono.codigo_siono AS codigo_siono
FROM
	siono siono
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
