if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_causa_den_reco_pen_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_causa_den_reco_pen_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_causa_den_reco_pen_1] AS
SELECT
	causa_den_reco_pen.numero_causa_den_reco_pen AS numero_causa_den_reco_pen,
	causa_den_reco_pen.codigo_causa_den_reco_pen AS codigo_causa_den_reco_pen
FROM
	causa_den_reco_pen causa_den_reco_pen
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
