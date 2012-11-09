USE MHZMD201
GO

EXEC xdbTablesReload
GO

EXEC xdbViewsReload
GO

-- columnas que se llaman igual que la tabla
select * from xdbScriptTables where colname in (select tabname from xdbTables)
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas id% que no son bigint
select * from xdbScriptTables where colname like'id%' and substring(colname, 3, 1) = '_' and coltype<>127
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas bigint que no son id% o version%
select * from xdbScriptTables where coltype=127 and colname not like'id%' and colname not like'version%'
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas version% que no son bigint
select * from xdbScriptTables where colname like'version%' and coltype<>127
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas version sin DEFAULT
select xdbTables.tabid, xdbScriptTables.tabname, xdbScriptTables.colid, xdbScriptTables.colname 
from xdbTables inner join xdbScriptTables on xdbTables.tabname=xdbScriptTables.tabname
where xdbScriptTables.colname='version_'+xdbScriptTables.tabname
and not exists (
select * from sysobjects inner join syscomments on syscomments.id = sysobjects.id
where sysobjects.parent_obj=xdbTables.tabid and xtype='D' and sysobjects.info=xdbScriptTables.colid
and syscomments.text = '(0)'
)
order by xdbScriptTables.tabname, xdbScriptTables.colid

-- columnas numero% que no son int (13)
select 'numero no int',* from xdbScriptTables where colname like'numero%' and coltype<>56
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
and colname not in ('numero_edificio', 'numero_piso', 'numero_apartamento')
and colname not like 'numero[_]telefono%'
order by tabname, colid, colname

-- columnas es% que no son int
select * from xdbScriptTables where colname like'es%' and substring(colname, 3, 1) = '_' and coltype<>56
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas es% sin DEFAULT
select xdbTables.tabid, xdbScriptTables.tabname, xdbScriptTables.colid, xdbScriptTables.colname 
from xdbTables inner join xdbScriptTables on xdbTables.tabname=xdbScriptTables.tabname
where xdbScriptTables.colname like'es%' and substring(xdbScriptTables.colname, 3, 1) = '_'
and not exists (
select * from sysobjects inner join syscomments on syscomments.id = sysobjects.id
where sysobjects.parent_obj=xdbTables.tabid and xtype='D' and sysobjects.info=xdbScriptTables.colid
and (syscomments.text = '(0)' or syscomments.text = '(1)')
)
order by xdbScriptTables.tabname, xdbScriptTables.colid

-- columnas es% sin CHECK
select xdbTables.tabid, xdbScriptTables.tabname, xdbScriptTables.colid, xdbScriptTables.colname 
from xdbTables inner join xdbScriptTables on xdbTables.tabname=xdbScriptTables.tabname
where xdbScriptTables.colname like'es%' and substring(xdbScriptTables.colname, 3, 1) = '_'
and not exists (
select * from sysobjects inner join syscomments on syscomments.id = sysobjects.id
where sysobjects.parent_obj=xdbTables.tabid and xtype='C' and sysobjects.info=xdbScriptTables.colid
and (
	syscomments.text = '(['+xdbScriptTables.colname+'] = 0 or ['+xdbScriptTables.colname+'] = 1)' or 
	syscomments.text = '(['+xdbScriptTables.colname+'] = 1 or ['+xdbScriptTables.colname+'] = 0)' or 
	syscomments.text = '(['+xdbScriptTables.colname+'] >= 0 and ['+xdbScriptTables.colname+'] <= 1)'
	)
)
order by xdbScriptTables.tabname, xdbScriptTables.colid

-- columnas int que no son version%, numero% ó es%
/*
select * from xdbScriptTables where coltype=56 and colname not like'version%' and colname not like'numero%' and colname not like'es%'
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

select * from xdbScriptTables where coltype=56 and colname not like'version%' and colname not like'numero%' and colname not like'es%'
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by colname, tabname
*/

-- columnas codigo% que no son varchar
select * from xdbScriptTables where colname like'codigo%' and coltype<>167
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas nombre% que no son varchar
select * from xdbScriptTables where colname like'nombre%' and coltype<>167
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas descripcion% que no son varchar
select * from xdbScriptTables where colname like'descripcion%' and coltype<>167
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas fecha% que no son smalldatetime/datetime
select * from xdbScriptTables where colname like'fecha%' and coltype not in (58,61)
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas smalldatetime que no son fecha%
select * from xdbScriptTables where coltype=58 and colname not like'fecha%'
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas fecha_hora% que no son datetime
select * from xdbScriptTables where colname like'fecha_hora%' and coltype<>61
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas datetime que no son fecha_hora%
select * from xdbScriptTables where coltype=61 and colname not like'fecha_hora%'
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas monto% que no son decimal(16,2)
select * from xdbScriptTables where colname like'monto%' and (coltype not in (106) or prec<>16 or scale<>2)
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas saldo% que no son decimal(16,2)
select * from xdbScriptTables where colname like'saldo%' and (coltype not in (106) or prec<>16 or scale<>2)
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas comision% que no son decimal(7,4)
select * from xdbScriptTables where colname like'comision%' and (coltype not in (106) or prec<>7 or scale<>4)
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas porcentaje% que no son decimal(7,4)
select * from xdbScriptTables where colname like'porcentaje%' and (coltype not in (106) or prec<>7 or scale<>4)
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas tasa% que no son decimal(7,4)
select * from xdbScriptTables where colname like'tasa%' and (coltype not in (106) or prec<>7 or scale<>4)
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas factor% que no son decimal(16,4)
select * from xdbScriptTables where colname like'factor%' and (coltype not in (106) or prec<>16 or scale<>4)
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
order by tabname, colid, colname

-- columnas decimal que no son monto%, saldo%, comision%, porcentaje%, factor%, tasa% (4*base + 4*cantidad + 10*valor + 1*nota = 19)
-- select 'decimal con prefijo inusual',* from xdbScriptTables where coltype in (106) 
-- and colname not like'monto%' and colname not like'saldo%' 
-- and colname not like'comision%' and colname not like'porcentaje%' and colname not like'factor%' and colname not like'tasa%' and colname not like'total%'
-- and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
-- order by colname, tabname, colid

-- tablas cuya primera columna no es id o numero
select tabname as 'primera columna no id o numero' from xdbTables where tabid>0
and tabname not like'%$%' and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
and tabname not in (select tabname from xdbScriptTables where colid=1 and colname='id_'+tabname or colname='numero_'+tabname)
order by tabname

-- tablas cuya segunda columna no es version
select tabname as 'segunda columna no version' from xdbTables where tabid>0
and tabname not like'%$%' and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'rastro_funcion%' 
and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
and tabname not in (select tabname from xdbScriptTables where colid=2 and colname='version_'+tabname)
and tabname in (select tabname from xdbScriptTables where colid=1 and colname='id_'+tabname)
order by tabname

-- tablas cuya segunda columna es version y su primera columna no es id
select tabname as 'segunda columna version y primera columna no id' from xdbTables where tabid>0
and tabname not like'%$%' and tabname not like'xdb%' and tabname not like'xlt%' --and tabname not like'rastro%' 
and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
and tabname in (select tabname from xdbScriptTables where colid=2 and colname='version_'+tabname)
and tabname not in (select tabname from xdbScriptTables where colid=1 and colname='id_'+tabname)
order by tabname

-- tablas cuya primera columna no forma parte de su clave primaria
select tabname as 'primera columna no parte de clave primaria' from xdbScriptTables where colid=1
and tabname not like'%$%' and tabname not like'xdb%' and tabname not like'xlt%' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
and not exists (select * from xdbScriptPrimaryKeys where tabname=xdbScriptTables.tabname and colname=xdbScriptTables.colname)
order by tabname,colid

-- columnas codigo que no forman parte de una clave única (2*codigo_categoria_rubro)
select tabname, colname as 'codigo no parte de una clave única' from xdbScriptTables where colname like 'codigo%' 
and tabname not like'%$%' and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus' and tabname not like'rastro%' 
and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor', 'recurso') 
and not exists (select * from xdbScriptUniqueKeys where tabname=xdbScriptTables.tabname and colname=xdbScriptTables.colname)
order by tabname,colid

-- columnas id que no forman parte de una clave foránea (4)
select tabname, colname as 'id que no forma parte de una clave foránea' from xdbScriptTables where colid>1 and colname like 'id%' 
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'rastro%' 
and tabname not in('dual','recurso')
and colname not in('id_aplicacion_web','id_funcion_referencia_alternativa','id_segmento','id_rastro_proceso', 'id_filtro_funcion_original')
and colname not like'id[_]lista[_]valor%'
and colname not like'id[_]valor[_]lista%'
and colname not like'id[_]clase[_]objeto[_]valor%'
and colname not like'id[_]objeto[_]valor%'
and colname not like'id[_]clase[_]recurso[_]valor%'
and colname not like'id[_]recurso[_]valor%'
and not exists (select * from xdbScriptForeignKeys where tabname=xdbScriptTables.tabname and colname=xdbScriptTables.colname)
order by tabname,colid

-- columnas numero que no forman parte de una clave foránea (5)
select colname as 'numero no FK', coldescription, tabname, colid
from xdbScriptTables where colid>1 and coltype=56 and colname like 'numero%' 
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus' 
and tabname not in('dual', 'clase_recurso', 'elemento_segmento', 'filtro_funcion_parametro', 'propiedad_objeto', 'rastro_funcion', 'recurso', 'segmento_proceso', 'valor_decision') 
and colname not like'id_segmento%' and colname not like'id_recurso%' and colname not like'id_rastro_proceso%'
and colname not like'numero_cedula%' and colname not like'numero_orden_identificacion%'
and colname not in ('numero_formulario', 'numero_vivienda', 'numero_hogar')
and not exists (select * from xdbScriptForeignKeys where tabname=xdbScriptTables.tabname and colname=xdbScriptTables.colname)
order by tabname,colid

-- columnas id que no se llaman igual que el id de la tabla foránea
select colname as 'id not like PK%', refname, tabname
from xdbScriptForeignKeys where colid>0 and colname like 'id%' and substring(colname, 3, 1) = '_'
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor')
and substring(colname, 4, len(refname)) <> refname
order by refname, colname, tabname

-- select colname, tabname, refname from xdbScriptForeignKeys where colid>0 and colname like 'id%' and substring(colname, 3, 1) = '_'
-- and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor')
-- and substring(colname, 4, len(refname)) <> refname
-- order by colname, tabname, refname

-- select tabname, refname, colname from xdbScriptForeignKeys where colid>0 and colname like 'id%' and substring(colname, 3, 1) = '_'
-- and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor')
-- and substring(colname, 4, len(refname)) <> refname
-- order by tabname, refname, colname

-- columnas numero que no forman parte de una clave foránea
/*
select * from xdbScriptTables where colid>1 and colname like 'numero%' 
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'rastro%' 
and tabname not in('dual', 'elemento_segmento', 'filtro_funcion_parametro', 'propiedad_objeto', 'recurso', 'valor_decision') 
and not exists (select * from xdbScriptForeignKeys where tabname=xdbScriptTables.tabname and colname=xdbScriptTables.colname)
order by tabname,colid
*/

-- columnas numero que no se llaman igual que el numero de la tabla foránea (4)
select colname as 'numero not like PK%', refname, tabname from xdbScriptForeignKeys where colid>0 and colname like 'numero%' and substring(colname, 7, 1) = '_'
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus' and tabname not in('dual', 'proceso')
and substring(colname, 8, len(refname)) <> refname
order by refname, colname, tabname

/*
-- tablas sin columna codigo (92)
select tabname from xdbTables where tabid>0
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
and tabname not in (select tabname from xdbScriptTables where colname='codigo_'+tabname)
order by tabname

-- tablas sin columna codigo o nombre (92)
select tabname from xdbTables where tabid>0
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
and tabname not in (select tabname from xdbScriptTables where colname='codigo_'+tabname or colname='nombre_'+tabname)
order by tabname

-- tablas sin columna codigo o nombre o descripción (90)
select tabname from xdbTables where tabid>0
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
and tabname not in (select tabname from xdbScriptTables where colname='codigo_'+tabname or colname='nombre_'+tabname or colname='descripcion_'+tabname)
order by tabname

-- tablas sin columna codigo pero con nombre
select tabname from xdbTables where tabid>0
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
and tabname not in (select tabname from xdbScriptTables where colname='codigo_'+tabname)
and tabname in (select tabname from xdbScriptTables where colname='nombre_'+tabname)
order by tabname

-- tablas sin columna codigo pero con descripcion (2)
select tabname from xdbTables where tabid>0
and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor') 
and tabname not in (select tabname from xdbScriptTables where colname='codigo_'+tabname)
and tabname in (select tabname from xdbScriptTables where colname='descripcion_'+tabname)
order by tabname

-- tablas con columna codigo y sin dependientes
select tabname as 'tablas con columna codigo y sin dependientes' from xdbTables where tabid>0
and tabname not like'%$%' and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus' and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor', 'mensaje', 'recurso') 
and tabname in (select tabname from xdbScriptTables where colname='codigo_'+tabname) 
and not exists (select * from xdbScriptForeignKeys where refname=xdbTables.tabname)
order by tabname
*/

-- -- tablas sin columna codigo y con dependientes (11)
-- select tabname 
-- from xdbTables 
-- where tabname<>'cuenta_ff_pp'
-- and tabname not like'%$%' and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus' 
-- and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor', 'funcion_parametro', 'rastro_funcion', 'fila_decision', 'propiedad_clase', 'valor_lista') 
-- and tabname not in (select tabname from xdbScriptTables where colname='codigo_'+tabname) 
-- and exists (select * from xdbScriptForeignKeys where refname=xdbTables.tabname and tabname not like '%$%')
-- order by tabname

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*

-- dependencias de tablas sin columna codigo (14)
select refname, tabname, colname, '' as 'dependencias de tablas sin codigo'
from xdbScriptForeignKeys 
where tabname<>'transaccion_ff_pp'
and tabname not like'%$%' and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus' and tabname not like'rastro%' and tabname not like'filtro%'
and tabname not in('dual', 'clase_recurso_parametro', 'columna_clase_objeto', 'columna_lista_valor', 'propiedad_clase', 'propiedad_objeto', 'valor_decision') 
and refname not in (select tabname from xdbScriptTables where colname='codigo_'+tabname) 
order by refname, tabname, colname

-- -- dependencias de tablas sin columna codigo (10*movimiento + 10 = 20)
-- select tabname, colname, refname
-- from xdbScriptForeignKeys 
-- where tabname<>'transaccion_ff_pp'
-- and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus'
-- and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor', 'filtro_funcion_parametro', 'rastro_funcion_parametro', 'propiedad_clase', 'propiedad_objeto', 'valor_decision') 
-- and refname not in (select tabname from xdbScriptTables where colname='codigo_'+tabname) 
-- order by tabname, colname, refname
-- 
-- -- dependencias de tablas sin columna codigo (10*movimiento)
-- select tabname, colname, refname
-- from xdbScriptForeignKeys 
-- where tabname<>'transaccion_ff_pp'
-- and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus'
-- and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor', 'filtro_funcion_parametro', 'rastro_funcion_parametro', 'propiedad_clase', 'propiedad_objeto', 'valor_decision') 
-- and refname not in (select tabname from xdbScriptTables where colname='codigo_'+tabname) 
-- and tabname like'movimiento%'
-- order by tabname, colname, refname
-- 
-- -- dependencias de tablas sin columna codigo (20 - 10*movimiento = 10)
-- select tabname, colname, refname
-- from xdbScriptForeignKeys 
-- where tabname<>'transaccion_ff_pp'
-- and tabname not like'xdb%' and tabname not like'xlt%' and tabname not like'%plus'
-- and tabname not in('dual', 'columna_clase_objeto', 'columna_lista_valor', 'filtro_funcion_parametro', 'rastro_funcion_parametro', 'propiedad_clase', 'propiedad_objeto', 'valor_decision') 
-- and refname not in (select tabname from xdbScriptTables where colname='codigo_'+tabname) 
-- and tabname not like'movimiento%'
-- order by tabname, colname, refname

-- -- paginas con mas de un detalle
-- select dx.codigo_dominio, ax.codigo_aplicacion, px.codigo_pagina from aplicacion ax, pagina px, dominio dx
-- where px.numero_tipo_pagina=2 and px.id_aplicacion>=20000 and px.id_aplicacion=ax.id_aplicacion and px.id_dominio=dx.id_dominio 
-- and exists (
-- select 1 from pagina py
-- where py.numero_tipo_pagina=2
-- and py.id_dominio=px.id_dominio
-- and py.id_pagina<>px.id_pagina
-- )
-- order by 1, 2

-- tablas sin columna codigo y con dependientes
select refname, count(*) as "count", min(tabname) as "min", max(tabname) as "max", '' as 'tablas sin codigo y con dependientes'
from xdbScriptForeignKeys, clase_recurso tabclass, clase_recurso refclass
where tabname=tabclass.codigo_clase_recurso and tabclass.numero_tipo_recurso<>22
and refname=refclass.codigo_clase_recurso and refclass.numero_tipo_recurso<>22 and refclass.id_clase_recurso>=20000
and not exists (select 1 from xdbScriptTables where colname='codigo_'+refname) 
group by refname
order by refname

-- tablas sin columna nombre y con dependientes
select refname, count(*) as "count", min(tabname) as "min", max(tabname) as "max", '' as 'tablas sin nombre y con dependientes'
from xdbScriptForeignKeys, clase_recurso tabclass, clase_recurso refclass
where tabname=tabclass.codigo_clase_recurso and tabclass.numero_tipo_recurso<>22
and refname=refclass.codigo_clase_recurso and refclass.numero_tipo_recurso not in (12,22) and refclass.id_clase_recurso>=20000
and not exists (select 1 from xdbScriptTables where colname='nombre_'+refname) 
group by refname
order by refname

-- tablas de gestión manual con dependientes y sin pagina de detalle independiente
select refclass.numero_tipo_recurso, refname, count(*) as "count", min(tabname) as "min", '' as 'tablas de gestión manual con dependientes y sin pagina de detalle independiente' --, max(tabname) as "max"
from xdbScriptForeignKeys, clase_recurso tabclass, clase_recurso refclass
where tabname=tabclass.codigo_clase_recurso and tabclass.numero_tipo_recurso<>22
and refname=refclass.codigo_clase_recurso and refclass.numero_tipo_recurso in (13,21) and refclass.id_clase_recurso>=20000
and not exists
(
select 1 from pagina, dominio detail 
where pagina.numero_tipo_pagina=2
and pagina.id_dominio=detail.id_dominio 
and pagina.id_dominio_maestro is null 
and detail.codigo_dominio=refname
)
group by refclass.numero_tipo_recurso, refname having count(*)>0
order by refclass.numero_tipo_recurso, refname

-- tablas de gestión manual con dependientes, sin pagina de detalle independiente y sin pagina maestro-detalle correspondiente
select refclass.numero_tipo_recurso, refname, count(*) as "count", min(tabname) as "min", '' as 'tablas de gestión manual con dependientes, sin pagina de detalle independiente y sin pagina maestro-detalle correspondiente' --, max(tabname) as "max"
from xdbScriptForeignKeys, clase_recurso tabclass, clase_recurso refclass
where tabname=tabclass.codigo_clase_recurso and tabclass.numero_tipo_recurso<>22
and refname=refclass.codigo_clase_recurso and refclass.numero_tipo_recurso in (13,21) and refclass.id_clase_recurso>=20000
and not exists
(
select 1 from pagina, dominio detail 
where pagina.numero_tipo_pagina=2
and pagina.id_dominio=detail.id_dominio 
and pagina.id_dominio_maestro is null 
and detail.codigo_dominio=refname
)
and not exists 
(
select 1 from pagina, dominio detail, dominio master 
where pagina.numero_tipo_pagina<>4
and pagina.id_dominio=detail.id_dominio 
and pagina.id_dominio_maestro=master.id_dominio 
and detail.codigo_dominio=tabname 
and master.codigo_dominio=refname
)
group by refclass.numero_tipo_recurso, refname having count(*)>0
order by refclass.numero_tipo_recurso, refname

*/
