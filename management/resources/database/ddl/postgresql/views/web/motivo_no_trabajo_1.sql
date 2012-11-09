/**/
DROP VIEW IF EXISTS consulta_motivo_no_trabajo_1;
/**/
CREATE OR REPLACE VIEW consulta_motivo_no_trabajo_1 AS
SELECT
	motivo_no_trabajo.numero_motivo_no_trabajo AS numero_motivo_no_trabajo,
	motivo_no_trabajo.codigo_motivo_no_trabajo AS codigo_motivo_no_trabajo
FROM
	motivo_no_trabajo motivo_no_trabajo;

