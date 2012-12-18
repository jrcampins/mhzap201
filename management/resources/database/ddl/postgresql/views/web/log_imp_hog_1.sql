/**/
DROP VIEW IF EXISTS consulta_log_imp_hog_1;
/**/
CREATE OR REPLACE VIEW consulta_log_imp_hog_1 AS
SELECT
	log_imp_hog.id_log_imp_hog AS id_log_imp_hog,
	log_imp_hog.version_log_imp_hog AS version_log_imp_hog,
	log_imp_hog.observaciones AS observaciones,
	log_imp_hog.letra_ci AS letra_ci,
	log_imp_hog.es_importado AS es_importado,
	log_imp_hog.observacion AS observacion,
	log_imp_hog.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_hog.nombre_archivo AS nombre_archivo,
	log_imp_hog.codigo_archivo AS codigo_archivo
FROM
	log_imp_hog log_imp_hog;

