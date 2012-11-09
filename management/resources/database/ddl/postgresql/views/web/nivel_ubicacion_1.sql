/**/
DROP VIEW IF EXISTS consulta_nivel_ubicacion_1;
/**/
CREATE OR REPLACE VIEW consulta_nivel_ubicacion_1 AS
SELECT
	nivel_ubicacion.numero_nivel_ubicacion AS numero_nivel_ubicacion,
	nivel_ubicacion.codigo_nivel_ubicacion AS codigo_nivel_ubicacion,
	nivel_ubicacion.digitos_nivel_ubicacion AS digitos_nivel_ubicacion
FROM
	nivel_ubicacion nivel_ubicacion;

