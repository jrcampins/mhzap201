/**/
DROP VIEW IF EXISTS consulta_tipo_servicio_san_1;
/**/
CREATE OR REPLACE VIEW consulta_tipo_servicio_san_1 AS
SELECT
	tipo_servicio_san.numero_tipo_servicio_san AS numero_tipo_servicio_san,
	tipo_servicio_san.codigo_tipo_servicio_san AS codigo_tipo_servicio_san
FROM
	tipo_servicio_san tipo_servicio_san;

