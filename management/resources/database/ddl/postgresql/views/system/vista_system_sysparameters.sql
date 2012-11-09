-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_sysparameters
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE OR REPLACE VIEW vista_system_sysparameters AS
select	id_funcion as function_key, codigo_funcion as function_name,
        cast(md5(routines.specific_catalog || routines.specific_schema || routines.specific_name || parameters.ordinal_position) as varchar(32)) as parameter_key,
        cast(routines.specific_catalog as varchar(256)),
        cast(routines.specific_schema as varchar(256)),
        cast(routines.specific_name as varchar(256)),
        cast(routines.routine_name as varchar(256)),
        cast(routines.data_type as varchar(256)) as routine_data_type,
        cast(routines.type_udt_name as varchar(256)),
        cast(parameters.ordinal_position as integer),
        cast(parameters.parameter_mode as varchar(256)),
        cast(parameters.parameter_name as varchar(256)),
        cast(parameters.data_type as varchar(256)) as parameter_data_type,
        cast(parameters.udt_name as varchar(256))
from	public.funcion
join    public.dominio
on      dominio.id_dominio = funcion.id_dominio
join    information_schema.routines
on      routine_name       = codigo_dominio || '_' || trim(both '_' from replace(replace(codigo_funcion, codigo_dominio, ''), '__', '_'))
join	information_schema.parameters
on      routines.specific_catalog   = parameters.specific_catalog
and     routines.specific_schema    = parameters.specific_schema
and     routines.specific_name      = parameters.specific_name
where	routines.routine_schema     = 'public'
and     routines.routine_type       = 'FUNCTION'
and     routines.routine_body       = 'EXTERNAL'
and     routines.external_language  = 'PLPGSQL'
and     routines.routine_definition IS NOT NULL
and     routines.routine_definition <> ''
and     routines.data_type          <> 'trigger'
and     routines.type_udt_name      <> 'trigger'
order	by routines.routine_name, parameters.ordinal_position;
