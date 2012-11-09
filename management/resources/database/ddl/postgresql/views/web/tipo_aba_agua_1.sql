/**/
DROP VIEW IF EXISTS consulta_tipo_aba_agua_1;
/**/
CREATE OR REPLACE VIEW consulta_tipo_aba_agua_1 AS
SELECT
	tipo_aba_agua.numero_tipo_aba_agua AS numero_tipo_aba_agua,
	tipo_aba_agua.codigo_tipo_aba_agua AS codigo_tipo_aba_agua
FROM
	tipo_aba_agua tipo_aba_agua;

