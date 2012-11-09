CREATE VIEW favoritos
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
;
CREATE VIEW lista_recurso
AS
SELECT recurso.*
FROM recurso
;
CREATE VIEW relacion_rastro_funcion
AS
SELECT	rastro_funcion.*, 
--	persona.codigo_persona, persona.nombre_persona,
	usuario.codigo_usuario, usuario.nombre_usuario, usuario.es_super_usuario, 
	funcion.codigo_funcion, funcion.nombre_funcion, funcion.numero_tipo_funcion, 
	funcion.es_publica, funcion.es_programatica, funcion.es_personalizada, 
 funcion.es_segmentada, clase_recurso.id_clase_recurso, clase_recurso.codigo_clase_recurso, 
 clase_recurso.nombre_clase_recurso
FROM	dominio
	INNER JOIN clase_recurso ON clase_recurso.id_clase_recurso = dominio.id_clase_recurso 
	RIGHT OUTER JOIN funcion ON dominio.id_dominio = funcion.id_dominio 
	RIGHT OUTER JOIN rastro_funcion ON funcion.id_funcion = rastro_funcion.id_funcion 
	LEFT OUTER JOIN usuario ON usuario.id_usuario = rastro_funcion.id_usuario 
--	LEFT OUTER JOIN persona ON persona.id_persona = rastro_funcion.id_usuario
;
CREATE VIEW relacion_rastro_informe
AS
SELECT	rastro_informe.*, 
--	persona.codigo_persona, persona.nombre_persona,
	usuario.codigo_usuario, usuario.nombre_usuario, usuario.es_super_usuario, 
	funcion.codigo_funcion, funcion.nombre_funcion, funcion.numero_tipo_funcion, 
	funcion.es_publica, funcion.es_programatica, funcion.es_personalizada, 
	funcion.es_segmentada, clase_recurso.id_clase_recurso, clase_recurso.codigo_clase_recurso, 
	clase_recurso.nombre_clase_recurso, condicion_eje_fun.codigo_condicion_eje_fun
FROM	condicion_eje_fun
	INNER JOIN rastro_informe ON condicion_eje_fun.numero_condicion_eje_fun = rastro_informe.numero_condicion_eje_fun 
	LEFT OUTER JOIN dominio
		INNER JOIN clase_recurso ON clase_recurso.id_clase_recurso = dominio.id_clase_recurso
		RIGHT OUTER JOIN funcion ON dominio.id_dominio = funcion.id_dominio
	ON funcion.id_funcion = rastro_informe.id_funcion
	LEFT OUTER JOIN usuario ON usuario.id_usuario = rastro_informe.id_usuario
--	LEFT OUTER JOIN persona ON persona.id_persona = rastro_informe.id_usuario
;
CREATE VIEW relacion_rastro_proceso
AS
SELECT	rastro_proceso.*, 
--	persona.codigo_persona, persona.nombre_persona,
	usuario.codigo_usuario, usuario.nombre_usuario, usuario.es_super_usuario, 
	funcion.codigo_funcion, funcion.nombre_funcion, funcion.numero_tipo_funcion, 
	funcion.es_publica, funcion.es_programatica, funcion.es_personalizada, 
	funcion.es_segmentada, clase_recurso.id_clase_recurso, clase_recurso.codigo_clase_recurso, 
	clase_recurso.nombre_clase_recurso, condicion_eje_fun.codigo_condicion_eje_fun
FROM	condicion_eje_fun 
	INNER JOIN rastro_proceso ON condicion_eje_fun.numero_condicion_eje_fun = rastro_proceso.numero_condicion_eje_fun 
	LEFT OUTER JOIN dominio 
		INNER JOIN clase_recurso ON clase_recurso.id_clase_recurso = dominio.id_clase_recurso 
		RIGHT OUTER JOIN funcion ON dominio.id_dominio = funcion.id_dominio 
	ON funcion.id_funcion = rastro_proceso.id_funcion 
	LEFT OUTER JOIN usuario ON usuario.id_usuario = rastro_proceso.id_usuario 
--	LEFT OUTER JOIN persona ON persona.id_persona = rastro_proceso.id_usuario
;
CREATE	VIEW vista_autenticacion_1
AS
SELECT	codigo_usuario, password_usuario
FROM	usuario
WHERE	es_usuario_inactivo = 0
;
CREATE	VIEW vista_autenticacion_2
AS
SELECT	codigo_rol, nombre_rol
FROM	rol
;
CREATE	VIEW vista_autenticacion_3
AS
SELECT	codigo_usuario, codigo_rol
FROM	rol_usuario
INNER	JOIN usuario ON usuario.id_usuario = rol_usuario.id_usuario
INNER	JOIN rol ON rol.id_rol = rol_usuario.id_rol
WHERE	es_super_usuario=0
/*
UNION
SELECT	codigo_usuario, cast('F' || cast(id_funcion as varchar(20)) as varchar(100)) AS codigo_rol
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
SELECT	codigo_usuario, cast('Operador' || codigo_grupo_aplicacion as varchar(100)) AS codigo_rol
FROM	usuario, grupo_aplicacion
WHERE	es_super_usuario=0 and id_grupo_aplicacion>300
*/
;
CREATE VIEW relacion_rastro_funcion_par
AS
SELECT	relacion_rastro_funcion.*, 
	rastro_funcion_par.id_rastro_funcion_par, rastro_funcion_par.id_parametro, 
	rastro_funcion_par.valor_parametro, parametro.codigo_parametro, parametro.nombre_parametro, 
	parametro.descripcion_parametro, parametro.numero_tipo_dato_par
FROM	relacion_rastro_funcion
	LEFT OUTER JOIN parametro 
		INNER JOIN rastro_funcion_par ON parametro.id_parametro = rastro_funcion_par.id_parametro 
	ON relacion_rastro_funcion.id_rastro_funcion = rastro_funcion_par.id_rastro_funcion
;
