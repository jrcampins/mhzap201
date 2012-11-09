/**/
DROP VIEW IF EXISTS consulta_tipo_combustible_1;
/**/
CREATE OR REPLACE VIEW consulta_tipo_combustible_1 AS
SELECT
	tipo_combustible.numero_tipo_combustible AS numero_tipo_combustible,
	tipo_combustible.codigo_tipo_combustible AS codigo_tipo_combustible
FROM
	tipo_combustible tipo_combustible;

