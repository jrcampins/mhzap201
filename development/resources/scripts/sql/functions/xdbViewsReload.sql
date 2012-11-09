if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xdbViewsReload]') and OBJECTPROPERTY(id, N'IsProcedure') = 1)
drop procedure [dbo].[xdbViewsReload]
GO

SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
CREATE PROCEDURE	xdbViewsReload AS 
BEGIN
	DELETE FROM		xdbViews;
	DELETE FROM		xdbViewsDependencies;
	INSERT INTO		xdbViews (viwid, viwname)
	SELECT			viw.id, viw.name
	FROM			sysobjects as viw
	WHERE			viw.xtype = 'V'
	AND			viw.category = 0
	ORDER BY		viw.name;
	INSERT INTO 		xdbViewsDependencies  (viwid, depviwid)
	SELECT DISTINCT		vw2.viwid as viwid, vw1.viwid as depviwid
	FROM			xdbViews vw1, sysdepends bov, xdbViews vw2
	WHERE			vw1.viwid = bov.id
	AND			vw2.viwid = bov.depid
	ORDER BY 		vw1.viwid, vw2.viwid;
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
