USE MHZMD201
GO

/*
select * from parametro where nombre_parametro like'%[ ]___[ ]%' or nombre_parametro like'___[ ]%' or nombre_parametro like'%[ ]___' order by nombre_parametro
*/

select 'ADD'  as [action], tabname
from xdbScriptTables
where colid=1 and tabname not in (select codigo_clase_recurso from clase_recurso) and tabname<>'dual' and tabname not like 'xdb%'
union
select 'DELETE' as [action], codigo_clase_recurso as tabname
from clase_recurso
where numero_tipo_clase_recurso<>2 and codigo_clase_recurso not in (select tabname from xdbScriptTables where colid=1)
order by 1,2
--
select firstname as 'xdb101 not in clase_recurso'
from xdb101 
where firstname not in (select codigo_clase_recurso from clase_recurso where id_clase_recurso>=20000)
order by 1
--
-- select codigo_clase_recurso as 'clase_recurso not in xdb101'
-- from clase_recurso 
-- where codigo_clase_recurso not in (select firstname from xdb101) and id_clase_recurso>=30000
-- order by 1
--
select firstname as tabname, tabid as 'id out of range'
from xdb101 inner join clase_recurso on codigo_clase_recurso = firstname
where tabid not between 10000*id_clase_recurso and 10000*id_clase_recurso+9999
order by 1
--
select x2.tabid,firstname,lastname,colid,colname as 'parámetro sin columna',paramtype,paramdefault,refname
from xdb101 x1 inner join xdb102 x2 ON x2.tabid=x1.tabid
where colname not in (select codigo_parametro from parametro)
order by 1,2
--
select x2.tabid,firstname,lastname,colid,colname as 'parámetro sin columna',paramtype,paramdefault,refname
from xdb101 x1 inner join xdb102 x2 ON x2.tabid=x1.tabid
where colname not in (select colname from xdbScriptTables join clase_recurso on codigo_clase_recurso = tabname where id_clase_recurso>=0)
and colname not in (select colname + '_desde' from xdbScriptTables join clase_recurso on codigo_clase_recurso = tabname where id_clase_recurso>=0)
and colname not in (select colname + '_hasta' from xdbScriptTables join clase_recurso on codigo_clase_recurso = tabname where id_clase_recurso>=0)
order by 1,2
--
--
-- select * from clase_recurso where numero_tipo_recurso=13 and id_aplicacion_web<>41300 order by 1
-- select * from clase_recurso where numero_tipo_recurso<>13 and id_aplicacion_web=41300 order by 1
--
-- select codigo_clase_recurso, numero_tipo_recurso, count(*) as columnas
-- from clase_recurso t1
-- inner join clase_recurso_par t2 on t2.id_clase_recurso=t1.id_clase_recurso
-- where t1.id_clase_recurso>0
-- and numero_tipo_recurso>0000
-- and t1.id_clase_recurso in (select id_clase_recurso from clase_recurso_sec)
-- group by codigo_clase_recurso, numero_tipo_recurso
-- having count(*)<=10
-- order by codigo_clase_recurso, numero_tipo_recurso
-- 
-- select codigo_clase_recurso, numero_tipo_recurso, count(*) as columnas
-- from clase_recurso t1
-- inner join clase_recurso_par t2 on t2.id_clase_recurso=t1.id_clase_recurso
-- where t1.id_clase_recurso>30000
-- and numero_tipo_recurso=21
-- and t1.id_clase_recurso NOT in (select id_clase_recurso from clase_recurso_sec)
-- group by codigo_clase_recurso, numero_tipo_recurso
-- having count(*)>=10
-- order by codigo_clase_recurso, numero_tipo_recurso
--
--
-- filas de clase_recurso_par cuyo id no corresponde al id de la fila de clase_recurso
--
select * from clase_recurso_par
where id_clase_recurso_par NOT BETWEEN 10000*id_clase_recurso AND 10000*id_clase_recurso+9999
ORDER BY 1
--
-- filas de clase_recurso_par cuya seccion no corresponde al id de la fila de clase_recurso
--
select * from clase_recurso_par
where id_clase_recurso_sec NOT BETWEEN 10000*id_clase_recurso AND 10000*id_clase_recurso+9999
ORDER BY 1
--
-- filas de clase_recurso_sec cuyo id no corresponde al id de la fila de clase_recurso
--
select * from clase_recurso_sec
where id_clase_recurso_sec NOT BETWEEN 10000*id_clase_recurso AND 10000*id_clase_recurso+9999
ORDER BY 1
--
-- filas de filtro_cla_rec_fun cuyo id no corresponde al id de la fila de funcion
--
select * from filtro_cla_rec_fun
where id_filtro_cla_rec_fun NOT BETWEEN 100*id_funcion AND 100*id_funcion+99
ORDER BY 1
--
-- filas de filtro_cla_rec_fun cuyo id no corresponde al id de la fila de clase_recurso_par
--
select * from filtro_cla_rec_fun inner join clase_recurso_par on id_clase_recurso_par_columna=id_clase_recurso_par
where id_filtro_cla_rec_fun NOT BETWEEN 1000000*id_clase_recurso AND 1000000*id_clase_recurso+999999
ORDER BY 1
--
-- filas de filtro_cla_rec_par cuyo id no corresponde al id de la fila de clase_recurso_par
--
select * from filtro_cla_rec_par
where id_filtro_cla_rec_par NOT BETWEEN 100*id_clase_recurso_par AND 100*id_clase_recurso_par+99
ORDER BY 1
--
-- filas de filtro_cla_rec_sec cuyo id no corresponde al id de la fila de clase_recurso_sec
--
select * from filtro_cla_rec_sec
where id_filtro_cla_rec_sec NOT BETWEEN 100*id_clase_recurso_sec AND 100*id_clase_recurso_sec+99
ORDER BY 1
--
-- filas de filtro_cla_rec_sec cuyo id no corresponde al id de la fila de clase_recurso_par
--
select * from filtro_cla_rec_sec inner join clase_recurso_par on id_clase_recurso_par_columna=id_clase_recurso_par
where id_filtro_cla_rec_sec NOT BETWEEN 1000000*id_clase_recurso AND 1000000*id_clase_recurso+999999
ORDER BY 1
--
-- filas de filtro_cla_rec_vin cuyo id no corresponde al id de la fila de clase_recurso_par
--
select * from filtro_cla_rec_vin
where id_filtro_cla_rec_vin NOT BETWEEN 100*id_clase_recurso_par AND 100*id_clase_recurso_par+99
ORDER BY 1
--
-- filas de clase_recurso_par que sin la columna correspondiente
--
select cr.codigo_clase_recurso, p.codigo_parametro, tabname, colid, colname, crp.*
from clase_recurso_par crp 
inner join clase_recurso cr on cr.id_clase_recurso=crp.id_clase_recurso and cr.numero_tipo_clase_recurso=1
inner join parametro p on p.id_parametro=crp.id_parametro
left outer join xdbScriptTables x on x.tabname=cr.codigo_clase_recurso and x.colname=p.codigo_parametro
where colname is null
order by tabname, colid
--
-- filas de clase_recurso_par que no están en la misma posición que la columna correspondiente
--
select cr.codigo_clase_recurso, p.codigo_parametro, tabname, colid, colname, crp.*
from clase_recurso_par crp 
inner join clase_recurso cr on cr.id_clase_recurso=crp.id_clase_recurso and cr.numero_tipo_clase_recurso=1
inner join parametro p on p.id_parametro=crp.id_parametro
left outer join xdbScriptTables x on x.tabname=cr.codigo_clase_recurso and x.colname=p.codigo_parametro
where crp.id_clase_recurso_par <> 10000*crp.id_clase_recurso+100*colid
order by tabname, colid
--
-- filas de clase_recurso_par sin sección
--
select cr.codigo_clase_recurso, p.codigo_parametro, crm.codigo_clase_recurso
from (clase_recurso cr left join clase_recurso crm on crm.id_clase_recurso=cr.id_clase_recurso_base)
inner join clase_recurso_par crp on crp.id_clase_recurso=cr.id_clase_recurso and id_clase_recurso_sec is null
inner join parametro p on p.id_parametro=crp.id_parametro
where cr.id_clase_recurso in (select id_clase_recurso from clase_recurso_sec)
and crp.es_parametro_maestro=0
and p.codigo_parametro<>'id_'+cr.codigo_clase_recurso
and p.codigo_parametro<>'id_clase_'+cr.codigo_clase_recurso
and p.codigo_parametro<>'version_'+cr.codigo_clase_recurso
and p.codigo_parametro<>'codigo_'+cr.codigo_clase_recurso
and p.codigo_parametro<>'numero_'+cr.codigo_clase_recurso
and p.codigo_parametro<>'nombre_'+cr.codigo_clase_recurso
and(crm.codigo_clase_recurso is null or (
    p.codigo_parametro<>'id_'+crm.codigo_clase_recurso
and p.codigo_parametro<>'id_clase_'+crm.codigo_clase_recurso
and p.codigo_parametro<>'version_'+crm.codigo_clase_recurso
and p.codigo_parametro<>'codigo_'+crm.codigo_clase_recurso
and p.codigo_parametro<>'numero_'+crm.codigo_clase_recurso
and p.codigo_parametro<>'nombre_'+crm.codigo_clase_recurso
))
order by 1,2
--
-- filas de clase_recurso sin maestro
--
select cr.codigo_clase_recurso as detalle, crm.codigo_clase_recurso as maestro, p.codigo_parametro as columna
from clase_recurso cr
inner join clase_recurso crm on crm.id_clase_recurso=cr.id_clase_recurso_maestro
left join (clase_recurso_par crp inner join parametro p on p.id_parametro=crp.id_parametro)
on crp.id_clase_recurso=cr.id_clase_recurso and crp.id_clase_recurso_valor=crm.id_clase_recurso and crp.es_parametro_maestro=1
where cr.es_clase_recurso_con_arbol=0 and codigo_parametro IS NULL
order by 1
--
-- filas de clase_recurso sin segmento
--
select cr.codigo_clase_recurso as detalle, crm.codigo_clase_recurso as segmento, p.codigo_parametro as columna
from clase_recurso cr
inner join clase_recurso crm on crm.id_clase_recurso=cr.id_clase_recurso_segmento
left join (clase_recurso_par crp inner join parametro p on p.id_parametro=crp.id_parametro)
on crp.id_clase_recurso=cr.id_clase_recurso and crp.id_clase_recurso_valor=crm.id_clase_recurso and crp.es_parametro_segmento=1
where codigo_parametro IS NULL
order by 1
