-- delimiter ??
-- DROP FUNCTION IF EXISTS setup_database_upgrade_count();
CREATE OR REPLACE FUNCTION setup_database_upgrade_count() RETURNS setof record AS
$body$
DECLARE
    contador record;
BEGIN
	FOR contador IN
        (
        select  cast('tables' as varchar),
                cast(count(*) as integer)
        from    information_schema.tables t
        where   t.table_schema='public' and t.table_type like'%TABLE%'
        union
        select  cast('columns' as varchar),
                cast(count(*) as integer)
        from    information_schema.columns c inner join information_schema.tables t
        on      c.table_catalog=t.table_catalog and c.table_schema=t.table_schema and c.table_name=t.table_name
        where   t.table_schema='public' and t.table_type like'%TABLE%'
        union
        select  cast('constraints' as varchar),
                cast(count(*) as integer)
        from    pg_constraint
        union
        select  cast('defaults' as varchar),
                cast(count(*) as integer)
        from    information_schema.columns c inner join information_schema.tables t
        on      c.table_catalog=t.table_catalog and c.table_schema=t.table_schema and c.table_name=t.table_name
        where   t.table_schema='public' and t.table_type like'%TABLE%' and c.column_default is not null
        union
        select  cast('functions' as varchar),
                cast(count(*) as integer)
        from    pg_proc
        union
        select  cast('indexes' as varchar),
                cast(count(*) as integer)
        from    pg_index
        union
        select  cast('triggers' as varchar),
                cast(count(*) as integer)
        from    information_schema.triggers t
        where   t.trigger_schema='public'
        union
        select  cast('views' as varchar),
                cast(count(*) as integer)
        from    information_schema.views v
        where   v.table_schema='public'
        order   by 1
        )
 	LOOP
        return next contador;
	END LOOP;
    return;
END;
$body$
LANGUAGE 'plpgsql' VOLATILE CALLED ON NULL INPUT SECURITY INVOKER;
-- ??
