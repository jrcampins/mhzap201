/**/
DROP VIEW IF EXISTS consulta_log_imp_ubi_1;
/**/
CREATE OR REPLACE VIEW consulta_log_imp_ubi_1 AS
SELECT
	log_imp_ubi.id_log_imp_ubi AS id_log_imp_ubi,
	log_imp_ubi.version_log_imp_ubi AS version_log_imp_ubi,
	log_imp_ubi.codigo AS codigo,
	log_imp_ubi.ubicacion AS ubicacion,
	log_imp_ubi.tipo_ubicacion AS tipo_ubicacion,
	log_imp_ubi.tipo_area AS tipo_area,
	log_imp_ubi.codigo_ubicacion_superior AS codigo_ubicacion_superior,
	log_imp_ubi.es_importado AS es_importado,
	log_imp_ubi.observacion AS observacion,
	log_imp_ubi.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_ubi.nombre_archivo AS nombre_archivo,
	log_imp_ubi.codigo_archivo AS codigo_archivo
FROM
	log_imp_ubi log_imp_ubi;

