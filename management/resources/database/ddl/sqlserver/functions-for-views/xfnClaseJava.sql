if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnClaseJava]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnClaseJava]
GO
SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
CREATE  FUNCTION xfnClaseJava (@Tipo smallint) RETURNS VARCHAR(20) AS
BEGIN
	DECLARE	@Descripcion VARCHAR(20)
	SET	@Descripcion =
		CASE @Tipo
			WHEN 34		THEN 'java.lang.Object' -- image
			WHEN 35		THEN 'java.lang.String' -- text
			WHEN 36		THEN 'java.lang.Object' -- uniqueidentifier
			WHEN 48		THEN 'java.lang.Byte'
			WHEN 52		THEN 'java.lang.Short'
			WHEN 56		THEN 'java.lang.Integer'
			WHEN 58		THEN 'java.sql.Date'
			WHEN 59		THEN 'java.lang.Float'
			WHEN 60		THEN 'java.math.BigDecimal'
			WHEN 61		THEN 'java.sql.Time'
			WHEN 62		THEN 'java.lang.Double'
			WHEN 98		THEN 'java.lang.Object' -- sql_variant
			WHEN 99		THEN 'java.lang.String'
			WHEN 104 	THEN 'java.lang.Boolean'
			WHEN 106	THEN 'java.math.BigDecimal'
			WHEN 108	THEN 'java.math.BigDecimal'
			WHEN 122	THEN 'java.math.BigDecimal'
			WHEN 127	THEN 'java.lang.Long'
			WHEN 165	THEN 'java.lang.Object' -- varbinary
			WHEN 167	THEN 'java.lang.String'
			WHEN 173	THEN 'java.lang.Object' -- binary
			WHEN 175	THEN 'java.lang.Character'
			WHEN 189	THEN 'java.sql.Timestamp'
			WHEN 231	THEN 'java.lang.String'
			WHEN 239	THEN 'java.lang.Character'
			ELSE 'java.lang.Object' -- unknown
		END 
	RETURN @Descripcion
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
