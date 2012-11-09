if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_tipo_servicio_agua_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_tipo_servicio_agua_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_tipo_servicio_agua_1] AS
SELECT
	tipo_servicio_agua.numero_tipo_servicio_agua AS numero_tipo_servicio_agua,
	tipo_servicio_agua.codigo_tipo_servicio_agua AS codigo_tipo_servicio_agua
FROM
	tipo_servicio_agua tipo_servicio_agua
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
