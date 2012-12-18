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
	log_imp_hog.p20d AS p20d,
	log_imp_hog.p20m AS p20m,
	log_imp_hog.p20a AS p20a,
	log_imp_hog.p17 AS p17,
	log_imp_hog.p18 AS p18,
	log_imp_hog.var00001 AS var00001,
	log_imp_hog.p19 AS p19,
	log_imp_hog.observaciones AS observaciones,
	log_imp_hog.utm AS utm,
	log_imp_hog.gps AS gps,
	log_imp_hog.orden AS orden,
	log_imp_hog.coordx AS coordx,
	log_imp_hog.p01a AS p01a,
	log_imp_hog.p01b AS p01b,
	log_imp_hog.p01c AS p01c,
	log_imp_hog.p01d AS p01d,
	log_imp_hog.p02 AS p02,
	log_imp_hog.p03 AS p03,
	log_imp_hog.p04 AS p04,
	log_imp_hog.p05 AS p05,
	log_imp_hog.p06 AS p06,
	log_imp_hog.p08 AS p08,
	log_imp_hog.p07 AS p07,
	log_imp_hog.p09 AS p09,
	log_imp_hog.p14 AS p14,
	log_imp_hog.p15 AS p15,
	log_imp_hog.p16 AS p16,
	log_imp_hog.p24 AS p24,
	log_imp_hog.p25 AS p25,
	log_imp_hog.p26 AS p26,
	log_imp_hog.p27 AS p27,
	log_imp_hog.p27e AS p27e,
	log_imp_hog.p28a AS p28a,
	log_imp_hog.p28b AS p28b,
	log_imp_hog.p29 AS p29,
	log_imp_hog.p30 AS p30,
	log_imp_hog.p31 AS p31,
	log_imp_hog.p32 AS p32,
	log_imp_hog.p33 AS p33,
	log_imp_hog.p34 AS p34,
	log_imp_hog.p35 AS p35,
	log_imp_hog.p36 AS p36,
	log_imp_hog.p37 AS p37,
	log_imp_hog.nro_celular AS nro_celular,
	log_imp_hog.p38 AS p38,
	log_imp_hog.nro_linea_baja AS nro_linea_baja,
	log_imp_hog.p391 AS p391,
	log_imp_hog.p392 AS p392,
	log_imp_hog.p393 AS p393,
	log_imp_hog.p394 AS p394,
	log_imp_hog.p395 AS p395,
	log_imp_hog.p396 AS p396,
	log_imp_hog.p397 AS p397,
	log_imp_hog.p42n AS p42n,
	log_imp_hog.p42ci AS p42ci,
	log_imp_hog.letra_ci AS letra_ci,
	log_imp_hog.p43 AS p43,
	log_imp_hog.var00002 AS var00002,
	log_imp_hog.var00003 AS var00003,
	log_imp_hog.var00004 AS var00004,
	log_imp_hog.p104 AS p104,
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
