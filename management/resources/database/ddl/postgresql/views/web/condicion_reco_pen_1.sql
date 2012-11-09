/**/
DROP VIEW IF EXISTS consulta_condicion_reco_pen_1;
/**/
CREATE OR REPLACE VIEW consulta_condicion_reco_pen_1 AS
SELECT
	condicion_reco_pen.numero_condicion_reco_pen AS numero_condicion_reco_pen,
	condicion_reco_pen.codigo_condicion_reco_pen AS codigo_condicion_reco_pen
FROM
	condicion_reco_pen condicion_reco_pen;

