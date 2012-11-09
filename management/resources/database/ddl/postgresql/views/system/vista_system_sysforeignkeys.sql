-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_sysforeignkeys
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE OR REPLACE VIEW vista_system_sysforeignkeys AS
select	fkc.oid as conid,
        fkc.conname,
        case(fkc.confdeltype)
                when('c')then('CASCADE')
                else('NO ACTION')
                end as deleterule,
        case(fkc.confupdtype)
                when('c')then('CASCADE')
                else('NO ACTION')
                end as updaterule,
        tab.oid as tabid,
        tab.relname as tabname,
        fkc.conkey[1] as colno,
        att.attname as colname,
        pkc.oid as pkcid,
        uqc.oid as uqcid,
        fkc.confrelid as reftabid,
        reltab.relname as reftabname,
        fkc.confkey[1] as refcolno,
        relatt.attname as refcolname
from	pg_class tab
join	pg_constraint fkc
on      tab.oid=conrelid
join	pg_class reltab
on      reltab.oid=confrelid
join	pg_attribute att
on      tab.oid=att.attrelid and conkey[1]=att.attnum
join	pg_attribute relatt
on      reltab.oid=relatt.attrelid and confkey[1]=relatt.attnum
left	outer join pg_constraint pkc
on      pkc.contype='p' and pkc.conrelid=fkc.conrelid and array_upper(pkc.conkey,1)=1 and pkc.conkey[1]=fkc.conkey[1]
left	outer join pg_constraint uqc
on      uqc.contype='u' and uqc.conrelid=fkc.conrelid and array_upper(uqc.conkey,1)=1 and uqc.conkey[1]=fkc.conkey[1]
where	tab.relkind='r'
and     tab.relname not like'pg%'
and     tab.relname not like'sql%'
and     tab.relname in (select codigo_clase_recurso from clase_recurso where codigo_clase_recurso <> 'recurso' and codigo_clase_recurso not like'%plus' and numero_tipo_clase_recurso=1)
and     fkc.contype='f'
order	by tabid, colno;
