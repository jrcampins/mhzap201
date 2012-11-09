/**/
exec xsp.dropone('view','consulta_tipo_mat_techo_1');
/**/
CREATE VIEW consulta_tipo_mat_techo_1 AS
SELECT
	tipo_mat_techo.numero_tipo_mat_techo AS numero_tipo_mat_techo,
	tipo_mat_techo.codigo_tipo_mat_techo AS codigo_tipo_mat_techo
FROM
	tipo_mat_techo tipo_mat_techo;

