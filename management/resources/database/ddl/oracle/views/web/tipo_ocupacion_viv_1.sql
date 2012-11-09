/**/
exec xsp.dropone('view','consulta_tipo_ocupacion_viv_1');
/**/
CREATE VIEW consulta_tipo_ocupacion_viv_1 AS
SELECT
	tipo_ocupacion_viv.numero_tipo_ocupacion_viv AS numero_tipo_ocupacion_viv,
	tipo_ocupacion_viv.codigo_tipo_ocupacion_viv AS codigo_tipo_ocupacion_viv
FROM
	tipo_ocupacion_viv tipo_ocupacion_viv;

