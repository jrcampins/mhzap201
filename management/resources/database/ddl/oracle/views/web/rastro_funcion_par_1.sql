/**/
exec xsp.dropone('view','consulta_rastro_funcion_par_1');
/**/
CREATE VIEW consulta_rastro_funcion_par_1 AS
SELECT
	rastro_funcion_par.id_rastro_funcion_par AS id_rastro_funcion_par,
	rastro_funcion_par.id_rastro_funcion AS id_rastro_funcion,
		rastro_funcion_1x1.fecha_hora_ejecucion AS fecha_hora_ejecucion_1x1y2,
		rastro_funcion_1x1.id_usuario AS id_usuario_1x1y3,
		rastro_funcion_1x1.id_funcion AS id_funcion_1x1y4,
		rastro_funcion_1x1.id_recurso AS id_recurso_1x1y5,
		rastro_funcion_1x1.version_recurso AS version_recurso_1x1y6,
		rastro_funcion_1x1.codigo_recurso AS codigo_recurso_1x1y7,
		rastro_funcion_1x1.nombre_recurso AS nombre_recurso_1x1y8,
		rastro_funcion_1x1.id_propietario_recurso AS id_propietario_recurso_1x1y9,
		rastro_funcion_1x1.id_segmento_recurso AS id_segmento_recurso_1x1y10,
		rastro_funcion_1x1.numero_error AS numero_error_1x1y11,
		rastro_funcion_1x1.descripcion_error AS descripcion_error_1x1y12,
	rastro_funcion_par.id_parametro AS id_parametro,
		parametro_1x2.codigo_parametro AS codigo_parametro_1x2y3,
		parametro_1x2.nombre_parametro AS nombre_parametro_1x2y4,
		parametro_1x2.detalle_parametro AS detalle_parametro_1x2y5,
		parametro_1x2.descripcion_parametro AS descripcion_parametro_1x2y6,
		parametro_1x2.numero_tipo_dato_par AS numero_tipo_dato_par_1x2y7,
		parametro_1x2.alias_parametro AS alias_parametro_1x2y8,
	rastro_funcion_par.valor_parametro AS valor_parametro
FROM
	rastro_funcion_par rastro_funcion_par
	INNER JOIN rastro_funcion rastro_funcion_1x1 ON rastro_funcion_1x1.id_rastro_funcion = rastro_funcion_par.id_rastro_funcion
	INNER JOIN parametro parametro_1x2 ON parametro_1x2.id_parametro = rastro_funcion_par.id_parametro;

