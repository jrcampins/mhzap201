/**/
exec xsp.dropone('view','consulta_estado_salud_1');
/**/
CREATE VIEW consulta_estado_salud_1 AS
SELECT
	estado_salud.numero_estado_salud AS numero_estado_salud,
	estado_salud.codigo_estado_salud AS codigo_estado_salud
FROM
	estado_salud estado_salud;

