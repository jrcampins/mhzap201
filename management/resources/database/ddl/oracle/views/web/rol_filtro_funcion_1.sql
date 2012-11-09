/**/
exec xsp.dropone('view','consulta_rol_filtro_funcion_1');
/**/
CREATE VIEW consulta_rol_filtro_funcion_1 AS
SELECT
	rol_filtro_funcion.id_rol_filtro_funcion AS id_rol_filtro_funcion,
	rol_filtro_funcion.version_rol_filtro_funcion AS version_rol_filtro_funcion,
	rol_filtro_funcion.id_rol AS id_rol,
		rol_1x1.codigo_rol AS codigo_rol_1x1y3,
		rol_1x1.nombre_rol AS nombre_rol_1x1y4,
		rol_1x1.descripcion_rol AS descripcion_rol_1x1y5,
		rol_1x1.numero_tipo_rol AS numero_tipo_rol_1x1y6,
		rol_1x1.id_grupo_aplicacion AS id_grupo_aplicacion_1x1y7,
	rol_filtro_funcion.id_filtro_funcion AS id_filtro_funcion,
		filtro_funcion_1x2.codigo_filtro_funcion AS codigo_filtro_funcion_1x2y3,
		filtro_funcion_1x2.nombre_filtro_funcion AS nombre_filtro_funcion_1x2y4,
		filtro_funcion_1x2.descripcion_filtro_funcion AS descripcion_filtro_funci_1x2y5,
		filtro_funcion_1x2.id_funcion AS id_funcion_1x2y6,
		filtro_funcion_1x2.id_usuario AS id_usuario_1x2y7,
		filtro_funcion_1x2.es_publico AS es_publico_1x2y8,
		filtro_funcion_1x2.id_filtro_funcion_original AS id_filtro_funcion_origin_1x2y9
FROM
	rol_filtro_funcion rol_filtro_funcion
	INNER JOIN rol rol_1x1 ON rol_1x1.id_rol = rol_filtro_funcion.id_rol
	INNER JOIN filtro_funcion filtro_funcion_1x2 ON filtro_funcion_1x2.id_filtro_funcion = rol_filtro_funcion.id_filtro_funcion;

