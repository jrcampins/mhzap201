if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_tipo_excepcion_ced_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_tipo_excepcion_ced_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_tipo_excepcion_ced_1] AS
SELECT
	tipo_excepcion_ced.numero_tipo_excepcion_ced AS numero_tipo_excepcion_ced,
	tipo_excepcion_ced.codigo_tipo_excepcion_ced AS codigo_tipo_excepcion_ced
FROM
	tipo_excepcion_ced tipo_excepcion_ced
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
