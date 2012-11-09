/**/
DROP VIEW IF EXISTS consulta_tipo_desecho_bas_1;
/**/
CREATE OR REPLACE VIEW consulta_tipo_desecho_bas_1 AS
SELECT
	tipo_desecho_bas.numero_tipo_desecho_bas AS numero_tipo_desecho_bas,
	tipo_desecho_bas.codigo_tipo_desecho_bas AS codigo_tipo_desecho_bas
FROM
	tipo_desecho_bas tipo_desecho_bas;

