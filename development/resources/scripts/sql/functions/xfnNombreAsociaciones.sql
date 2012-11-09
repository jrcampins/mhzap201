if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnNombreAsociaciones]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnNombreAsociaciones]
GO

SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
CREATE FUNCTION xfnNombreAsociaciones(@dominio varchar(100), @maestro varchar(100)) RETURNS varchar(100) AS
BEGIN
	DECLARE @i int
	DECLARE @c varchar(1)
	DECLARE @delimitador varchar(1)
	DECLARE @plural bit	
	DECLARE @prefijo varchar(15)
	SET @dominio = LTRIM(RTRIM(@dominio))
	SET @maestro = dbo.xfnNombrePropio('_' + @maestro)
	SET @delimitador = '/'
	SET @plural = 0
	SET @prefijo = 'Asociación '
	SET @i = CHARINDEX(@prefijo, @dominio)
	IF (@i <> 1)
		BEGIN
		SET @plural = 1
		SET @prefijo = 'Asociaciones '
		SET @i = CHARINDEX(@prefijo, @dominio)
		END
	IF (@i = 1)
		BEGIN
		SET @dominio = REPLACE(@dominio, @prefijo, '')
		SET @dominio = REPLACE(@dominio, @maestro + @delimitador + @maestro, @maestro)
		SET @dominio = REPLACE(@dominio, @maestro + @delimitador, '')
		SET @dominio = REPLACE(@dominio, @delimitador + @maestro, '')
		SET @i = CHARINDEX(@delimitador, @dominio)
		IF (@i = 0 AND @plural = 1)
--			BEGIN
-- 			SET @c = RIGHT(@dominio, 1)
-- 			IF (@c = 'a' OR @c = 'e' OR @c = 'i' OR @c = 'o' OR @c = 'u')
-- 				SET @dominio = @dominio + 's'
-- 			ELSE
-- 				SET @dominio = @dominio + 'es'
--			END
			SET @dominio = dbo.xfnNombrePlural(@dominio)
		END
-- 		IF (@i = 0)
-- 			SET @dominio = REPLACE(@dominio, ' ', ' de ')
-- 		END
	/**/
	RETURN REPLACE(@dominio, 'iónes', 'iones')
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
