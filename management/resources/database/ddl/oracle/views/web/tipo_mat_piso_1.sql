/**/
exec xsp.dropone('view','consulta_tipo_mat_piso_1');
/**/
CREATE VIEW consulta_tipo_mat_piso_1 AS
SELECT
	tipo_mat_piso.numero_tipo_mat_piso AS numero_tipo_mat_piso,
	tipo_mat_piso.codigo_tipo_mat_piso AS codigo_tipo_mat_piso
FROM
	tipo_mat_piso tipo_mat_piso;

