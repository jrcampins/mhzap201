if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnTipoDatoParametro]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnTipoDatoParametro]
GO

SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
CREATE FUNCTION xfnTipoDatoParametro (@Tipo smallint) RETURNS INTEGER AS
BEGIN
	DECLARE	@TDP INTEGER
	SET	@TDP =
		CASE @Tipo
			WHEN 34		THEN 0
			WHEN 35		THEN 0
			WHEN 36		THEN 0
			WHEN 48		THEN 4
			WHEN 52		THEN 4
			WHEN 56		THEN 4
			WHEN 58		THEN 3
			WHEN 59		THEN 2
			WHEN 60		THEN 2
			WHEN 61		THEN 3
			WHEN 62		THEN 2
			WHEN 98		THEN 1
			WHEN 99		THEN 1
			WHEN 104	THEN 0
			WHEN 106	THEN 2
			WHEN 108	THEN 2
			WHEN 122	THEN 2
			WHEN 127	THEN 5
			WHEN 165	THEN 0
			WHEN 167	THEN 1
			WHEN 173	THEN 0
			WHEN 175	THEN 1
			WHEN 189	THEN 3
			WHEN 231	THEN 1
			WHEN 239	THEN 1
			ELSE 0
		END 
	RETURN @TDP
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
