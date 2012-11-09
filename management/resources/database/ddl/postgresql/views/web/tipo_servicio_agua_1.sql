/**/
DROP VIEW IF EXISTS consulta_tipo_servicio_agua_1;
/**/
CREATE OR REPLACE VIEW consulta_tipo_servicio_agua_1 AS
SELECT
	tipo_servicio_agua.numero_tipo_servicio_agua AS numero_tipo_servicio_agua,
	tipo_servicio_agua.codigo_tipo_servicio_agua AS codigo_tipo_servicio_agua
FROM
	tipo_servicio_agua tipo_servicio_agua;

