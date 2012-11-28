set echo off
set verify off
set autocommit off
set serveroutput on
set linesize 10000
set pagesize 50000
whenever oserror  exit failure rollback
whenever sqlerror exit failure rollback
rem 
rem spool &1
rem 
rem connect "&2"/"&3";
rem
host echo SQLPATH=$SQLPATH
prompt RUN> @&1(&2,&3,&4,&5,&6,&7,&8,&9)
set echo on
@&1 &2 &3 &4 &5 &6 &7 &8 &9
commit;
exit
