/**/
DROP VIEW IF EXISTS consulta_dominio_paquete_1;
/**/
CREATE OR REPLACE VIEW consulta_dominio_paquete_1 AS
SELECT
	dominio_paquete.id_dominio_paquete AS id_dominio_paquete,
	dominio_paquete.version_dominio_paquete AS version_dominio_paquete,
	dominio_paquete.id_dominio AS id_dominio,
		dominio_1x1.codigo_dominio AS codigo_dominio_1x1y3,
		dominio_1x1.nombre_dominio AS nombre_dominio_1x1y4,
		dominio_1x1.descripcion_dominio AS descripcion_dominio_1x1y5,
		dominio_1x1.nombre_tabla AS nombre_tabla_1x1y6,
		dominio_1x1.numero_tipo_dominio AS numero_tipo_dominio_1x1y7,
		dominio_1x1.id_clase_recurso AS id_clase_recurso_1x1y8,
		dominio_1x1.id_funcion_seleccion AS id_funcion_seleccion_1x1y9,
		dominio_1x1.id_dominio_segmento AS id_dominio_segmento_1x1y10,
		dominio_1x1.id_paquete AS id_paquete_1x1y11,
	dominio_paquete.id_paquete AS id_paquete,
		paquete_1x2.codigo_paquete AS codigo_paquete_1x2y3
FROM
	dominio_paquete dominio_paquete
	INNER JOIN dominio dominio_1x1 ON dominio_1x1.id_dominio = dominio_paquete.id_dominio
	INNER JOIN paquete paquete_1x2 ON paquete_1x2.id_paquete = dominio_paquete.id_paquete;

