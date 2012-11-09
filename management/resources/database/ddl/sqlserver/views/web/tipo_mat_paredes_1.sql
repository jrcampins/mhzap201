if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_tipo_mat_paredes_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_tipo_mat_paredes_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_tipo_mat_paredes_1] AS
SELECT
	tipo_mat_paredes.numero_tipo_mat_paredes AS numero_tipo_mat_paredes,
	tipo_mat_paredes.codigo_tipo_mat_paredes AS codigo_tipo_mat_paredes
FROM
	tipo_mat_paredes tipo_mat_paredes
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
