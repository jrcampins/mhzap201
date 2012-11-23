-- ------------------------------------------------------------------------------------------------------------------------
-- EOS
-- ------------------------------------------------------------------------------------------------------------------------
USE MHZMD201
GO
SELECT		[xtype], COUNT(*) AS [count], MIN([name]) AS [min], MAX([name]) AS [max]
FROM		[sysobjects]
WHERE		([xtype] IN ('U','V','P','FN') AND ([xtype]<>'V' OR [category]=0) AND [name] NOT LIKE 'dt%')
OR		([parent_obj] IN (SELECT [id] FROM [sysobjects] WHERE [xtype]='U' AND [name] NOT LIKE 'dt%'))
GROUP BY	[xtype]
UNION
SELECT		'IX' AS [xtype], COUNT(*) AS [count], MIN([name]) AS [min], MAX([name]) AS [max]
FROM 		[sysindexes]
WHERE		[name] NOT LIKE '%SYS%'
AND		[name] NOT IN (SELECT [name] FROM [sysobjects])
AND		[id] IN (SELECT [id] FROM [sysobjects] WHERE [xtype]='U' AND [name] NOT LIKE 'dt%')
ORDER BY 	[xtype]
GO
