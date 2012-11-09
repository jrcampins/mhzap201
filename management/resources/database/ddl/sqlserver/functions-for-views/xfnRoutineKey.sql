if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnRoutineKey]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnRoutineKey]
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
CREATE FUNCTION xfnRoutineKey(@Catalog varchar(256), @Schema varchar(256), @Name varchar(256)) RETURNS varchar(256) AS
BEGIN
	RETURN @Catalog + '.' + @Schema + '.' + @Name

END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
