/**/
DROP VIEW IF EXISTS consulta_tipo_ocupacion_viv_1;
/**/
CREATE OR REPLACE VIEW consulta_tipo_ocupacion_viv_1 AS
SELECT
	tipo_ocupacion_viv.numero_tipo_ocupacion_viv AS numero_tipo_ocupacion_viv,
	tipo_ocupacion_viv.codigo_tipo_ocupacion_viv AS codigo_tipo_ocupacion_viv
FROM
	tipo_ocupacion_viv tipo_ocupacion_viv;

