USE MHZMD201
GO

select   substring(tabname, 1, charindex('_', tabname + '_', 1) - 1) as prefijo, 
         min(len(tabname)) as minlen, max(len(tabname)) as maxlen 
from     xdbScriptTables
where    colid = 1 and tabname not like'x%'  and tabname not like'%$%$%' 
group by substring(tabname, 1, charindex('_', tabname + '_', 1) - 1)
order by 3 DESC,2 DESC,1 ASC
/*
select   substring(name, 1, charindex('_', name + '_', 1) - 1) as prefijo, 
         min(len(name)) as minlen, max(len(name)) as maxlen 
from     syscolumns
group by substring(name, 1, charindex('_', name + '_', 1) - 1)
order by 3 DESC,2 DESC,1 ASC

select   c.name, c.name, len(c.name)
from     syscolumns c
where	 c.name like'version%' and len(c.name)>30
order by 3,2,1

select   t.name, c.name, len(c.name)
from     syscolumns c, sysobjects t
where	 c.id=t.id
and    	 c.name like'version%' and len(c.name)>30
order by 3,2,1

select   substring(colname, 1, charindex('_', colname + '_', 1) - 1) as prefijo, 
         min(length) as minlen, max(length) as maxlen 
from     xdbScriptTables
where    coltype = 167 and tabname not like'x%' 
group by substring(colname, 1, charindex('_', colname + '_', 1) - 1)
having   min(length) <> max(length)
order by 3,2,1

select   substring(colname, 1, charindex('_', colname + '_', 1) - 1) as prefijo, 
	 	 length, colname, tabname
from     xdbScriptTables
where    coltype = 167 and (colname like 'codigo%')
order by 1, 2 DESC, 3, 4

select   substring(colname, 1, charindex('_', colname + '_', 1) - 1) as prefijo, 
	 	 length, colname, tabname
from     xdbScriptTables
where    coltype = 167 and (colname like 'nombre%')
order by 1, 2 DESC, 3, 4

select   substring(colname, 1, charindex('_', colname + '_', 1) - 1) as prefijo, 
	 	 length, colname, tabname
from     xdbScriptTables
where    coltype = 167 and (colname like 'numero%')
order by 1, 2 DESC, 3, 4

select   substring(colname, 1, charindex('_', colname + '_', 1) - 1) as prefijo, 
	 	 length, colname, tabname
from     xdbScriptTables
where    coltype = 167 and (colname like 'descripcion%')
order by 1, 2 DESC, 3, 4

select   substring(colname, 1, charindex('_', colname + '_', 1) - 1) as prefijo, 
	 	 length, colname, tabname
from     xdbScriptTables
where    coltype = 167 and (colname like 'direccion%')
order by 1, 2 DESC, 3, 4

select   substring(colname, 1, charindex('_', colname + '_', 1) - 1) as prefijo, 
	 	 length, colname, tabname
from     xdbScriptTables
where    coltype = 167 and (colname like 'motivo%')
order by 1, 2 DESC, 3, 4

select   substring(colname, 1, charindex('_', colname + '_', 1) - 1) as prefijo, 
	 	 length, colname, tabname
from     xdbScriptTables
where    coltype = 167 and (colname like 'telefono%')
order by 1, 2 DESC, 3, 4

select	 xdbTables.*, colname
from	 xdbTables, xdbScriptTables
where	 xdbTables.tabtype = 1
and	 xdbTables.tabname = xdbScriptTables.tabname
and	 xdbScriptTables.colname like'codigo_'+xdbScriptTables.tabname
order by 2
*/
