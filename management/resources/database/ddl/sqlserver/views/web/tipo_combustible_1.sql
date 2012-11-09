if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_tipo_combustible_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_tipo_combustible_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_tipo_combustible_1] AS
SELECT
	tipo_combustible.numero_tipo_combustible AS numero_tipo_combustible,
	tipo_combustible.codigo_tipo_combustible AS codigo_tipo_combustible
FROM
	tipo_combustible tipo_combustible
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
