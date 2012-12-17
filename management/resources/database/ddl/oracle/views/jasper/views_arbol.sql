create or replace view ubicacion_arbol_2_nivel as
select  ubicacion.id_ubicacion as id_ubicacion, 
	ubicacion. codigo_ubicacion as codigo_ubicacion, 
	ubicacion.nombre_ubicacion as nombre_ubicacion, 
	ubicacion_1x4.id_ubicacion as id_ubicacion_superior,
        ubicacion_1x4.codigo_ubicacion as codigo_ubicacion_superior, 
        ubicacion_1x4.nombre_ubicacion as nombre_ubicacion_superior 
from ubicacion 
left outer join ubicacion ubicacion_1x4 on ubicacion.id_ubicacion_superior=ubicacion_1x4.id_ubicacion
order by codigo_ubicacion;

create or replace view ubicacion_arbol_1_nivel as
select  ubicacion.id_ubicacion as id_ubicacion, 
	ubicacion. codigo_ubicacion as codigo_ubicacion, 
	ubicacion.nombre_ubicacion as nombre_ubicacion, 
	ubicacion_1x4.id_ubicacion as id_ubicacion_superior,
        ubicacion_1x4.codigo_ubicacion as codigo_ubicacion_superior, 
        ubicacion_1x4.nombre_ubicacion as nombre_ubicacion_superior 
from ubicacion 
left outer join ubicacion ubicacion_1x4 on ubicacion.id_ubicacion_superior=ubicacion_1x4.id_ubicacion
where ubicacion_1x4.id_ubicacion_superior is null
order by codigo_ubicacion;