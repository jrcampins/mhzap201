-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_sysprimarykeys
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE OR REPLACE VIEW vista_system_sysprimarykeys AS
select	pkc.oid as conid,
        pkc.conname,
        tab.oid as tabid,
        tab.relname as tabname,
        pkc.conkey[1] as colno,
        att.attname as colname
from	pg_class tab
join	pg_constraint pkc
on      tab.oid=conrelid
join	pg_attribute att
on      tab.oid=att.attrelid and conkey[1]=att.attnum
where	tab.relkind='r'
and     tab.relname not like'pg%'
and     tab.relname not like'sql%'
and     tab.relname in (select codigo_clase_recurso from clase_recurso where codigo_clase_recurso <> 'recurso' and codigo_clase_recurso not like'%plus' and numero_tipo_clase_recurso=1)
and     pkc.contype='p'
order	by tabid, colno;
