if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnClaseRecursoRaiz]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnClaseRecursoRaiz]
GO

SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
CREATE FUNCTION xfnClaseRecursoRaiz(@id1 bigint) RETURNS bigint AS
BEGIN
IF (@id1 IS NULL) RETURN NULL
DECLARE @id2 bigint
SELECT @id2=id_clase_recurso_maestro
FROM clase_recurso
WHERE id_clase_recurso=@id1
IF (@id2 IS NULL) RETURN @id1
IF (@id2 <> @id1) RETURN dbo.xfnClaseRecursoRaiz(@id2)
RETURN @id1
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
