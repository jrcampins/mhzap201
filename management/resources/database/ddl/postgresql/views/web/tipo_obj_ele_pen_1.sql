/**/
DROP VIEW IF EXISTS consulta_tipo_obj_ele_pen_1;
/**/
CREATE OR REPLACE VIEW consulta_tipo_obj_ele_pen_1 AS
SELECT
	tipo_obj_ele_pen.numero_tipo_obj_ele_pen AS numero_tipo_obj_ele_pen,
	tipo_obj_ele_pen.codigo_tipo_obj_ele_pen AS codigo_tipo_obj_ele_pen
FROM
	tipo_obj_ele_pen tipo_obj_ele_pen;

