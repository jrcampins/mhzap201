if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnRoutineName]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnRoutineName]
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
CREATE FUNCTION xfnRoutineName(@Function varchar(256), @Domain varchar(256)) RETURNS varchar(256) AS
BEGIN
	DECLARE @Name varchar(256)
	SELECT	@Name = @Function
	SELECT	@Name = REPLACE(@Name, @Domain, '')
	SELECT	@Name = REPLACE(@Name, '__', '_')
	SELECT	@Name = REPLACE(@Name, '_', ' ')
	SELECT	@Name = LTRIM(RTRIM(@Name))
	SELECT	@Name = REPLACE(@Name, ' ', '_')
	SELECT	@Name = @Domain + '_' + @Name
	RETURN	@Name
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
