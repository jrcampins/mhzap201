/**/
exec xsp.dropone('view','consulta_causa_rev_pension_1');
/**/
CREATE VIEW consulta_causa_rev_pension_1 AS
SELECT
	causa_rev_pension.numero_causa_rev_pension AS numero_causa_rev_pension,
	causa_rev_pension.codigo_causa_rev_pension AS codigo_causa_rev_pension
FROM
	causa_rev_pension causa_rev_pension;

