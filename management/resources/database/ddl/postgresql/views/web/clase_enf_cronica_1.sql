/**/
DROP VIEW IF EXISTS consulta_clase_enf_cronica_1;
/**/
CREATE OR REPLACE VIEW consulta_clase_enf_cronica_1 AS
SELECT
	clase_enf_cronica.numero_clase_enf_cronica AS numero_clase_enf_cronica,
	clase_enf_cronica.codigo_clase_enf_cronica AS codigo_clase_enf_cronica
FROM
	clase_enf_cronica clase_enf_cronica;

