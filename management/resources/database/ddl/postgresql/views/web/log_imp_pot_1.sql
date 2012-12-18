/**/
DROP VIEW IF EXISTS consulta_log_imp_pot_1;
/**/
CREATE OR REPLACE VIEW consulta_log_imp_pot_1 AS
SELECT
	log_imp_pot.id_log_imp_pot AS id_log_imp_pot,
	log_imp_pot.version_log_imp_pot AS version_log_imp_pot,
	log_imp_pot.departamento AS departamento,
	log_imp_pot.distrito AS distrito,
	log_imp_pot.nombres_apellidos AS nombres_apellidos,
	log_imp_pot.apodo AS apodo,
	log_imp_pot.edad_a_la_fecha AS edad_a_la_fecha,
	log_imp_pot.nacimiento AS nacimiento,
	log_imp_pot.cedula AS cedula,
	log_imp_pot.telefono AS telefono,
	log_imp_pot.direccion AS direccion,
	log_imp_pot.referencia AS referencia,
	log_imp_pot.barrio AS barrio,
	log_imp_pot.nombre_referente AS nombre_referente,
	log_imp_pot.telefono_referente AS telefono_referente,
	log_imp_pot.es_importado AS es_importado,
	log_imp_pot.observacion AS observacion,
	log_imp_pot.fecha_hora_transaccion AS fecha_hora_transaccion,
	log_imp_pot.nombre_archivo AS nombre_archivo,
	log_imp_pot.codigo_archivo AS codigo_archivo
FROM
	log_imp_pot log_imp_pot;

