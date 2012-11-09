SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xisRol
GO
CREATE PROCEDURE xisRol AS
BEGIN
DECLARE @insertst varchar(8000)
DECLARE @selectst varchar(8000)
/*
SET @insertst = "
INSERT
INTO	rol
		(
		id_rol,
		codigo_rol,
		nombre_rol,
		descripcion_rol
		)
"
SET @selectst = "
SELECT	100*id_aplicacion+0 AS id_rol,
		dbo.xfnCamelCase(REPLACE(codigo_aplicacion,'mhzap201-web','-operador')) AS codigo_rol,
		REPLACE(nombre_aplicacion,'Gesti?n','Operador') AS nombre_rol,
		descripcion_aplicacion AS descripcion_rol
FROM	aplicacion
WHERE	es_publica=0
AND		id_aplicacion<99999
AND		100*id_aplicacion+0 NOT IN (SELECT id_rol FROM rol)
UNION
SELECT	100*id_aplicacion+1 AS id_rol,
		dbo.xfnCamelCase(REPLACE(codigo_aplicacion,'mhzap201-web','-gestor')) AS codigo_rol,
		REPLACE(nombre_aplicacion,'Gesti?n','Gestor') AS nombre_rol,
		descripcion_aplicacion AS descripcion_rol
FROM	aplicacion
WHERE	es_publica=0
AND		id_aplicacion<50000
AND		100*id_aplicacion+1 NOT IN (SELECT id_rol FROM rol)
UNION
SELECT	100*id_aplicacion+2 AS id_rol,
		dbo.xfnCamelCase(REPLACE(codigo_aplicacion,'mhzap201-web','-procesador')) AS codigo_rol,
		REPLACE(nombre_aplicacion,'Gesti?n','Procesador') AS nombre_rol,
		descripcion_aplicacion AS descripcion_rol
FROM	aplicacion
WHERE	es_publica=0
AND		id_aplicacion<50000
AND		100*id_aplicacion+2 NOT IN (SELECT id_rol FROM rol)
UNION
SELECT	100*id_aplicacion+4 AS id_rol,
		dbo.xfnCamelCase(REPLACE(codigo_aplicacion,'mhzap201-web','-lector')) AS codigo_rol,
		REPLACE(nombre_aplicacion,'Gesti?n','Lector') AS nombre_rol,
		descripcion_aplicacion AS descripcion_rol
FROM	aplicacion
WHERE	es_publica=0
AND		id_aplicacion<50000
AND		100*id_aplicacion+4 NOT IN (SELECT id_rol FROM rol)
ORDER	BY 1
"
*/
SET @insertst = "
INSERT
INTO	rol
		(
		id_rol,
		codigo_rol,
		nombre_rol,
		descripcion_rol,
		numero_tipo_rol,
		id_grupo_aplicacion
		)
"
SET @selectst = "
SELECT	100*id_grupo_aplicacion+numero_tipo_rol AS id_rol,
		codigo_tipo_rol + codigo_grupo_aplicacion AS codigo_rol,
		codigo_tipo_rol + ' de ' + nombre_grupo_aplicacion AS nombre_rol,
		codigo_tipo_rol + ' de ' + nombre_grupo_aplicacion AS descripcion_rol,
		numero_tipo_rol,
		id_grupo_aplicacion
FROM	grupo_aplicacion, tipo_rol
where	id_grupo_aplicacion in (201,301,302,303,304)
AND		numero_tipo_rol between 1 and 16
AND		100*id_grupo_aplicacion+numero_tipo_rol NOT IN (SELECT id_rol FROM rol)
ORDER	BY 1
"
EXECUTE xis @insertst, @selectst
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
