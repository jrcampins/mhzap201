SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
DROP PROCEDURE xisAplicacion
GO
CREATE PROCEDURE xisAplicacion AS
BEGIN
DECLARE @insertst varchar(8000)
DECLARE @selectst varchar(8000)
SET @insertst = "
INSERT
INTO	aplicacion
		(
		id_aplicacion,
		codigo_aplicacion,
		nombre_aplicacion,
		descripcion_aplicacion,
		servidor_aplicacion,
		puerto_aplicacion,
		url_aplicacion,
		id_grupo_aplicacion
		)
"
SET @selectst = "
SELECT	cr.id_clase_recurso AS id_aplicacion,
		'mhzap201-web-' + REPLACE(cr.codigo_clase_recurso,'_','-') AS codigo_aplicacion, 
		'Gestión de ' + dr.nombre_dominio AS nombre_aplicacion, 
		dr.descripcion_dominio AS descripcion_aplicacion,
		'localhost' AS servidor_aplicacion,
		'8080' AS puerto_aplicacion,
		'/' + 'mhzap201-web-' + REPLACE(cr.codigo_clase_recurso,'_','-') AS url_aplicacion,
		cr.id_grupo_aplicacion
FROM	clase_recurso cr, dominio dr
WHERE	cr.id_clase_recurso = dr.id_clase_recurso
and		dr.id_dominio = 100*cr.id_clase_recurso+1
and		cr.es_clase_recurso_independiente=1
AND		cr.numero_tipo_recurso IN (11,13,21,22)
AND		(
		cr.id_clase_recurso_maestro IS NULL OR cr.id_clase_recurso_maestro=cr.id_clase_recurso
		)
and		cr.id_aplicacion_web is null
AND		cr.id_clase_recurso NOT IN (SELECT id_aplicacion FROM aplicacion)
ORDER	BY 1
"
EXECUTE xis @insertst, @selectst
/*
SELECT	41100 AS id_aplicacion,
		'mhzap201-web-configuracion-basica' AS codigo_aplicacion, 
		'Gestión de Recursos de Configuración Básica' AS nombre_aplicacion, 
		'Gestión de Recursos de Configuración Básica' AS descripcion_aplicacion,
		'localhost' AS servidor_aplicacion,
		'8080' AS puerto_aplicacion,
		'/mhzap201-web-configuracion-basica' AS url_aplicacion, 300
UNION
*/
SET @selectst = "
SELECT	41200 AS id_aplicacion,
		'mhzap201-web-configuracion-fija' AS codigo_aplicacion, 
		'Gestión de Recursos de Configuración Fija' AS nombre_aplicacion, 
		'Gestión de Recursos de Configuración Fija' AS descripcion_aplicacion,
		'localhost' AS servidor_aplicacion,
		'8080' AS puerto_aplicacion,
		'/mhzap201-web-configuracion-fija' AS url_aplicacion, 300
UNION
SELECT	41300 AS id_aplicacion,
		'mhzap201-web-configuracion-manual' AS codigo_aplicacion, 
		'Gestión de Recursos de Configuración Manual' AS nombre_aplicacion, 
		'Gestión de Recursos de Configuración Manual' AS descripcion_aplicacion,
		'localhost' AS servidor_aplicacion,
		'8080' AS puerto_aplicacion,
		'/mhzap201-web-configuracion-manual' AS url_aplicacion, 300
UNION
SELECT	42100 AS id_aplicacion,
		'mhzap201-web-gestion-manual' AS codigo_aplicacion, 
 		'Gestión de Recursos Compartidos' AS nombre_aplicacion, 
 		'Gestión de Recursos Compartidos' AS descripcion_aplicacion,
		'localhost' AS servidor_aplicacion,
		'8080' AS puerto_aplicacion,
		'/mhzap201-web-gestion-manual' AS url_aplicacion, 300
UNION
SELECT	42110 AS id_aplicacion,
		'mhzap201-web-gestion-pension' AS codigo_aplicacion, 
 		'Gestión de Pensiones' AS nombre_aplicacion, 
 		'Gestión de Pensiones' AS descripcion_aplicacion,
		'localhost' AS servidor_aplicacion,
		'8080' AS puerto_aplicacion,
		'/mhzap201-web-gestion-pension' AS url_aplicacion, 301
UNION
SELECT	42120 AS id_aplicacion,
		'mhzap201-web-gestion-censo' AS codigo_aplicacion, 
		'Gestión de Censos' AS nombre_aplicacion, 
		'Gestión de Censos' AS descripcion_aplicacion,
		'localhost' AS servidor_aplicacion,
		'8080' AS puerto_aplicacion,
		'/mhzap201-web-gestion-censo' AS url_aplicacion, 302
/*
UNION
SELECT	42130 AS id_aplicacion,
		'mhzap201-web-recurso-financiero' AS codigo_aplicacion, 
		'Gestión de Recursos Financieros' AS nombre_aplicacion, 
		'Gestión de Recursos Financieros' AS descripcion_aplicacion,
		'localhost' AS servidor_aplicacion,
		'8080' AS puerto_aplicacion,
		'/mhzap201-web-recurso-financiero' AS url_aplicacion, 303
UNION
SELECT	42140 AS id_aplicacion,
		'mhzap201-web-recurso-especial' AS codigo_aplicacion, 
		'Gestión de Recursos Especiales' AS nombre_aplicacion, 
		'Gestión de Recursos Especiales' AS descripcion_aplicacion,
		'localhost' AS servidor_aplicacion,
		'8080' AS puerto_aplicacion,
		'/mhzap201-web-recurso-especial' AS url_aplicacion, 304
*/
UNION
SELECT	51000 AS id_aplicacion,
		'mhzap201-web-proceso' AS codigo_aplicacion, 
		'Ejecución de Procesos' AS nombre_aplicacion, 
		'Ejecución de Procesos' AS descripcion_aplicacion,
		'localhost' AS servidor_aplicacion,
		'8080' AS puerto_aplicacion,
		'/mhzap201-web-proceso' AS url_aplicacion, 300
UNION
SELECT	52000 AS id_aplicacion,
		'mhzap201-web-consulta' AS codigo_aplicacion, 
		'Ejecución de Consultas' AS nombre_aplicacion, 
		'Ejecución de Consultas' AS descripcion_aplicacion,
		'localhost' AS servidor_aplicacion,
		'8080' AS puerto_aplicacion,
		'/mhzap201-web-consulta' AS url_aplicacion, 300
ORDER 	BY 1
"
EXECUTE xis @insertst, @selectst
/**/
END
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
/*
SELECT	42131 AS id_aplicacion,
		'mhzap201-web-personal' AS codigo_aplicacion, 
		'Gestión de Personal' AS nombre_aplicacion, 
		'Gestión de Personal' AS descripcion_aplicacion,
		'localhost' AS servidor_aplicacion,
		'8080' AS puerto_aplicacion,
		'/mhzap201-web-personal' AS url_aplicacion, 303
UNION
SELECT	42132 AS id_aplicacion,
		'mhzap201-web-nomina' AS codigo_aplicacion, 
		'Gestión de Nómina' AS nombre_aplicacion, 
		'Gestión de Nómina' AS descripcion_aplicacion,
		'localhost' AS servidor_aplicacion,
		'8080' AS puerto_aplicacion,
		'/mhzap201-web-nomina' AS url_aplicacion, 303
UNION
*/
