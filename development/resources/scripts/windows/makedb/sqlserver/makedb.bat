@echo off
cd /d "%~dp0"

setlocal
if not defined first_bat set first_bat="%~f0"
set variables=
call variables
if not defined variables goto:eof

:ask
set CRVL=%aaaammdd%
set /p CRVL="version del esquema de la base de datos (aaaammddhh) [%CRVL%] "
if not defined CRVL goto ask
set CRVL="%CRVL%"

cd /d "%~dp0"
set this=%CD%
set that=%project_source_dir%\management\resources\scripts\windows\%dbms%

set /a xerrorlevel=0
if %xerrorlevel% == 0 call "%this%\concatsql"
if %xerrorlevel% == 0 call:run-sql "%SQLDDLDIR%\%dbms%\%SSDATABASE%_SS.sql" master
if %xerrorlevel% == 0 call:run-sql "%SQLDDLDIR%\%SSDATABASE%_SS_100.sql"
if %xerrorlevel% == 0 call:run-sql "%SQLDDLDIR%\%SSDATABASE%_SS_200.sql"
if %xerrorlevel% == 0 call:run-sql "%SQLDDLDIR%\%SSDATABASE%_SS_300.sql"
if %xerrorlevel% == 0 call:run-sql "%SQLDDLDIR%\%SSDATABASE%_SS_400.sql"
if %xerrorlevel% == 0 call:run-sql "%SQLDDLDIR%\%SSDATABASE%_SS_500.sql"
call "%~dp0..\eoj" "%~f0"
goto:eof

:run-sql
if not exist "%~f1" (
    set /a xerrorlevel=1
    echo.
    echo ERROR: el script "%~f1" no existe
    echo.
    pause
    goto:eof
)
echo psql "%~f1"
set SSDB=%SSDATABASE%
if /i "%2" == "master" (
    set SSDB=master
    echo.
    pause
)
call "%that%\psql" "%~f1"
goto:eof
