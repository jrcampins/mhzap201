if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_tipo_servicio_san_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_tipo_servicio_san_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_tipo_servicio_san_1] AS
SELECT
	tipo_servicio_san.numero_tipo_servicio_san AS numero_tipo_servicio_san,
	tipo_servicio_san.codigo_tipo_servicio_san AS codigo_tipo_servicio_san
FROM
	tipo_servicio_san tipo_servicio_san
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
