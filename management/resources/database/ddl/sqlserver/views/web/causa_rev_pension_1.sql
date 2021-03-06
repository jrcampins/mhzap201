if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_causa_rev_pension_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_causa_rev_pension_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_causa_rev_pension_1] AS
SELECT
	causa_rev_pension.numero_causa_rev_pension AS numero_causa_rev_pension,
	causa_rev_pension.codigo_causa_rev_pension AS codigo_causa_rev_pension
FROM
	causa_rev_pension causa_rev_pension
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
