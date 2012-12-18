/**/
DROP VIEW IF EXISTS consulta_log_imp_deu_1;
/**/
CREATE OR REPLACE VIEW consulta_log_imp_deu_1 AS
SELECT
	log_imp_deu.id_log_imp_deu AS id_log_imp_deu,
	log_imp_deu.version_log_imp_deu AS version_log_imp_deu,
	log_imp_deu.cedula AS cedula,
	log_imp_deu.primer_nombre AS primer_nombre,
	log_imp_deu.segundo_nombre AS segundo_nombre,
	log_imp_deu.primer_apellido AS primer_apellido,
	log_imp_deu.segundo_apellido AS segundo_apellido,
	log_imp_deu.apellido_casada AS apellido_casada,
	log_imp_deu.es_importado AS es_importado,
	log_imp_deu.observacion AS observacion,
	log_imp_deu.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_deu.nombre_archivo AS nombre_archivo,
	log_imp_deu.codigo_archivo AS codigo_archivo
FROM
	log_imp_deu log_imp_deu;

