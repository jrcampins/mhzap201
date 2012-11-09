/**/
exec xsp.dropone('view','consulta_siono_1');
/**/
CREATE VIEW consulta_siono_1 AS
SELECT
	siono.numero_siono AS numero_siono,
	siono.codigo_siono AS codigo_siono
FROM
	siono siono;

