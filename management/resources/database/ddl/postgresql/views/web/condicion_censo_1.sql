/**/
DROP VIEW IF EXISTS consulta_condicion_censo_1;
/**/
CREATE OR REPLACE VIEW consulta_condicion_censo_1 AS
SELECT
	condicion_censo.numero_condicion_censo AS numero_condicion_censo,
	condicion_censo.codigo_condicion_censo AS codigo_condicion_censo
FROM
	condicion_censo condicion_censo;

