/**/
DROP VIEW IF EXISTS consulta_clase_impedimento_1;
/**/
CREATE OR REPLACE VIEW consulta_clase_impedimento_1 AS
SELECT
	clase_impedimento.numero_clase_impedimento AS numero_clase_impedimento,
	clase_impedimento.codigo_clase_impedimento AS codigo_clase_impedimento
FROM
	clase_impedimento clase_impedimento;

