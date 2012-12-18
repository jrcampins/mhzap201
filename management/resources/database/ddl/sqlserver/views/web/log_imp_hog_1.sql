if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_log_imp_hog_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_log_imp_hog_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_log_imp_hog_1] AS
SELECT
	log_imp_hog.id_log_imp_hog AS id_log_imp_hog,
	log_imp_hog.version_log_imp_hog AS version_log_imp_hog,
	log_imp_hog.observaciones AS observaciones,
	log_imp_hog.letra_ci AS letra_ci,
	log_imp_hog.es_importado AS es_importado,
	log_imp_hog.observacion AS observacion,
	log_imp_hog.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_hog.nombre_archivo AS nombre_archivo,
	log_imp_hog.codigo_archivo AS codigo_archivo
FROM
	log_imp_hog log_imp_hog
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
