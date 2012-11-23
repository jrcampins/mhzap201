@echo off
cd /d "%~dp0"

set variables=
call variables "%~f0"
if not defined variables goto:eof

call:concat %SQLDDLDIR% %dbms%
set ORADDLDIR=%string%
if not exist %ORADDLDIR% call %DIRBAT2%\variables-reset el directorio %ORADDLDIR% no existe
if not defined variables goto EOJ

if not exist "%~dp0logs" md "%~dp0logs"
set PLOG="%~dp0logs\%~n0.log"
set XLOG=%PLOG%
if exist %PLOG% del %PLOG%

set PSQL="%~dpn0.sql"
if not exist %PSQL% call %DIRBAT2%\variables-reset el archivo %PSQL% no existe
if not defined variables goto EOJ

if not defined SQLPLUS_SPOOL (
    set SQLPLUS_SPOOL=%PLOG%
    if exist %PLOG% del %PLOG%
    echo %~f0 >> %PLOG%
)

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

REM call dropdb
if %xerrorlevel% GEQ 1 goto EOJ

REM call createdb
if %xerrorlevel% GEQ 1 goto EOJ

echo.
pause
echo.

set SQLPATH=%SQLDDLDIR%
call sqlplus "%~dpn0.sql" %O9DATABASE% O9
if %xerrorlevel% GEQ 1 goto EOJ

REM call rebuild
if %xerrorlevel% GEQ 1 goto EOJ

REM call vacuumdb
if %xerrorlevel% GEQ 1 goto EOJ

REM call dump
if %xerrorlevel% GEQ 1 goto EOJ

cd /d "%~dp0"

REM call rebuild-menu
if %xerrorlevel% GEQ 1 goto EOJ

:EOJ
call %DIRBAT2%\eoj "%~f0"
goto:eof

:concat
set string="%~f1\%2"
goto:eof
