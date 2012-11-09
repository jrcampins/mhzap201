/**/
DROP VIEW IF EXISTS consulta_causa_den_reco_pen_1;
/**/
CREATE OR REPLACE VIEW consulta_causa_den_reco_pen_1 AS
SELECT
	causa_den_reco_pen.numero_causa_den_reco_pen AS numero_causa_den_reco_pen,
	causa_den_reco_pen.codigo_causa_den_reco_pen AS codigo_causa_den_reco_pen
FROM
	causa_den_reco_pen causa_den_reco_pen;

