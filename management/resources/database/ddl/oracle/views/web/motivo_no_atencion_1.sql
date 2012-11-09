/**/
exec xsp.dropone('view','consulta_motivo_no_atencion_1');
/**/
CREATE VIEW consulta_motivo_no_atencion_1 AS
SELECT
	motivo_no_atencion.numero_motivo_no_atencion AS numero_motivo_no_atencion,
	motivo_no_atencion.codigo_motivo_no_atencion AS codigo_motivo_no_atencion
FROM
	motivo_no_atencion motivo_no_atencion;

