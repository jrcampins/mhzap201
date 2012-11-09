/**/
DROP VIEW IF EXISTS consulta_rol_pagina_1;
/**/
CREATE OR REPLACE VIEW consulta_rol_pagina_1 AS
SELECT
	rol_pagina.id_rol_pagina AS id_rol_pagina,
	rol_pagina.version_rol_pagina AS version_rol_pagina,
	rol_pagina.id_rol AS id_rol,
		rol_1x1.codigo_rol AS codigo_rol_1x1y3,
		rol_1x1.nombre_rol AS nombre_rol_1x1y4,
		rol_1x1.descripcion_rol AS descripcion_rol_1x1y5,
		rol_1x1.numero_tipo_rol AS numero_tipo_rol_1x1y6,
		rol_1x1.id_grupo_aplicacion AS id_grupo_aplicacion_1x1y7,
	rol_pagina.id_pagina AS id_pagina,
		pagina_1x2.codigo_pagina AS codigo_pagina_1x2y3,
		pagina_1x2.nombre_pagina AS nombre_pagina_1x2y4,
		pagina_1x2.descripcion_pagina AS descripcion_pagina_1x2y5,
		pagina_1x2.url_pagina AS url_pagina_1x2y6,
		pagina_1x2.id_aplicacion AS id_aplicacion_1x2y7,
		pagina_1x2.es_publica AS es_publica_1x2y8,
		pagina_1x2.numero_tipo_pagina AS numero_tipo_pagina_1x2y9,
		pagina_1x2.id_dominio AS id_dominio_1x2y10,
		pagina_1x2.id_dominio_maestro AS id_dominio_maestro_1x2y11,
		pagina_1x2.id_parametro AS id_parametro_1x2y12
FROM
	rol_pagina rol_pagina
	INNER JOIN rol rol_1x1 ON rol_1x1.id_rol = rol_pagina.id_rol
	INNER JOIN pagina pagina_1x2 ON pagina_1x2.id_pagina = rol_pagina.id_pagina;

