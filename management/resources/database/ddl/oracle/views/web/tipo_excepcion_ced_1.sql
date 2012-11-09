/**/
exec xsp.dropone('view','consulta_tipo_excepcion_ced_1');
/**/
CREATE VIEW consulta_tipo_excepcion_ced_1 AS
SELECT
	tipo_excepcion_ced.numero_tipo_excepcion_ced AS numero_tipo_excepcion_ced,
	tipo_excepcion_ced.codigo_tipo_excepcion_ced AS codigo_tipo_excepcion_ced
FROM
	tipo_excepcion_ced tipo_excepcion_ced;

