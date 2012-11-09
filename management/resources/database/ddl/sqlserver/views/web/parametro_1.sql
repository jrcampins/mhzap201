if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_parametro_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_parametro_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_parametro_1] AS
SELECT
	parametro.id_parametro AS id_parametro,
	parametro.version_parametro AS version_parametro,
	parametro.codigo_parametro AS codigo_parametro,
	parametro.nombre_parametro AS nombre_parametro,
	parametro.detalle_parametro AS detalle_parametro,
	parametro.descripcion_parametro AS descripcion_parametro,
	parametro.numero_tipo_dato_par AS numero_tipo_dato_par,
		tipo_dato_par_1x1.codigo_tipo_dato_par AS codigo_tipo_dato_par_1x1y2,
	parametro.alias_parametro AS alias_parametro
FROM
	parametro parametro
	INNER JOIN tipo_dato_par tipo_dato_par_1x1 ON tipo_dato_par_1x1.numero_tipo_dato_par = parametro.numero_tipo_dato_par
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
