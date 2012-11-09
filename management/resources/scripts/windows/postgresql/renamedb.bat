@echo off
cd /d "%~dp0"
echo "%~n0" renombra la base de datos
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto EOJ
call variables "%~f0"
if not defined variables goto EOJ

if not exist "%~dp0logs" md "%~dp0logs"
if not defined PLOG set PLOG="%~dp0logs\%~n0.log"
if not defined PSQL set PSQL="%~dpn0.psql"
if not exist "%PSQL%" call ..\unset-variables el archivo "%PSQL%" no existe
if not defined variables goto EOJ

:ask
set /p CRVL="version actualmente instalada "
if not defined CRVL goto ask
set PGDB=%PGDATABASE%
set PGDATABASE=postgres

call psql

:EOJ
call ..\eoj "%~f0"
