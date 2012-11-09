-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_syscolumnconstraints
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE OR REPLACE VIEW vista_system_syscolumnconstraints AS 
select	ckc.oid AS conid,
        ckc.conname,
        ckc.consrc as conexpr,
        tab.oid as tabid,
        tab.relname as tabname,
        ckc.conkey[1] as colno,
        att.attname as colname
from	pg_class tab
join	pg_constraint ckc
on      tab.oid = ckc.conrelid
join	pg_attribute att
on      tab.oid = att.attrelid and ckc.conkey[1] = att.attnum
where	ckc.conname like'cc%'
and     tab.relkind = 'r'
and     tab.relname not like 'pg%'
and     tab.relname not like 'sql%'
and     tab.relname in (select codigo_clase_recurso from clase_recurso where codigo_clase_recurso <> 'recurso' and codigo_clase_recurso not like'%plus' and numero_tipo_clase_recurso=1)
and     ckc.contype = 'c'
order	by tab.oid, ckc.conkey[1];
