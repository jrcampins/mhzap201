-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_system_systables
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[vista_system_systables]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[vista_system_systables]
GO
SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
CREATE VIEW vista_system_systables AS
SELECT  TOP 100 PERCENT
		TAB.id as tabid,
        TAB.name as tabname
FROM	sysobjects TAB
INNER	JOIN clase_recurso ON codigo_clase_recurso = TAB.name AND numero_tipo_clase_recurso = 1
WHERE	TAB.xtype = 'U' AND TAB.name NOT IN (N'dtproperties', N'dual', N'recurso') AND TAB.name NOT LIKE N'%plus'
order	by TAB.name
GO
SET QUOTED_IDENTIFIER OFF
GO
SET ANSI_NULLS ON
GO
/*
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[vista_system_systables]') and OBJECTPROPERTY(id, N'IsView') = 1)
SELECT * FROM vista_system_systables
*/
