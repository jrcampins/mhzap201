if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnPlural]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnPlural]
GO

SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
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
