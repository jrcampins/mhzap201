/**/
DROP VIEW IF EXISTS consulta_causa_impedimento_1;
/**/
CREATE OR REPLACE VIEW consulta_causa_impedimento_1 AS
SELECT
	causa_impedimento.numero_causa_impedimento AS numero_causa_impedimento,
	causa_impedimento.codigo_causa_impedimento AS codigo_causa_impedimento
FROM
	causa_impedimento causa_impedimento;

