/**/
DROP VIEW IF EXISTS consulta_tipo_area_1;
/**/
CREATE OR REPLACE VIEW consulta_tipo_area_1 AS
SELECT
	tipo_area.numero_tipo_area AS numero_tipo_area,
	tipo_area.codigo_tipo_area AS codigo_tipo_area
FROM
	tipo_area tipo_area;

