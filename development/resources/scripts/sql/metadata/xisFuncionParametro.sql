SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xisFuncionParametro
GO
CREATE PROCEDURE xisFuncionParametro AS
BEGIN
DECLARE @insertst varchar(8000)
DECLARE @selectst varchar(8000)
SET @insertst = "
INSERT
INTO	funcion_parametro (id_funcion_parametro, id_funcion, id_parametro, numero_tipo_parametro)
"
SET @selectst = "
SELECT	100 * id_funcion + JDP.colid AS id_funcion_parametro, 
		id_funcion, 
--		codigo_funcion, numero_tipo_funcion, codigo_dominio, JDP.colid, JDP.colname, 
		id_parametro, 
		case 
--			when JDP.colname = 'version' + '_' + JDP.tabname
			when JDP.colname LIKE 'version[_]%'
			then 2
			else 3 
		end as numero_tipo_parametro
FROM	funcion 
INNER
JOIN 	dominio
ON 		funcion.id_dominio = dominio.id_dominio
INNER
JOIN 	xdbJavaDataProviders11 JDP
ON		JDP.tabname = codigo_dominio
INNER
JOIN 	parametro
ON		JDP.colname = parametro.codigo_parametro
WHERE	numero_tipo_funcion = 21
AND		id_funcion = 100 * funcion.id_dominio + 1
-- AND	numero_tipo_dominio = 1
-- AND	JDP.colname <> 'version' + '_' + JDP.tabname
AND		100 * id_funcion + JDP.colid NOT IN (SELECT id_funcion_parametro FROM funcion_parametro)
UNION
SELECT	100 * id_funcion + JDP.colid AS id_funcion_parametro, 
		id_funcion, 
--		codigo_funcion, numero_tipo_funcion, codigo_dominio, JDP.colid, JDP.colname, 
		id_parametro, 
		case 
--			when JDP.colname = 'version' + '_' + JDP.tabname
			when JDP.colname LIKE 'version[_]%'
			then 4
			else 3 
		end as numero_tipo_parametro
FROM 	funcion 
INNER 
JOIN 	dominio
ON 		funcion.id_dominio = dominio.id_dominio
INNER 
JOIN 	xdbJavaDataProviders11 JDP
ON		JDP.tabname = codigo_dominio
INNER 
JOIN 	parametro
ON		JDP.colname = parametro.codigo_parametro
WHERE	numero_tipo_funcion = 31
AND		id_funcion = 100 * funcion.id_dominio + 2
-- AND	numero_tipo_dominio = 1
-- AND	JDP.colname <> 'version' + '_' + JDP.tabname
AND		100 * id_funcion + JDP.colid NOT IN (SELECT id_funcion_parametro FROM funcion_parametro)
UNION
SELECT	100 * id_funcion + JDP.colid AS id_funcion_parametro, 
		id_funcion, 
--		codigo_funcion, numero_tipo_funcion, codigo_dominio, JDP.colid, JDP.colname, 
		id_parametro, 
		case 
--			when JDP.colname = 'version' + '_' + JDP.tabname
			when JDP.colname LIKE 'version[_]%'
			then 4
			else 3 
		end as numero_tipo_parametro
FROM	funcion 
INNER 
JOIN 	dominio
ON 		funcion.id_dominio = dominio.id_dominio
INNER 
JOIN 	xdbJavaDataProviders11 JDP
ON		JDP.tabname = codigo_dominio
INNER 
JOIN 	parametro
ON		JDP.colname = parametro.codigo_parametro
WHERE	numero_tipo_funcion = 32
AND		id_funcion = 100 * funcion.id_dominio + 3
-- AND	numero_tipo_dominio = 1
-- AND	JDP.colname <> 'version' + '_' + JDP.tabname
AND		100 * id_funcion + JDP.colid NOT IN (SELECT id_funcion_parametro FROM funcion_parametro)
UNION
SELECT	100 * id_funcion + JDP.colid AS id_funcion_parametro, 
		id_funcion, 
--		codigo_funcion, numero_tipo_funcion, codigo_dominio, JDP.colid, JDP.colname, 
		id_parametro, 
		1 AS numero_tipo_parametro
FROM 	funcion 
INNER 
JOIN 	dominio
ON 		funcion.id_dominio = dominio.id_dominio
INNER 
JOIN 	xdbJavaDataProviders11 JDP
ON		JDP.tabname = codigo_dominio
INNER 
JOIN 	parametro
ON		JDP.colname = parametro.codigo_parametro
-- INNER
-- JOIN	xdbScriptPrimaryKeys SPK
-- ON		SPK.tabname = dominio.codigo_dominio
-- AND		SPK.colname = parametro.codigo_parametro
WHERE	numero_tipo_funcion = 33
AND		id_funcion = 100 * funcion.id_dominio + 4
-- AND	numero_tipo_dominio = 1
AND		JDP.colid = 1 -- AND (JDP.colname = 'id' + '_' + tabname OR JDP.colname = 'numero' + '_' + tabname)
AND		100 * id_funcion + JDP.colid NOT IN (SELECT id_funcion_parametro FROM funcion_parametro)
ORDER	BY 1
"
EXECUTE xis @insertst, @selectst
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
