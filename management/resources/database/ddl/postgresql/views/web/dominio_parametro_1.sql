/**/
DROP VIEW IF EXISTS consulta_dominio_parametro_1;
/**/
CREATE OR REPLACE VIEW consulta_dominio_parametro_1 AS
SELECT
	dominio_parametro.id_dominio_parametro AS id_dominio_parametro,
	dominio_parametro.version_dominio_parametro AS version_dominio_parametro,
	dominio_parametro.id_dominio AS id_dominio,
		dominio_1x1.codigo_dominio AS codigo_dominio_1x1y3,
		dominio_1x1.nombre_dominio AS nombre_dominio_1x1y4,
		dominio_1x1.descripcion_dominio AS descripcion_dominio_1x1y5,
		dominio_1x1.nombre_tabla AS nombre_tabla_1x1y6,
		dominio_1x1.numero_tipo_dominio AS numero_tipo_dominio_1x1y7,
		dominio_1x1.id_clase_recurso AS id_clase_recurso_1x1y8,
		dominio_1x1.id_funcion_seleccion AS id_funcion_seleccion_1x1y9,
		dominio_1x1.id_dominio_segmento AS id_dominio_segmento_1x1y10,
		dominio_1x1.id_paquete AS id_paquete_1x1y11,
	dominio_parametro.id_parametro AS id_parametro,
		parametro_1x2.codigo_parametro AS codigo_parametro_1x2y3,
		parametro_1x2.nombre_parametro AS nombre_parametro_1x2y4,
		parametro_1x2.detalle_parametro AS detalle_parametro_1x2y5,
		parametro_1x2.descripcion_parametro AS descripcion_parametro_1x2y6,
		parametro_1x2.numero_tipo_dato_par AS numero_tipo_dato_par_1x2y7,
		parametro_1x2.alias_parametro AS alias_parametro_1x2y8,
	dominio_parametro.numero_tipo_parametro_dom AS numero_tipo_parametro_dom,
		tipo_parametro_dom_1x3.codigo_tipo_parametro_dom AS codigo_tipo_parametro_do_1x3y2,
		tipo_parametro_dom_1x3.codigo_propiedad_interfaz AS codigo_propiedad_interfa_1x3y3,
		tipo_parametro_dom_1x3.nombre_interfaz AS nombre_interfaz_1x3y4,
		tipo_parametro_dom_1x3.etiqueta_parametro AS etiqueta_parametro_1x3y5,
	dominio_parametro.etiqueta_parametro AS etiqueta_parametro
FROM
	dominio_parametro dominio_parametro
	INNER JOIN dominio dominio_1x1 ON dominio_1x1.id_dominio = dominio_parametro.id_dominio
	INNER JOIN parametro parametro_1x2 ON parametro_1x2.id_parametro = dominio_parametro.id_parametro
	INNER JOIN tipo_parametro_dom tipo_parametro_dom_1x3 ON tipo_parametro_dom_1x3.numero_tipo_parametro_dom = dominio_parametro.numero_tipo_parametro_dom;

