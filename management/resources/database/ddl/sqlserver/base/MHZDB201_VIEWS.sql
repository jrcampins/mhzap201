-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- favoritos
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_NULLS ON
GO
CREATE  VIEW favoritos
AS
SELECT
pagina_usuario.id_pagina_usuario,
pagina_usuario.version_pagina_usuario,
pagina_usuario.id_pagina,
pagina_usuario.id_usuario,
pagina.codigo_pagina,
pagina.nombre_pagina,
pagina.id_aplicacion,
pagina.numero_tipo_pagina,
pagina.url_pagina,
usuario.codigo_usuario,
usuario.nombre_usuario,
aplicacion.url_aplicacion,
clase_recurso.id_clase_recurso,
clase_recurso.numero_tipo_recurso,
case when clase_recurso.id_grupo_aplicacion is null then aplicacion.id_grupo_aplicacion else clase_recurso.id_grupo_aplicacion end as id_grupo_aplicacion
FROM pagina_usuario
INNER JOIN pagina ON pagina.id_pagina = pagina_usuario.id_pagina
INNER JOIN usuario ON usuario.id_usuario = pagina_usuario.id_usuario
INNER JOIN aplicacion ON aplicacion.id_aplicacion = pagina.id_aplicacion
LEFT OUTER JOIN (dominio INNER JOIN clase_recurso ON clase_recurso.id_clase_recurso = dominio.id_clase_recurso) ON dominio.id_dominio = pagina.id_dominio
GO
SET QUOTED_IDENTIFIER OFF
GO
SET ANSI_NULLS ON
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- lista_recurso
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_NULLS ON
GO
CREATE VIEW dbo.lista_recurso
AS
SELECT     dbo.recurso.*
FROM         dbo.recurso
GO
SET QUOTED_IDENTIFIER OFF
GO
SET ANSI_NULLS ON
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- relacion_rastro_funcion
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_NULLS ON
GO
CREATE VIEW dbo.relacion_rastro_funcion
AS
SELECT	dbo.rastro_funcion.*, 
--	dbo.persona.codigo_persona, dbo.persona.nombre_persona,
	dbo.usuario.codigo_usuario, dbo.usuario.nombre_usuario, dbo.usuario.es_super_usuario, 
	dbo.funcion.codigo_funcion, dbo.funcion.nombre_funcion, dbo.funcion.numero_tipo_funcion, 
	dbo.funcion.es_publica, dbo.funcion.es_programatica, dbo.funcion.es_personalizada, 
        dbo.funcion.es_segmentada, dbo.clase_recurso.id_clase_recurso, dbo.clase_recurso.codigo_clase_recurso, 
        dbo.clase_recurso.nombre_clase_recurso
FROM	dbo.dominio
	INNER JOIN dbo.clase_recurso ON dbo.clase_recurso.id_clase_recurso = dbo.dominio.id_clase_recurso 
	RIGHT OUTER JOIN dbo.funcion ON dbo.dominio.id_dominio = dbo.funcion.id_dominio 
	RIGHT OUTER JOIN dbo.rastro_funcion ON dbo.funcion.id_funcion = dbo.rastro_funcion.id_funcion 
	LEFT OUTER JOIN dbo.usuario ON dbo.usuario.id_usuario = dbo.rastro_funcion.id_usuario 
--	LEFT OUTER JOIN dbo.persona ON dbo.persona.id_persona = dbo.rastro_funcion.id_usuario
GO
SET QUOTED_IDENTIFIER OFF
GO
SET ANSI_NULLS ON
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- relacion_rastro_informe
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_NULLS ON
GO
CREATE VIEW dbo.relacion_rastro_informe
AS
SELECT	dbo.rastro_informe.*, 
--	dbo.persona.codigo_persona, dbo.persona.nombre_persona,
	dbo.usuario.codigo_usuario, dbo.usuario.nombre_usuario, dbo.usuario.es_super_usuario, 
	dbo.funcion.codigo_funcion, dbo.funcion.nombre_funcion, dbo.funcion.numero_tipo_funcion, 
	dbo.funcion.es_publica, dbo.funcion.es_programatica, dbo.funcion.es_personalizada, 
	dbo.funcion.es_segmentada, dbo.clase_recurso.id_clase_recurso, dbo.clase_recurso.codigo_clase_recurso, 
	dbo.clase_recurso.nombre_clase_recurso, dbo.condicion_eje_fun.codigo_condicion_eje_fun
FROM	dbo.condicion_eje_fun
	INNER JOIN dbo.rastro_informe ON dbo.condicion_eje_fun.numero_condicion_eje_fun = dbo.rastro_informe.numero_condicion_eje_fun 
	LEFT OUTER JOIN dbo.dominio
		INNER JOIN dbo.clase_recurso ON dbo.clase_recurso.id_clase_recurso = dbo.dominio.id_clase_recurso
		RIGHT OUTER JOIN dbo.funcion ON dbo.dominio.id_dominio = dbo.funcion.id_dominio
	ON dbo.funcion.id_funcion = dbo.rastro_informe.id_funcion
	LEFT OUTER JOIN dbo.usuario ON dbo.usuario.id_usuario = dbo.rastro_informe.id_usuario
--	LEFT OUTER JOIN dbo.persona ON dbo.persona.id_persona = dbo.rastro_informe.id_usuario
GO
SET QUOTED_IDENTIFIER OFF
GO
SET ANSI_NULLS ON
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- relacion_rastro_proceso
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_NULLS ON
GO
CREATE VIEW dbo.relacion_rastro_proceso
AS
SELECT	dbo.rastro_proceso.*, 
--	dbo.persona.codigo_persona, dbo.persona.nombre_persona,
	dbo.usuario.codigo_usuario, dbo.usuario.nombre_usuario, dbo.usuario.es_super_usuario, 
	dbo.funcion.codigo_funcion, dbo.funcion.nombre_funcion, dbo.funcion.numero_tipo_funcion, 
	dbo.funcion.es_publica, dbo.funcion.es_programatica, dbo.funcion.es_personalizada, 
	dbo.funcion.es_segmentada, dbo.clase_recurso.id_clase_recurso, dbo.clase_recurso.codigo_clase_recurso, 
	dbo.clase_recurso.nombre_clase_recurso, dbo.condicion_eje_fun.codigo_condicion_eje_fun
FROM	dbo.condicion_eje_fun 
	INNER JOIN dbo.rastro_proceso ON dbo.condicion_eje_fun.numero_condicion_eje_fun = dbo.rastro_proceso.numero_condicion_eje_fun 
	LEFT OUTER JOIN dbo.dominio 
		INNER JOIN dbo.clase_recurso ON dbo.clase_recurso.id_clase_recurso = dbo.dominio.id_clase_recurso 
		RIGHT OUTER JOIN dbo.funcion ON dbo.dominio.id_dominio = dbo.funcion.id_dominio 
	ON dbo.funcion.id_funcion = dbo.rastro_proceso.id_funcion 
	LEFT OUTER JOIN dbo.usuario ON dbo.usuario.id_usuario = dbo.rastro_proceso.id_usuario 
--	LEFT OUTER JOIN dbo.persona ON dbo.persona.id_persona = dbo.rastro_proceso.id_usuario
GO
SET QUOTED_IDENTIFIER OFF
GO
SET ANSI_NULLS ON
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_autenticacion_1
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_NULLS ON
GO
CREATE	VIEW dbo.vista_autenticacion_1
AS
SELECT	codigo_usuario, password_usuario
FROM	usuario
WHERE	es_usuario_inactivo = 0
GO
SET QUOTED_IDENTIFIER OFF
GO
SET ANSI_NULLS ON
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_autenticacion_2
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_NULLS ON
GO
CREATE	VIEW dbo.vista_autenticacion_2
AS
SELECT	codigo_rol, nombre_rol
FROM	rol
GO
SET QUOTED_IDENTIFIER OFF
GO
SET ANSI_NULLS ON
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- vista_autenticacion_3
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_NULLS ON
GO
CREATE	VIEW dbo.vista_autenticacion_3
AS
SELECT	codigo_usuario, codigo_rol
FROM	rol_usuario
INNER	JOIN usuario ON usuario.id_usuario = rol_usuario.id_usuario
INNER	JOIN rol ON rol.id_rol = rol_usuario.id_rol
WHERE	es_super_usuario=0
/*
UNION
SELECT	codigo_usuario, cast('F' + cast(id_funcion as varchar(20)) as varchar(100)) AS codigo_rol
FROM	rol_usuario
INNER	JOIN usuario ON usuario.id_usuario = rol_usuario.id_usuario
INNER	JOIN rol_funcion ON rol_funcion.id_rol = rol_usuario.id_rol
WHERE	es_super_usuario=0
*/
UNION
SELECT	codigo_usuario, codigo_rol
FROM	usuario, rol
WHERE	es_super_usuario=0 AND es_usuario_especial=0 AND codigo_rol='Operador'
UNION
SELECT	codigo_usuario, codigo_rol
FROM	usuario, rol
WHERE	es_super_usuario=0 AND es_usuario_especial=1 AND id_usuario=id_rol
UNION
SELECT	codigo_usuario, codigo_rol
FROM	usuario, rol
WHERE	es_super_usuario=1 AND codigo_rol='SuperGestor'
/*
UNION
SELECT	codigo_usuario, cast('Operador' + codigo_grupo_aplicacion as varchar(100)) AS codigo_rol
FROM	usuario, grupo_aplicacion
WHERE	es_super_usuario=0 and id_grupo_aplicacion>300
*/
GO
SET QUOTED_IDENTIFIER OFF
GO
SET ANSI_NULLS ON
GO
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- relacion_rastro_funcion_par
-- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_NULLS ON
GO
CREATE VIEW dbo.relacion_rastro_funcion_par
AS
SELECT	dbo.relacion_rastro_funcion.*, 
	dbo.rastro_funcion_par.id_rastro_funcion_par, dbo.rastro_funcion_par.id_parametro, 
	dbo.rastro_funcion_par.valor_parametro, dbo.parametro.codigo_parametro, dbo.parametro.nombre_parametro, 
	dbo.parametro.descripcion_parametro, dbo.parametro.numero_tipo_dato_par
FROM	dbo.relacion_rastro_funcion
	LEFT OUTER JOIN dbo.parametro 
		INNER JOIN dbo.rastro_funcion_par ON dbo.parametro.id_parametro = dbo.rastro_funcion_par.id_parametro 
	ON dbo.relacion_rastro_funcion.id_rastro_funcion = dbo.rastro_funcion_par.id_rastro_funcion
GO
SET QUOTED_IDENTIFIER OFF
GO
SET ANSI_NULLS ON
GO
