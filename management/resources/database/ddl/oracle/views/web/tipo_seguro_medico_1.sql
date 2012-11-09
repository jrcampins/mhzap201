/**/
exec xsp.dropone('view','consulta_tipo_seguro_medico_1');
/**/
CREATE VIEW consulta_tipo_seguro_medico_1 AS
SELECT
	tipo_seguro_medico.numero_tipo_seguro_medico AS numero_tipo_seguro_medico,
	tipo_seguro_medico.codigo_tipo_seguro_medico AS codigo_tipo_seguro_medico
FROM
	tipo_seguro_medico tipo_seguro_medico;

