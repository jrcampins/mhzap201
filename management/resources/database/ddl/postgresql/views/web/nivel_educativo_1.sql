/**/
DROP VIEW IF EXISTS consulta_nivel_educativo_1;
/**/
CREATE OR REPLACE VIEW consulta_nivel_educativo_1 AS
SELECT
	nivel_educativo.numero_nivel_educativo AS numero_nivel_educativo,
	nivel_educativo.codigo_nivel_educativo AS codigo_nivel_educativo,
	nivel_educativo.primer_curso AS primer_curso,
	nivel_educativo.ultimo_curso AS ultimo_curso
FROM
	nivel_educativo nivel_educativo;

