/**/
DROP VIEW IF EXISTS consulta_aplicacion_1;
/**/
CREATE OR REPLACE VIEW consulta_aplicacion_1 AS
SELECT
	aplicacion.id_aplicacion AS id_aplicacion,
	aplicacion.version_aplicacion AS version_aplicacion,
	aplicacion.codigo_aplicacion AS codigo_aplicacion,
	aplicacion.nombre_aplicacion AS nombre_aplicacion,
	aplicacion.descripcion_aplicacion AS descripcion_aplicacion,
	aplicacion.servidor_aplicacion AS servidor_aplicacion,
	aplicacion.puerto_aplicacion AS puerto_aplicacion,
	aplicacion.url_aplicacion AS url_aplicacion,
	aplicacion.es_publica AS es_publica,
	aplicacion.id_grupo_aplicacion AS id_grupo_aplicacion,
		grupo_aplicacion_1x1.codigo_grupo_aplicacion AS codigo_grupo_aplicacion_1x1y3,
		grupo_aplicacion_1x1.nombre_grupo_aplicacion AS nombre_grupo_aplicacion_1x1y4,
		grupo_aplicacion_1x1.descripcion_grupo_aplicacion AS descripcion_grupo_aplica_1x1y5
FROM
	aplicacion aplicacion
	LEFT OUTER JOIN grupo_aplicacion grupo_aplicacion_1x1 ON grupo_aplicacion_1x1.id_grupo_aplicacion = aplicacion.id_grupo_aplicacion;

