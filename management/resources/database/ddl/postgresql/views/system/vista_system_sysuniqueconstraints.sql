-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_sysuniqueconstraints
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE OR REPLACE VIEW vista_system_sysuniqueconstraints AS
select	uqc.oid as conid,
        uqc.conname,
        tab.oid as tabid,
        tab.relname as tabname,
        uqc.conkey[1] as colno,
        att.attname as colname
from	pg_class tab
join	pg_constraint uqc
on      tab.oid=conrelid and array_upper(conkey,1)=1
join	pg_attribute att
on      tab.oid=att.attrelid and conkey[1]=att.attnum
where	tab.relkind='r'
and     tab.relname not like'pg%'
and     tab.relname not like'sql%'
and     tab.relname in (select codigo_clase_recurso from clase_recurso where codigo_clase_recurso <> 'recurso' and codigo_clase_recurso not like'%plus' and numero_tipo_clase_recurso=1)
and     uqc.contype='u'
order	by tabid, colno;
