-- delimiter ??
CREATE OR REPLACE FUNCTION setup_database_upgrade_drop() RETURNS integer AS
$body$
BEGIN
    perform setup_database_upgrade_drop_triggers();
    perform setup_database_upgrade_drop_functions();
    perform setup_database_upgrade_drop_views();
    perform setup_database_upgrade_drop_constraints();
    perform setup_database_upgrade_drop_indexes();
    perform setup_database_upgrade_drop_defaults();
    return 0;
END;
$body$
LANGUAGE 'plpgsql' VOLATILE CALLED ON NULL INPUT SECURITY INVOKER;

CREATE OR REPLACE FUNCTION setup_database_upgrade_drop_constraints() RETURNS integer AS
$body$
DECLARE
    reg     record;
    nombre  varchar;
    tabla   varchar;
    comando varchar := 'ALTER TABLE {0} DROP CONSTRAINT {1} CASCADE;';
    query   varchar;
BEGIN
 -- contype: c = check constraint, f = foreign key constraint, p = primary key constraint, u = unique constraint
    FOR reg IN
        (
        select  distinct
		pdq.contype,
                tab.relname as table_name,
                pdq.conname as constraint_name
        from	pg_class      tab
        join	pg_constraint pdq on tab.oid=conrelid
        join	pg_namespace  nsp on nsp.oid=relnamespace
        where	tab.relkind = 'r'
        and     nsp.nspname = 'public'
        and     tab.relname not like'pg%'
        and     tab.relname not like'sql%'
--      and     pdq.contype <> 'p' -- tambien se deben eliminar las claves primarias
        order	by 1, 2, 3
        )
    LOOP
    query  = comando;
    tabla  = reg.table_name;
    nombre = reg.constraint_name;
    query  = replace(query, '{0}', tabla);
    query  = replace(query, '{1}', nombre);
--  RAISE NOTICE '%',query;
    execute query;
    END LOOP;
    return 0;
END;
$body$
LANGUAGE 'plpgsql' VOLATILE CALLED ON NULL INPUT SECURITY INVOKER;

CREATE OR REPLACE FUNCTION setup_database_upgrade_drop_defaults() RETURNS integer AS
$body$
DECLARE
    reg     record;
    nombre  varchar;
    tabla   varchar;
    comando varchar := 'ALTER TABLE {0} ALTER COLUMN {1} DROP DEFAULT;';
    query   varchar;
BEGIN
    FOR reg IN
        (
        select  distinct
                table_name,
                column_name
        from    information_schema.columns
        where   column_default is not null
        and     table_schema = 'public'
        and     table_name not like 'pg%'
        and     table_name not like 'sql%'
        order   by 1, 2
        )
    LOOP
    query  = comando;
    tabla  = reg.table_name;
    nombre = reg.column_name;
    query  = replace(query, '{0}', tabla);
    query  = replace(query, '{1}', nombre);
--  RAISE NOTICE '%',query;
    execute query;
    END LOOP;
    return 0;
END;
$body$
LANGUAGE 'plpgsql' VOLATILE CALLED ON NULL INPUT SECURITY INVOKER;

CREATE OR REPLACE FUNCTION setup_database_upgrade_drop_functions() RETURNS integer AS
$body$
DECLARE
    reg     record;
    nombre  varchar;
    tabla   varchar;
    comando varchar := 'DROP FUNCTION IF EXISTS {0} CASCADE;';
    query   varchar;
BEGIN
    FOR reg IN
        (
        select  distinct
                proname||'('||pg_catalog.oidvectortypes(proargtypes)||')' as firma_funcion
        from    pg_proc
        join    pg_namespace on pg_namespace.oid = pg_proc.pronamespace
        where   nspname = 'public'
        and     proname not like 'pg%'
        and     proname not like 'sql%'
        and     proname not like 'setup_database_upgrade%'
        order   by 1
        )
    LOOP
    query  = comando;
    nombre = reg.firma_funcion;
    query  = replace(query, '{0}', nombre);
--  RAISE NOTICE '%',query;
    execute query;
    END LOOP;
    return 0;
END;
$body$
LANGUAGE 'plpgsql' VOLATILE CALLED ON NULL INPUT SECURITY INVOKER;

CREATE OR REPLACE FUNCTION setup_database_upgrade_drop_indexes() RETURNS integer AS
$body$
DECLARE
    reg     record;
    nombre  varchar;
    comando varchar := 'DROP INDEX IF EXISTS {0} CASCADE;';
    query   varchar;
BEGIN
    FOR reg IN
        (
        select	distinct
                idx.relname
        from	pg_index
        join	pg_class     idx on idx.oid=pg_index.indexrelid
        join	pg_class     tab on tab.oid=pg_index.indrelid
        join	pg_namespace nsp on nsp.oid=tab.relnamespace
        where	tab.relkind = 'r'
        and     nsp.nspname = 'public'
        and     tab.relname not like'pg%'
        and     tab.relname not like'sql%'
        order	by 1
        )
    LOOP
    query  = comando;
    nombre = reg.relname;
    query  = replace(query, '{0}', nombre);
--  RAISE NOTICE '%',query;
    execute query;
    END LOOP;
    return 0;
END;
$body$
LANGUAGE 'plpgsql' VOLATILE CALLED ON NULL INPUT SECURITY INVOKER;

CREATE OR REPLACE FUNCTION setup_database_upgrade_drop_triggers() RETURNS integer AS
$body$
DECLARE
    reg     record;
    nombre  varchar;
    tabla   varchar;
    comando varchar := 'DROP TRIGGER IF EXISTS {0} ON {1} CASCADE;';
    query   varchar;
BEGIN
    FOR reg IN
        (
        select  distinct
                trigger_name,
                event_object_table
        from    information_schema.triggers
        where   trigger_schema = 'public'
        and     trigger_name not like 'pg%'
        and     trigger_name not like 'sql%'
        order   by 1, 2
        )
    LOOP
    query  = comando;
    tabla  = reg.event_object_table;
    nombre = reg.trigger_name;
    query  = replace(query, '{0}', nombre);
    query  = replace(query, '{1}', tabla);
--  RAISE NOTICE '%',query;
    execute query;
    END LOOP;
    return 0;
END;
$body$
LANGUAGE 'plpgsql' VOLATILE CALLED ON NULL INPUT SECURITY INVOKER;

CREATE OR REPLACE FUNCTION setup_database_upgrade_drop_views() RETURNS integer AS
$body$
DECLARE
    reg     record;
    nombre  varchar;
    tabla   varchar;
    comando varchar := 'DROP VIEW IF EXISTS {0} CASCADE;';
    query   varchar;
BEGIN
    FOR reg IN
        (
        select  distinct
                table_name
        from    information_schema.views
        where   table_schema='public'
        and     table_name not like 'pg%'
        and     table_name not like 'sql%'
        order   by 1
        )
    LOOP
    query  = comando;
    nombre = reg.table_name;
    query  = replace(query, '{0}', nombre);
--  RAISE NOTICE '%',query;
    execute query;
    END LOOP;
    return 0;
END;
$body$
LANGUAGE 'plpgsql' VOLATILE CALLED ON NULL INPUT SECURITY INVOKER;
-- ??
