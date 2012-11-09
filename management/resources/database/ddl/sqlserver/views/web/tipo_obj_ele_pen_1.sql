if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_tipo_obj_ele_pen_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_tipo_obj_ele_pen_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_tipo_obj_ele_pen_1] AS
SELECT
	tipo_obj_ele_pen.numero_tipo_obj_ele_pen AS numero_tipo_obj_ele_pen,
	tipo_obj_ele_pen.codigo_tipo_obj_ele_pen AS codigo_tipo_obj_ele_pen
FROM
	tipo_obj_ele_pen tipo_obj_ele_pen
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
