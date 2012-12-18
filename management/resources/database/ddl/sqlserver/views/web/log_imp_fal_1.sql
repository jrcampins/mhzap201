if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_log_imp_fal_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_log_imp_fal_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_log_imp_fal_1] AS
SELECT
	log_imp_fal.id_log_imp_fal AS id_log_imp_fal,
	log_imp_fal.version_log_imp_fal AS version_log_imp_fal,
	log_imp_fal.cedula AS cedula,
	log_imp_fal.primer_nombre AS primer_nombre,
	log_imp_fal.segundo_nombre AS segundo_nombre,
	log_imp_fal.primer_apellido AS primer_apellido,
	log_imp_fal.segundo_apellido AS segundo_apellido,
	log_imp_fal.apellido_casada AS apellido_casada,
	log_imp_fal.defuncion AS defuncion,
	log_imp_fal.es_importado AS es_importado,
	log_imp_fal.observacion AS observacion,
	log_imp_fal.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_fal.nombre_archivo AS nombre_archivo,
	log_imp_fal.codigo_archivo AS codigo_archivo
FROM
	log_imp_fal log_imp_fal
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
