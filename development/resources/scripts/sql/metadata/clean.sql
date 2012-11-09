USE MHZMD201
GO
EXEC xdbTablesReload
GO
EXEC xdbViewsReload
GO
/*
select codigo_clase_recurso from clase_recurso where codigo_clase_recurso<>'sesion' and codigo_clase_recurso not in (select tabname from xdbScriptTables where colid=1) order by 1
select tabname from xdbScriptTables where colid=1 and tabname not in (select codigo_clase_recurso from clase_recurso) and tabname<>'dual' and tabname not like'%$%' and tabname not like 'xdb%' order by 1
*/
/*
UPDATE	dual SET id_dual=0
--EXEC xisClaseRecurso30K
--EXEC xisParametroSDK
UPDATE	dual SET id_dual=1
select 'OK'

EXEC xdbMetadataClean
EXEC xdbMetadataBuild
select 'OK'
*/

/*
-- update clase_recurso set nombre_clase_recurso='***'+nombre_clase_recurso+'***', limite_filas_consulta=-1, limite_filas_informe=-1
-- select * from clase_recurso
where codigo_clase_recurso not in (select name from sysobjects where xtype='U')
*/

/*
update clase_recurso set id_pagina_seleccion=null where codigo_clase_recurso not in (select name from sysobjects where xtype='U')
update clase_recurso set id_pagina_detalle=null where codigo_clase_recurso not in (select name from sysobjects where xtype='U')
update clase_recurso set id_funcion_seleccion=null where codigo_clase_recurso not in (select name from sysobjects where xtype='U')
update dominio set id_funcion_seleccion=null where id_clase_recurso
	in (select id_clase_recurso from clase_recurso where codigo_clase_recurso not in (select name from sysobjects where xtype='U'))
update funcion_parametro set id_funcion_referencia=null where id_funcion_referencia
	in (select id_funcion from funcion, dominio where funcion.id_dominio=dominio.id_dominio and dominio.id_clase_recurso
	in (select id_clase_recurso from clase_recurso where codigo_clase_recurso not in (select name from sysobjects where xtype='U')))
update funcion_parametro set id_clase_recurso_valor=null,numero_tipo_valor=11 where id_clase_recurso_valor
	in (select id_clase_recurso from clase_recurso where codigo_clase_recurso not in (select name from sysobjects where xtype='U'))
--
update clase_recurso_par set id_funcion_referencia=null where id_funcion_referencia
	in (select id_funcion from funcion, dominio where funcion.id_dominio=dominio.id_dominio and dominio.id_clase_recurso
	in (select id_clase_recurso from clase_recurso where codigo_clase_recurso not in (select name from sysobjects where xtype='U')))
update clase_recurso_par set id_clase_recurso_valor=null,numero_tipo_valor=11 where id_clase_recurso_valor
	in (select id_clase_recurso from clase_recurso where codigo_clase_recurso not in (select name from sysobjects where xtype='U'))
--
delete from filtro_funcion;
delete from funcion_parametro where id_funcion
	in (select id_funcion from funcion, dominio where funcion.id_dominio=dominio.id_dominio and dominio.id_clase_recurso
	in (select id_clase_recurso from clase_recurso where codigo_clase_recurso not in (select name from sysobjects where xtype='U')))
delete from funcion where id_funcion
	in (select id_funcion from funcion, dominio where funcion.id_dominio=dominio.id_dominio and dominio.id_clase_recurso
	in (select id_clase_recurso from clase_recurso where codigo_clase_recurso not in (select name from sysobjects where xtype='U')))

delete from pagina where id_pagina
	in (select id_pagina from pagina, dominio where pagina.id_dominio=dominio.id_dominio and dominio.id_clase_recurso
	in (select id_clase_recurso from clase_recurso where codigo_clase_recurso not in (select name from sysobjects where xtype='U')))
delete from pagina where id_pagina
	in (select id_pagina from pagina, dominio where pagina.id_dominio_maestro=dominio.id_dominio and dominio.id_clase_recurso
	in (select id_clase_recurso from clase_recurso where codigo_clase_recurso not in (select name from sysobjects where xtype='U')))
delete from dominio where id_clase_recurso
	in (select id_clase_recurso from clase_recurso where codigo_clase_recurso not in (select name from sysobjects where xtype='U'))
delete from clase_recurso where codigo_clase_recurso not in (select name from sysobjects where xtype='U')
*/

/*
select tabname, colname
from xdbScriptTables
left join clase_recurso on codigo_clase_recurso = tabname
where colname not in (select codigo_parametro from parametro)
and (tabname in (select codigo_clase_recurso from clase_recurso where id_clase_recurso < 20000)
or codigo_clase_recurso is null)
order by 1
*/

/*
select *
-- delete
from parametro
where id_parametro>20000
and id_parametro not in (select id_parametro from dominio_parametro)
and id_parametro not in (select id_parametro from funcion_parametro)
and id_parametro not in (select id_parametro from clase_recurso_par)
and codigo_parametro not in (select colname from xdbScriptTables)
--
order by id_parametro
*/
