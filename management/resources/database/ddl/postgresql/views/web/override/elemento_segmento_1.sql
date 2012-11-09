/**/
DROP VIEW IF EXISTS consulta_elemento_segmento_1;
/**/
CREATE OR REPLACE VIEW consulta_elemento_segmento_1 AS
SELECT
	elemento_segmento.id_elemento_segmento AS id_elemento_segmento,
	elemento_segmento.version_elemento_segmento AS version_elemento_segmento,
	elemento_segmento.id_conjunto_segmento AS id_conjunto_segmento,
		conjunto_segmento_1x1.codigo_conjunto_segmento AS codigo_conjunto_segmento_1x1y3,
		conjunto_segmento_1x1.nombre_conjunto_segmento AS nombre_conjunto_segmento_1x1y4,
		conjunto_segmento_1x1.descripcion_conjunto_segmento AS descripcion_conjunto_seg_1x1y5,
		conjunto_segmento_1x1.id_clase_recurso AS id_clase_recurso_1x1y6,
	elemento_segmento.id_segmento AS id_segmento,
	elemento_segmento.valor_segmento AS valor_segmento,
	elemento_segmento.significado_segmento AS significado_segmento,
	elemento_segmento.valor_segmento AS codigo_segmento,
	elemento_segmento.significado_segmento AS nombre_segmento
FROM
	elemento_segmento elemento_segmento
	INNER JOIN conjunto_segmento conjunto_segmento_1x1 ON conjunto_segmento_1x1.id_conjunto_segmento = elemento_segmento.id_conjunto_segmento;
