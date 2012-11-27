@echo off
cd /d "%~dp0"

setlocal
if not defined first_bat set first_bat="%~f0"
set variables=
call variables
if not defined variables goto:eof

cd /d "%~dp0"
set this=%CD%
set that=%project_source_dir%\management\resources\scripts\windows\%dbms%

set /a xerrorlevel=0
if %xerrorlevel% == 0 call "%this%\concatsql"
if %xerrorlevel% == 0 call "%that%\customize"
if %xerrorlevel% == 0 call "%that%\makedb"
call "%~dp0..\eoj" "%~f0"
