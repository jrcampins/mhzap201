@echo off
cd /d "%~dp0"

set variables=
call variables "%~f0"
if not defined variables goto:eof

if not exist "%~dp0logs" md "%~dp0logs"
set PLOG="%~dp0logs\%~n0.log"
set XLOG=%PLOG%
if exist %PLOG% del %PLOG%

set PSQL="%~dpn0.psql"
if not exist %PSQL% call %DIRBAT2%\variables-reset el archivo %PSQL% no existe
if not defined variables goto EOJ

:ask
set nn=10
set CRVL=%nn%%aammdd%
set /p CRVL="version del esquema de la base de datos (aaaammddhh) [%CRVL%] "
if not defined CRVL goto ask
set CRVL="%CRVL%"

set /a xerrorlevel=0
call concatsql
if %xerrorlevel% GEQ 1 goto EOJ

rem echo copy-userdata
rem if %xerrorlevel% GEQ 1 goto EOJ

cd /d "%sourcedir%\management\resources\scripts\windows\%dbms%"

call dropdb
if %xerrorlevel% GEQ 1 goto EOJ

call createdb
if %xerrorlevel% GEQ 1 goto EOJ

set PSQL="%~dpn0.psql"
call psql %PSQL%
if %xerrorlevel% GEQ 1 goto EOJ

call rebuild
if %xerrorlevel% GEQ 1 goto EOJ

call vacuumdb
if %xerrorlevel% GEQ 1 goto EOJ

call dump
if %xerrorlevel% GEQ 1 goto EOJ

cd /d "%~dp0"

call rebuild-menu
if %xerrorlevel% GEQ 1 goto EOJ

:EOJ
call %DIRBAT2%\eoj "%~f0"
