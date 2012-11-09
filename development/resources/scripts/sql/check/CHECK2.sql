USE MHZMD201

-- EXEC xdbTablesReload

SELECT tabid, tabname, tabtype, numero_tipo_recurso
FROM xdbTables INNER JOIN clase_recurso ON tabname=codigo_clase_recurso
WHERE numero_tipo_recurso IN(1,2,3) and tabtype=1
ORDER BY tabname
GO
SELECT tabid, tabname, tabtype, numero_tipo_recurso
FROM xdbTables INNER JOIN clase_recurso ON tabname=codigo_clase_recurso
WHERE numero_tipo_recurso IN(4,5,6) and tabtype=0
ORDER BY tabname
GO
