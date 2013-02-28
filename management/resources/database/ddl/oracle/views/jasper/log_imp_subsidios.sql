CREATE OR REPLACE VIEW log_imp_subsidios AS
SELECT
	log_imp_sub.id_log_imp_sub AS id_log_imp_sub,
	log_imp_sub.version_log_imp_sub AS version_log_imp_sub,
	log_imp_sub.cedula AS cedula,
	log_imp_sub.primer_nombre AS primer_nombre,
	log_imp_sub.segundo_nombre AS segundo_nombre,
	log_imp_sub.primer_apellido AS primer_apellido,
	log_imp_sub.segundo_apellido AS segundo_apellido,
	log_imp_sub.apellido_casada AS apellido_casada,
	log_imp_sub.es_importado AS es_importado,
	log_imp_sub.observacion AS observacion,
	log_imp_sub.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_sub.nombre_archivo AS nombre_archivo,
	log_imp_sub.codigo_archivo AS codigo_archivo,
        case when log_imp_sub.es_importado=1 then 'Sí' else 'No' end as importo,
        archivo.id_proveedor_dat_ext AS proveedor,
        proveedor.nombre_proveedor_dat_ext AS nombre_proveedor,
        tipo_archivo.codigo_tipo_arc_dat_ext AS cod_tipo_archivo
FROM
	log_imp_sub log_imp_sub
LEFT JOIN archivo_datos_ext archivo ON log_imp_sub.codigo_archivo=archivo.codigo_archivo_datos_ext
LEFT JOIN proveedor_dat_ext proveedor ON archivo.id_proveedor_dat_ext=proveedor.id_proveedor_dat_ext
LEFT JOIN tipo_arc_dat_ext tipo_archivo ON archivo.numero_tipo_arc_dat_ext=tipo_archivo.numero_tipo_arc_dat_ext
ORDER BY  proveedor,cedula;