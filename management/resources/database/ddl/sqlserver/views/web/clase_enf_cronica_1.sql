if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_clase_enf_cronica_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_clase_enf_cronica_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_clase_enf_cronica_1] AS
SELECT
	clase_enf_cronica.numero_clase_enf_cronica AS numero_clase_enf_cronica,
	clase_enf_cronica.codigo_clase_enf_cronica AS codigo_clase_enf_cronica
FROM
	clase_enf_cronica clase_enf_cronica
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
