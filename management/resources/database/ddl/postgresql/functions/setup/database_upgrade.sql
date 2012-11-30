CREATE OR REPLACE FUNCTION setup_database_upgrade() RETURNS integer AS
$body$
DECLARE
    comando varchar := 'select {0}';
    funcion record;
    ok integer;
BEGIN
    FOR funcion IN
    (
    select  proname||'('||pg_catalog.oidvectortypes(proargtypes)||')' as firma_funcion
    from    pg_proc inner join pg_namespace on pg_namespace.oid = pg_proc.pronamespace
    where   proname like 'setup_database_upgrade_version%'
    and     pg_catalog.oidvectortypes(proargtypes)=''
    order   by proname
    )
    LOOP
        comando = 'select ' || funcion.firma_funcion;
--      RAISE NOTICE 'execute: "%"', comando;
        execute comando;
    END LOOP;
    return 0;
END;
$body$
LANGUAGE 'plpgsql' VOLATILE CALLED ON NULL INPUT SECURITY INVOKER;
