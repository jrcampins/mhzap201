/**/
exec xsp.dropone('view','consulta_condicion_censo_1');
/**/
CREATE VIEW consulta_condicion_censo_1 AS
SELECT
	condicion_censo.numero_condicion_censo AS numero_condicion_censo,
	condicion_censo.codigo_condicion_censo AS codigo_condicion_censo
FROM
	condicion_censo condicion_censo;

