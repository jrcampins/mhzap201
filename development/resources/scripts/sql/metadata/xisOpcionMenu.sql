SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xisOpcionMenu
GO
CREATE PROCEDURE xisOpcionMenu AS
BEGIN
DECLARE @insertst varchar(8000)
DECLARE @selectst varchar(8000)
SET @insertst = "
INSERT
INTO	opcion_menu
		(
		id_opcion_menu, 
		codigo_opcion_menu, 
		nombre_opcion_menu, 
		descripcion_opcion_menu, 
		url_opcion_menu, 
		id_opcion_menu_superior
		)
"
------------------------------------------------------------------------------------------------------------------------
--		registro
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
SELECT	id_pagina AS id_opcion_menu, 
		'N' + 
		CAST(dbo.xfnOpcionMenuBase(clase_recurso.id_grupo_aplicacion) + 100 AS VARCHAR) +
		CAST(id_pagina AS VARCHAR) AS codigo_opcion_menu, 
		REPLACE(nombre_pagina, 'Registro de ', '') AS nombre_opcion_menu, 
		descripcion_pagina AS descripcion_opcion_menu,
		'redirect.html?url=http://localhost:8080/' + codigo_aplicacion + url_pagina AS url_opcion_menu,
		dbo.xfnOpcionMenuBase(clase_recurso.id_grupo_aplicacion) + 100 AS id_opcion_menu_superior
FROM	pagina
JOIN	aplicacion ON pagina.id_aplicacion = aplicacion.id_aplicacion
JOIN	dominio ON pagina.id_dominio = dominio.id_dominio
JOIN	clase_recurso ON dominio.id_clase_recurso = clase_recurso.id_clase_recurso
WHERE	pagina.id_pagina NOT IN (SELECT id_opcion_menu FROM opcion_menu)
AND		pagina.id_dominio_maestro IS NULL
AND		pagina.numero_tipo_pagina = 1
AND		clase_recurso.numero_tipo_recurso>20
ORDER	BY 1
"
EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
--		procesos
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
SELECT	id_pagina AS id_opcion_menu, 
		'N' + 
		CAST(dbo.xfnOpcionMenuBase(clase_recurso.id_grupo_aplicacion) + 200 AS VARCHAR) +
		CAST(id_pagina AS VARCHAR) AS codigo_opcion_menu, 
		REPLACE(nombre_pagina, 'Ejecución de Procesos de ', '') AS nombre_opcion_menu, 
		descripcion_pagina AS descripcion_opcion_menu,
		'redirect.html?url=http://localhost:8080/' + codigo_aplicacion + url_pagina AS url_opcion_menu,
		dbo.xfnOpcionMenuBase(clase_recurso.id_grupo_aplicacion) + 200 AS id_opcion_menu_superior
FROM	pagina
JOIN	aplicacion ON pagina.id_aplicacion = aplicacion.id_aplicacion
JOIN	dominio ON pagina.id_dominio = dominio.id_dominio
JOIN	clase_recurso ON dominio.id_clase_recurso = clase_recurso.id_clase_recurso
WHERE	pagina.id_pagina NOT IN (SELECT id_opcion_menu FROM opcion_menu)
AND		pagina.id_dominio_maestro IS NULL
AND		pagina.numero_tipo_pagina = 4
AND		pagina.codigo_pagina not like'%420'
ORDER	BY 1
"
EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
--		consultas e informes
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
SELECT	id_pagina AS id_opcion_menu, 
		'N' + 
		CAST(dbo.xfnOpcionMenuBase(clase_recurso.id_grupo_aplicacion) + 400 AS VARCHAR) +
		CAST(id_pagina AS VARCHAR) AS codigo_opcion_menu, 
		REPLACE(nombre_pagina, 'Consulta de ', '') AS nombre_opcion_menu, 
		descripcion_pagina AS descripcion_opcion_menu,
		'redirect.html?url=http://localhost:8080/' + codigo_aplicacion + url_pagina AS url_opcion_menu,
		dbo.xfnOpcionMenuBase(clase_recurso.id_grupo_aplicacion) + 400 AS id_opcion_menu_superior
FROM	pagina
JOIN	aplicacion ON pagina.id_aplicacion = aplicacion.id_aplicacion
JOIN	dominio ON pagina.id_dominio = dominio.id_dominio
JOIN	clase_recurso ON dominio.id_clase_recurso = clase_recurso.id_clase_recurso
WHERE	pagina.id_pagina NOT IN (SELECT id_opcion_menu FROM opcion_menu)
AND		pagina.id_dominio_maestro IS NULL
AND		pagina.numero_tipo_pagina = 5
ORDER	BY 1
"
EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
--		configuración
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
SELECT	id_pagina AS id_opcion_menu, 
		'N' + 
		CAST(dbo.xfnOpcionMenuBase(clase_recurso.id_grupo_aplicacion) + 800 AS VARCHAR) +
		CAST(id_pagina AS VARCHAR) AS codigo_opcion_menu, 
		REPLACE(nombre_pagina, 'Registro de ', '') AS nombre_opcion_menu, 
		descripcion_pagina AS descripcion_opcion_menu,
		'redirect.html?url=http://localhost:8080/' + codigo_aplicacion + url_pagina AS url_opcion_menu,
		dbo.xfnOpcionMenuBase(clase_recurso.id_grupo_aplicacion) + 800 AS id_opcion_menu_superior
FROM	pagina
JOIN	aplicacion ON pagina.id_aplicacion = aplicacion.id_aplicacion
JOIN	dominio ON pagina.id_dominio = dominio.id_dominio
JOIN	clase_recurso ON dominio.id_clase_recurso = clase_recurso.id_clase_recurso
WHERE	pagina.id_pagina NOT IN (SELECT id_opcion_menu FROM opcion_menu)
AND		pagina.id_dominio_maestro IS NULL
AND		pagina.numero_tipo_pagina = 1
AND		id_pagina NOT IN (SELECT id_opcion_menu FROM opcion_menu)
AND		numero_tipo_recurso IN (11,13,14)
ORDER	BY 1
"
EXECUTE xis @insertst, @selectst
------------------------------------------------------------------------------------------------------------------------
--		configuración fija
------------------------------------------------------------------------------------------------------------------------
SET @selectst = "
SELECT	id_pagina AS id_opcion_menu, 
		'N' + 
		CAST(dbo.xfnOpcionMenuBase(clase_recurso.id_grupo_aplicacion) + 810 AS VARCHAR) +
		CAST(id_pagina AS VARCHAR) AS codigo_opcion_menu, 
		REPLACE(nombre_pagina, 'Registro de ', '') AS nombre_opcion_menu, 
		descripcion_pagina AS descripcion_opcion_menu,
		'redirect.html?url=http://localhost:8080/' + codigo_aplicacion + url_pagina AS url_opcion_menu,
		dbo.xfnOpcionMenuBase(clase_recurso.id_grupo_aplicacion) + 810 AS id_opcion_menu_superior
FROM	pagina
JOIN	aplicacion ON pagina.id_aplicacion = aplicacion.id_aplicacion
JOIN	dominio ON pagina.id_dominio = dominio.id_dominio
JOIN	clase_recurso ON dominio.id_clase_recurso = clase_recurso.id_clase_recurso
WHERE	pagina.id_pagina NOT IN (SELECT id_opcion_menu FROM opcion_menu)
AND		pagina.id_dominio_maestro IS NULL
AND		pagina.numero_tipo_pagina = 1
AND		id_pagina NOT IN (SELECT id_opcion_menu FROM opcion_menu)
AND		numero_tipo_recurso=12
ORDER	BY 1
"
EXECUTE xis @insertst, @selectst
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
