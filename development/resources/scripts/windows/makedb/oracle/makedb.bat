@echo off
cd /d "%~dp0"

setlocal
if not defined first_bat set first_bat="%~f0"
set variables=
call variables
if not defined variables goto:eof

set /a xerrorlevel=0
if %xerrorlevel% == 0 call "%thisdir%\concatsql"
if %xerrorlevel% == 0 call "%thatdir%\customize"
if %xerrorlevel% == 0 call "%thatdir%\makedb"
call "%~dp0..\eoj" "%~f0"
