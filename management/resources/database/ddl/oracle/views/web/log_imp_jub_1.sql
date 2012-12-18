/**/
exec xsp.dropone('view','consulta_log_imp_jub_1');
/**/
CREATE VIEW consulta_log_imp_jub_1 AS
SELECT
	log_imp_jub.id_log_imp_jub AS id_log_imp_jub,
	log_imp_jub.version_log_imp_jub AS version_log_imp_jub,
	log_imp_jub.cedula AS cedula,
	log_imp_jub.primer_nombre AS primer_nombre,
	log_imp_jub.segundo_nombre AS segundo_nombre,
	log_imp_jub.primer_apellido AS primer_apellido,
	log_imp_jub.segundo_apellido AS segundo_apellido,
	log_imp_jub.apellido_casada AS apellido_casada,
	log_imp_jub.tipo_registro AS tipo_registro,
	log_imp_jub.es_importado AS es_importado,
	log_imp_jub.observacion AS observacion,
	log_imp_jub.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_jub.nombre_archivo AS nombre_archivo,
	log_imp_jub.codigo_archivo AS codigo_archivo
FROM
	log_imp_jub log_imp_jub;

