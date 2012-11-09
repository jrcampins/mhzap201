/**/
exec xsp.dropone('view','consulta_mensaje_1');
/**/
CREATE VIEW consulta_mensaje_1 AS
SELECT
	mensaje.id_mensaje AS id_mensaje,
	mensaje.version_mensaje AS version_mensaje,
	mensaje.codigo_mensaje AS codigo_mensaje,
	mensaje.patron_mensaje AS patron_mensaje,
	mensaje.descripcion_mensaje AS descripcion_mensaje
FROM
	mensaje mensaje;

