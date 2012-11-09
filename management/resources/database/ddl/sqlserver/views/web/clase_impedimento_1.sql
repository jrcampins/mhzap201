if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_clase_impedimento_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_clase_impedimento_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_clase_impedimento_1] AS
SELECT
	clase_impedimento.numero_clase_impedimento AS numero_clase_impedimento,
	clase_impedimento.codigo_clase_impedimento AS codigo_clase_impedimento
FROM
	clase_impedimento clase_impedimento
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
