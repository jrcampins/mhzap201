if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_tipo_act_jupe_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_tipo_act_jupe_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_tipo_act_jupe_1] AS
SELECT
	tipo_act_jupe.numero_tipo_act_jupe AS numero_tipo_act_jupe,
	tipo_act_jupe.codigo_tipo_act_jupe AS codigo_tipo_act_jupe
FROM
	tipo_act_jupe tipo_act_jupe
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
