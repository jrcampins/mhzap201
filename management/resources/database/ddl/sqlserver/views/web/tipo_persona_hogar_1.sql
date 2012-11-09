if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_tipo_persona_hogar_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_tipo_persona_hogar_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_tipo_persona_hogar_1] AS
SELECT
	tipo_persona_hogar.numero_tipo_persona_hogar AS numero_tipo_persona_hogar,
	tipo_persona_hogar.codigo_tipo_persona_hogar AS codigo_tipo_persona_hogar
FROM
	tipo_persona_hogar tipo_persona_hogar
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
