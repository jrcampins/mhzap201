SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xisParametro
GO
CREATE PROCEDURE xisParametro AS
BEGIN
DECLARE @rehearsal integer
SELECT 	@rehearsal = id_dual FROM dual 
DECLARE	cursor1 CURSOR FOR
SELECT	DISTINCT
		LTRIM(RTRIM(colname)) AS parmcode,
		LTRIM(RTRIM(colname)) AS parmname,
		dbo.xfnTipoDatoParametro(coltype) AS parmtype
FROM	xdbScriptTables
WHERE	tabname not like 'xdb%' -- tabname IN (select codigo_clase_recurso FROM clase_recurso)
AND		colname NOT IN (select codigo_parametro FROM parametro)
ORDER 	BY 1,2
OPEN cursor1
DECLARE @parmid bigint
DECLARE @parmcode varchar(100)
DECLARE @parmname varchar(100)
DECLARE @parmtype integer
SELECT @parmid = MAX(id_parametro) FROM parametro 
IF (@parmid < 20000) SET @parmid = 20000
FETCH NEXT FROM cursor1 INTO @parmcode, @parmname, @parmtype
WHILE (@@FETCH_STATUS <> -1)
BEGIN
	IF (@@FETCH_STATUS <> -2)
	BEGIN   
		SELECT @parmid = @parmid + 1
		IF (SUBSTRING(@parmname, 1, 3) = 'id_' OR SUBSTRING(@parmname, 1, 3) = 'es_')
			SELECT @parmname = dbo.xfnNombrePropio(RIGHT(@parmname,LEN(@parmname)-2)) 
		ELSE
			SELECT @parmname = dbo.xfnNombrePropio('_' + @parmname) 
		PRINT CAST(@parmid AS VARCHAR) + ' ' + CAST(@parmtype AS VARCHAR) + ' ' + @parmcode + ' ' + @parmname
		IF (@rehearsal = 0)
			INSERT
			INTO parametro (id_parametro, version_parametro, codigo_parametro, nombre_parametro, numero_tipo_dato_par, alias_parametro)
			VALUES (@parmid, 1, @parmcode, @parmname, @parmtype, @parmcode)
		END
	FETCH NEXT FROM cursor1 INTO @parmcode, @parmname, @parmtype
END
CLOSE cursor1
DEALLOCATE cursor1
DECLARE	cursor2 CURSOR FOR
SELECT	DISTINCT codigo_parametro, numero_tipo_dato_par, dbo.xfnTipoDatoParametro(coltype) AS parmtype
FROM	parametro, xdbScriptTables
WHERE	codigo_parametro = colname
AND		numero_tipo_dato_par <> dbo.xfnTipoDatoParametro(coltype)
ORDER 	BY 1
OPEN cursor2
DECLARE @parmtyp1 integer
DECLARE @parmtyp2 integer
FETCH NEXT FROM cursor2 INTO @parmcode, @parmtyp1, @parmtyp2
WHILE (@@FETCH_STATUS <> -1)
BEGIN
	IF (@@FETCH_STATUS <> -2)
	BEGIN   
		PRINT '********** ' + CAST(@parmtyp2 AS VARCHAR) + '<>' + CAST(@parmtyp1 AS VARCHAR) + ' ' + @parmcode + ' **********'
		END
	FETCH NEXT FROM cursor2 INTO @parmcode, @parmtyp1, @parmtyp2
END
CLOSE cursor2
DEALLOCATE cursor2
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
