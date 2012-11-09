/**/
DROP VIEW IF EXISTS consulta_siono_1;
/**/
CREATE OR REPLACE VIEW consulta_siono_1 AS
SELECT
	siono.numero_siono AS numero_siono,
	siono.codigo_siono AS codigo_siono
FROM
	siono siono;

