if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnAplicacionClaseRecursoRaiz]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnAplicacionClaseRecursoRaiz]
GO

SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
CREATE FUNCTION xfnAplicacionClaseRecursoRaiz(@id1 bigint) RETURNS bigint AS
BEGIN
IF (@id1 IS NULL) RETURN NULL
DECLARE @id2 bigint
DECLARE @id3 bigint
SELECT @id2=dbo.xfnClaseRecursoRaiz(@id1)
SELECT @id3=id_aplicacion_web FROM clase_recurso WHERE id_clase_recurso=@id2
IF (@id3 IS NULL) RETURN @id2
RETURN @id3
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
