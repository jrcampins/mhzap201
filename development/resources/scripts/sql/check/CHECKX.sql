USE MHZMD201
-- opciones de menú con url con error
select id_opcion_menu, nombre_opcion_menu, 
substring(url_opcion_menu, charindex('faces/', url_opcion_menu) + 6, charindex('.jsp', url_opcion_menu) - charindex('faces/', url_opcion_menu) - 6) as url_pagina,
substring(url_opcion_menu, charindex('mhzap201-web', url_opcion_menu), charindex('/faces/', url_opcion_menu) - charindex('mhzap201-web', url_opcion_menu)) as url_aplicacion,
aplicacion.codigo_aplicacion, url_opcion_menu, es_opcion_menu_inactiva
from opcion_menu left outer join pagina inner join aplicacion on pagina.id_aplicacion = aplicacion.id_aplicacion 
on codigo_pagina = substring(url_opcion_menu, charindex('faces/', url_opcion_menu) + 6, charindex('.jsp', url_opcion_menu) - charindex('faces/', url_opcion_menu) - 6)
where url_opcion_menu like'%mhzap201-web%' -- url_opcion_menu is not null --
and (aplicacion.codigo_aplicacion is null or aplicacion.codigo_aplicacion<>substring(url_opcion_menu, charindex('mhzap201-web', url_opcion_menu), charindex('/faces/', url_opcion_menu) - charindex('mhzap201-web', url_opcion_menu)))
and url_opcion_menu not like'redirect.html?url=http://localhost:8080/mhzap201-web-recurso%/faces/Objeto1.jsp'
order by 5,4,3

/*
EXEC xdbTablesReload
EXEC xdbViewsReload
*/
/*
select * from clase_recurso
where id_clase_recurso>20000 and numero_tipo_recurso=13
order by 3
*/
/*
-- tablas de configuracion manual sin columna codigo y con dependientes (2)
select refclass.numero_tipo_recurso, refname, tabname
from xdbScriptForeignKeys, clase_recurso tabclass, clase_recurso refclass
where tabname=tabclass.codigo_clase_recurso -- and tabclass.numero_tipo_recurso<>22
and refname=refclass.codigo_clase_recurso 
and refclass.numero_tipo_recurso=13 and refclass.id_clase_recurso>=20000
and not exists (select 1 from xdbScriptTables where colname='codigo_'+refname) 
order by 1, 2, 3
*/
/*
select tabname, refname, refclass.numero_tipo_recurso
from xdbScriptForeignKeys, clase_recurso tabclass, clase_recurso refclass
where tabname=tabclass.codigo_clase_recurso 
and tabclass.numero_tipo_recurso=13
and refname=refclass.codigo_clase_recurso 
and refclass.numero_tipo_recurso<>12
and refclass.id_clase_recurso>=20000
order by 3,1,2
*/
/*
-- tablas con proyecto y sin claves foraneas (10)
select numero_tipo_recurso, codigo_clase_recurso, codigo_aplicacion 
from clase_recurso inner join aplicacion on id_aplicacion=id_clase_recurso
where id_clase_recurso>20000 --and numero_tipo_recurso=13
and codigo_clase_recurso not in (
select tabname 
from clase_recurso inner join xdbScriptForeignKeys on codigo_clase_recurso=refname 
where refname<>tabname
--and numero_tipo_recurso=21
)
order by 1,2
*/
/*
-- referencias dentro del mismo proyecto (6)
select apl1.codigo_aplicacion, pag1.codigo_pagina, tabname, apl2.codigo_aplicacion, pag2.codigo_pagina, refname
from xdbScriptForeignKeys
inner join clase_recurso cla1 on tabname=cla1.codigo_clase_recurso 
inner join dominio dom1 on tabname=dom1.codigo_dominio
inner join pagina pag1 on pag1.id_dominio=dom1.id_dominio
inner join aplicacion apl1 on apl1.id_aplicacion=pag1.id_aplicacion
inner join clase_recurso cla2 on refname=cla2.codigo_clase_recurso 
inner join dominio dom2 on refname=dom2.codigo_dominio
inner join pagina pag2 on pag2.id_dominio=dom2.id_dominio
inner join aplicacion apl2 on apl2.id_aplicacion=pag2.id_aplicacion
where apl1.codigo_aplicacion=apl2.codigo_aplicacion
and pag1.id_dominio<>pag2.id_dominio
and pag1.id_dominio_maestro<>pag2.id_dominio
and pag2.id_dominio_maestro is null
order by 1,2,3,4,5,6
*/
/*
-- aplicaciones de clases de recurso sin dependientes (matricula, nota)
select aplicacion.codigo_aplicacion as 'aplicación de clase de recurso sin dependientes'
from aplicacion inner join clase_recurso on clase_recurso.id_clase_recurso=aplicacion.id_aplicacion
where id_clase_recurso>20000 and clase_recurso.codigo_clase_recurso not in (select refname from xdbScriptForeignKeys)
order by 1
*/
/*
-- clases de recurso sin página (5*14)
select codigo_clase_recurso as 'clase de recurso sin página', numero_tipo_recurso
from clase_recurso inner join dominio on dominio.id_clase_recurso=clase_recurso.id_clase_recurso 
where clase_recurso.id_clase_recurso>=20000 and not exists (select 1 from pagina where id_dominio=dominio.id_dominio)
order by numero_tipo_recurso, codigo_clase_recurso
*/
/*
-- select count(*) as count_clase_recurso from clase_recurso
-- select count(*) as count_clase_recurso_independiente from clase_recurso where es_clase_recurso_independiente=1
-- select count(*) as count_aplicacion from aplicacion
-- select count(*) as count_aplicacion_clase_recurso from clase_recurso inner join aplicacion on id_aplicacion=id_clase_recurso
-- select count(*) as count_aplicacion_clase_recurso_independiente from clase_recurso inner join aplicacion on id_aplicacion=id_clase_recurso where es_clase_recurso_independiente=1

-- select * from aplicacion where id_aplicacion not in (select id_clase_recurso from clase_recurso) order by 1
-- select * from clase_recurso where numero_tipo_recurso not in(12, 14) and es_clase_recurso_independiente=1 and id_clase_recurso not in (select id_aplicacion from aplicacion) order by 1
-- select numero_tipo_recurso, codigo_clase_recurso from clase_recurso inner join aplicacion on id_aplicacion=id_clase_recurso where codigo_clase_recurso not in (select refname from xdbScriptForeignKeys) order by 1,2
*/
/*
select count(*) as count_clase_recurso_13 
from clase_recurso 
where numero_tipo_recurso=13

select count(*) as count_aplicacion_clase_recurso_13 
from clase_recurso 
inner join aplicacion on id_aplicacion=id_clase_recurso 
where numero_tipo_recurso=13

select count(*) as count_aplicacion_clase_recurso_13_sin_hijos 
from clase_recurso 
inner join aplicacion on id_aplicacion=id_clase_recurso 
where numero_tipo_recurso=13 
and codigo_clase_recurso not in (select refname from xdbScriptForeignKeys)

select count(*) as count_aplicacion_clase_recurso_13_sin_hijos_13 
from clase_recurso 
inner join aplicacion on id_aplicacion=id_clase_recurso 
where numero_tipo_recurso=13 
and codigo_clase_recurso not in (select refname from xdbScriptForeignKeys inner join clase_recurso on tabname=codigo_clase_recurso where numero_tipo_recurso=13)

select count(*) as count_aplicacion_clase_recurso_13_con_hijos_13 
from clase_recurso 
inner join aplicacion on id_aplicacion=id_clase_recurso 
where numero_tipo_recurso=13 
and codigo_clase_recurso in (select refname from xdbScriptForeignKeys inner join clase_recurso on tabname=codigo_clase_recurso where numero_tipo_recurso=13)
*/
/*
select codigo_clase_recurso, pagina.* 
from clase_recurso 
inner join pagina on id_aplicacion=id_clase_recurso 
where numero_tipo_recurso=13
order by 1,2

select pag1.codigo_pagina, pag1.version_pagina, dom1.codigo_dominio, dom2.codigo_dominio, pag2.codigo_pagina
from pagina pag1
inner join dominio dom1 on dom1.id_dominio=pag1.id_dominio
inner join clase_recurso cla1 on cla1.id_clase_recurso=dom1.id_clase_recurso
inner join dominio dom2 on dom2.id_dominio=pag1.id_dominio_maestro
inner join clase_recurso cla2 on cla2.id_clase_recurso=dom2.id_clase_recurso
left outer join pagina pag2 on pag2.id_dominio=pag1.id_dominio and pag2.id_dominio_maestro is null and pag2.numero_tipo_pagina=1
where cla1.numero_tipo_recurso<>13
and cla2.numero_tipo_recurso=13
--and pag2.codigo_pagina is null
order by 1
*/
/*
select 
tabname, refname, ap1.codigo_aplicacion, ap1.id_aplicacion, dbo.xfnClaseRecursoRaiz(tab.id_clase_recurso), ap2.id_aplicacion, ap2.codigo_aplicacion
from xdbScriptForeignKeys
inner join clase_recurso tab on tabname=tab.codigo_clase_recurso left outer join aplicacion ap1 on ap1.id_aplicacion=tab.id_clase_recurso
inner join clase_recurso ref on refname=ref.codigo_clase_recurso left outer join aplicacion ap2 on ap2.id_aplicacion=ref.id_clase_recurso
where tab.numero_tipo_recurso=13 and ref.numero_tipo_recurso=13
and ap2.id_aplicacion is not null
order by ap2.codigo_aplicacion, ap1.codigo_aplicacion

select 
-- tabname, refname
refname, tabname
-- refname, count(*) as refcount
-- distinct refname 
-- count(distinct refname)
from xdbScriptForeignKeys
inner join clase_recurso tab on tabname=tab.codigo_clase_recurso
inner join clase_recurso ref on refname=ref.codigo_clase_recurso
where tab.numero_tipo_recurso=13 and ref.numero_tipo_recurso=13
-- group by refname having count(*) = 1
order by 1,2

select 
refname, tabname
-- distinct refname 
from xdbScriptForeignKeys
inner join clase_recurso tab on tabname=tab.codigo_clase_recurso
inner join clase_recurso ref on refname=ref.codigo_clase_recurso
where tab.numero_tipo_recurso=13 and ref.numero_tipo_recurso=13
--and tab.es_clase_recurso_con_arbol<>1 and ref.es_clase_recurso_con_arbol<>1
and (tab.id_clase_recurso_maestro is null or tab.id_clase_recurso_maestro<>ref.id_clase_recurso)
order by 1,2

select 
refname, tabname
-- distinct refname 
from xdbScriptForeignKeys
inner join clase_recurso tab on tabname=tab.codigo_clase_recurso
inner join clase_recurso ref on refname=ref.codigo_clase_recurso
where tab.numero_tipo_recurso=13 and ref.numero_tipo_recurso=13
--and tab.es_clase_recurso_con_arbol<>1 and ref.es_clase_recurso_con_arbol<>1
and (tab.id_clase_recurso_maestro is null or tab.id_clase_recurso_maestro<>ref.id_clase_recurso)
order by 2,1
*/

-- select version_pagina, count(*) from pagina group by version_pagina order by version_pagina

-- select apl1.codigo_aplicacion, pag1.codigo_pagina, dom1.codigo_dominio, dom2.codigo_dominio
-- from pagina pag1
-- inner join aplicacion apl1 on apl1.id_aplicacion=pag1.id_aplicacion
-- inner join dominio dom1 on dom1.id_dominio=pag1.id_dominio
-- inner join clase_recurso cla1 on cla1.id_clase_recurso=dom1.id_clase_recurso
-- inner join dominio dom2 on dom2.id_dominio=pag1.id_dominio_maestro
-- inner join clase_recurso cla2 on cla2.id_clase_recurso=dom2.id_clase_recurso
-- where cla2.numero_tipo_recurso=13
-- order by 1,2

-- select 
-- -- tabname, refname
-- refname, ref.numero_tipo_recurso, tabname, tab.numero_tipo_recurso
-- -- refname, count(*) as refcount
-- -- distinct refname 
-- -- count(distinct refname)
-- from xdbScriptForeignKeys
-- inner join clase_recurso tab on tabname=tab.codigo_clase_recurso
-- inner join clase_recurso ref on refname=ref.codigo_clase_recurso
-- --where tab.numero_tipo_recurso=13 and ref.numero_tipo_recurso=13
-- where tab.numero_tipo_recurso<>ref.numero_tipo_recurso
-- -- group by refname having count(*) = 1
-- order by 1,2

-- select apl1.id_aplicacion, apl1.codigo_aplicacion, pag1.codigo_pagina, dom1.codigo_dominio, cla1.numero_tipo_recurso, dom2.codigo_dominio, cla2.numero_tipo_recurso, pag2.codigo_pagina
-- from pagina pag1
-- inner join aplicacion apl1 on apl1.id_aplicacion=pag1.id_aplicacion
-- inner join dominio dom1 on dom1.id_dominio=pag1.id_dominio
-- inner join clase_recurso cla1 on cla1.id_clase_recurso=dom1.id_clase_recurso
-- inner join dominio dom2 on dom2.id_dominio=pag1.id_dominio_maestro
-- inner join clase_recurso cla2 on cla2.id_clase_recurso=dom2.id_clase_recurso
-- left outer join pagina pag2 on pag2.id_dominio=pag1.id_dominio and pag2.id_dominio_maestro is null and pag2.numero_tipo_pagina=1
-- where cla1.numero_tipo_recurso<>cla2.numero_tipo_recurso
-- --and pag2.codigo_pagina is null
-- order by 1,3

-- -- clases de recurso 14 y 22 con página
-- select codigo_clase_recurso, numero_tipo_recurso, codigo_pagina 
-- from clase_recurso 
-- inner join dominio on dominio.id_clase_recurso=clase_recurso.id_clase_recurso 
-- inner join pagina on pagina.id_dominio=dominio.id_dominio
-- where clase_recurso.id_clase_recurso>=20000 and numero_tipo_recurso in(14,22)
-- order by 2,1
