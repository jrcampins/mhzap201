/**/
exec xsp.dropone('view','consulta_opcion_menu_1');
/**/
CREATE VIEW consulta_opcion_menu_1 AS
SELECT
	opcion_menu.id_opcion_menu AS id_opcion_menu,
	opcion_menu.version_opcion_menu AS version_opcion_menu,
	opcion_menu.codigo_opcion_menu AS codigo_opcion_menu,
	opcion_menu.nombre_opcion_menu AS nombre_opcion_menu,
	opcion_menu.descripcion_opcion_menu AS descripcion_opcion_menu,
	opcion_menu.url_opcion_menu AS url_opcion_menu,
	opcion_menu.id_aplicacion AS id_aplicacion,
		aplicacion_1x1.codigo_aplicacion AS codigo_aplicacion_1x1y3,
		aplicacion_1x1.nombre_aplicacion AS nombre_aplicacion_1x1y4,
		aplicacion_1x1.descripcion_aplicacion AS descripcion_aplicacion_1x1y5,
		aplicacion_1x1.servidor_aplicacion AS servidor_aplicacion_1x1y6,
		aplicacion_1x1.puerto_aplicacion AS puerto_aplicacion_1x1y7,
		aplicacion_1x1.url_aplicacion AS url_aplicacion_1x1y8,
		aplicacion_1x1.es_publica AS es_publica_1x1y9,
		aplicacion_1x1.id_grupo_aplicacion AS id_grupo_aplicacion_1x1y10,
	opcion_menu.id_pagina AS id_pagina,
		pagina_1x2.codigo_pagina AS codigo_pagina_1x2y3,
		pagina_1x2.nombre_pagina AS nombre_pagina_1x2y4,
		pagina_1x2.descripcion_pagina AS descripcion_pagina_1x2y5,
		pagina_1x2.url_pagina AS url_pagina_1x2y6,
		pagina_1x2.id_aplicacion AS id_aplicacion_1x2y7,
		pagina_1x2.es_publica AS es_publica_1x2y8,
		pagina_1x2.numero_tipo_pagina AS numero_tipo_pagina_1x2y9,
		pagina_1x2.id_dominio AS id_dominio_1x2y10,
		pagina_1x2.id_dominio_maestro AS id_dominio_maestro_1x2y11,
		pagina_1x2.id_parametro AS id_parametro_1x2y12,
	opcion_menu.id_opcion_menu_superior AS id_opcion_menu_superior,
		opcion_menu_1x3.codigo_opcion_menu AS codigo_opcion_menu_1x3y3,
		opcion_menu_1x3.nombre_opcion_menu AS nombre_opcion_menu_1x3y4,
		opcion_menu_1x3.descripcion_opcion_menu AS descripcion_opcion_menu_1x3y5,
		opcion_menu_1x3.url_opcion_menu AS url_opcion_menu_1x3y6,
		opcion_menu_1x3.id_aplicacion AS id_aplicacion_1x3y7,
		opcion_menu_1x3.id_pagina AS id_pagina_1x3y8,
		opcion_menu_1x3.id_opcion_menu_superior AS id_opcion_menu_superior_1x3y9,
		opcion_menu_1x3.numero_tipo_nodo AS numero_tipo_nodo_1x3y10,
		opcion_menu_1x3.numero_nivel_opcion_menu AS numero_nivel_opcion_men_1x3y11,
		opcion_menu_1x3.secuencia_opcion_menu AS secuencia_opcion_menu_1x3y12,
		opcion_menu_1x3.clave_opcion_menu AS clave_opcion_menu_1x3y13,
		opcion_menu_1x3.es_opcion_menu_inactiva AS es_opcion_menu_inactiva_1x3y14,
		opcion_menu_1x3.es_opcion_menu_sincronizada AS es_opcion_menu_sincroni_1x3y15,
	opcion_menu.numero_tipo_nodo AS numero_tipo_nodo,
		tipo_nodo_1x4.codigo_tipo_nodo AS codigo_tipo_nodo_1x4y2,
	opcion_menu.numero_nivel_opcion_menu AS numero_nivel_opcion_menu,
		nivel_opcion_menu_1x5.codigo_nivel_opcion_menu AS codigo_nivel_opcion_menu_1x5y2,
		nivel_opcion_menu_1x5.digitos_nivel_opcion_menu AS digitos_nivel_opcion_men_1x5y3,
	opcion_menu.secuencia_opcion_menu AS secuencia_opcion_menu,
	opcion_menu.clave_opcion_menu AS clave_opcion_menu,
	opcion_menu.es_opcion_menu_inactiva AS es_opcion_menu_inactiva,
	opcion_menu.es_opcion_menu_sincronizada AS es_opcion_menu_sincronizada
FROM
	opcion_menu opcion_menu
	LEFT OUTER JOIN aplicacion aplicacion_1x1 ON aplicacion_1x1.id_aplicacion = opcion_menu.id_aplicacion
	LEFT OUTER JOIN pagina pagina_1x2 ON pagina_1x2.id_pagina = opcion_menu.id_pagina
	LEFT OUTER JOIN opcion_menu opcion_menu_1x3 ON opcion_menu_1x3.id_opcion_menu = opcion_menu.id_opcion_menu_superior
	LEFT OUTER JOIN tipo_nodo tipo_nodo_1x4 ON tipo_nodo_1x4.numero_tipo_nodo = opcion_menu.numero_tipo_nodo
	LEFT OUTER JOIN nivel_opcion_menu nivel_opcion_menu_1x5 ON nivel_opcion_menu_1x5.numero_nivel_opcion_menu = opcion_menu.numero_nivel_opcion_menu;

