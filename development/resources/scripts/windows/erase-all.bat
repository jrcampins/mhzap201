@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

if not defined f0 set f0="%~f0"

call erase-gf-logs
echo.

call erase-nb-userdir
echo.

call erase-workspace
echo.

if %f0% == "%~f0" pause
goto:eof
