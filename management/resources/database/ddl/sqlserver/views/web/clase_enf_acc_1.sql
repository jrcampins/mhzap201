if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[consulta_clase_enf_acc_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[consulta_clase_enf_acc_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[consulta_clase_enf_acc_1] AS
SELECT
	clase_enf_acc.numero_clase_enf_acc AS numero_clase_enf_acc,
	clase_enf_acc.codigo_clase_enf_acc AS codigo_clase_enf_acc
FROM
	clase_enf_acc clase_enf_acc
GO

SET QUOTED_IDENTIFIER OFF 
GO

SET ANSI_NULLS ON 
GO
