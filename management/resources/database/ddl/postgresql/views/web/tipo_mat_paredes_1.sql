/**/
DROP VIEW IF EXISTS consulta_tipo_mat_paredes_1;
/**/
CREATE OR REPLACE VIEW consulta_tipo_mat_paredes_1 AS
SELECT
	tipo_mat_paredes.numero_tipo_mat_paredes AS numero_tipo_mat_paredes,
	tipo_mat_paredes.codigo_tipo_mat_paredes AS codigo_tipo_mat_paredes
FROM
	tipo_mat_paredes tipo_mat_paredes;

