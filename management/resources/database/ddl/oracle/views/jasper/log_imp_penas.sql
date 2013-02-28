CREATE OR REPLACE VIEW log_imp_penas AS
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
	log_imp_pen.codigo_archivo AS codigo_archivo,
        case when log_imp_pen.es_importado=1 then 'Sí' else 'No' end as importo,
        archivo.id_proveedor_dat_ext AS proveedor,
        proveedor.nombre_proveedor_dat_ext AS nombre_proveedor,
        tipo_archivo.codigo_tipo_arc_dat_ext AS cod_tipo_archivo
FROM
	log_imp_pen log_imp_pen
LEFT JOIN archivo_datos_ext archivo ON log_imp_pen.codigo_archivo=archivo.codigo_archivo_datos_ext
LEFT JOIN proveedor_dat_ext proveedor ON archivo.id_proveedor_dat_ext=proveedor.id_proveedor_dat_ext
LEFT JOIN tipo_arc_dat_ext tipo_archivo ON archivo.numero_tipo_arc_dat_ext=tipo_archivo.numero_tipo_arc_dat_ext
ORDER BY  proveedor,cedula;