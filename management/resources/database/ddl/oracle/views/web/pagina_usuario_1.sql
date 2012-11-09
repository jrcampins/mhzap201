/**/
exec xsp.dropone('view','consulta_pagina_usuario_1');
/**/
CREATE VIEW consulta_pagina_usuario_1 AS
SELECT
	pagina_usuario.id_pagina_usuario AS id_pagina_usuario,
	pagina_usuario.version_pagina_usuario AS version_pagina_usuario,
	pagina_usuario.id_pagina AS id_pagina,
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
	pagina_usuario.id_usuario AS id_usuario,
		usuario_1x2.codigo_usuario AS codigo_usuario_1x2y3,
		usuario_1x2.nombre_usuario AS nombre_usuario_1x2y4,
		usuario_1x2.password_usuario AS password_usuario_1x2y5,
		usuario_1x2.correo_electronico AS correo_electronico_1x2y6,
		usuario_1x2.id_usuario_supervisor AS id_usuario_supervisor_1x2y7,
		usuario_1x2.es_super_usuario AS es_super_usuario_1x2y8,
		usuario_1x2.es_usuario_especial AS es_usuario_especial_1x2y9,
		usuario_1x2.es_usuario_inactivo AS es_usuario_inactivo_1x2y10,
		usuario_1x2.es_usuario_modificado AS es_usuario_modificado_1x2y11
FROM
	pagina_usuario pagina_usuario
	INNER JOIN pagina pagina_1x1 ON pagina_1x1.id_pagina = pagina_usuario.id_pagina
	INNER JOIN usuario usuario_1x2 ON usuario_1x2.id_usuario = pagina_usuario.id_usuario;

