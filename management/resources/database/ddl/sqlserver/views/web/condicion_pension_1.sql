if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_condicion_pension_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_condicion_pension_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_condicion_pension_1] AS
SELECT
	condicion_pension.numero_condicion_pension AS numero_condicion_pension,
	condicion_pension.codigo_condicion_pension AS codigo_condicion_pension
FROM
	condicion_pension condicion_pension
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
