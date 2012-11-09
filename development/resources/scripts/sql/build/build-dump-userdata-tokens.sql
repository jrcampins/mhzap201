USE MHZMD201
GO
/*
W:\mhzap201\source\management\resources\scripts\windows\postgresql\dump-table-tokens.txt
*/
-- select 'call "%BAT%" dual'
-- union
select codigo_clase_recurso
from clase_recurso
where (numero_tipo_clase_recurso=1 and numero_tipo_recurso=21 and id_clase_recurso>=20000)
/*
where numero_tipo_clase_recurso=1
and numero_tipo_recurso>12
and codigo_clase_recurso not in ('grupo_proceso', 'opcion_menu_plus')
or (codigo_clase_recurso in('parametro_general'))
*/
order by 1
GO
