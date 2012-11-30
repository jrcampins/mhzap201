@echo off
cd /d "%~dp0"

setlocal
set variables=
call variables
if not defined variables goto:eof

set  SOURCE=%SQLDDLDIR%\%dbms%\base
set  TARGET=%SQLJOINDIR%\%dbname%_100.sql
set  TARGET
set  SOURCE

if exist "%TARGET%" del "%TARGET%"

rem type %SOURCE%\%dbname%_SEQUENCES.sql>>%TARGET%
rem echo.>>%TARGET%

type %SOURCE%\%dbname%_TABLES.sql>>%TARGET%
echo.>>%TARGET%

type %SOURCE%\%dbname%_DEFAULTS_RENUMBERED.sql>>%TARGET%
echo.>>%TARGET%

call "%~dp0..\eoj" "%~f0"
