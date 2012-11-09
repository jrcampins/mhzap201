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

select 'xold.'||lower(column_name)||' := :old.'||lower(column_name)||';' as pl_sql_statement
from user_tab_columns
where table_name = 'FICHA_PERSONA'
order by column_id;
