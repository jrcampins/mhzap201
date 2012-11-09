-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_sysparameters
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[vista_system_sysparameters]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[vista_system_sysparameters]
GO
SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
CREATE VIEW vista_system_sysparameters AS
SELECT	TOP 100 PERCENT
		id_funcion AS function_key,
		codigo_funcion AS function_name,
		dbo.xfnRoutineParameterKey(routines.specific_catalog, routines.specific_schema, routines.specific_name, parameters.ordinal_position) AS parameter_key,
        CAST(routines.specific_catalog AS VARCHAR(256)) AS specific_catalog,
        CAST(routines.specific_schema AS VARCHAR(256)) AS specific_schema,
        CAST(routines.specific_name AS VARCHAR(256)) AS specific_name,
		CAST(routines.routine_name AS VARCHAR(256)) AS routine_name,
		CAST(routines.data_type AS VARCHAR(256)) AS routine_data_type,
		CASE
			WHEN routines.type_udt_name IS NULL
			THEN CAST(routines.data_type AS VARCHAR(256))
			ELSE CAST(routines.type_udt_name AS VARCHAR(256))
			END AS type_udt_name,
        CAST(parameters.ordinal_position AS integer) AS ordinal_position,
        CAST(parameters.parameter_mode AS VARCHAR(256)) AS parameter_mode,
        CAST(parameters.parameter_name AS VARCHAR(256)) AS parameter_name,
        CAST(parameters.data_type AS VARCHAR(256)) AS parameter_data_type,
		CASE
			WHEN parameters.user_defined_type_name IS NULL
			THEN CAST(parameters.data_type AS VARCHAR(256))
			ELSE CAST(parameters.user_defined_type_name AS VARCHAR(256))
			END AS udt_name
FROM	funcion
INNER 	join dominio ON	dominio.id_dominio = funcion.id_dominio
INNER	join information_schema.routines routines ON CAST(routines.routine_name AS VARCHAR(256)) = dbo.xfnRoutineName(codigo_funcion, codigo_dominio)
INNER	join information_schema.parameters parameters
ON      routines.specific_catalog   = parameters.specific_catalog
AND     routines.specific_schema    = parameters.specific_schema
AND     routines.specific_name      = parameters.specific_name
WHERE	numero_tipo_funcion	= 13
ORDER	BY routines.routine_name, parameters.ordinal_position
GO
SET QUOTED_IDENTIFIER OFF
GO
SET ANSI_NULLS ON
GO
--/*
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[vista_system_sysparameters]') and OBJECTPROPERTY(id, N'IsView') = 1)
SELECT * FROM vista_system_sysparameters
--*/
