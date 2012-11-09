/**/
exec xsp.dropone('view','consulta_tipo_servicio_san_1');
/**/
CREATE VIEW consulta_tipo_servicio_san_1 AS
SELECT
	tipo_servicio_san.numero_tipo_servicio_san AS numero_tipo_servicio_san,
	tipo_servicio_san.codigo_tipo_servicio_san AS codigo_tipo_servicio_san
FROM
	tipo_servicio_san tipo_servicio_san;

