if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnOpcionMenuBase]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnOpcionMenuBase]
GO

SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
CREATE FUNCTION xfnOpcionMenuBase(@grupo bigint) RETURNS bigint AS
BEGIN
	IF @grupo BETWEEN 301 AND 379 RETURN 10000 + 1000*(@grupo-300)	
	RETURN 80000	
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
