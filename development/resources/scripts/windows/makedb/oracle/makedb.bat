@echo off
cd /d "%~dp0"

setlocal
if not defined first_bat set first_bat="%~f0"
set variables=
call variables
if not defined variables goto:eof

set /a xerrorlevel=0
call concatsql
if not %xerrorlevel% == 0 (pause & goto:eof)

cd /d "%project_source_dir%\management\resources\scripts\windows\%dbms%"
call customize
call makedb
call "%~dp0..\eoj" "%~f0"
