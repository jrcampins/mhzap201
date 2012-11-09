-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_syscolumns
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[vista_system_syscolumns]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[vista_system_syscolumns]
GO
SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
CREATE VIEW vista_system_syscolumns AS
SELECT	TOP 100 PERCENT
		1000 * cast(TAB.id as bigint) + cast(COL.colid as bigint) as colid,
        cast(TAB.id as bigint) as tabid,
		TAB.name AS tabname, 
        COL.colid as colno,
		COL.name AS colname, 
        dbo.xfnTipoDatoParametro(COL.xusertype) as coltype,
        dbo.xfnTipoDato(COL.xusertype) as typname,
        dbo.xfnTipoDatoJava(COL.xusertype, COL.isnullable) as javatypname,
        dbo.xfnClaseJava(COL.xusertype) as javaclassname,
        COL.length as collength,
        COL.prec as colprec,
        COL.scale as colscale,
		CASE
		WHEN COL.xusertype IN (175,239)					THEN 48
		WHEN COL.xusertype IN (59, 60, 62, 106, 108, 122)THEN 96
		WHEN COL.xusertype IN (58, 61, 189)				THEN 64
		WHEN COL.xusertype IN (48, 52, 56)				THEN 64
		WHEN COL.xusertype IN (127)						THEN 96
		WHEN COL.xusertype IN (35, 99, 167, 231)			THEN
			(
			CASE
			 	WHEN COL.length<0	THEN 384
				WHEN COL.length>100	THEN 256
				WHEN COL.length>50	THEN 192
				WHEN COL.length>20	THEN 128
				ELSE 48
				END
			)
		ELSE 0
		END as colwidth,
		COL.isnullable as isnullable,
		CASE WHEN DFV.xtype IS NULL THEN 0 ELSE 1 END as hasdefault,
		PKC.id as pkcid,
		UQC.id as uqcid,
		FKC.id as fkcid
FROM 	sysobjects TAB
INNER 	JOIN syscolumns COL ON COL.id = TAB.id
LEFT 	JOIN sysobjects DFV ON DFV.parent_obj = COL.id AND DFV.info = COL.colid AND DFV.xtype = 'D'
LEFT	JOIN(sysobjects PKC INNER JOIN sysindexes PK1 ON PK1.name = PKC.name INNER JOIN sysindexkeys PK2 ON PK2.indid = PK1.indid) ON PKC.parent_obj = TAB.id AND PKC.xtype = 'PK' AND PK1.id = TAB.id AND PK2.id = TAB.id AND PK2.colid = COL.colid
LEFT	JOIN(sysobjects UQC INNER JOIN sysindexes UQ1 ON UQ1.name = UQC.name INNER JOIN sysindexkeys UQ2 ON UQ2.indid = UQ1.indid) ON UQC.parent_obj = TAB.id AND UQC.xtype = 'UQ' AND UQ1.id = TAB.id AND UQ2.id = TAB.id AND UQ2.colid = COL.colid
LEFT	JOIN sysobjects FKC ON FKC.parent_obj = TAB.id AND FKC.info = COL.colid AND FKC.xtype = 'F' -- sysreferences FKC ON FKC.fkeyid = TAB.id AND FKC.fkey1 = COL.colid
WHERE	TAB.xtype = 'U' AND TAB.name NOT IN (N'dtproperties', N'dual', N'recurso') AND TAB.name NOT LIKE N'%plus'
ORDER	BY TAB.name, COL.colid
GO
SET QUOTED_IDENTIFIER OFF
GO
SET ANSI_NULLS ON
GO
/*
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[vista_system_syscolumns]') and OBJECTPROPERTY(id, N'IsView') = 1)
SELECT * FROM vista_system_syscolumns
*/
