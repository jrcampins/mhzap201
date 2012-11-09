/**/
exec xsp.dropone('view','consulta_tipo_pieza_bano_1');
/**/
CREATE VIEW consulta_tipo_pieza_bano_1 AS
SELECT
	tipo_pieza_bano.numero_tipo_pieza_bano AS numero_tipo_pieza_bano,
	tipo_pieza_bano.codigo_tipo_pieza_bano AS codigo_tipo_pieza_bano
FROM
	tipo_pieza_bano tipo_pieza_bano;

