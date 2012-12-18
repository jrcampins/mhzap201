/**/
exec xsp.dropone('view','consulta_log_imp_fal_1');
/**/
CREATE VIEW consulta_log_imp_fal_1 AS
SELECT
	log_imp_fal.id_log_imp_fal AS id_log_imp_fal,
	log_imp_fal.version_log_imp_fal AS version_log_imp_fal,
	log_imp_fal.cedula AS cedula,
	log_imp_fal.primer_nombre AS primer_nombre,
	log_imp_fal.segundo_nombre AS segundo_nombre,
	log_imp_fal.primer_apellido AS primer_apellido,
	log_imp_fal.segundo_apellido AS segundo_apellido,
	log_imp_fal.apellido_casada AS apellido_casada,
	log_imp_fal.defuncion AS defuncion,
	log_imp_fal.es_importado AS es_importado,
	log_imp_fal.observacion AS observacion,
	log_imp_fal.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_fal.nombre_archivo AS nombre_archivo,
	log_imp_fal.codigo_archivo AS codigo_archivo
FROM
	log_imp_fal log_imp_fal;

