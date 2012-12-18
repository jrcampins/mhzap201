if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_log_imp_per_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_log_imp_per_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_log_imp_per_1] AS
SELECT
	log_imp_per.id_log_imp_per AS id_log_imp_per,
	log_imp_per.version_log_imp_per AS version_log_imp_per,
	log_imp_per.p01a AS p01a,
	log_imp_per.p01b AS p01b,
	log_imp_per.p01c AS p01c,
	log_imp_per.p01d AS p01d,
	log_imp_per.p02 AS p02,
	log_imp_per.p03 AS p03,
	log_imp_per.p104 AS p104,
	log_imp_per.p43 AS p43,
	log_imp_per.p45a AS p45a,
	log_imp_per.p45b AS p45b,
	log_imp_per.p44a AS p44a,
	log_imp_per.p44b AS p44b,
	log_imp_per.var00001 AS var00001,
	log_imp_per.var00002 AS var00002,
	log_imp_per.p46 AS p46,
	log_imp_per.p47 AS p47,
	log_imp_per.var00030 AS var00030,
	log_imp_per.p48 AS p48,
	log_imp_per.p49 AS p49,
	log_imp_per.p50a AS p50a,
	log_imp_per.p50b AS p50b,
	log_imp_per.p50c AS p50c,
	log_imp_per.p51 AS p51,
	log_imp_per.var00003 AS var00003,
	log_imp_per.var00004 AS var00004,
	log_imp_per.p52d AS p52d,
	log_imp_per.p52m AS p52m,
	log_imp_per.p52a AS p52a,
	log_imp_per.p53a AS p53a,
	log_imp_per.p53b AS p53b,
	log_imp_per.p53c AS p53c,
	log_imp_per.p53z AS p53z,
	log_imp_per.p54 AS p54,
	log_imp_per.p54e AS p54e,
	log_imp_per.p56 AS p56,
	log_imp_per.p58 AS p58,
	log_imp_per.p58e AS p58e,
	log_imp_per.p59 AS p59,
	log_imp_per.p60 AS p60,
	log_imp_per.p61 AS p61,
	log_imp_per.p62 AS p62,
	log_imp_per.p63 AS p63,
	log_imp_per.p64 AS p64,
	log_imp_per.p65 AS p65,
	log_imp_per.p65e AS p65e,
	log_imp_per.p66 AS p66,
	log_imp_per.p66e AS p66e,
	log_imp_per.p67 AS p67,
	log_imp_per.p68 AS p68,
	log_imp_per.p68e AS p68e,
	log_imp_per.p73 AS p73,
	log_imp_per.p74 AS p74,
	log_imp_per.var00006 AS var00006,
	log_imp_per.var00007 AS var00007,
	log_imp_per.var00008 AS var00008,
	log_imp_per.var00009 AS var00009,
	log_imp_per.var00010 AS var00010,
	log_imp_per.var00011 AS var00011,
	log_imp_per.var00031 AS var00031,
	log_imp_per.var00012 AS var00012,
	log_imp_per.var00013 AS var00013,
	log_imp_per.p86 AS p86,
	log_imp_per.p87 AS p87,
	log_imp_per.p87e AS p87e,
	log_imp_per.p88 AS p88,
	log_imp_per.p88e AS p88e,
	log_imp_per.p91 AS p91,
	log_imp_per.var00017 AS var00017,
	log_imp_per.var00018 AS var00018,
	log_imp_per.var00019 AS var00019,
	log_imp_per.var00020 AS var00020,
	log_imp_per.var00021 AS var00021,
	log_imp_per.var00022 AS var00022,
	log_imp_per.var00023 AS var00023,
	log_imp_per.var00024 AS var00024,
	log_imp_per.var00025 AS var00025,
	log_imp_per.var00026 AS var00026,
	log_imp_per.var00027 AS var00027,
	log_imp_per.var00028 AS var00028,
	log_imp_per.p92 AS p92,
	log_imp_per.icv AS icv,
	log_imp_per.ficha_activa AS ficha_activa,
	log_imp_per.es_importado AS es_importado,
	log_imp_per.observacion AS observacion,
	log_imp_per.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_per.nombre_archivo AS nombre_archivo,
	log_imp_per.codigo_archivo AS codigo_archivo
FROM
	log_imp_per log_imp_per
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
