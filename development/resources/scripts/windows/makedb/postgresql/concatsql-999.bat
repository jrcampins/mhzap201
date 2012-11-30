@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

set  SOURCE=%SQLDDLDIR%\%dbms%\base
set  TARGET=%SQLJOINDIR%\%dbname%_999.sql
set  TARGET
set  SOURCE

if exist "%TARGET%" del "%TARGET%"

type %SOURCE%\%dbname%_TABLES_DROP.sql>>%TARGET%
echo.>>%TARGET%

type %SOURCE%\%dbname%_SEQUENCES_DROP.sql>>%TARGET%
echo.>>%TARGET%

rem type %SOURCE%\%dbname%_VIEWS_DROP.sql>>%TARGET%
rem echo.>>%TARGET%

call "%~dp0..\eoj" "%~f0"
