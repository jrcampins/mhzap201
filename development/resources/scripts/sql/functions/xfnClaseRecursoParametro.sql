if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnClaseRecursoParametro]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnClaseRecursoParametro]
GO

SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
CREATE FUNCTION xfnClaseRecursoParametro(@tabid bigint, @colid integer) RETURNS bigint AS
BEGIN
	DECLARE @newid bigint
	DECLARE @maxid bigint
	DECLARE @lowerbound bigint
	DECLARE @upperbound bigint

	IF (@tabid IS NULL) RETURN NULL
	IF (@colid IS NULL) RETURN NULL

	SET @lowerbound = 10000*@tabid + 100*@colid
	SET @upperbound = @lowerbound + 99

	SELECT @maxid = MAX(id_clase_recurso_parametro)
	FROM clase_recurso_parametro
	WHERE id_clase_recurso_parametro BETWEEN @lowerbound AND @upperbound

	IF (@maxid IS NULL)
		SET @newid = @lowerbound
	ELSE
		SET @newid = @maxid + 1

	RETURN @newid

END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
