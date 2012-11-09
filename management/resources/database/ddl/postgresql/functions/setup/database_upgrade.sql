-- delimiter ??
-- DROP FUNCTION IF EXISTS setup_database_upgrade();
CREATE OR REPLACE FUNCTION setup_database_upgrade() RETURNS integer AS
$body$
DECLARE
    comando varchar := 'select {0}';
    funcion record;
    ok integer;
BEGIN
    select  1
    into    ok
    from    pg_class tab
    join    pg_attribute att
    on      att.attrelid=tab.oid
    where   tab.relkind = 'r'
    and     tab.relname = 'dual'
    and     att.attname = 'version_dual'
    and     att.attnum  > 0;
    if not found then
        RAISE NOTICE 'ALTER TABLE dual ADD COLUMN version_dual BIGINT';
        ALTER TABLE dual ADD COLUMN version_dual BIGINT;
        UPDATE dual SET version_dual=0;
        ALTER TABLE dual ALTER COLUMN version_dual SET NOT NULL;
    end if;
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
--  RAISE NOTICE 'execute: "%"', comando;
    execute comando;
	END LOOP;
    return 0;
END;
$body$
LANGUAGE 'plpgsql' VOLATILE CALLED ON NULL INPUT SECURITY INVOKER;
-- ??
