if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_tipo_area_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_tipo_area_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_tipo_area_1] AS
SELECT
	tipo_area.numero_tipo_area AS numero_tipo_area,
	tipo_area.codigo_tipo_area AS codigo_tipo_area
FROM
	tipo_area tipo_area
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
