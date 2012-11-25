set echo off
set verify off
set autocommit off
set serveroutput on
set linesize 10000
set pagesize 50000
whenever oserror  exit failure rollback
whenever sqlerror exit failure rollback
rem 
rem define spfile = &1
rem define dbuser = &2
rem define dbpass = &3
rem 
rem prompt spfile = &spfile
rem prompt dbuser = &dbuser
rem prompt dbpass = *******
rem 
rem spool &spfile
rem 
rem connect "&dbuser"/"&dbpass";
rem
host set SQLPATH
prompt RUN> @&1, &2, &3, &4, &5, &6, &7, &8, &9
set echo on
@&1 &2 &3 &4 &5 &6 &7 &8 &9
commit;
exit
