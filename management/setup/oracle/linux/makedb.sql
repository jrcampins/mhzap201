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

set echo off
define folder = /opt/mhzap201/VnnRaammdd/resources/database/ddl/
define tokens = MHZDB201_O9_
define custom = oracle/custom/packages/xsp
define script = &folder&custom
prompt RUN> &script
set echo on
@&script

set echo off
exec xsp.dropall();

select object_type, status, count(*)
from user_objects
group by object_type, status
order by object_type, status;

select object_type, timestamp, status, object_name
from user_objects
order by object_type, object_name;

set echo off
define suffix = 100
define script = &folder&tokens&suffix
prompt RUN> &script
set echo on
@&script

set echo off
define suffix = 200
define script = &folder&tokens&suffix
prompt RUN> &script
set echo on
@&script

set echo off
define suffix = 300
define script = &folder&tokens&suffix
prompt RUN> &script
set echo on
@&script

set echo off
define suffix = 400_PACKAGES
define script = &folder&tokens&suffix
prompt RUN> &script
set echo on
@&script

set echo off
define suffix = 400_FUNCTIONS
define script = &folder&tokens&suffix
prompt RUN> &script
set echo on
@&script

set echo off
define suffix = 500
define script = &folder&tokens&suffix
prompt RUN> &script
set echo on
@&script

set echo off
define suffix = 600
define script = &folder&tokens&suffix
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
