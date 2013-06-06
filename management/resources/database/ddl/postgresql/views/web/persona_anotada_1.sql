/**/
DROP VIEW IF EXISTS consulta_persona_anotada_1;
/**/
CREATE OR REPLACE VIEW consulta_persona_anotada_1 AS
SELECT
	persona_anotada.id_persona_anotada AS id_persona_anotada,
	persona_anotada.version_persona_anotada AS version_persona_anotada,
	persona_anotada.id_persona AS id_persona,
	persona_anotada.codigo_persona AS codigo_persona,
	persona_anotada.nombre_persona AS nombre_persona,
	persona_anotada.id_usuario AS id_usuario,
	persona_anotada.codigo_usuario AS codigo_usuario,
	persona_anotada.nombre_usuario AS nombre_usuario,
	persona_anotada.fecha_hora_seleccion AS fecha_hora_seleccion
FROM
	persona_anotada persona_anotada;

