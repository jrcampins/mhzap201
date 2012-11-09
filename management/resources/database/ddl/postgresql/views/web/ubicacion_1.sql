/**/
DROP VIEW IF EXISTS consulta_ubicacion_1;
/**/
CREATE OR REPLACE VIEW consulta_ubicacion_1 AS
SELECT
	ubicacion.id_ubicacion AS id_ubicacion,
	ubicacion.version_ubicacion AS version_ubicacion,
	ubicacion.codigo_ubicacion AS codigo_ubicacion,
	ubicacion.nombre_ubicacion AS nombre_ubicacion,
	ubicacion.id_ubicacion_superior AS id_ubicacion_superior,
		ubicacion_1x1.codigo_ubicacion AS codigo_ubicacion_1x1y3,
		ubicacion_1x1.nombre_ubicacion AS nombre_ubicacion_1x1y4,
		ubicacion_1x1.id_ubicacion_superior AS id_ubicacion_superior_1x1y5,
		ubicacion_1x1.numero_tipo_nodo AS numero_tipo_nodo_1x1y6,
		ubicacion_1x1.numero_nivel_ubicacion AS numero_nivel_ubicacion_1x1y7,
		ubicacion_1x1.secuencia_ubicacion AS secuencia_ubicacion_1x1y8,
		ubicacion_1x1.clave_ubicacion AS clave_ubicacion_1x1y9,
		ubicacion_1x1.numero_tipo_area AS numero_tipo_area_1x1y10,
	ubicacion.numero_tipo_nodo AS numero_tipo_nodo,
		tipo_nodo_1x2.codigo_tipo_nodo AS codigo_tipo_nodo_1x2y2,
	ubicacion.numero_nivel_ubicacion AS numero_nivel_ubicacion,
		nivel_ubicacion_1x3.codigo_nivel_ubicacion AS codigo_nivel_ubicacion_1x3y2,
		nivel_ubicacion_1x3.digitos_nivel_ubicacion AS digitos_nivel_ubicacion_1x3y3,
	ubicacion.secuencia_ubicacion AS secuencia_ubicacion,
	ubicacion.clave_ubicacion AS clave_ubicacion,
	ubicacion.numero_tipo_area AS numero_tipo_area,
		tipo_area_1x4.codigo_tipo_area AS codigo_tipo_area_1x4y2
FROM
	ubicacion ubicacion
	LEFT OUTER JOIN ubicacion ubicacion_1x1 ON ubicacion_1x1.id_ubicacion = ubicacion.id_ubicacion_superior
	LEFT OUTER JOIN tipo_nodo tipo_nodo_1x2 ON tipo_nodo_1x2.numero_tipo_nodo = ubicacion.numero_tipo_nodo
	LEFT OUTER JOIN nivel_ubicacion nivel_ubicacion_1x3 ON nivel_ubicacion_1x3.numero_nivel_ubicacion = ubicacion.numero_nivel_ubicacion
	LEFT OUTER JOIN tipo_area tipo_area_1x4 ON tipo_area_1x4.numero_tipo_area = ubicacion.numero_tipo_area;

