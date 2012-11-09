set echo off
set verify off
set autocommit off
set serveroutput on
set linesize 10000
set pagesize 50000
whenever oserror  exit failure rollback
whenever sqlerror exit failure rollback

set serveroutput on
begin
    dbms_output.put_line('rebuild menu = ' || sp$opcion_menu.rebuild());
end;
/
--
-- set echo on
-- update opcion_menu set es_opcion_menu_inactiva=0 where codigo_opcion_menu like'N9%' and codigo_opcion_menu not like'N92%';
-- set echo off
--
column clave    format a20
column codigo   format a20
column nombre   format a40
select clave_opcion_menu as clave, codigo_opcion_menu as codigo, nombre_opcion_menu as nombre, es_opcion_menu_inactiva as inactiva
from opcion_menu
where codigo_opcion_menu like'N9%'
order by 1,2;
