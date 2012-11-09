if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_tipo_mat_piso_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_tipo_mat_piso_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_tipo_mat_piso_1] AS
SELECT
	tipo_mat_piso.numero_tipo_mat_piso AS numero_tipo_mat_piso,
	tipo_mat_piso.codigo_tipo_mat_piso AS codigo_tipo_mat_piso
FROM
	tipo_mat_piso tipo_mat_piso
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
