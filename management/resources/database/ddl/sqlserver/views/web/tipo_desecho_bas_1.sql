if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_tipo_desecho_bas_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_tipo_desecho_bas_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_tipo_desecho_bas_1] AS
SELECT
	tipo_desecho_bas.numero_tipo_desecho_bas AS numero_tipo_desecho_bas,
	tipo_desecho_bas.codigo_tipo_desecho_bas AS codigo_tipo_desecho_bas
FROM
	tipo_desecho_bas tipo_desecho_bas
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
