if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_log_imp_sub_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_log_imp_sub_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_log_imp_sub_1] AS
SELECT
	log_imp_sub.id_log_imp_sub AS id_log_imp_sub,
	log_imp_sub.version_log_imp_sub AS version_log_imp_sub,
	log_imp_sub.cedula AS cedula,
	log_imp_sub.primer_nombre AS primer_nombre,
	log_imp_sub.segundo_nombre AS segundo_nombre,
	log_imp_sub.primer_apellido AS primer_apellido,
	log_imp_sub.segundo_apellido AS segundo_apellido,
	log_imp_sub.apellido_casada AS apellido_casada,
	log_imp_sub.es_importado AS es_importado,
	log_imp_sub.observacion AS observacion,
	log_imp_sub.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_sub.nombre_archivo AS nombre_archivo,
	log_imp_sub.codigo_archivo AS codigo_archivo
FROM
	log_imp_sub log_imp_sub
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
