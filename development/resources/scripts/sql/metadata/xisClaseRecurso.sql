SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xisClaseRecurso20K
GO
CREATE PROCEDURE xisClaseRecurso20K AS
BEGIN
DECLARE @rehearsal integer
SELECT 	@rehearsal = id_dual FROM dual 
DECLARE	tablenames_cursor CURSOR FOR
SELECT	sysobjects.name
FROM	sysobjects
WHERE	sysobjects.xtype = 'U'
AND		sysobjects.name IN
		(
		'dependencia',
		'dependencia_plus',
		'jurisdiccion',
		'jurisdiccion_plus',
		'nivel_dependencia',
		'nivel_jurisdiccion',
		'persona',
		'tipo_persona'
		)
AND		sysobjects.name NOT IN (select codigo_clase_recurso FROM clase_recurso)
ORDER 	BY 1
OPEN tablenames_cursor
DECLARE @tableid bigint
DECLARE @tablename sysname
DECLARE @codigo varchar(100)
DECLARE @nombre varchar(100)
SELECT @tableid = MAX(id_clase_recurso) FROM clase_recurso 
IF (@tableid < 20000) SET @tableid = 20000
FETCH NEXT FROM tablenames_cursor INTO @tablename
WHILE (@@FETCH_STATUS <> -1)
BEGIN
	IF (@@FETCH_STATUS <> -2)
	BEGIN   
		SET @tableid = @tableid + 10
		SET @codigo = RTRIM(@tablename)
		SET @nombre = dbo.xfnNombrePropio('_' + @codigo)
		PRINT CAST(@tableid AS VARCHAR) + ' ' + @codigo + ' ' + @nombre
		IF (@rehearsal = 0)
			INSERT
			INTO clase_recurso (id_clase_recurso, codigo_clase_recurso, nombre_clase_recurso, numero_tipo_recurso, es_clase_recurso_independiente)
			VALUES (@tableid, @codigo, @nombre, 21, 1)
	END
	FETCH NEXT FROM tablenames_cursor INTO @tablename
END
CLOSE tablenames_cursor
DEALLOCATE tablenames_cursor
IF (@rehearsal = 0)
	UPDATE clase_recurso
	SET numero_tipo_recurso = 22
	WHERE id_clase_recurso BETWEEN 20000 AND 29999
	AND NOT EXISTS (select 1 from xdbScriptTables where tabname=clase_recurso.codigo_clase_recurso AND colname='version_'+tabname and colid=2)
IF (@rehearsal = 0)
	UPDATE clase_recurso
	SET numero_tipo_recurso = 12, es_clase_recurso_sin_detalle = 1
	WHERE id_clase_recurso BETWEEN 20000 AND 29999
	AND EXISTS (select 1 from xdbScriptTables where tabname=clase_recurso.codigo_clase_recurso AND colname='numero_'+tabname and colid=1)
END
GO
DROP PROCEDURE xisClaseRecurso30K
GO
CREATE PROCEDURE xisClaseRecurso30K AS
BEGIN
DECLARE @rehearsal integer
SELECT 	@rehearsal = id_dual FROM dual 
DECLARE	tablenames_cursor CURSOR FOR
SELECT	sysobjects.name
FROM	sysobjects
WHERE	sysobjects.xtype = 'U'
AND		sysobjects.name <> N'dtproperties'
AND		sysobjects.name <> N'dual'
AND		sysobjects.name NOT LIKE N'%$%'
AND		sysobjects.name NOT LIKE N'xdb%'
AND		sysobjects.name NOT IN (select codigo_clase_recurso FROM clase_recurso)
ORDER 	BY 1
OPEN tablenames_cursor
DECLARE @tableid bigint
DECLARE @tablename sysname
DECLARE @codigo varchar(100)
DECLARE @nombre varchar(100)
SELECT @tableid = MAX(id_clase_recurso) FROM clase_recurso 
IF (@tableid < 30000) SET @tableid = 30000
FETCH NEXT FROM tablenames_cursor INTO @tablename
WHILE (@@FETCH_STATUS <> -1)
BEGIN
	IF (@@FETCH_STATUS <> -2)
	BEGIN   
		SET @tableid = @tableid + 100
		SET @codigo = RTRIM(@tablename)
		SET @nombre = dbo.xfnNombrePropio('_' + @codigo)
		PRINT CAST(@tableid AS VARCHAR) + ' ' + @codigo + ' ' + @nombre
		IF (@rehearsal = 0)
			INSERT
			INTO clase_recurso (id_clase_recurso, codigo_clase_recurso, nombre_clase_recurso, numero_tipo_recurso, es_clase_recurso_independiente)
			VALUES (@tableid, @codigo, @nombre, 21, 1)
	END
	FETCH NEXT FROM tablenames_cursor INTO @tablename
END
CLOSE tablenames_cursor
DEALLOCATE tablenames_cursor
IF (@rehearsal = 0)
	UPDATE clase_recurso
	SET numero_tipo_recurso = 22
	WHERE id_clase_recurso >= 30000
	AND NOT EXISTS (select 1 from xdbScriptTables where tabname=clase_recurso.codigo_clase_recurso AND colname='version_'+tabname and colid=2)
IF (@rehearsal = 0)
	UPDATE clase_recurso
	SET numero_tipo_recurso = 12, es_clase_recurso_sin_detalle = 1
	WHERE id_clase_recurso >= 30000
	AND EXISTS (select 1 from xdbScriptTables where tabname=clase_recurso.codigo_clase_recurso AND colname='numero_'+tabname and colid=1)
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
