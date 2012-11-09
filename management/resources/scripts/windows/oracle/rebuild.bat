@echo off
cd /d "%~dp0"
echo "%~n0" reconstruye las tablas "plus" correspondientes a cada tabla "arbol"
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto EOJ

call variables "%~f0"
if not defined variables goto EOJ

if not exist "%~dp0logs" md "%~dp0logs"
set log="%~dp0logs\%~n0.log"
if not defined PLOG (
    set PLOG=%log%
    if exist %log% del %log%
)

set PSQL="%~dpn0.sql"
if not exist "%PSQL%" call ..\unset-variables el archivo "%PSQL%" no existe
if not defined variables goto EOJ

if not defined SQLPLUS_SPOOL (
    set SQLPLUS_SPOOL=%PLOG%
    if exist %PLOG% del %PLOG%
    echo "%~f0" >> %PLOG%
)

call sqlplus "%~dpn0.sql"

:EOJ
call ..\eoj "%~f0"
