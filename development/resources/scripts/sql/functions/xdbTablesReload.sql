if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xdbTablesReload]') and OBJECTPROPERTY(id, N'IsProcedure') = 1)
drop procedure [dbo].[xdbTablesReload]
GO

SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
CREATE PROCEDURE	xdbTablesReload
AS 
BEGIN
	DELETE FROM		xdbTables;
	INSERT INTO		xdbTables (tabid, tabname)
	SELECT			tab.id, tab.name
	FROM			sysobjects as tab
	WHERE			tab.xtype = 'U'
	AND			tab.name NOT LIKE 'dt%'
	ORDER BY		tab.id;
	UPDATE 			xdbTables 
	SET 			tabtype=1
	WHERE 			tabid IN (SELECT id FROM syscolumns WHERE autoval IS NOT NULL)
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
