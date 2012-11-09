--informe_pension_denegada_persona_no_acreditada
create or replace view informe_pen_den_per_no_acr as
select  persona.id_persona as id_persona,
        persona.codigo_persona as cedula,
        persona.nombre_persona as nombre_persona,
        utils.years_since(persona.fecha_nacimiento) as edad,
        persona.id_departamento AS id_departamento,
		ubicacion_1x4.codigo_ubicacion AS codigo_ubicacion_1x4,
		ubicacion_1x4.nombre_ubicacion AS nombre_ubicacion_1x4,
	persona.id_distrito AS id_distrito,
		ubicacion_1x5.codigo_ubicacion AS codigo_ubicacion_1x5,
		ubicacion_1x5.nombre_ubicacion AS nombre_ubicacion_1x5,
	persona.numero_tipo_area AS numero_tipo_area,
		tipo_area_1x6.codigo_tipo_area AS codigo_tipo_area_1x6,
	persona.id_barrio AS id_barrio,
		ubicacion_1x7.codigo_ubicacion AS codigo_ubicacion_1x7,
		ubicacion_1x7.nombre_ubicacion AS nombre_ubicacion_1x7,
        persona.direccion as direccion,
        persona.indice_calidad_vida as icv
from
    persona persona
    left outer join ubicacion ubicacion_1x4 on ubicacion_1x4.id_ubicacion = persona.id_departamento
    left outer join  ubicacion ubicacion_1x5 on ubicacion_1x5.id_ubicacion = persona.id_distrito
    left outer join tipo_area tipo_area_1x6 on tipo_area_1x6.numero_tipo_area = persona.numero_tipo_area
    left outer join ubicacion ubicacion_1x7 on ubicacion_1x7.id_ubicacion = persona.id_barrio
    left outer join ubicacion ubicacion_1x8 on ubicacion_1x8.id_ubicacion = persona.id_manzana
where persona.es_persona_acreditada_para_pen=0;
