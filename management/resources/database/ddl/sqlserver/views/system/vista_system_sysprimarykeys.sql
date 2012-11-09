-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_sysprimarykeys
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[vista_system_sysprimarykeys]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[vista_system_sysprimarykeys]
GO
SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
CREATE VIEW vista_system_sysprimarykeys AS
SELECT	TOP 100 PERCENT
		PKC.id as conid,
        PKC.name as conname,
        TAB.id as tabid,
        TAB.name as tabname,
        COL.colid as colno,
        COL.name as colname
FROM 	sysobjects TAB
INNER 	JOIN syscolumns COL ON COL.id = TAB.id
INNER	JOIN(sysobjects PKC INNER JOIN sysindexes PK1 ON PK1.name = PKC.name INNER JOIN sysindexkeys PK2 ON PK2.indid = PK1.indid) ON PKC.parent_obj = TAB.id AND PKC.xtype = 'PK' AND PK1.id = TAB.id AND PK2.id = TAB.id AND PK2.colid = COL.colid
WHERE	TAB.xtype = 'U' AND TAB.name NOT IN (N'dtproperties', N'dual', N'recurso') AND TAB.name NOT LIKE N'%plus'
ORDER	BY TAB.name, PKC.name, COL.colid
GO
SET QUOTED_IDENTIFIER OFF
GO
SET ANSI_NULLS ON
GO
/*
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[vista_system_sysprimarykeys]') and OBJECTPROPERTY(id, N'IsView') = 1)
SELECT * FROM vista_system_sysprimarykeys
*/
