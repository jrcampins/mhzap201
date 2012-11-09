if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnTipoDatoJava]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnTipoDatoJava]
GO
SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
CREATE  FUNCTION xfnTipoDatoJava (@Tipo smallint, @Anulable int) RETURNS VARCHAR(20) AS
BEGIN
	DECLARE	@Descripcion VARCHAR(20)
	IF @Anulable = 0
		SET	@Descripcion =
			CASE @Tipo
				WHEN 34		THEN '¿?' -- image
				WHEN 35		THEN '¿?' -- text
				WHEN 36		THEN '¿?' -- uniqueidentifier
				WHEN 48		THEN 'byte'
				WHEN 52		THEN 'short'
				WHEN 56		THEN 'int'
				WHEN 58		THEN '¿?'
				WHEN 59		THEN 'float'
				WHEN 60		THEN '¿?'
				WHEN 61		THEN '¿?'
				WHEN 62		THEN 'double'
				WHEN 98		THEN '¿?' -- sql_variant
				WHEN 99		THEN '¿?'
				WHEN 104 	THEN 'boolean'
				WHEN 106	THEN '¿?'
				WHEN 108	THEN '¿?'
				WHEN 122	THEN '¿?'
				WHEN 127	THEN 'long'
				WHEN 165	THEN '¿?' -- varbinary
				WHEN 167	THEN '¿?'
				WHEN 173	THEN '¿?' -- binary
				WHEN 175	THEN 'char'
				WHEN 189	THEN '¿?'
				WHEN 231	THEN '¿?'
				WHEN 239	THEN 'char'
				ELSE '¿?'
			END
	IF @Anulable <> 0 OR @Descripcion = '¿?'
		SET	@Descripcion =
			CASE @Tipo
				WHEN 34		THEN 'Object' -- image
				WHEN 35		THEN 'String' -- text
				WHEN 36		THEN 'Object' -- uniqueidentifier
				WHEN 48		THEN 'Byte'
				WHEN 52		THEN 'Short'
				WHEN 56		THEN 'Integer'
				WHEN 58		THEN 'Date'
				WHEN 59		THEN 'Float'
				WHEN 60		THEN 'BigDecimal'
				WHEN 61		THEN 'Time'
				WHEN 62		THEN 'Double'
				WHEN 98		THEN 'Object' -- sql_variant
				WHEN 99		THEN 'String'
				WHEN 104 	THEN 'Boolean'
				WHEN 106	THEN 'BigDecimal'
				WHEN 108	THEN 'BigDecimal'
				WHEN 122	THEN 'BigDecimal'
				WHEN 127	THEN 'Long'
				WHEN 165	THEN 'Object' -- varbinary
				WHEN 167	THEN 'String'
				WHEN 173	THEN 'Object' -- binary
				WHEN 175	THEN 'Character'
				WHEN 189	THEN 'Timestamp'
				WHEN 231	THEN 'String'
				WHEN 239	THEN 'Character'
				ELSE 'Object' -- unknown
			END
	/**/
	RETURN @Descripcion
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
