@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

set  SOURCE=%SQLDDLDIR%\%dbms%
set  SOURCE
set  TARGET=%SQLDDLDIR%\%PGDATABASE%_PG_999.sql
set  TARGET
if exist "%TARGET%" del "%TARGET%"
type %SOURCE%\%PGDATABASE%_PG_TABLES_DROP.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%PGDATABASE%_PG_SEQUENCES_DROP.sql>>%TARGET%

call "%~dp0..\eoj" "%~f0"
