-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_syscolumns
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE OR REPLACE VIEW vista_system_syscolumns AS
select  1000 * cast(tab.oid as bigint) + cast(att.attnum as bigint) as colid,
        tab.oid as tabid,
        tab.relname as tabname,
        att.attnum as colno,
        att.attname as colname,
        case(typ.typname)
            when('bpchar')then(1)
            when('varchar')then(1)
            when('numeric')then(2)
            when('timestamp')then(3)
            when('timestamptz')then(3)
            when('int4')then(4)
            when('int8')then(5)
--          when('bytea')then(6)
            else(-1)
            end as coltype,
        typ.typname,
        case(att.attnotnull)
            when(true)then
                (case(typ.typname)
                    when('bpchar')then('char')
                    when('varchar')then('String')
                    when('numeric')then('BigDecimal')
                    when('timestamp')then('Date')
                    when('timestamptz')then('Date')
                    when('int4')then('int')
                    when('int8')then('long')
                    when('bytea')then('byte[]')
                    else('Object')
                    end)
            else
                (case(typ.typname)
                    when('bpchar')then('String')
                    when('varchar')then('String')
                    when('numeric')then('BigDecimal')
                    when('timestamp')then('Date')
                    when('timestamptz')then('Date')
                    when('int4')then('Integer')
                    when('int8')then('Long')
                    when('bytea')then('byte[]')
                    else('Object')
                    end)
            end as javatypname,
        case(typ.typname)
            when('bpchar')then('java.lang.String')
            when('varchar')then('java.lang.String')
            when('numeric')then('java.math.BigDecimal')
            when('timestamp')then('java.util.Date')
            when('timestamptz')then('java.util.Date')
            when('int4')then('java.lang.Integer')
            when('int8')then('java.lang.Long')
            when('bytea')then('java.lang.Byte')
            else('java.lang.Object')
            end as javaclassname,
        att.attlen as collength,
        case
            when((att.atttypmod<0)and(typ.typname='varchar'))then(8160)
            when((att.atttypmod>0)and(typ.typname in('bpchar','varchar')))then(att.atttypmod-4)
            when((att.atttypmod>0)and(typ.typname='numeric'))then(att.atttypmod/65536-0)
            else(-1)
            end as colprec,
        case
            when((att.atttypmod>0)and(typ.typname='numeric'))then(att.atttypmod%65536-4)
            else(-1)
            end as colscale,
        case(typ.typname)
            when('bpchar')then(48)
            when('varchar')then(case when(att.atttypmod<0)then(384)when((att.atttypmod-4)>100)then(256)when((att.atttypmod-4)>50)then(192)when((att.atttypmod-4)>20)then(128)else(48)end)
            when('numeric')then(96)
            when('timestamp')then(64)
            when('timestamptz')then(64)
            when('int4')then(64)
            when('int8')then(96)
--          when('bytea')then(0)
            else(0)
            end as colwidth,
        case(att.attnotnull)
            when(true)then(0)
            else(1)
            end as isnullable,
        case(att.atthasdef)
            when(true)then(1)
            else(0)
            end as hasdefault,
	cast(attdef.adsrc as varchar) as coldefault,
        pkc.oid as pkcid,
        uqc.oid as uqcid,
        fkc.oid as fkcid
from    pg_class tab
join    pg_attribute att
on      att.attrelid=tab.oid
join    pg_type typ
on      att.atttypid=typ.oid
left	outer join pg_attrdef attdef
on	attdef.adrelid=att.attrelid and attdef.adnum=att.attnum
left	outer join pg_constraint pkc
on      pkc.contype='p' and pkc.conrelid=tab.oid and array_upper(pkc.conkey,1)=1 and pkc.conkey[1]=att.attnum
left	outer join pg_constraint fkc
on      fkc.contype='f' and fkc.conrelid=tab.oid and array_upper(fkc.conkey,1)=1 and fkc.conkey[1]=att.attnum
left	outer join pg_constraint uqc
on      uqc.contype='u' and uqc.conrelid=tab.oid and array_upper(uqc.conkey,1)=1 and uqc.conkey[1]=att.attnum
where   tab.relkind='r'
and     tab.relname not like'pg%'
and     tab.relname not like'sql%'
and     tab.relname in (select codigo_clase_recurso from clase_recurso where codigo_clase_recurso <> 'recurso' and codigo_clase_recurso not like'%plus' and numero_tipo_clase_recurso=1)
and     att.attnum>0
order	by tabid, colno;
