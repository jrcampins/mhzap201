if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[rpad]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[rpad]
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
CREATE FUNCTION rpad(@Cadena varchar(256), @Longitud int, @Relleno varchar(256)) RETURNS varchar(256) AS
BEGIN
	IF LEN(@Cadena) > @Longitud RETURN LEFT(@Cadena, @Longitud)
	IF LEN(@Cadena) < @Longitud RETURN @Cadena + REPLICATE(@Relleno, @Longitud-LEN(@Cadena))
	RETURN @Cadena
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
