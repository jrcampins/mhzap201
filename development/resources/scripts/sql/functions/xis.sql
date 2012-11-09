if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xis]') and OBJECTPROPERTY(id, N'IsProcedure') = 1)
drop procedure [dbo].[xis]
GO

SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
CREATE PROCEDURE xis(@insertst varchar(8000), @selectst varchar(8000)) AS
BEGIN
DECLARE @rehearsal integer
SELECT 	@rehearsal = id_dual FROM dual 
DECLARE @xi integer
DECLARE @xj integer
DECLARE @si integer
DECLARE @sj integer
SET @insertst = REPLACE(@insertst, CHAR(9)+CHAR(9), CHAR(9))
SET @selectst = REPLACE(@selectst, CHAR(9)+CHAR(9), CHAR(9))
SET @xi = CHARINDEX(CHAR(13)+CHAR(10)+'insert', @insertst) + 2
SET @xj = LEN(@insertst) + 1
IF (@xi = 0) SET @xi = @xj
SET @si = CHARINDEX(CHAR(13)+CHAR(10)+'select', @selectst) + 2
SET @sj = LEN(@selectst) + 1
IF (@si = 0) SET @si = @sj
SET @insertst = SUBSTRING(@insertst, @xi, @xj-@xi) + SUBSTRING(@selectst, @si, @sj-@si)
SET @selectst = SUBSTRING(@selectst, @si, @sj-@si)
IF (@rehearsal = 0)
	BEGIN
	PRINT @insertst
	EXEC (@insertst)
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
