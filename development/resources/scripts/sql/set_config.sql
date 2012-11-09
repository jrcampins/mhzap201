/*
select 1000*extract(epoch from clock_timestamp()), current_setting('timezone'), current_timestamp, localtimestamp;
*/
/*
select current_setting('datestyle'),current_setting('timezone');
*/
/*
select * from pg_timezone_names where name like'America%' order by 1;
*/
/*
-- timezone = 'America/Caracas'
select set_config('timezone', 'America/Caracas', false)
*/
select 'x' as type,relkind as kind,relname as name,length(relname) as len
from pg_class 
where length(relname)>0
and relnamespace not in(11,11342)
and relname not like'vista_system%'
union
select 'a','-',attname,length(attname)
from pg_attribute
where length(attname)>0
and attname not like'result_cast%'
and attname not like'sql_language%'
order by 4 desc, 1,2,3
