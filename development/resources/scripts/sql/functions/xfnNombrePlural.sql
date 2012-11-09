if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnNombrePlural]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnNombrePlural]
GO

SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
CREATE FUNCTION xfnNombrePlural(@singular varchar(100)) RETURNS varchar(100) AS
BEGIN
	DECLARE @i1 int
	DECLARE @i2 int
	DECLARE @j1 int
	DECLARE @j2 int
	DECLARE @j3 int
	DECLARE @j4 int
	DECLARE @j5 int
	DECLARE @j6 int
	DECLARE @j7 int
	DECLARE @jx int
	DECLARE @c varchar(1)
	DECLARE @plural varchar(100)
	DECLARE @parte1 varchar(100)
	DECLARE @parte2 varchar(100)
	DECLARE @prefijo1 varchar(15)
	DECLARE @delimitador1 varchar(15)
	/**/
	SET @plural = LTRIM(RTRIM(@singular))
	/**/
	SET @i1 = CHARINDEX('Asociación', @plural)
	SET @i2 = CHARINDEX('-', @plural)
	SET @j1 = CHARINDEX(' ', @plural)
	SET @j2 = CHARINDEX(' a ', @plural)
	SET @j3 = CHARINDEX(' de ', @plural)
	SET @j4 = CHARINDEX(' del', @plural)
	SET @j5 = CHARINDEX(' en ', @plural)
	SET @j6 = CHARINDEX(' por ', @plural)
	SET @j7 = CHARINDEX(' para ', @plural)
	/**/
	IF @i1 = 1
		SET @jx = @j1
	ELSE IF @i2 > 0
		SET @jx = @i2
	ELSE IF @j2 > 0 AND (@j3=0 OR @j2<@j3) AND (@j4=0 OR @j2<@j4) AND (@j5=0 OR @j2<@j5) AND (@j6=0 OR @j2<@j6) AND (@j7=0 OR @j2<@j7)
		SET @jx = @j2
	ELSE IF @j3 > 0 AND (@j4=0 OR @j3<@j4) AND (@j5=0 OR @j3<@j5) AND (@j6=0 OR @j3<@j6) AND (@j7=0 OR @j3<@j7)
		SET @jx = @j3
	ELSE IF @j4 > 0 AND (@j5=0 OR @j4<@j5) AND (@j6=0 OR @j4<@j6) AND (@j7=0 OR @j4<@j7)
		SET @jx = @j4
	ELSE IF @j5 > 0 AND (@j6=0 OR @j5<@j6) AND (@j7=0 OR @j5<@j7)
		SET @jx = @j5
	ELSE IF @j6 > 0 AND (@j7=0 OR @j6<@j7)
		SET @jx = @j6
	ELSE
		SET @jx = @j7
	/**/
	IF @jx = 0
		BEGIN
		SET @parte1 = @plural
		SET @parte2 = ''
		END
	ELSE
		BEGIN
		SET @parte1 = LEFT(@plural, @jx - 1)
		SET @parte2 = RIGHT(@plural, LEN(@plural) - @jx + 1)
		END
	/**/
	SET @plural = ''
	SET @parte1 = LTRIM(RTRIM(@parte1))
	WHILE @parte1 <> ''
		BEGIN
		SET @jx = CHARINDEX(' ', @parte1)
		IF @jx = 0
			BEGIN
			SET @plural = @plural + ' ' + dbo.xfnPlural(@parte1)
			SET @parte1 = ''
			END
		ELSE
			BEGIN
			SET @plural = @plural + ' ' + dbo.xfnPlural(LEFT(@parte1, @jx - 1))
			SET @parte1 = RIGHT(@parte1, LEN(@parte1) - @jx)
			END
		END
	/**/
	RETURN LTRIM(RTRIM(@plural)) + @parte2
END
GO
DROP FUNCTION xfnPlural
GO
CREATE FUNCTION xfnPlural(@singular varchar(100)) RETURNS varchar(100) AS
BEGIN
	DECLARE @c varchar(1)
	DECLARE @ing varchar(3)
	DECLARE @plural varchar(100)
	SET @plural = LTRIM(RTRIM(@singular))
	SET @c = RIGHT(@plural, 1)
	SET @ing = RIGHT(@plural, 3)
	IF @singular = 'y'
		SET @plural = @singular
	ELSE IF @ing = 'ing'
		SET @plural = @plural + 's'
	ELSE IF @c = 'a' OR @c = 'e' OR @c = 'i' OR @c = 'o' OR @c = 'u'
		SET @plural = @plural + 's'
	ELSE IF @c = 'z'
		SET @plural = LEFT(@plural, LEN(@plural) - 1) + 'ces'
	ELSE IF @c <> '.'
		SET @plural = @plural + 'es'
	/**/
	SET @plural = REPLACE(@plural, 'ías', 'ias')
	SET @plural = REPLACE(@plural, 'ónes', 'ones')
	RETURN @plural
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
