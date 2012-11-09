/**/
exec xsp.dropone('view','consulta_causa_impedimento_1');
/**/
CREATE VIEW consulta_causa_impedimento_1 AS
SELECT
	causa_impedimento.numero_causa_impedimento AS numero_causa_impedimento,
	causa_impedimento.codigo_causa_impedimento AS codigo_causa_impedimento
FROM
	causa_impedimento causa_impedimento;

