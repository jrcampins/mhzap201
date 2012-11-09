if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_motivo_no_atencion_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_motivo_no_atencion_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_motivo_no_atencion_1] AS
SELECT
	motivo_no_atencion.numero_motivo_no_atencion AS numero_motivo_no_atencion,
	motivo_no_atencion.codigo_motivo_no_atencion AS codigo_motivo_no_atencion
FROM
	motivo_no_atencion motivo_no_atencion
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
