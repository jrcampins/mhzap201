if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[vista_clase_recurso_parametro_1]') and OBJECTPROPERTY(id, N'IsView') = 1)
drop view [dbo].[vista_clase_recurso_parametro_1]
GO

SET QUOTED_IDENTIFIER ON 
GO

SET ANSI_NULLS ON 
GO

CREATE VIEW [dbo].[vista_clase_recurso_parametro_1] AS
SELECT TOP 100 PERCENT
    clase_recurso_parametro.*
FROM
    clase_recurso_parametro
LEFT OUTER JOIN
    clase_recurso_seccion
ON
    clase_recurso_seccion.id_clase_recurso_seccion = clase_recurso_parametro.id_clase_recurso_seccion
ORDER BY
    clase_recurso_parametro.id_clase_recurso,
    clase_recurso_seccion.orden_presentacion,
    clase_recurso_seccion.id_clase_recurso_seccion,
    clase_recurso_parametro.orden_presentacion,
    clase_recurso_parametro.id_clase_recurso_parametro
GO

SET QUOTED_IDENTIFIER OFF
GO

SET ANSI_NULLS ON
GO
