if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_causa_impedimento_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_causa_impedimento_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_causa_impedimento_1] AS
SELECT
	causa_impedimento.numero_causa_impedimento AS numero_causa_impedimento,
	causa_impedimento.codigo_causa_impedimento AS codigo_causa_impedimento
FROM
	causa_impedimento causa_impedimento
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
