/**/
exec xsp.dropone('view','consulta_tipo_area_1');
/**/
CREATE VIEW consulta_tipo_area_1 AS
SELECT
	tipo_area.numero_tipo_area AS numero_tipo_area,
	tipo_area.codigo_tipo_area AS codigo_tipo_area,
	tipo_area.limite_indice_calidad_vida AS limite_indice_calidad_vida
FROM
	tipo_area tipo_area;

