if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_tipo_pieza_bano_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_tipo_pieza_bano_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_tipo_pieza_bano_1] AS
SELECT
	tipo_pieza_bano.numero_tipo_pieza_bano AS numero_tipo_pieza_bano,
	tipo_pieza_bano.codigo_tipo_pieza_bano AS codigo_tipo_pieza_bano
FROM
	tipo_pieza_bano tipo_pieza_bano
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
