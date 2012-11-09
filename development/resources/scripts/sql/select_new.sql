set echo off
set verify off
set autocommit off
set serveroutput on
set linesize 10000
set pagesize 50000
set feedback off
set verify off
set heading off

clear screen

select 'xnew.'||lower(column_name)||' := :new.'||lower(column_name)||';' as pl_sql_statement
from user_tab_columns
where table_name = 'POTENCIAL_BEN'
order by column_id;
