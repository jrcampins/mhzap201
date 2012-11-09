/**/
DROP VIEW IF EXISTS consulta_usuario_1;
/**/
CREATE OR REPLACE VIEW consulta_usuario_1 AS
SELECT
	usuario.id_usuario AS id_usuario,
	usuario.version_usuario AS version_usuario,
	usuario.codigo_usuario AS codigo_usuario,
	usuario.nombre_usuario AS nombre_usuario,
	usuario.password_usuario AS password_usuario,
	usuario.correo_electronico AS correo_electronico,
	usuario.id_usuario_supervisor AS id_usuario_supervisor,
		usuario_1x1.codigo_usuario AS codigo_usuario_1x1y3,
		usuario_1x1.nombre_usuario AS nombre_usuario_1x1y4,
		usuario_1x1.password_usuario AS password_usuario_1x1y5,
		usuario_1x1.correo_electronico AS correo_electronico_1x1y6,
		usuario_1x1.id_usuario_supervisor AS id_usuario_supervisor_1x1y7,
		usuario_1x1.es_super_usuario AS es_super_usuario_1x1y8,
		usuario_1x1.es_usuario_especial AS es_usuario_especial_1x1y9,
		usuario_1x1.es_usuario_inactivo AS es_usuario_inactivo_1x1y10,
		usuario_1x1.es_usuario_modificado AS es_usuario_modificado_1x1y11,
	usuario.es_super_usuario AS es_super_usuario,
	usuario.es_usuario_especial AS es_usuario_especial,
	usuario.es_usuario_inactivo AS es_usuario_inactivo,
	usuario.es_usuario_modificado AS es_usuario_modificado
FROM
	usuario usuario
	LEFT OUTER JOIN usuario usuario_1x1 ON usuario_1x1.id_usuario = usuario.id_usuario_supervisor
WHERE	usuario.es_usuario_especial=0;
