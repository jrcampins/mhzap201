if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnNombrePagina]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnNombrePagina]
GO

SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
CREATE FUNCTION xfnNombrePagina(@dominio varchar(100), @tipo integer) RETURNS varchar(100) AS
BEGIN
	DECLARE @i int
	DECLARE @c varchar(1)
	DECLARE @delimitador varchar(1)
	DECLARE @plural bit	
	DECLARE @prefijo varchar(15)
	DECLARE @nombre varchar(100)
	DECLARE @parte1 varchar(100)
	DECLARE @parte2 varchar(100)
	SET @nombre = LTRIM(RTRIM(@dominio))
	SET @delimitador = '/'
	SET @plural = 0
	SET @prefijo = 'Asociación '
	SET @i = CHARINDEX(@prefijo, @nombre)
	IF (@i <> 1)
		BEGIN
		SET @plural = 1
		SET @prefijo = 'Asociaciones '
		SET @i = CHARINDEX(@prefijo, @nombre)
		END
	IF (@i = 1)
		BEGIN
		SET @nombre = REPLACE(@nombre, @prefijo, '')
		SET @i = CHARINDEX(@delimitador, @nombre)
		IF (@i > 0) --  AND @plural = 1
			BEGIN
			SET @parte1 = LEFT(@nombre, @i - 1)
			SET @parte2 = RIGHT(@nombre, LEN(@nombre) - @i)
			SET @nombre = dbo.xfnNombrePlural(@parte1) + ' por ' + @parte2
			END
		END
	/**/
	SET @nombre =
		CASE @tipo
			WHEN 1 THEN 'Registro de ' + @nombre
			WHEN 2 THEN 'Ejecución de Procesos de ' + @nombre
			WHEN 3 THEN 'Consulta de ' + @nombre
		END
	/**/
	RETURN REPLACE(@nombre, 'iónes', 'iones')
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
