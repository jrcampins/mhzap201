/**/
exec xsp.dropone('view','consulta_pagina_1');
/**/
CREATE VIEW consulta_pagina_1 AS
SELECT
	pagina.id_pagina AS id_pagina,
	pagina.version_pagina AS version_pagina,
	pagina.codigo_pagina AS codigo_pagina,
	pagina.nombre_pagina AS nombre_pagina,
	pagina.descripcion_pagina AS descripcion_pagina,
	pagina.url_pagina AS url_pagina,
	pagina.id_aplicacion AS id_aplicacion,
		aplicacion_1x1.codigo_aplicacion AS codigo_aplicacion_1x1y3,
		aplicacion_1x1.nombre_aplicacion AS nombre_aplicacion_1x1y4,
		aplicacion_1x1.descripcion_aplicacion AS descripcion_aplicacion_1x1y5,
		aplicacion_1x1.servidor_aplicacion AS servidor_aplicacion_1x1y6,
		aplicacion_1x1.puerto_aplicacion AS puerto_aplicacion_1x1y7,
		aplicacion_1x1.url_aplicacion AS url_aplicacion_1x1y8,
		aplicacion_1x1.es_publica AS es_publica_1x1y9,
		aplicacion_1x1.id_grupo_aplicacion AS id_grupo_aplicacion_1x1y10,
	pagina.es_publica AS es_publica,
	pagina.numero_tipo_pagina AS numero_tipo_pagina,
		tipo_pagina_1x2.codigo_tipo_pagina AS codigo_tipo_pagina_1x2y2,
	pagina.id_dominio AS id_dominio,
		dominio_1x3.codigo_dominio AS codigo_dominio_1x3y3,
		dominio_1x3.nombre_dominio AS nombre_dominio_1x3y4,
		dominio_1x3.descripcion_dominio AS descripcion_dominio_1x3y5,
		dominio_1x3.nombre_tabla AS nombre_tabla_1x3y6,
		dominio_1x3.numero_tipo_dominio AS numero_tipo_dominio_1x3y7,
		dominio_1x3.id_clase_recurso AS id_clase_recurso_1x3y8,
		dominio_1x3.id_funcion_seleccion AS id_funcion_seleccion_1x3y9,
		dominio_1x3.id_dominio_segmento AS id_dominio_segmento_1x3y10,
		dominio_1x3.id_paquete AS id_paquete_1x3y11,
	pagina.id_dominio_maestro AS id_dominio_maestro,
		dominio_1x4.codigo_dominio AS codigo_dominio_1x4y3,
		dominio_1x4.nombre_dominio AS nombre_dominio_1x4y4,
		dominio_1x4.descripcion_dominio AS descripcion_dominio_1x4y5,
		dominio_1x4.nombre_tabla AS nombre_tabla_1x4y6,
		dominio_1x4.numero_tipo_dominio AS numero_tipo_dominio_1x4y7,
		dominio_1x4.id_clase_recurso AS id_clase_recurso_1x4y8,
		dominio_1x4.id_funcion_seleccion AS id_funcion_seleccion_1x4y9,
		dominio_1x4.id_dominio_segmento AS id_dominio_segmento_1x4y10,
		dominio_1x4.id_paquete AS id_paquete_1x4y11,
	pagina.id_parametro AS id_parametro,
		parametro_1x5.codigo_parametro AS codigo_parametro_1x5y3,
		parametro_1x5.nombre_parametro AS nombre_parametro_1x5y4,
		parametro_1x5.detalle_parametro AS detalle_parametro_1x5y5,
		parametro_1x5.descripcion_parametro AS descripcion_parametro_1x5y6,
		parametro_1x5.numero_tipo_dato_par AS numero_tipo_dato_par_1x5y7,
		parametro_1x5.alias_parametro AS alias_parametro_1x5y8
FROM
	pagina pagina
	INNER JOIN aplicacion aplicacion_1x1 ON aplicacion_1x1.id_aplicacion = pagina.id_aplicacion
	LEFT OUTER JOIN tipo_pagina tipo_pagina_1x2 ON tipo_pagina_1x2.numero_tipo_pagina = pagina.numero_tipo_pagina
	LEFT OUTER JOIN dominio dominio_1x3 ON dominio_1x3.id_dominio = pagina.id_dominio
	LEFT OUTER JOIN dominio dominio_1x4 ON dominio_1x4.id_dominio = pagina.id_dominio_maestro
	LEFT OUTER JOIN parametro parametro_1x5 ON parametro_1x5.id_parametro = pagina.id_parametro;

