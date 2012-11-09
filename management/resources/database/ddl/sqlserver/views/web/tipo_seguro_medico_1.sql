if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_tipo_seguro_medico_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_tipo_seguro_medico_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_tipo_seguro_medico_1] AS
SELECT
	tipo_seguro_medico.numero_tipo_seguro_medico AS numero_tipo_seguro_medico,
	tipo_seguro_medico.codigo_tipo_seguro_medico AS codigo_tipo_seguro_medico
FROM
	tipo_seguro_medico tipo_seguro_medico
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
