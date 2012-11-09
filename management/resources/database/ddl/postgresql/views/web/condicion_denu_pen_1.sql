/**/
DROP VIEW IF EXISTS consulta_condicion_denu_pen_1;
/**/
CREATE OR REPLACE VIEW consulta_condicion_denu_pen_1 AS
SELECT
	condicion_denu_pen.numero_condicion_denu_pen AS numero_condicion_denu_pen,
	condicion_denu_pen.codigo_condicion_denu_pen AS codigo_condicion_denu_pen
FROM
	condicion_denu_pen condicion_denu_pen;

