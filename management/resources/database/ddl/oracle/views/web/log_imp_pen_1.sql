/**/
exec xsp.dropone('view','consulta_log_imp_pen_1');
/**/
CREATE VIEW consulta_log_imp_pen_1 AS
SELECT
	log_imp_pen.id_log_imp_pen AS id_log_imp_pen,
	log_imp_pen.version_log_imp_pen AS version_log_imp_pen,
	log_imp_pen.cedula AS cedula,
	log_imp_pen.primer_nombre AS primer_nombre,
	log_imp_pen.segundo_nombre AS segundo_nombre,
	log_imp_pen.primer_apellido AS primer_apellido,
	log_imp_pen.segundo_apellido AS segundo_apellido,
	log_imp_pen.apellido_casada AS apellido_casada,
	log_imp_pen.es_importado AS es_importado,
	log_imp_pen.observacion AS observacion,
	log_imp_pen.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_pen.nombre_archivo AS nombre_archivo,
	log_imp_pen.codigo_archivo AS codigo_archivo
FROM
	log_imp_pen log_imp_pen;

