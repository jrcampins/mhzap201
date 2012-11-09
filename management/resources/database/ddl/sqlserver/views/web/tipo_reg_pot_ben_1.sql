if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_tipo_reg_pot_ben_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_tipo_reg_pot_ben_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_tipo_reg_pot_ben_1] AS
SELECT
	tipo_reg_pot_ben.numero_tipo_reg_pot_ben AS numero_tipo_reg_pot_ben,
	tipo_reg_pot_ben.codigo_tipo_reg_pot_ben AS codigo_tipo_reg_pot_ben
FROM
	tipo_reg_pot_ben tipo_reg_pot_ben
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
