/**/
DROP VIEW IF EXISTS consulta_rol_aplicacion_1;
/**/
CREATE OR REPLACE VIEW consulta_rol_aplicacion_1 AS
SELECT
	rol_aplicacion.id_rol_aplicacion AS id_rol_aplicacion,
	rol_aplicacion.version_rol_aplicacion AS version_rol_aplicacion,
	rol_aplicacion.id_rol AS id_rol,
		rol_1x1.codigo_rol AS codigo_rol_1x1y3,
		rol_1x1.nombre_rol AS nombre_rol_1x1y4,
		rol_1x1.descripcion_rol AS descripcion_rol_1x1y5,
		rol_1x1.numero_tipo_rol AS numero_tipo_rol_1x1y6,
		rol_1x1.id_grupo_aplicacion AS id_grupo_aplicacion_1x1y7,
	rol_aplicacion.id_aplicacion AS id_aplicacion,
		aplicacion_1x2.codigo_aplicacion AS codigo_aplicacion_1x2y3,
		aplicacion_1x2.nombre_aplicacion AS nombre_aplicacion_1x2y4,
		aplicacion_1x2.descripcion_aplicacion AS descripcion_aplicacion_1x2y5,
		aplicacion_1x2.servidor_aplicacion AS servidor_aplicacion_1x2y6,
		aplicacion_1x2.puerto_aplicacion AS puerto_aplicacion_1x2y7,
		aplicacion_1x2.url_aplicacion AS url_aplicacion_1x2y8,
		aplicacion_1x2.es_publica AS es_publica_1x2y9,
		aplicacion_1x2.id_grupo_aplicacion AS id_grupo_aplicacion_1x2y10
FROM
	rol_aplicacion rol_aplicacion
	INNER JOIN rol rol_1x1 ON rol_1x1.id_rol = rol_aplicacion.id_rol
	INNER JOIN aplicacion aplicacion_1x2 ON aplicacion_1x2.id_aplicacion = rol_aplicacion.id_aplicacion;

