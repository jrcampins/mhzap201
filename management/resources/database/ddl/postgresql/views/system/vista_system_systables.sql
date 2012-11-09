-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_systables
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
DROP VIEW IF EXISTS vista_system_systables;
CREATE OR REPLACE VIEW vista_system_systables AS
select  tab.oid as tabid,
        tab.relname as tabname
from    pg_class tab
where   tab.relkind='r'
and     tab.relname not like'pg%'
and     tab.relname not like'sql%'
and     tab.relname not like'dual'
and     tab.relname in (select codigo_clase_recurso from clase_recurso where codigo_clase_recurso <> 'recurso' and codigo_clase_recurso not like'%plus' and numero_tipo_clase_recurso=1)
order	by 1;
