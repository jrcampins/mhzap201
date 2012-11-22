@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" limpia las tablas de la base de datos
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

if not exist "%~dp0logs" md "%~dp0logs"
if not defined PLOG set PLOG="%~dp0logs\%~n0.log"

set PSQL="%~dpn0.psql"
if not exist "%PSQL%" call ..\unset-variables el archivo "%PSQL%" no existe
if defined variables call psql
set PSQL=
call ..\eoj "%~f0"
