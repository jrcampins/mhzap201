if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_estado_civil_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_estado_civil_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_estado_civil_1] AS
SELECT
	estado_civil.numero_estado_civil AS numero_estado_civil,
	estado_civil.codigo_estado_civil AS codigo_estado_civil
FROM
	estado_civil estado_civil
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
