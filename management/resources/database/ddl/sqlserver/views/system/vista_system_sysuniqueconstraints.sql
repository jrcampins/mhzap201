-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_sysuniqueconstraints
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[vista_system_sysuniqueconstraints]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[vista_system_sysuniqueconstraints]
GO
SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
CREATE VIEW vista_system_sysuniqueconstraints AS
SELECT	TOP 100 PERCENT
		UQC.id as conid,
		UQC.name as conname,
		TAB.id as tabid,
		TAB.name as tabname,
		COL.colid as colno,
		COL.name as colname
FROM 	sysobjects TAB
INNER 	JOIN syscolumns COL ON COL.id = TAB.id
INNER	JOIN(sysobjects UQC INNER JOIN sysindexes UQ1 ON UQ1.name = UQC.name INNER JOIN sysindexkeys UQ2 ON UQ2.indid = UQ1.indid) ON UQC.parent_obj = TAB.id AND UQC.xtype = 'UQ' AND UQ1.id = TAB.id AND UQ2.id = TAB.id AND UQ2.colid = COL.colid
WHERE	TAB.xtype = 'U' AND TAB.name NOT IN (N'dtproperties', N'dual', N'recurso') AND TAB.name NOT LIKE N'%plus'
ORDER	BY TAB.name, UQC.name, COL.colid
GO
SET QUOTED_IDENTIFIER OFF
GO
SET ANSI_NULLS ON
GO
/*
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[vista_system_sysuniqueconstraints]') and OBJECTPROPERTY(id, N'IsView') = 1)
SELECT * FROM vista_system_sysuniqueconstraints
*/
