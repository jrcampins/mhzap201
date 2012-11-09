if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[trim]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[trim]
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
CREATE FUNCTION trim(@Cadena varchar(256)) RETURNS varchar(256) AS
BEGIN
	RETURN LTRIM(RTRIM(@Cadena))
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
