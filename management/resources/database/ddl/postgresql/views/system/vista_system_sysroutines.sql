-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_sysroutines
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE OR REPLACE VIEW vista_system_sysroutines AS
select	id_funcion as function_key, codigo_funcion as function_name,
        cast(md5(specific_catalog || specific_schema || specific_name) as varchar(32)) as routine_key,
        cast(routine_name as varchar(256)),
        cast(data_type as varchar(256)) as routine_data_type,
        cast(type_udt_name as varchar(256))
from	public.funcion
join    public.dominio
on      dominio.id_dominio = funcion.id_dominio
join    information_schema.routines
on      routine_name       = codigo_dominio || '_' || trim(both '_' from replace(replace(codigo_funcion, codigo_dominio, ''), '__', '_'))
where	routine_schema     = 'public'
and     routine_type       = 'FUNCTION'
and     routine_body       = 'EXTERNAL'
and     external_language  = 'PLPGSQL'
and     routine_definition IS NOT NULL
and     routine_definition <> ''
and     data_type          <> 'trigger'
and     type_udt_name      <> 'trigger'
order	by routine_name;
