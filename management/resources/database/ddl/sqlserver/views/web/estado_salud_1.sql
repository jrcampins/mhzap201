if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_estado_salud_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_estado_salud_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_estado_salud_1] AS
SELECT
	estado_salud.numero_estado_salud AS numero_estado_salud,
	estado_salud.codigo_estado_salud AS codigo_estado_salud
FROM
	estado_salud estado_salud
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
