if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_nivel_ubicacion_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_nivel_ubicacion_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_nivel_ubicacion_1] AS
SELECT
	nivel_ubicacion.numero_nivel_ubicacion AS numero_nivel_ubicacion,
	nivel_ubicacion.codigo_nivel_ubicacion AS codigo_nivel_ubicacion,
	nivel_ubicacion.digitos_nivel_ubicacion AS digitos_nivel_ubicacion
FROM
	nivel_ubicacion nivel_ubicacion
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
