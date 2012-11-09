/**/
DROP VIEW IF EXISTS consulta_tipo_persona_hogar_1;
/**/
CREATE OR REPLACE VIEW consulta_tipo_persona_hogar_1 AS
SELECT
	tipo_persona_hogar.numero_tipo_persona_hogar AS numero_tipo_persona_hogar,
	tipo_persona_hogar.codigo_tipo_persona_hogar AS codigo_tipo_persona_hogar
FROM
	tipo_persona_hogar tipo_persona_hogar;

