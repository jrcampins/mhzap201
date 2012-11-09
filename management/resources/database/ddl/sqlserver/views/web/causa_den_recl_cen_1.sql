if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_causa_den_recl_cen_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_causa_den_recl_cen_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_causa_den_recl_cen_1] AS
SELECT
	causa_den_recl_cen.numero_causa_den_recl_cen AS numero_causa_den_recl_cen,
	causa_den_recl_cen.codigo_causa_den_recl_cen AS codigo_causa_den_recl_cen
FROM
	causa_den_recl_cen causa_den_recl_cen
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
