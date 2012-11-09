if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_elemento_segmento_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_elemento_segmento_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_elemento_segmento_1] AS
SELECT
	elemento_segmento.id_elemento_segmento AS id_elemento_segmento,
	elemento_segmento.version_elemento_segmento AS version_elemento_segmento,
	elemento_segmento.id_conjunto_segmento AS id_conjunto_segmento,
		conjunto_segmento_1x1.codigo_conjunto_segmento AS codigo_conjunto_segmento_1x1y3,
		conjunto_segmento_1x1.nombre_conjunto_segmento AS nombre_conjunto_segmento_1x1y4,
		conjunto_segmento_1x1.descripcion_conjunto_segmento AS descripcion_conjunto_seg_1x1y5,
		conjunto_segmento_1x1.id_clase_recurso AS id_clase_recurso_1x1y6,
	elemento_segmento.id_segmento AS id_segmento,
	elemento_segmento.valor_segmento AS valor_segmento,
	elemento_segmento.significado_segmento AS significado_segmento
FROM
	elemento_segmento elemento_segmento
	INNER JOIN conjunto_segmento conjunto_segmento_1x1 ON conjunto_segmento_1x1.id_conjunto_segmento = elemento_segmento.id_conjunto_segmento
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
