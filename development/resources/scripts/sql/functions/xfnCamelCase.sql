if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnCamelCase]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnCamelCase]
GO

SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
CREATE FUNCTION xfnCamelCase(@x varchar(100)) RETURNS varchar(100) AS
BEGIN
	DECLARE @b bit
	DECLARE @i integer
	DECLARE @n integer
	DECLARE @c varchar(1)
	DECLARE @y varchar(100)
	SELECT @x = LTRIM(RTRIM(@x))
	SELECT @y = ''
	SELECT @i = 0
	SELECT @n = LEN(@x)
	WHILE (@i < @n)
		BEGIN
		SELECT @i = @i + 1
	    SELECT @c = SUBSTRING(@x, @i, 1)
	    IF (@c = '_' OR @c = '-')
	        SELECT @b = 1
	    ELSE
			IF (@b = 1)
				BEGIN
	            SELECT @b = 0
	            SELECT @y = @y + UPPER(@c)
				END
	        ELSE
	            SELECT @y = @y + LOWER(@c)
		END
	RETURN LTRIM(RTRIM(@y))
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
