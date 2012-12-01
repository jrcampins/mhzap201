USE MHZMD201
GO
select 'call "%~f1" ' + codigo_clase_recurso
from clase_recurso
where numero_tipo_clase_recurso=1 and (numero_tipo_recurso<=12 or id_clase_recurso<20000)
/*
where numero_tipo_clase_recurso=1
and numero_tipo_recurso<=12
and codigo_clase_recurso not in('parametro_general')
or (codigo_clase_recurso in('grupo_proceso', 'opcion_menu_plus'))
*/
order by 1
GO
