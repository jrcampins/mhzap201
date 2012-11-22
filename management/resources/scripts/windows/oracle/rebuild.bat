@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" reconstruye las tablas "plus" correspondientes a cada tabla "arbol"
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

if not exist "%~dp0logs" md "%~dp0logs"
set log="%~dp0logs\%~n0.log"
if not defined PLOG (
    set PLOG=%log%
    if exist %log% del %log%
)

if not defined SQLPLUS_SPOOL (
    set SQLPLUS_SPOOL=%PLOG%
    if exist %PLOG% del %PLOG%
    echo "%~f0" >> %PLOG%
)

set PSQL="%~dpn0.sql"
if not exist "%PSQL%" call ..\unset-variables el archivo "%PSQL%" no existe
if defined variables call sqlplus "%~dpn0.sql"
set PSQL=
call ..\eoj "%~f0"
