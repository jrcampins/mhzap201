if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xdbProcessTables1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[xdbProcessTables1]
GO

if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xdbProcessTables2]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[xdbProcessTables2]
GO

SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
create view xdbProcessTables1 as
select	TOP 100 PERCENT
		CAST(sysobjects.name AS varchar(128)) as tabname,
		CAST(LEFT(sysobjects.name, CHARINDEX('$', sysobjects.name)-1) AS varchar(128)) as firstname,
		CAST(LEFT(CAST(RIGHT(sysobjects.name, LEN(sysobjects.name)-CHARINDEX('$', sysobjects.name)) AS varchar(128)), CHARINDEX('$', CAST(RIGHT(sysobjects.name, LEN(sysobjects.name)-CHARINDEX('$', sysobjects.name)) AS varchar(128)))-1) AS varchar(128)) as middlename,
		CAST(RIGHT(CAST(RIGHT(sysobjects.name, LEN(sysobjects.name)-CHARINDEX('$', sysobjects.name)) AS varchar(128)), LEN(CAST(RIGHT(sysobjects.name, LEN(sysobjects.name)-CHARINDEX('$', sysobjects.name)) AS varchar(128)))-CHARINDEX('$', CAST(RIGHT(sysobjects.name, LEN(sysobjects.name)-CHARINDEX('$', sysobjects.name)) AS varchar(128)))) AS varchar(128)) as lastname
FROM	sysobjects
WHERE	sysobjects.xtype = 'U'
and		sysobjects.name like '%$%$%'
order by 1
GO
create view xdbProcessTables2 as
select	TOP 100 PERCENT
		xdbProcessTables1.*,
		cr.id_clase_recurso, 
		CAST(41002 AS BIGINT) as id_aplicacion,
		1000000*cr.id_clase_recurso + 400 + CAST('0' + middlename AS int) as id_pagina,
		CAST(dbo.xfnCamelCase('_' + firstname) + '4' + middlename AS VARCHAR(100)) as codigo_pagina,
		'Procesar ' + dr.nombre_dominio as nombre_pagina,
		dr.descripcion_dominio as descripcion_pagina,
		CAST('/faces/' + dbo.xfnCamelCase('_' + firstname) + '4' + middlename + '.jsp' AS VARCHAR(2000)) as url_pagina,
		dr.id_dominio,
		CAST(NULL AS BIGINT) as id_dominio_maestro,
		4 as numero_tipo_pagina,
		CAST(NULL AS BIGINT) as id_parametro,
		CASE
			WHEN substring(lastname,1,6) = 'emitir' THEN 22
			WHEN substring(lastname,1,8) = 'informar' THEN 22
			WHEN substring(lastname,1,8) = 'exportar' THEN 23
			ELSE 13
		END AS numero_tipo_funcion
FROM	xdbProcessTables1, clase_recurso cr, dominio dr
WHERE	cr.codigo_clase_recurso = firstname
and		dr.codigo_dominio = firstname
order by 1
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
