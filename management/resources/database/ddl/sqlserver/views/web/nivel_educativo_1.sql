if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_nivel_educativo_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_nivel_educativo_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_nivel_educativo_1] AS
SELECT
	nivel_educativo.numero_nivel_educativo AS numero_nivel_educativo,
	nivel_educativo.codigo_nivel_educativo AS codigo_nivel_educativo,
	nivel_educativo.primer_curso AS primer_curso,
	nivel_educativo.ultimo_curso AS ultimo_curso
FROM
	nivel_educativo nivel_educativo
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
