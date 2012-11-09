/**/
DROP VIEW IF EXISTS consulta_pagina_funcion_1;
/**/
CREATE OR REPLACE VIEW consulta_pagina_funcion_1 AS
SELECT
	pagina_funcion.id_pagina_funcion AS id_pagina_funcion,
	pagina_funcion.version_pagina_funcion AS version_pagina_funcion,
	pagina_funcion.id_pagina AS id_pagina,
		pagina_1x1.codigo_pagina AS codigo_pagina_1x1y3,
		pagina_1x1.nombre_pagina AS nombre_pagina_1x1y4,
		pagina_1x1.descripcion_pagina AS descripcion_pagina_1x1y5,
		pagina_1x1.url_pagina AS url_pagina_1x1y6,
		pagina_1x1.id_aplicacion AS id_aplicacion_1x1y7,
		pagina_1x1.es_publica AS es_publica_1x1y8,
		pagina_1x1.numero_tipo_pagina AS numero_tipo_pagina_1x1y9,
		pagina_1x1.id_dominio AS id_dominio_1x1y10,
		pagina_1x1.id_dominio_maestro AS id_dominio_maestro_1x1y11,
		pagina_1x1.id_parametro AS id_parametro_1x1y12,
	pagina_funcion.id_funcion AS id_funcion,
		funcion_1x2.codigo_funcion AS codigo_funcion_1x2y3,
		funcion_1x2.nombre_funcion AS nombre_funcion_1x2y4,
		funcion_1x2.descripcion_funcion AS descripcion_funcion_1x2y5,
		funcion_1x2.numero_tipo_funcion AS numero_tipo_funcion_1x2y6,
		funcion_1x2.numero_tipo_rastro_fun AS numero_tipo_rastro_fun_1x2y7,
		funcion_1x2.id_dominio AS id_dominio_1x2y8,
		funcion_1x2.clausula_where AS clausula_where_1x2y9,
		funcion_1x2.clausula_order AS clausula_order_1x2y10,
		funcion_1x2.es_publica AS es_publica_1x2y11,
		funcion_1x2.es_programatica AS es_programatica_1x2y12,
		funcion_1x2.es_personalizada AS es_personalizada_1x2y13,
		funcion_1x2.es_segmentada AS es_segmentada_1x2y14,
		funcion_1x2.id_grupo_proceso AS id_grupo_proceso_1x2y15,
	pagina_funcion.es_funcion_inicial AS es_funcion_inicial,
	pagina_funcion.control_pagina_funcion AS control_pagina_funcion
FROM
	pagina_funcion pagina_funcion
	INNER JOIN pagina pagina_1x1 ON pagina_1x1.id_pagina = pagina_funcion.id_pagina
	INNER JOIN funcion funcion_1x2 ON funcion_1x2.id_funcion = pagina_funcion.id_funcion;

