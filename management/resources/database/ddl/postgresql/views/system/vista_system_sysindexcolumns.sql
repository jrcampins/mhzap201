-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_sysindexcolumns
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE OR REPLACE VIEW vista_system_sysindexcolumns AS
select	1000 * cast(ind.oid as bigint) + cast(indexof(cast(pg_index.indkey as int[]), cast(att.attnum as int)) as bigint) as indcolid,
        ind.oid as indid, 
--	ind.relname as indname, 
--	tab.oid as tabid, 
--	tab.relname as tabname,
--	unnest(pg_index.indkey) as indkeycolno,
--      cast(pg_index.indkey as int[]) as indkeyarray,
--	att.attnum as colno,
--      att.attname as colname,
	indexof(cast(pg_index.indkey as int[]), cast(att.attnum as int)) as indcolno,
        pg_index.indoption[indexof(cast(pg_index.indkey as int[]), cast(att.attnum as int))] as indcolopt,
        1000 * cast(tab.oid as bigint) + cast(att.attnum as bigint) as colid
from	pg_catalog.pg_index
join	pg_catalog.pg_class ind on ind.oid = pg_index.indexrelid
join	pg_catalog.pg_class tab on tab.oid = pg_index.indrelid
join	pg_attribute att on att.attrelid=tab.oid and att.attnum = ANY(pg_index.indkey)
where	tab.relkind='r'
and     tab.relname not like'pg%'
and     tab.relname not like'sql%'
and     tab.relname in (select codigo_clase_recurso from clase_recurso where codigo_clase_recurso <> 'recurso' and codigo_clase_recurso not like'%plus' and numero_tipo_clase_recurso=1)
and	(pg_index.indisunique is not true or pg_index.indnatts > 1)
order by
	indid, indcolno;
