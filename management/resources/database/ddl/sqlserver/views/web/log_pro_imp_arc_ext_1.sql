if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_log_pro_imp_arc_ext_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_log_pro_imp_arc_ext_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_log_pro_imp_arc_ext_1] AS
SELECT
	log_pro_imp_arc_ext.id_log_pro_imp_arc_ext AS id_log_pro_imp_arc_ext,
	log_pro_imp_arc_ext.version_log_pro_imp_arc_ext AS version_log_pro_imp_arc_ext,
	log_pro_imp_arc_ext.id_archivo_datos_ext AS id_archivo_datos_ext,
		archivo_datos_ext_1x1.codigo_archivo_datos_ext AS codigo_archivo_datos_ext_1x1y3,
		archivo_datos_ext_1x1.nombre_archivo_datos_ext AS nombre_archivo_datos_ext_1x1y4,
		archivo_datos_ext_1x1.id_proveedor_dat_ext AS id_proveedor_dat_ext_1x1y5,
		archivo_datos_ext_1x1.numero_tipo_arc_dat_ext AS numero_tipo_arc_dat_ext_1x1y6,
		archivo_datos_ext_1x1.objeto_archivo_datos_ext AS objeto_archivo_datos_ext_1x1y7,
		archivo_datos_ext_1x1.bytes_archivo_datos_ext AS bytes_archivo_datos_ext_1x1y8,
		archivo_datos_ext_1x1.es_archivo_datos_ext_importado AS es_archivo_datos_ext_imp_1x1y9,
		archivo_datos_ext_1x1.es_archivo_datos_ext_inactivo AS es_archivo_datos_ext_in_1x1y10,
		archivo_datos_ext_1x1.fecha_hora_ultima_carga AS fecha_hora_ultima_carga_1x1y11,
		archivo_datos_ext_1x1.id_usuario_ultima_carga AS id_usuario_ultima_carga_1x1y12,
		archivo_datos_ext_1x1.fecha_hora_ultima_importacion AS fecha_hora_ultima_impor_1x1y13,
		archivo_datos_ext_1x1.id_usuario_ultima_importacion AS id_usuario_ultima_impor_1x1y14,
	log_pro_imp_arc_ext.codigo_tipo_arc_dat_ext AS codigo_tipo_arc_dat_ext,
	log_pro_imp_arc_ext.numero_tipo_arc_dat_ext AS numero_tipo_arc_dat_ext,
		tipo_arc_dat_ext_1x2.codigo_tipo_arc_dat_ext AS codigo_tipo_arc_dat_ext_1x2y2,
	log_pro_imp_arc_ext.nombre_proveedor_dat_ext AS nombre_proveedor_dat_ext,
	log_pro_imp_arc_ext.codigo_proveedor_dat_ext AS codigo_proveedor_dat_ext,
	log_pro_imp_arc_ext.codigo_archivo_datos_ext AS codigo_archivo_datos_ext,
	log_pro_imp_arc_ext.ruta_archivo_datos_ext AS ruta_archivo_datos_ext,
	log_pro_imp_arc_ext.es_importado AS es_importado,
	log_pro_imp_arc_ext.observacion AS observacion,
	log_pro_imp_arc_ext.fecha_hora_transaccion AS fecha_hora_transaccion
FROM
	log_pro_imp_arc_ext log_pro_imp_arc_ext
	LEFT OUTER JOIN archivo_datos_ext archivo_datos_ext_1x1 ON archivo_datos_ext_1x1.id_archivo_datos_ext = log_pro_imp_arc_ext.id_archivo_datos_ext
	LEFT OUTER JOIN tipo_arc_dat_ext tipo_arc_dat_ext_1x2 ON tipo_arc_dat_ext_1x2.numero_tipo_arc_dat_ext = log_pro_imp_arc_ext.numero_tipo_arc_dat_ext
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
