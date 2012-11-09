if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_sexo_persona_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_sexo_persona_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_sexo_persona_1] AS
SELECT
	sexo_persona.numero_sexo_persona AS numero_sexo_persona,
	sexo_persona.codigo_sexo_persona AS codigo_sexo_persona
FROM
	sexo_persona sexo_persona
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
