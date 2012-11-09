if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_archivo_datos_ext_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_archivo_datos_ext_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_archivo_datos_ext_1] AS
SELECT
	archivo_datos_ext.id_archivo_datos_ext AS id_archivo_datos_ext,
	archivo_datos_ext.version_archivo_datos_ext AS version_archivo_datos_ext,
	archivo_datos_ext.codigo_archivo_datos_ext AS codigo_archivo_datos_ext,
	archivo_datos_ext.nombre_archivo_datos_ext AS nombre_archivo_datos_ext,
	archivo_datos_ext.id_proveedor_dat_ext AS id_proveedor_dat_ext,
		proveedor_dat_ext_1x1.codigo_proveedor_dat_ext AS codigo_proveedor_dat_ext_1x1y3,
		proveedor_dat_ext_1x1.nombre_proveedor_dat_ext AS nombre_proveedor_dat_ext_1x1y4,
	archivo_datos_ext.numero_tipo_arc_dat_ext AS numero_tipo_arc_dat_ext,
		tipo_arc_dat_ext_1x2.codigo_tipo_arc_dat_ext AS codigo_tipo_arc_dat_ext_1x2y2,
	archivo_datos_ext.objeto_archivo_datos_ext AS objeto_archivo_datos_ext,
	archivo_datos_ext.bytes_archivo_datos_ext AS bytes_archivo_datos_ext,
	archivo_datos_ext.es_archivo_datos_ext_importado AS es_archivo_datos_ext_importado,
	archivo_datos_ext.es_archivo_datos_ext_inactivo AS es_archivo_datos_ext_inactivo,
	archivo_datos_ext.fecha_hora_ultima_carga AS fecha_hora_ultima_carga,
	archivo_datos_ext.id_usuario_ultima_carga AS id_usuario_ultima_carga,
		usuario_1x3.codigo_usuario AS codigo_usuario_1x3y3,
		usuario_1x3.nombre_usuario AS nombre_usuario_1x3y4,
		usuario_1x3.password_usuario AS password_usuario_1x3y5,
		usuario_1x3.correo_electronico AS correo_electronico_1x3y6,
		usuario_1x3.id_usuario_supervisor AS id_usuario_supervisor_1x3y7,
		usuario_1x3.es_super_usuario AS es_super_usuario_1x3y8,
		usuario_1x3.es_usuario_especial AS es_usuario_especial_1x3y9,
		usuario_1x3.es_usuario_inactivo AS es_usuario_inactivo_1x3y10,
		usuario_1x3.es_usuario_modificado AS es_usuario_modificado_1x3y11,
	archivo_datos_ext.fecha_hora_ultima_importacion AS fecha_hora_ultima_importacion,
	archivo_datos_ext.id_usuario_ultima_importacion AS id_usuario_ultima_importacion,
		usuario_1x4.codigo_usuario AS codigo_usuario_1x4y3,
		usuario_1x4.nombre_usuario AS nombre_usuario_1x4y4,
		usuario_1x4.password_usuario AS password_usuario_1x4y5,
		usuario_1x4.correo_electronico AS correo_electronico_1x4y6,
		usuario_1x4.id_usuario_supervisor AS id_usuario_supervisor_1x4y7,
		usuario_1x4.es_super_usuario AS es_super_usuario_1x4y8,
		usuario_1x4.es_usuario_especial AS es_usuario_especial_1x4y9,
		usuario_1x4.es_usuario_inactivo AS es_usuario_inactivo_1x4y10,
		usuario_1x4.es_usuario_modificado AS es_usuario_modificado_1x4y11
FROM
	archivo_datos_ext archivo_datos_ext
	INNER JOIN proveedor_dat_ext proveedor_dat_ext_1x1 ON proveedor_dat_ext_1x1.id_proveedor_dat_ext = archivo_datos_ext.id_proveedor_dat_ext
	INNER JOIN tipo_arc_dat_ext tipo_arc_dat_ext_1x2 ON tipo_arc_dat_ext_1x2.numero_tipo_arc_dat_ext = archivo_datos_ext.numero_tipo_arc_dat_ext
	LEFT OUTER JOIN usuario usuario_1x3 ON usuario_1x3.id_usuario = archivo_datos_ext.id_usuario_ultima_carga
	LEFT OUTER JOIN usuario usuario_1x4 ON usuario_1x4.id_usuario = archivo_datos_ext.id_usuario_ultima_importacion
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
