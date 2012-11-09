USE MHZMD201
-- update xdbTables set length1=null, length2=null, length3=null, length4=null
-- go
-- 
-- update xdbViews  set length1=null, length2=null, length3=null, length4=null
-- go
-- 
-- update xdbTables set length1=
-- (
-- select sum(length)
-- from xdbJavaDataProviders 
-- where tabname=xdbTables.tabname
-- and tabname <> 'dual' 
-- and tabname not like 'x%' 
-- and tabname not like 'condicion%' 
-- and tabname not like 'opcion%' 
-- and tabname not like 'nivel%' 
-- and tabname not like 'tipo%' 
-- and tabname not like '%plus'
-- and coltype<>167
-- )
-- go
-- 
-- update xdbTables set length2=
-- (
-- select sum(length)
-- from xdbJavaDataProviders 
-- where tabname=xdbTables.tabname
-- and tabname <> 'dual' 
-- and tabname not like 'x%' 
-- and tabname not like 'condicion%' 
-- and tabname not like 'opcion%' 
-- and tabname not like 'nivel%' 
-- and tabname not like 'tipo%' 
-- and tabname not like '%plus'
-- and coltype=167
-- )
-- go
-- 
-- update xdbTables set length3=
-- (
-- select sum(length)
-- from xdbJavaDataProviders 
-- where tabname=xdbTables.tabname
-- and tabname <> 'dual' 
-- and tabname not like 'x%' 
-- and tabname not like 'condicion%' 
-- and tabname not like 'opcion%' 
-- and tabname not like 'nivel%' 
-- and tabname not like 'tipo%' 
-- and tabname not like '%plus'
-- )
-- go
-- 
-- update xdbTables set length4=length1 where length2 is null
-- go
-- 
-- update xdbTables set length4=length1+70*length2/100 where length2 is not null
-- go
-- 
-- 
-- update xdbViews  set length1=
-- (
-- select sum(length)
-- from xdbJavaDataProviders 
-- where tabname=xdbViews.viwname
-- and tabname <> 'dual' 
-- and tabname not like 'x%' 
-- and tabname not like 'condicion%' 
-- and tabname not like 'opcion%' 
-- and tabname not like 'nivel%' 
-- and tabname not like 'tipo%' 
-- and tabname not like '%plus'
-- and coltype<>167
-- )
-- go
-- 
-- update xdbViews  set length2=
-- (
-- select sum(length)
-- from xdbJavaDataProviders 
-- where tabname=xdbViews.viwname
-- and tabname <> 'dual' 
-- and tabname not like 'x%' 
-- and tabname not like 'condicion%' 
-- and tabname not like 'opcion%' 
-- and tabname not like 'nivel%' 
-- and tabname not like 'tipo%' 
-- and tabname not like '%plus'
-- and coltype=167
-- )
-- go
-- 
-- update xdbViews  set length3=
-- (
-- select sum(length)
-- from xdbJavaDataProviders 
-- where tabname=xdbViews.viwname
-- and tabname <> 'dual' 
-- and tabname not like 'x%' 
-- and tabname not like 'condicion%' 
-- and tabname not like 'opcion%' 
-- and tabname not like 'nivel%' 
-- and tabname not like 'tipo%' 
-- and tabname not like '%plus'
-- )
-- go
-- 
-- update xdbViews  set length4=length1 where length2 is null
-- go
-- 
-- update xdbViews  set length4=length1+70*length2/100 where length2 is not null
-- go


select avg(length1) as length1, avg(length2) as length2, avg(length3) as length3, avg(length4) as length4 from xdbTables
go

select avg(length1) as length1, avg(length2) as length2, avg(length3) as length3, avg(length4) as length4 from xdbViews
go

select tabname, sum(length) as length
from xdbJavaDataProviders11
where tabname <> 'dual' 
and tabname not like 'x%' 
and tabname not like 'condicion%' 
and tabname not like 'opcion%' 
and tabname not like 'nivel%' 
and tabname not like 'tipo%' 
and tabname not like '%plus'
group by tabname
having sum(length) between 0 and 4000
order by 2 desc, 1
go
