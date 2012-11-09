/**/
exec xsp.dropone('view','consulta_paquete_1');
/**/
CREATE VIEW consulta_paquete_1 AS
SELECT
	paquete.id_paquete AS id_paquete,
	paquete.version_paquete AS version_paquete,
	paquete.codigo_paquete AS codigo_paquete
FROM
	paquete paquete;

