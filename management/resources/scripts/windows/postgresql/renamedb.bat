@echo off
cd /d "%~dp0"

set variables=
call variables
if not defined variables goto:eof

echo "%~n0" renombra la base de datos
call "%~dp0..\setsiono" ejecutar "%~n0"
if /i "%siono%" NEQ "S" goto:eof

call psql "%~dpn0.psql"
call "%~dp0..\eoj" "%~f0"
goto:eof

:renamedb
set /p CRVL="version actualmente instalada "
if not defined CRVL goto ask
set PGDB=%PGDATABASE%
set PGDATABASE=postgres
call psql
goto:eof
