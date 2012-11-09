/**/
DROP VIEW IF EXISTS consulta_sexo_persona_1;
/**/
CREATE OR REPLACE VIEW consulta_sexo_persona_1 AS
SELECT
	sexo_persona.numero_sexo_persona AS numero_sexo_persona,
	sexo_persona.codigo_sexo_persona AS codigo_sexo_persona
FROM
	sexo_persona sexo_persona;

