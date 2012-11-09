USE MHZMD201
select len(codigo_clase_objeto),  codigo_clase_objeto  from clase_objeto  where len(codigo_clase_objeto)  > 25 order by 1 DESC,2
select len(codigo_seccion_clase), codigo_seccion_clase from seccion_clase where len(codigo_seccion_clase) > 25 order by 1 DESC,2
select len(codigo_propiedad),     codigo_propiedad     from propiedad     where len(codigo_propiedad)     > 30 order by 1 DESC,2
