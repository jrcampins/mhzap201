-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_sysroutines
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[vista_system_sysroutines]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[vista_system_sysroutines]
GO
SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
CREATE VIEW vista_system_sysroutines AS
SELECT	TOP 100 PERCENT
		id_funcion AS function_key,
		codigo_funcion AS function_name,
		dbo.xfnRoutineKey(specific_catalog, specific_schema, specific_name) AS routine_key,
		CAST(routine_name AS VARCHAR(256)) AS routine_name,
		CAST(data_type AS VARCHAR(256)) AS routine_data_type,
		CASE
			WHEN type_udt_name IS NULL
			THEN CAST(data_type AS VARCHAR(256))
			ELSE CAST(type_udt_name AS VARCHAR(256))
			END AS type_udt_name
FROM	funcion
INNER 	join dominio ON	dominio.id_dominio = funcion.id_dominio
INNER	join information_schema.routines ON	CAST(routine_name AS VARCHAR(256)) = dbo.xfnRoutineName(codigo_funcion, codigo_dominio)
WHERE	numero_tipo_funcion	= 13
--  and	routine_schema		= 'dbo'
--  and	routine_type		= 'FUNCTION'
--  and	routine_body		= 'SQL'
--  and	routine_definition	IS NOT NULL
--  and	routine_definition	<> ''
--  and	data_type			<> 'trigger'
----and	external_language	= 'SQL'
----and	type_udt_name		IS NOT NULL
----and	type_udt_name		<> 'trigger'
ORDER	BY routine_name
GO
SET QUOTED_IDENTIFIER OFF
GO
SET ANSI_NULLS ON
GO
/*
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[vista_system_sysroutines]') and OBJECTPROPERTY(id, N'IsView') = 1)
SELECT * FROM vista_system_sysroutines
*/
