/**/
DROP VIEW IF EXISTS consulta_condicion_recl_cen_1;
/**/
CREATE OR REPLACE VIEW consulta_condicion_recl_cen_1 AS
SELECT
	condicion_recl_cen.numero_condicion_recl_cen AS numero_condicion_recl_cen,
	condicion_recl_cen.codigo_condicion_recl_cen AS codigo_condicion_recl_cen
FROM
	condicion_recl_cen condicion_recl_cen;

