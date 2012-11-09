if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnTipoDatoPrimitivo]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnTipoDatoPrimitivo]
GO
SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
CREATE  FUNCTION xfnTipoDatoPrimitivo (@Tipo smallint) RETURNS VARCHAR(20) AS
BEGIN
	DECLARE	@Descripcion VARCHAR(20)
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
	RETURN @Descripcion
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
