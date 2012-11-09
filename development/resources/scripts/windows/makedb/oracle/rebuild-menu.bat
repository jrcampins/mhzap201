@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

echo "%~n0" reconstruye las tabla "plus" correspondiente al menu
set siono=S
call ..\setsiono ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto EOJ

if not exist "%~dp0logs" md "%~dp0logs"
set log="%~dp0logs\%~n0.log"
if not defined PLOG (
    set PLOG=%log%
    if exist %log% del %log%
)

set PSQL="%~dpn0.sql"
if not exist %PSQL% call %DIRBAT2%\variables-reset el archivo %PSQL% no existe
if not defined variables goto EOJ

if not defined SQLPLUS_SPOOL (
    set SQLPLUS_SPOOL=%PLOG%
    if exist %PLOG% del %PLOG%
    echo %~f0 >> %PLOG%
)

cd /d "%MHZAP201_VSWS%\management\resources\scripts\windows\%dbms%"
call sqlplus "%~dpn0.sql"
cd /d "%~dp0"

:EOJ
call %DIRBAT2%\eoj "%~f0"
