/**/
exec xsp.dropone('view','consulta_log_imp_per_1');
/**/
CREATE VIEW consulta_log_imp_per_1 AS
SELECT
	log_imp_per.id_log_imp_per AS id_log_imp_per,
	log_imp_per.version_log_imp_per AS version_log_imp_per,
	log_imp_per.ficha_activa AS ficha_activa,
	log_imp_per.es_importado AS es_importado,
	log_imp_per.observacion AS observacion,
	log_imp_per.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_per.nombre_archivo AS nombre_archivo,
	log_imp_per.codigo_archivo AS codigo_archivo
FROM
	log_imp_per log_imp_per;

