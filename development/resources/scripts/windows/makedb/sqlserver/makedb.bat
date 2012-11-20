@echo off
cd /d "%~dp0"

if not defined variables call variables "%~f0"
if not defined variables goto EOJ

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

cd /d "%MHZAP201_SOURCE%\management\resources\scripts\windows\%dbms%"

set SSDB=master
call:runSQLFile %SQLDDLDIR%\%dbms%\%SSDATABASE%_SS.sql
set SSDB=%SSDATABASE%
PAUSE

call:runSQLFile "%SQLDDLDIR%\%SSDATABASE%_SS_100.sql"
if %xerrorlevel% GEQ 1 goto EOJ

call:runSQLFile "%SQLDDLDIR%\%SSDATABASE%_SS_200.sql"
if %xerrorlevel% GEQ 1 goto EOJ

call:runSQLFile "%SQLDDLDIR%\%SSDATABASE%_SS_300.sql"
if %xerrorlevel% GEQ 1 goto EOJ

call:runSQLFile "%SQLDDLDIR%\%SSDATABASE%_SS_400.sql"
if %xerrorlevel% GEQ 1 goto EOJ

call:runSQLFile "%SQLDDLDIR%\%SSDATABASE%_SS_500.sql"
if %xerrorlevel% GEQ 1 goto EOJ

call:runSQLFile "%SQLDDLDIR%\%SSDATABASE%_SS_600.sql"
if %xerrorlevel% GEQ 1 goto EOJ

call:runSQLFile "%~dpn0.psql"
if %xerrorlevel% GEQ 1 goto EOJ

echo vacuumdb
if %xerrorlevel% GEQ 1 goto EOJ

echo dump
if %xerrorlevel% GEQ 1 goto EOJ

cd /d "%~dp0"

:EOJ
call %DIRBAT2%\eoj "%~f0"
goto:eof

:runSQLFile
set PSQL="%~f1"
if exist %PSQL% call psql %PSQL%
goto:eof
