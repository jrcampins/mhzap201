/**/
DROP VIEW IF EXISTS consulta_tipo_relacion_lab_1;
/**/
CREATE OR REPLACE VIEW consulta_tipo_relacion_lab_1 AS
SELECT
	tipo_relacion_lab.numero_tipo_relacion_lab AS numero_tipo_relacion_lab,
	tipo_relacion_lab.codigo_tipo_relacion_lab AS codigo_tipo_relacion_lab
FROM
	tipo_relacion_lab tipo_relacion_lab;

