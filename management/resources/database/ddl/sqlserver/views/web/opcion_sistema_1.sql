if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_opcion_sistema_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_opcion_sistema_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_opcion_sistema_1] AS
SELECT
	opcion_sistema.id_opcion_sistema AS id_opcion_sistema,
	opcion_sistema.version_opcion_sistema AS version_opcion_sistema,
	opcion_sistema.clave_opcion_sistema AS clave_opcion_sistema,
	opcion_sistema.valor_opcion_sistema AS valor_opcion_sistema,
	opcion_sistema.significado_opcion_sistema AS significado_opcion_sistema
FROM
	opcion_sistema opcion_sistema
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
