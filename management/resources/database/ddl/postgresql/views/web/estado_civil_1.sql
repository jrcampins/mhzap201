/**/
DROP VIEW IF EXISTS consulta_estado_civil_1;
/**/
CREATE OR REPLACE VIEW consulta_estado_civil_1 AS
SELECT
	estado_civil.numero_estado_civil AS numero_estado_civil,
	estado_civil.codigo_estado_civil AS codigo_estado_civil
FROM
	estado_civil estado_civil;

