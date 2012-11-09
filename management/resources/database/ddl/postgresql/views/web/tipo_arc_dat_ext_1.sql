/**/
DROP VIEW IF EXISTS consulta_tipo_arc_dat_ext_1;
/**/
CREATE OR REPLACE VIEW consulta_tipo_arc_dat_ext_1 AS
SELECT
	tipo_arc_dat_ext.numero_tipo_arc_dat_ext AS numero_tipo_arc_dat_ext,
	tipo_arc_dat_ext.codigo_tipo_arc_dat_ext AS codigo_tipo_arc_dat_ext
FROM
	tipo_arc_dat_ext tipo_arc_dat_ext;

