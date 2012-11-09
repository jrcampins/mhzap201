/**/
exec xsp.dropone('view','consulta_causa_inv_censo_1');
/**/
CREATE VIEW consulta_causa_inv_censo_1 AS
SELECT
	causa_inv_censo.numero_causa_inv_censo AS numero_causa_inv_censo,
	causa_inv_censo.codigo_causa_inv_censo AS codigo_causa_inv_censo
FROM
	causa_inv_censo causa_inv_censo;

