if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xus]') and OBJECTPROPERTY(id, N'IsProcedure') = 1)
drop procedure [dbo].[xus]
GO

SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
CREATE PROCEDURE xus(@updatest varchar(8000), @selectst varchar(8000), @kw varchar(10)) AS
BEGIN
DECLARE @rehearsal integer
SELECT 	@rehearsal = id_dual FROM dual 
DECLARE @xi integer
DECLARE @xj integer
DECLARE @s1 integer
DECLARE @s2 integer
DECLARE @s3 integer
DECLARE @s4 integer
DECLARE @s5 integer
DECLARE @si integer
DECLARE @sj integer
--	SET @updatest = REPLACE(@updatest, CHAR(9), REPLICATE(' ', 4))
--	SET @selectst = REPLACE(@selectst, CHAR(9), REPLICATE(' ', 4))
SET @updatest = REPLACE(@updatest, CHAR(9)+CHAR(9), CHAR(9))
SET @selectst = REPLACE(@selectst, CHAR(9)+CHAR(9), CHAR(9))
SET @xi = CHARINDEX(CHAR(13)+CHAR(10)+'update', @updatest) + 2
SET @xj = LEN(@updatest) + 1
IF (@xi = 0) SET @xi = @xj
SET @s1 = CHARINDEX(CHAR(13)+CHAR(10)+'select', @selectst) + 2
SET @s2 = CHARINDEX(CHAR(13)+CHAR(10)+'from'  , @selectst) + 2
SET @s3 = CHARINDEX(CHAR(13)+CHAR(10)+'where' , @selectst) + 2
SET @s4 = CHARINDEX(CHAR(13)+CHAR(10)+'order' , @selectst) + 2
SET @s5 = LEN(@selectst) + 1
IF (@s1 = 0) SET @s1 = @s5
IF (@s2 = 0) SET @s2 = @s5
IF (@s3 = 0) SET @s3 = @s5
IF (@s4 = 0) SET @s4 = @s5
IF (@kw = 'where') SET @si = @s3 ELSE SET @si = @s2
SET @sj = @s4
SET @updatest = SUBSTRING(@updatest, @xi, @xj-@xi) + SUBSTRING(@selectst, @si, @sj-@si)
SET @selectst = SUBSTRING(@selectst, @s1, @s5-@s1)
IF (@rehearsal = 0)
	BEGIN
	PRINT @updatest
	EXEC (@updatest)
	END
ELSE
	BEGIN
	PRINT @selectst
	EXEC (@selectst)
	END
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
