if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_tipo_relacion_lab_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_tipo_relacion_lab_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_tipo_relacion_lab_1] AS
SELECT
	tipo_relacion_lab.numero_tipo_relacion_lab AS numero_tipo_relacion_lab,
	tipo_relacion_lab.codigo_tipo_relacion_lab AS codigo_tipo_relacion_lab
FROM
	tipo_relacion_lab tipo_relacion_lab
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
