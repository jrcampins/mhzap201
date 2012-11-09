-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_sysindexes
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE OR REPLACE VIEW vista_system_sysindexes AS
select	ind.oid as indid, 
	ind.relname as indname, 
	tab.oid as tabid, 
--	tab.relname as tabname,
        case(pg_index.indisunique) when(true) then(1) else(0) end as uqkey,
	cast(pg_index.indnatts as int) as ncols
from	pg_catalog.pg_index
join	pg_catalog.pg_class ind on ind.oid = pg_index.indexrelid
join	pg_catalog.pg_class tab on tab.oid = pg_index.indrelid
where	tab.relkind='r'
and     tab.relname not like'pg%'
and     tab.relname not like'sql%'
and     tab.relname in (select codigo_clase_recurso from clase_recurso where codigo_clase_recurso <> 'recurso' and codigo_clase_recurso not like'%plus' and numero_tipo_clase_recurso=1)
and	(pg_index.indisunique is not true or pg_index.indnatts > 1)
order by
	indname;
