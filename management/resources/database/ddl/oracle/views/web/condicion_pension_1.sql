/**/
exec xsp.dropone('view','consulta_condicion_pension_1');
/**/
CREATE VIEW consulta_condicion_pension_1 AS
SELECT
	condicion_pension.numero_condicion_pension AS numero_condicion_pension,
	condicion_pension.codigo_condicion_pension AS codigo_condicion_pension
FROM
	condicion_pension condicion_pension;

