--informe_pension_denegada_persona_no_elegible
create or replace view informe_pen_den_per_no_ele as
select  persona.codigo_persona as cedula,
        persona.nombre_persona as nombre_persona,
        date_part('year',age(persona.fecha_nacimiento)) as edad,
	ubicacion_1x4.nombre_ubicacion as departamento,
	ubicacion_1x5.nombre_ubicacion as distrito,
	ubicacion_1x7.nombre_ubicacion as barrio,
        persona.direccion as direccion,
        denegacion.codigo_causa_den_pension as causa
from
    persona persona
    left outer join ubicacion ubicacion_1x4 on ubicacion_1x4.id_ubicacion = persona.id_departamento
    left outer join  ubicacion ubicacion_1x5 on ubicacion_1x5.id_ubicacion = persona.id_distrito
    left outer join ubicacion ubicacion_1x7 on ubicacion_1x7.id_ubicacion = persona.id_barrio
    left outer join causa_den_pension denegacion on denegacion.numero_causa_den_pension = persona.numero_causa_den_pension 
where persona.numero_causa_den_pension >=20 and persona.numero_causa_den_pension<=29;
