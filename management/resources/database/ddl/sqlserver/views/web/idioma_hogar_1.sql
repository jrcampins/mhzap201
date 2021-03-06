if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_idioma_hogar_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_idioma_hogar_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_idioma_hogar_1] AS
SELECT
	idioma_hogar.numero_idioma_hogar AS numero_idioma_hogar,
	idioma_hogar.codigo_idioma_hogar AS codigo_idioma_hogar
FROM
	idioma_hogar idioma_hogar
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
