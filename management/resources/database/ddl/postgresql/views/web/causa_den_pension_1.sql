/**/
DROP VIEW IF EXISTS consulta_causa_den_pension_1;
/**/
CREATE OR REPLACE VIEW consulta_causa_den_pension_1 AS
SELECT
	causa_den_pension.numero_causa_den_pension AS numero_causa_den_pension,
	causa_den_pension.codigo_causa_den_pension AS codigo_causa_den_pension
FROM
	causa_den_pension causa_den_pension;

