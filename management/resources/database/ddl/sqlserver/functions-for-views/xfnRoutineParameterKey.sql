if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnRoutineParameterKey]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnRoutineParameterKey]
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
CREATE FUNCTION xfnRoutineParameterKey(@Catalog varchar(256), @Schema varchar(256), @Name varchar(256), @Position integer) RETURNS varchar(256) AS
BEGIN
	RETURN @Catalog + '.' + @Schema + '.' + @Name + '.' + @Position

END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
