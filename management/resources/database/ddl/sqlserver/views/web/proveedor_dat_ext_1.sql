if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_proveedor_dat_ext_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_proveedor_dat_ext_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_proveedor_dat_ext_1] AS
SELECT
	proveedor_dat_ext.id_proveedor_dat_ext AS id_proveedor_dat_ext,
	proveedor_dat_ext.version_proveedor_dat_ext AS version_proveedor_dat_ext,
	proveedor_dat_ext.codigo_proveedor_dat_ext AS codigo_proveedor_dat_ext,
	proveedor_dat_ext.nombre_proveedor_dat_ext AS nombre_proveedor_dat_ext
FROM
	proveedor_dat_ext proveedor_dat_ext
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
