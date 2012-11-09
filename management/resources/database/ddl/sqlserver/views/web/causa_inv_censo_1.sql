if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_causa_inv_censo_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_causa_inv_censo_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_causa_inv_censo_1] AS
SELECT
	causa_inv_censo.numero_causa_inv_censo AS numero_causa_inv_censo,
	causa_inv_censo.codigo_causa_inv_censo AS codigo_causa_inv_censo
FROM
	causa_inv_censo causa_inv_censo
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
