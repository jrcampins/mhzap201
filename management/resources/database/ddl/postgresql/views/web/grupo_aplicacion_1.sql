/**/
DROP VIEW IF EXISTS consulta_grupo_aplicacion_1;
/**/
CREATE OR REPLACE VIEW consulta_grupo_aplicacion_1 AS
SELECT
	grupo_aplicacion.id_grupo_aplicacion AS id_grupo_aplicacion,
	grupo_aplicacion.version_grupo_aplicacion AS version_grupo_aplicacion,
	grupo_aplicacion.codigo_grupo_aplicacion AS codigo_grupo_aplicacion,
	grupo_aplicacion.nombre_grupo_aplicacion AS nombre_grupo_aplicacion,
	grupo_aplicacion.descripcion_grupo_aplicacion AS descripcion_grupo_aplicacion
FROM
	grupo_aplicacion grupo_aplicacion;

