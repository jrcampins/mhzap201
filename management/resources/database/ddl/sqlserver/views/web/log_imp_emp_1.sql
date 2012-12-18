if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_log_imp_emp_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_log_imp_emp_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_log_imp_emp_1] AS
SELECT
	log_imp_emp.id_log_imp_emp AS id_log_imp_emp,
	log_imp_emp.version_log_imp_emp AS version_log_imp_emp,
	log_imp_emp.cedula AS cedula,
	log_imp_emp.primer_nombre AS primer_nombre,
	log_imp_emp.segundo_nombre AS segundo_nombre,
	log_imp_emp.primer_apellido AS primer_apellido,
	log_imp_emp.segundo_apellido AS segundo_apellido,
	log_imp_emp.apellido_casada AS apellido_casada,
	log_imp_emp.es_importado AS es_importado,
	log_imp_emp.observacion AS observacion,
	log_imp_emp.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_emp.nombre_archivo AS nombre_archivo,
	log_imp_emp.codigo_archivo AS codigo_archivo
FROM
	log_imp_emp log_imp_emp
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
