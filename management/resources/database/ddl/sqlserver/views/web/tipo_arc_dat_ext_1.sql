if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_tipo_arc_dat_ext_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_tipo_arc_dat_ext_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_tipo_arc_dat_ext_1] AS
SELECT
	tipo_arc_dat_ext.numero_tipo_arc_dat_ext AS numero_tipo_arc_dat_ext,
	tipo_arc_dat_ext.codigo_tipo_arc_dat_ext AS codigo_tipo_arc_dat_ext
FROM
	tipo_arc_dat_ext tipo_arc_dat_ext
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
