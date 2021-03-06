if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[lpad]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[lpad]
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
CREATE FUNCTION lpad(@Cadena varchar(256), @Longitud int, @Relleno varchar(256)) RETURNS varchar(256) AS
BEGIN
	IF LEN(@Cadena) > @Longitud RETURN RIGHT(@Cadena, @Longitud)
	IF LEN(@Cadena) < @Longitud RETURN REPLICATE(@Relleno, @Longitud-LEN(@Cadena)) + @Cadena
	RETURN @Cadena
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
