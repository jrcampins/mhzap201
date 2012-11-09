if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_tipo_mat_techo_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_tipo_mat_techo_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_tipo_mat_techo_1] AS
SELECT
	tipo_mat_techo.numero_tipo_mat_techo AS numero_tipo_mat_techo,
	tipo_mat_techo.codigo_tipo_mat_techo AS codigo_tipo_mat_techo
FROM
	tipo_mat_techo tipo_mat_techo
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
