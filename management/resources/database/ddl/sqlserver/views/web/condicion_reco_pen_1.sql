if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_condicion_reco_pen_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_condicion_reco_pen_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_condicion_reco_pen_1] AS
SELECT
	condicion_reco_pen.numero_condicion_reco_pen AS numero_condicion_reco_pen,
	condicion_reco_pen.codigo_condicion_reco_pen AS codigo_condicion_reco_pen
FROM
	condicion_reco_pen condicion_reco_pen
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
