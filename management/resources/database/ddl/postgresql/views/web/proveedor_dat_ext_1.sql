/**/
DROP VIEW IF EXISTS consulta_proveedor_dat_ext_1;
/**/
CREATE OR REPLACE VIEW consulta_proveedor_dat_ext_1 AS
SELECT
	proveedor_dat_ext.id_proveedor_dat_ext AS id_proveedor_dat_ext,
	proveedor_dat_ext.version_proveedor_dat_ext AS version_proveedor_dat_ext,
	proveedor_dat_ext.codigo_proveedor_dat_ext AS codigo_proveedor_dat_ext,
	proveedor_dat_ext.nombre_proveedor_dat_ext AS nombre_proveedor_dat_ext
FROM
	proveedor_dat_ext proveedor_dat_ext;

