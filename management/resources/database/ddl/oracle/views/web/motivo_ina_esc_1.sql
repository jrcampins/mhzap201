/**/
exec xsp.dropone('view','consulta_motivo_ina_esc_1');
/**/
CREATE VIEW consulta_motivo_ina_esc_1 AS
SELECT
	motivo_ina_esc.numero_motivo_ina_esc AS numero_motivo_ina_esc,
	motivo_ina_esc.codigo_motivo_ina_esc AS codigo_motivo_ina_esc
FROM
	motivo_ina_esc motivo_ina_esc;

