if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_log_imp_per_eec_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_log_imp_per_eec_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_log_imp_per_eec_1] AS
SELECT
	log_imp_per_eec.id_log_imp_per_eec AS id_log_imp_per_eec,
	log_imp_per_eec.version_log_imp_per_eec AS version_log_imp_per_eec,
	log_imp_per_eec.dptod AS dptod,
	log_imp_per_eec.distritod AS distritod,
	log_imp_per_eec.distripg AS distripg,
	log_imp_per_eec.area AS area,
	log_imp_per_eec.barrio AS barrio,
	log_imp_per_eec.manzana AS manzana,
	log_imp_per_eec.formulario AS formulario,
	log_imp_per_eec.vivi AS vivi,
	log_imp_per_eec.hogar AS hogar,
	log_imp_per_eec.orden AS orden,
	log_imp_per_eec.p30 AS p30,
	log_imp_per_eec.p31 AS p31,
	log_imp_per_eec.p32 AS p32,
	log_imp_per_eec.p33 AS p33,
	log_imp_per_eec.p34 AS p34,
	log_imp_per_eec.p35 AS p35,
	log_imp_per_eec.p36_orden_conyugue AS p36_orden_conyugue,
	log_imp_per_eec.p36_orden_padre AS p36_orden_padre,
	log_imp_per_eec.p36_orden_madre AS p36_orden_madre,
	log_imp_per_eec.p37 AS p37,
	log_imp_per_eec.p37_cedula AS p37_cedula,
	log_imp_per_eec.p38_dia AS p38_dia,
	log_imp_per_eec.p38_mes AS p38_mes,
	log_imp_per_eec.p38_ano AS p38_ano,
	log_imp_per_eec.p39pais AS p39pais,
	log_imp_per_eec.p39dpto AS p39dpto,
	log_imp_per_eec.p39dist AS p39dist,
	log_imp_per_eec.p39area AS p39area,
	log_imp_per_eec.p40_idioma AS p40_idioma,
	log_imp_per_eec.p40otr AS p40otr,
	log_imp_per_eec.p41 AS p41,
	log_imp_per_eec.p42 AS p42,
	log_imp_per_eec.p43 AS p43,
	log_imp_per_eec.p44_45t AS p44_45t,
	log_imp_per_eec.p44 AS p44,
	log_imp_per_eec.p45 AS p45,
	log_imp_per_eec.p46 AS p46,
	log_imp_per_eec.p47 AS p47,
	log_imp_per_eec.p48 AS p48,
	log_imp_per_eec.p49 AS p49,
	log_imp_per_eec.p49_otr AS p49_otr,
	log_imp_per_eec.p50 AS p50,
	log_imp_per_eec.p50_otr AS p50_otr,
	log_imp_per_eec.p51 AS p51,
	log_imp_per_eec.p52 AS p52,
	log_imp_per_eec.p52_otr AS p52_otr,
	log_imp_per_eec.p53 AS p53,
	log_imp_per_eec.p54 AS p54,
	log_imp_per_eec.p54a AS p54a,
	log_imp_per_eec.p54_otr AS p54_otr,
	log_imp_per_eec.p55 AS p55,
	log_imp_per_eec.p55_otr AS p55_otr,
	log_imp_per_eec.p56 AS p56,
	log_imp_per_eec.p57 AS p57,
	log_imp_per_eec.p58 AS p58,
	log_imp_per_eec.p59 AS p59,
	log_imp_per_eec.p60 AS p60,
	log_imp_per_eec.p61 AS p61,
	log_imp_per_eec.p62 AS p62,
	log_imp_per_eec.p63 AS p63,
	log_imp_per_eec.p63_especificar AS p63_especificar,
	log_imp_per_eec.p64des AS p64des,
	log_imp_per_eec.p64c AS p64c,
	log_imp_per_eec.p65des AS p65des,
	log_imp_per_eec.p65c AS p65c,
	log_imp_per_eec.p66 AS p66,
	log_imp_per_eec.p67a AS p67a,
	log_imp_per_eec.p67b AS p67b,
	log_imp_per_eec.p67c AS p67c,
	log_imp_per_eec.p67d AS p67d,
	log_imp_per_eec.p67e AS p67e,
	log_imp_per_eec.p67f AS p67f,
	log_imp_per_eec.p67g AS p67g,
	log_imp_per_eec.p67h AS p67h,
	log_imp_per_eec.p67i AS p67i,
	log_imp_per_eec.p67j AS p67j,
	log_imp_per_eec.p67k AS p67k,
	log_imp_per_eec.p67l AS p67l,
	log_imp_per_eec.p67tot AS p67tot,
	log_imp_per_eec.es_importado AS es_importado,
	log_imp_per_eec.observacion AS observacion,
	log_imp_per_eec.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_per_eec.nombre_archivo AS nombre_archivo,
	log_imp_per_eec.codigo_archivo AS codigo_archivo
FROM
	log_imp_per_eec log_imp_per_eec
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO