/**/
exec xsp.dropone('view','consulta_estado_civil_1');
/**/
CREATE VIEW consulta_estado_civil_1 AS
SELECT
	estado_civil.numero_estado_civil AS numero_estado_civil,
	estado_civil.codigo_estado_civil AS codigo_estado_civil
FROM
	estado_civil estado_civil;

