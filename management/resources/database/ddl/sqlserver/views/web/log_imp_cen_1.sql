if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_log_imp_cen_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_log_imp_cen_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_log_imp_cen_1] AS
SELECT
	log_imp_cen.id_log_imp_cen AS id_log_imp_cen,
	log_imp_cen.version_log_imp_cen AS version_log_imp_cen,
	log_imp_cen.orden AS orden,
	log_imp_cen.barrio AS barrio,
	log_imp_cen.direccion AS direccion,
	log_imp_cen.telefono AS telefono,
	log_imp_cen.primer_nombre AS primer_nombre,
	log_imp_cen.segundo_nombre AS segundo_nombre,
	log_imp_cen.primer_apellido AS primer_apellido,
	log_imp_cen.segundo_apellido AS segundo_apellido,
	log_imp_cen.edad_a_la_fecha AS edad_a_la_fecha,
	log_imp_cen.sexo AS sexo,
	log_imp_cen.parentesco AS parentesco,
	log_imp_cen.cedula AS cedula,
	log_imp_cen.nombre_jefe_hogar AS nombre_jefe_hogar,
	log_imp_cen.cedula_jefe_hogar AS cedula_jefe_hogar,
	log_imp_cen.icv AS icv,
	log_imp_cen.validado AS validado,
	log_imp_cen.observaciones AS observaciones,
	log_imp_cen.funcionario AS funcionario,
	log_imp_cen.causa_invalidacion AS causa_invalidacion,
	log_imp_cen.es_importado AS es_importado,
	log_imp_cen.observacion AS observacion,
	log_imp_cen.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_cen.nombre_archivo AS nombre_archivo,
	log_imp_cen.codigo_archivo AS codigo_archivo
FROM
	log_imp_cen log_imp_cen
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
