USE MHZMD201

-- EXEC xdbTablesReload
-- EXEC xdbViewsReload

SELECT * FROM xdbTables 
WHERE NOT(tabname LIKE'x%' OR tabname LIKE'%plus' OR tabname = 'dual')
AND tabname NOT IN (SELECT codigo_clase_recurso from clase_recurso)
ORDER BY tabname

SELECT * FROM clase_recurso
WHERE codigo_clase_recurso NOT IN (SELECT tabname FROM xdbTables)

-- SELECT * from xdbTables 
-- WHERE NOT(tabname LIKE'condicion%' OR tabname LIKE'tipo%' OR tabname LIKE'x%' OR tabname LIKE'%plus' OR tabname = 'dual')
-- AND tabname NOT IN (SELECT SUBSTRING(viwname,13,LEN(viwname)-12) from xdbViews WHERE viwname like'vista_lista%')
-- ORDER BY tabname

-- SELECT * from xdbTables 
-- WHERE NOT(tabname LIKE'condicion%' OR tabname LIKE'tipo%' OR tabname LIKE'x%' OR tabname LIKE'%plus' OR tabname = 'dual')
-- AND tabname NOT IN (SELECT SUBSTRING(viwname,13,LEN(viwname)-12) from xdbViews WHERE viwname like'vista_lista%')
-- AND tabname IN     (select tabname from xdbScriptTables where colname LIKE'codigo%'+tabname)
-- AND tabname IN     (select tabname from xdbScriptTables where colname LIKE'nombre%'+tabname)
-- ORDER BY tabname

-- SELECT * from xdbTables 
-- WHERE tabname IN     (SELECT SUBSTRING(viwname,13,LEN(viwname)-12) from xdbViews WHERE viwname like'vista_lista%')
-- AND ( tabname NOT IN (select tabname from xdbScriptTables where colname LIKE'codigo%'+tabname)
--    OR tabname NOT IN (select tabname from xdbScriptTables where colname LIKE'nombre%'+tabname))
-- ORDER BY tabname

-- SELECT * from xdbTables 
-- WHERE (tabname LIKE'condicion%' OR tabname LIKE'tipo%' OR tabname LIKE'x%' OR tabname LIKE'%plus' OR tabname = 'dual')
-- AND tabname IN (SELECT SUBSTRING(viwname,13,LEN(viwname)-12) from xdbViews WHERE viwname like'vista_lista%')
-- ORDER BY tabname

-- SELECT * from xdbTables 
-- WHERE tabname IN (SELECT tabname from xdbScriptTables where colname LIKE'%condicion%')
-- AND tabname IN (SELECT tabname from xdbScriptTables where colname LIKE'%inactiv%')
-- ORDER BY tabname
-- 
-- SELECT * from xdbTables 
-- WHERE tabname IN (SELECT tabname from xdbScriptTables where colname LIKE'%inactiv%')
-- ORDER BY tabname
-- 
-- SELECT * from xdbTables 
-- WHERE tabname IN (SELECT tabname from xdbScriptTables where colname LIKE'id_condicion%')
-- AND tabname IN (SELECT tabname from xdbScriptTables where colname LIKE'fecha_condicion%')
-- ORDER BY tabname
-- 
-- SELECT * from xdbTables 
-- WHERE tabname IN (SELECT tabname from xdbScriptTables where colname LIKE'id_condicion%')
-- AND tabname NOT IN (SELECT tabname from xdbScriptTables where colname LIKE'fecha_condicion%')
-- ORDER BY tabname
-- 
-- SELECT * from xdbTables 
-- WHERE tabname NOT IN (SELECT tabname from xdbScriptTables where colname LIKE'id_condicion%')
-- AND tabname IN (SELECT tabname from xdbScriptTables where colname LIKE'fecha_condicion%')
-- ORDER BY tabname
-- 
-- SELECT * from xdbTables 
-- WHERE tabname IN (SELECT tabname from xdbScriptTables where colname LIKE'id_oficina_recepcion%')
-- AND tabname IN (SELECT tabname from xdbScriptTables where colname LIKE'id_recepcionista%')
-- ORDER BY tabname
-- 
-- SELECT * from xdbTables 
-- WHERE tabname IN (SELECT tabname from xdbScriptTables where colname LIKE'id_oficina_recepcion%')
-- AND tabname NOT IN (SELECT tabname from xdbScriptTables where colname LIKE'id_recepcionista%')
-- ORDER BY tabname
