if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_log_imp_ids_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_log_imp_ids_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_log_imp_ids_1] AS
SELECT
	log_imp_ids.id_log_imp_ids AS id_log_imp_ids,
	log_imp_ids.version_log_imp_ids AS version_log_imp_ids,
	log_imp_ids.cedula AS cedula,
	log_imp_ids.letra_cedula AS letra_cedula,
	log_imp_ids.apellidos AS apellidos,
	log_imp_ids.nombres AS nombres,
	log_imp_ids.nacimiento AS nacimiento,
	log_imp_ids.sexo AS sexo,
	log_imp_ids.nacionalidad AS nacionalidad,
	log_imp_ids.estado_civil AS estado_civil,
	log_imp_ids.lugar_nacimiento AS lugar_nacimiento,
	log_imp_ids.indigena AS indigena,
	log_imp_ids.es_importado AS es_importado,
	log_imp_ids.observacion AS observacion,
	log_imp_ids.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_ids.nombre_archivo AS nombre_archivo,
	log_imp_ids.codigo_archivo AS codigo_archivo
FROM
	log_imp_ids log_imp_ids
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
