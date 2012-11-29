@echo off
cd /d "%~dp0"

setlocal
if not defined first_bat set first_bat="%~f0"
set variables=
call variables
if not defined variables goto:eof

:ask
set CRVL=%aaaammdd%
set /p CRVL="version del esquema de la base de datos (aaaammdd) [%CRVL%] "
if not defined CRVL goto ask
set CRVL="%CRVL%"

cd /d "%~dp0"
set this=%CD%
set that=%project_source_dir%\management\resources\scripts\windows\%dbms%

set /a xerrorlevel=0
if %xerrorlevel% == 0 call "%this%\concatsql"
if %xerrorlevel% == 0 call "%that%\dropdb"
if %xerrorlevel% == 0 call "%that%\createdb"
if %xerrorlevel% == 0 call "%that%\makedb"
if %xerrorlevel% == 0 call "%that%\rebuild"
if %xerrorlevel% == 0 call "%that%\vacuumdb"
if %xerrorlevel% == 0 call "%that%\dump"
if %xerrorlevel% == 0 call "%this%\rebuild-menu"
call "%~dp0..\eoj" "%~f0"
