SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
DROP VIEW dbo.xdbJavaParameters1
GO
CREATE VIEW dbo.xdbJavaParameters1
AS
SELECT	TOP 100 PERCENT
		codigo_parametro AS colname,
		NULL AS tabname,
		nombre_parametro AS paramname,
		detalle_parametro AS paramhint,
		NULL AS paramdesc
FROM    parametro
UNION
SELECT	TOP 100 PERCENT
		xdb1.colname,
		xdb1.tabname,
		NULL AS paramname,
		xdb2.label AS paramhint,
		CASE WHEN xdb1.coldescription IS NULL THEN xdb2.inline_help ELSE xdb1.coldescription END AS paramdesc
FROM    xdbJavaDataProviders11 xdb1
INNER	JOIN dominio
ON		xdb1.tabname = dominio.codigo_dominio
LEFT	JOIN xdbLabels xdb2
ON		xdb2.tabname = xdb1.tabname
AND		xdb2.colname = xdb1.colname
WHERE   xdb2.label IS NOT NULL OR xdb2.inline_help IS NOT NULL OR xdb1.coldescription IS NOT NULL
ORDER BY 1, 2
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
SELECT COUNT(*) FROM dbo.xdbJavaParameters1
GO
SELECT * FROM dbo.xdbJavaParameters1 WHERE tabname is not null and paramhint is not null
GO
