@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

set  SOURCE=%SQLDDLDIR%\%dbms%
set  SOURCE
set  TARGET=%SQLDDLDIR%\%O9DATABASE%_O9_100.sql
set  TARGET

if exist "%TARGET%" del "%TARGET%"
type %SOURCE%\%O9DATABASE%_O9_SEQUENCES.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%O9DATABASE%_O9_TABLES.sql>>%TARGET%
echo.>>%TARGET%
type %SOURCE%\%O9DATABASE%_O9_DEFAULTS_RENUMBERED.sql>>%TARGET%

call "%~dp0..\eoj" "%~f0"
