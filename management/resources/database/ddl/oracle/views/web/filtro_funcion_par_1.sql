/**/
exec xsp.dropone('view','consulta_filtro_funcion_par_1');
/**/
CREATE VIEW consulta_filtro_funcion_par_1 AS
SELECT
	filtro_funcion_par.id_filtro_funcion_par AS id_filtro_funcion_par,
	filtro_funcion_par.version_filtro_funcion_par AS version_filtro_funcion_par,
	filtro_funcion_par.id_filtro_funcion AS id_filtro_funcion,
		filtro_funcion_1x1.codigo_filtro_funcion AS codigo_filtro_funcion_1x1y3,
		filtro_funcion_1x1.nombre_filtro_funcion AS nombre_filtro_funcion_1x1y4,
		filtro_funcion_1x1.descripcion_filtro_funcion AS descripcion_filtro_funci_1x1y5,
		filtro_funcion_1x1.id_funcion AS id_funcion_1x1y6,
		filtro_funcion_1x1.id_usuario AS id_usuario_1x1y7,
		filtro_funcion_1x1.es_publico AS es_publico_1x1y8,
		filtro_funcion_1x1.id_filtro_funcion_original AS id_filtro_funcion_origin_1x1y9,
	filtro_funcion_par.id_funcion_parametro AS id_funcion_parametro,
		funcion_parametro_1x2.id_funcion AS id_funcion_1x2y3,
		funcion_parametro_1x2.id_parametro AS id_parametro_1x2y4,
		funcion_parametro_1x2.numero_tipo_parametro AS numero_tipo_parametro_1x2y5,
		funcion_parametro_1x2.numero_tipo_comparacion AS numero_tipo_comparacion_1x2y6,
		funcion_parametro_1x2.id_funcion_referencia AS id_funcion_referencia_1x2y7,
		funcion_parametro_1x2.numero_tipo_valor AS numero_tipo_valor_1x2y8,
		funcion_parametro_1x2.id_lista_valor AS id_lista_valor_1x2y9,
		funcion_parametro_1x2.id_clase_objeto_valor AS id_clase_objeto_valor_1x2y10,
		funcion_parametro_1x2.id_clase_recurso_valor AS id_clase_recurso_valor_1x2y11,
		funcion_parametro_1x2.valor_minimo AS valor_minimo_1x2y12,
		funcion_parametro_1x2.valor_maximo AS valor_maximo_1x2y13,
		funcion_parametro_1x2.valor_omision AS valor_omision_1x2y14,
		funcion_parametro_1x2.es_parametro_sin_rastro AS es_parametro_sin_rastro_1x2y15,
		funcion_parametro_1x2.es_parametro_segmento AS es_parametro_segmento_1x2y16,
	filtro_funcion_par.numero_operador_com AS numero_operador_com,
		operador_com_1x3.codigo_operador_com AS codigo_operador_com_1x3y2,
	filtro_funcion_par.id_valor_lista AS id_valor_lista,
	filtro_funcion_par.id_objeto_valor AS id_objeto_valor,
	filtro_funcion_par.id_recurso_valor AS id_recurso_valor,
	filtro_funcion_par.valor_parametro AS valor_parametro,
	filtro_funcion_par.significado_parametro AS significado_parametro
FROM
	filtro_funcion_par filtro_funcion_par
	INNER JOIN filtro_funcion filtro_funcion_1x1 ON filtro_funcion_1x1.id_filtro_funcion = filtro_funcion_par.id_filtro_funcion
	INNER JOIN funcion_parametro funcion_parametro_1x2 ON funcion_parametro_1x2.id_funcion_parametro = filtro_funcion_par.id_funcion_parametro
	INNER JOIN operador_com operador_com_1x3 ON operador_com_1x3.numero_operador_com = filtro_funcion_par.numero_operador_com;

