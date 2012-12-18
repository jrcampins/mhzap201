if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_log_imp_pen_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_log_imp_pen_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_log_imp_pen_1] AS
SELECT
	log_imp_pen.id_log_imp_pen AS id_log_imp_pen,
	log_imp_pen.version_log_imp_pen AS version_log_imp_pen,
	log_imp_pen.cedula AS cedula,
	log_imp_pen.primer_nombre AS primer_nombre,
	log_imp_pen.segundo_nombre AS segundo_nombre,
	log_imp_pen.primer_apellido AS primer_apellido,
	log_imp_pen.segundo_apellido AS segundo_apellido,
	log_imp_pen.apellido_casada AS apellido_casada,
	log_imp_pen.es_importado AS es_importado,
	log_imp_pen.observacion AS observacion,
	log_imp_pen.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_pen.nombre_archivo AS nombre_archivo,
	log_imp_pen.codigo_archivo AS codigo_archivo
FROM
	log_imp_pen log_imp_pen
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
