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
order by object_type, object_name;

define us = _
define tokens = &1&us&2&us

set echo off
define suffix = 100
define script = &tokens&suffix
prompt RUN> &script
set echo on
@&script

set echo off
define suffix = 200
define script = &tokens&suffix
prompt RUN> &script
set echo on
@&script

set echo off
define suffix = 300
define script = &tokens&suffix
prompt RUN> &script
set echo on
@&script

set echo off
define suffix = 400_PACKAGES
define script = &tokens&suffix
prompt RUN> &script
set echo on
@&script

set echo off
define suffix = 400_FUNCTIONS
define script = &tokens&suffix
prompt RUN> &script
set echo on
@&script

set echo off
define suffix = 500
define script = &tokens&suffix
prompt RUN> &script
set echo on
@&script

set echo off
define suffix = 600
define script = &tokens&suffix
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
