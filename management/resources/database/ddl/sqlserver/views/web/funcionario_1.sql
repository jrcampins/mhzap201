if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_funcionario_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_funcionario_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_funcionario_1] AS
SELECT
	funcionario.id_funcionario AS id_funcionario,
	funcionario.version_funcionario AS version_funcionario,
	funcionario.codigo_funcionario AS codigo_funcionario,
	funcionario.nombre_funcionario AS nombre_funcionario,
	funcionario.numero_cedula AS numero_cedula,
	funcionario.letra_cedula AS letra_cedula,
	funcionario.primer_nombre AS primer_nombre,
	funcionario.segundo_nombre AS segundo_nombre,
	funcionario.primer_apellido AS primer_apellido,
	funcionario.segundo_apellido AS segundo_apellido,
	funcionario.apellido_casada AS apellido_casada
FROM
	funcionario funcionario
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
