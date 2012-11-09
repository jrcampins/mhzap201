if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_motivo_no_trabajo_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_motivo_no_trabajo_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_motivo_no_trabajo_1] AS
SELECT
	motivo_no_trabajo.numero_motivo_no_trabajo AS numero_motivo_no_trabajo,
	motivo_no_trabajo.codigo_motivo_no_trabajo AS codigo_motivo_no_trabajo
FROM
	motivo_no_trabajo motivo_no_trabajo
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
