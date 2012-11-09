-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_syscolumnconstraints
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[vista_system_syscolumnconstraints]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[vista_system_syscolumnconstraints]
GO
SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
CREATE VIEW vista_system_syscolumnconstraints AS 
SELECT	TOP 100 PERCENT
		CCK.id AS conid,
        CCK.name as conname,
        CC1.text as conexpr,
        TAB.id as tabid,
        TAB.name as tabname,
        COL.colid as colno,
        COL.name as colname
FROM 	sysobjects TAB
INNER	JOIN syscolumns COL ON COL.id = TAB.id
INNER	JOIN sysobjects CCK ON CCK.parent_obj = COL.id AND CCK.info = COL.colid AND	CCK.xtype = 'C'
INNER	JOIN syscomments CC1 ON CC1.id = CCK.id
WHERE	TAB.xtype = 'U' AND TAB.name NOT IN (N'dtproperties', N'dual', N'recurso') AND TAB.name NOT LIKE N'%plus'
order	by TAB.name, COL.colid
GO
SET QUOTED_IDENTIFIER OFF
GO
SET ANSI_NULLS ON
GO
/*
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[vista_system_syscolumnconstraints]') and OBJECTPROPERTY(id, N'IsView') = 1)
SELECT * FROM vista_system_syscolumnconstraints
*/
