if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_condicion_recl_cen_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_condicion_recl_cen_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_condicion_recl_cen_1] AS
SELECT
	condicion_recl_cen.numero_condicion_recl_cen AS numero_condicion_recl_cen,
	condicion_recl_cen.codigo_condicion_recl_cen AS codigo_condicion_recl_cen
FROM
	condicion_recl_cen condicion_recl_cen
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
