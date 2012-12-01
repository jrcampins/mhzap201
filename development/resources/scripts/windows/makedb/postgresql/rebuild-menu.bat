@echo off
cd /d "%~dp0"

setlocal
if not defined first_bat set first_bat="%~f0"
set variables=
call variables
if not defined variables goto:eof

echo "%~n0" reconstruye el menu
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

call "%thatdir%\psql" "%~dpn0.psql"
call "%~dp0..\eoj" "%~f0"
