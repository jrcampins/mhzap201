-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_sysforeignkeys
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[vista_system_sysforeignkeys]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[vista_system_sysforeignkeys]
GO
SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
CREATE VIEW vista_system_sysforeignkeys AS
SELECT	TOP 100 PERCENT
		FKC.id as conid,
		FKC.name as conname,
		ISRC.DELETE_RULE as deleterule,
		ISRC.UPDATE_RULE AS updaterule,
		TAB.id as tabid,
		TAB.name as tabname,
		COL.colid as colno,
		COL.name as colname,
		pkc.id as pkcid,
		uqc.id as uqcid,
		REFTAB.id as reftabid,
		REFTAB.name as reftabname,
 		REFCOL.colid as refcolno,
 		REFCOL.name as refcolname
FROM 	sysobjects TAB
INNER 	JOIN syscolumns COL ON COL.id = TAB.id
INNER	JOIN sysobjects FKC ON FKC.parent_obj = TAB.id AND FKC.info = COL.colid AND FKC.xtype = 'F'
INNER	JOIN sysreferences FK1 ON FK1.constid = FKC.id AND FK1.fkeyid = TAB.id AND FK1.fkey1 = COL.colid
INNER	JOIN sysobjects REFTAB ON REFTAB.id = FK1.rkeyid
INNER 	JOIN syscolumns REFCOL ON REFCOL.id = REFTAB.id AND FK1.rkey1 = REFCOL.colid
INNER	JOIN INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS ISRC ON ISRC.CONSTRAINT_NAME = FKC.name
LEFT	JOIN(sysobjects PKC INNER JOIN sysindexes PK1 ON PK1.name = PKC.name INNER JOIN sysindexkeys PK2 ON PK2.indid = PK1.indid) ON PKC.parent_obj = TAB.id AND PKC.xtype = 'PK' AND PK1.id = TAB.id AND PK2.id = TAB.id AND PK2.colid = COL.colid
LEFT	JOIN(sysobjects UQC INNER JOIN sysindexes UQ1 ON UQ1.name = UQC.name INNER JOIN sysindexkeys UQ2 ON UQ2.indid = UQ1.indid) ON UQC.parent_obj = TAB.id AND UQC.xtype = 'UQ' AND UQ1.id = TAB.id AND UQ2.id = TAB.id AND UQ2.colid = COL.colid
WHERE	TAB.xtype = 'U' AND TAB.name NOT IN (N'dtproperties', N'dual', N'recurso') AND TAB.name NOT LIKE N'%plus'
ORDER	BY TAB.name, FKC.name, COL.colid
GO
SET QUOTED_IDENTIFIER OFF
GO
SET ANSI_NULLS ON
GO
/*
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[vista_system_sysforeignkeys]') and OBJECTPROPERTY(id, N'IsView') = 1)
SELECT * FROM vista_system_sysforeignkeys
*/
