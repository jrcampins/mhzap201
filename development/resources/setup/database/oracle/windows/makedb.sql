set echo off
set verify off
set autocommit off
set serveroutput on
set linesize 10000
set pagesize 50000
whenever oserror  exit failure rollback
whenever sqlerror exit failure rollback

select object_type, status, count(*)
from user_objects
group by object_type, status
order by object_type, status;

exec xsp.dropall();

select object_type, status, count(*)
from user_objects
group by object_type, status
order by object_type, status;

select object_type, timestamp, status, object_name
from user_objects
where object_type <> 'INDEX'
order by object_type, object_name;

define bs = C:\mhzap201\VnnRaammdd\resources\database\ddl\MHZDB201_O9_
define us = _

set echo off
define numero = 100
define script = &bs&numero
prompt RUN> &script
set echo on
@&script

set echo off
define numero = 200
define script = &bs&numero
prompt RUN> &script
set echo on
@&script

set echo off
define numero = 300
define script = &bs&numero
prompt RUN> &script
set echo on
@&script

set echo off
define numero = 400
define sufijo = PACKAGES
define script = &bs&numero&us&sufijo
prompt RUN> &script
set echo on
@&script

set echo off
define numero = 400
define sufijo = FUNCTIONS
define script = &bs&numero&us&sufijo
prompt RUN> &script
set echo on
@&script

set echo off
define numero = 500
define script = &bs&numero
prompt RUN> &script
set echo on
@&script

set echo off
define numero = 600
define script = &bs&numero
prompt RUN> &script
set echo on
@&script

set echo off
exec xsp.compile('function');
exec xsp.compile('package');
exec xsp.compile('procedure');
exec xsp.compile('trigger');

select object_type, timestamp, status, object_name
from user_objects
where object_type <> 'INDEX'
order by object_type, object_name;

select object_type, status, count(*)
from user_objects
group by object_type, status
order by object_type, status;

begin
    dbms_output.put_line('deploy menu = ' || sp$opcion_menu.deploy());
end;
/

set echo on
update usuario set nombre_usuario=nombre_usuario||'/Oracle' where id_usuario=101;
