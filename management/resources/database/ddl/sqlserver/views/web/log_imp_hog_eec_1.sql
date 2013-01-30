if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_log_imp_hog_eec_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_log_imp_hog_eec_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_log_imp_hog_eec_1] AS
SELECT
	log_imp_hog_eec.id_log_imp_hog_eec AS id_log_imp_hog_eec,
	log_imp_hog_eec.version_log_imp_hog_eec AS version_log_imp_hog_eec,
	log_imp_hog_eec.dptod AS dptod,
	log_imp_hog_eec.distritod AS distritod,
	log_imp_hog_eec.distripg AS distripg,
	log_imp_hog_eec.area AS area,
	log_imp_hog_eec.barrio AS barrio,
	log_imp_hog_eec.manzana AS manzana,
	log_imp_hog_eec.formulario AS formulario,
	log_imp_hog_eec.vivi AS vivi,
	log_imp_hog_eec.hogar AS hogar,
	log_imp_hog_eec.direccion AS direccion,
	log_imp_hog_eec.nro_de AS nro_de,
	log_imp_hog_eec.telefono AS telefono,
	log_imp_hog_eec.fecha AS fecha,
	log_imp_hog_eec.dia AS dia,
	log_imp_hog_eec.mes AS mes,
	log_imp_hog_eec.ano AS ano,
	log_imp_hog_eec.v10t AS v10t,
	log_imp_hog_eec.v11 AS v11,
	log_imp_hog_eec.v12 AS v12,
	log_imp_hog_eec.v13 AS v13,
	log_imp_hog_eec.v14 AS v14,
	log_imp_hog_eec.v15 AS v15,
	log_imp_hog_eec.v16 AS v16,
	log_imp_hog_eec.v16_otr AS v16_otr,
	log_imp_hog_eec.v17a AS v17a,
	log_imp_hog_eec.v17b AS v17b,
	log_imp_hog_eec.v18 AS v18,
	log_imp_hog_eec.v19 AS v19,
	log_imp_hog_eec.v20 AS v20,
	log_imp_hog_eec.v21 AS v21,
	log_imp_hog_eec.v22 AS v22,
	log_imp_hog_eec.v23 AS v23,
	log_imp_hog_eec.v24 AS v24,
	log_imp_hog_eec.v25 AS v25,
	log_imp_hog_eec.v26 AS v26,
	log_imp_hog_eec.v26esp_celular AS v26esp_celular,
	log_imp_hog_eec.v27 AS v27,
	log_imp_hog_eec.v27esp_linea AS v27esp_linea,
	log_imp_hog_eec.v28_1 AS v28_1,
	log_imp_hog_eec.v28_2 AS v28_2,
	log_imp_hog_eec.v28_3 AS v28_3,
	log_imp_hog_eec.v28_4 AS v28_4,
	log_imp_hog_eec.v28_5 AS v28_5,
	log_imp_hog_eec.v28_6 AS v28_6,
	log_imp_hog_eec.v28_7 AS v28_7,
	log_imp_hog_eec.v28_8 AS v28_8,
	log_imp_hog_eec.v29nombre_jefe AS v29nombre_jefe,
	log_imp_hog_eec.cedulajefe AS cedulajefe,
	log_imp_hog_eec.var00001 AS var00001,
	log_imp_hog_eec.es_importado AS es_importado,
	log_imp_hog_eec.observacion AS observacion,
	log_imp_hog_eec.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_hog_eec.nombre_archivo AS nombre_archivo,
	log_imp_hog_eec.codigo_archivo AS codigo_archivo
FROM
	log_imp_hog_eec log_imp_hog_eec
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
