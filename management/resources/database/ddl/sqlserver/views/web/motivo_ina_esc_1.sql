if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_motivo_ina_esc_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_motivo_ina_esc_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_motivo_ina_esc_1] AS
SELECT
	motivo_ina_esc.numero_motivo_ina_esc AS numero_motivo_ina_esc,
	motivo_ina_esc.codigo_motivo_ina_esc AS codigo_motivo_ina_esc
FROM
	motivo_ina_esc motivo_ina_esc
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
