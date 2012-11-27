@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

set  SOURCE=%SQLDDLDIR%\%dbms%
set  SOURCE
set  TARGET=%SQLDDLDIR%\%O9DATABASE%_O9_999.sql
set  TARGET

if exist "%TARGET%" del "%TARGET%"

type %SOURCE%\%O9DATABASE%_O9_TABLES_DROP.sql>>%TARGET%
echo.>>%TARGET%

type %SOURCE%\%O9DATABASE%_O9_VIEWS_DROP.sql>>%TARGET%
echo.>>%TARGET%

type %SOURCE%\%O9DATABASE%_O9_SEQUENCES_DROP.sql>>%TARGET%
echo.>>%TARGET%

call "%~dp0..\eoj" "%~f0"
