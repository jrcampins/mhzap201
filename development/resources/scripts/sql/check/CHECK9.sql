USE MHZMD201
-- numero_propiedad_clase

-- select codigo_clase_objeto,codigo_seccion_clase,numero_propiedad_clase,count(*) from vista_propiedad_clase_3
-- --where (es_seccion_multiple=0 and es_propiedad_multiple=0)
-- group by codigo_clase_objeto,codigo_seccion_clase,numero_propiedad_clase
-- having count(*)>1
-- order by 1,2

-- select codigo_clase_objeto,codigo_propiedad,count(*) from vista_propiedad_clase_3
-- --where (es_seccion_multiple=0 and es_propiedad_multiple=0)
-- group by codigo_clase_objeto,codigo_propiedad
-- having count(*)>1
-- order by 1,2

select codigo_clase_objeto, codigo_propiedad, codigo_seccion_clase
from vista_propiedad_clase_3 vpo31
where exists
(
select	codigo_clase_objeto,codigo_propiedad,count(*) from vista_propiedad_clase_3 vpo32
where	vpo32.codigo_clase_objeto = vpo31.codigo_clase_objeto
and		vpo32.codigo_propiedad    = vpo31.codigo_propiedad
group by codigo_clase_objeto,codigo_propiedad
having count(*)>1
)
order by 1,2,3
